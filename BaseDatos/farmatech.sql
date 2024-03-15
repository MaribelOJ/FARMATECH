-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-03-2024 a las 22:19:07
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `farmatech`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `cedula` char(10) NOT NULL,
  `nombre` varchar(35) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`cedula`, `nombre`) VALUES
('10100', 'Camila Murillo'),
('10200', 'Alejandra Garces'),
('10300', 'Catalina Rojas'),
('10400', 'Artemiz Arias'),
('10500', 'Diego Osorio'),
('10600', 'Diego Jaramillo'),
('10700', 'Alejandra Rojas'),
('10800', 'Natalia Ortiz'),
('10900', 'Macarena Rojas'),
('11000', 'Sebastia Ardila');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `factura`
--

CREATE TABLE `factura` (
  `numReferencia` int(11) NOT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `id_cliente` char(10) DEFAULT NULL,
  `nombre_cliente` varchar(35) DEFAULT NULL,
  `sub_total` int(11) DEFAULT NULL,
  `iva` decimal(7,1) DEFAULT NULL,
  `total` decimal(8,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `factura`
--

INSERT INTO `factura` (`numReferencia`, `fecha`, `hora`, `id_cliente`, `nombre_cliente`, `sub_total`, `iva`, `total`) VALUES
(1, '2024-03-07', '12:30:00', '10100', 'Camila Murillo', 83493, 4174.7, 87667.7),
(2, '2024-03-07', '13:45:00', '10200', 'Alejandra Garces', 0, 0.0, 0.0),
(3, '2024-03-07', '14:15:00', '10300', 'Catalina Rojas', 68749, 3437.5, 72186.5),
(4, '2024-03-07', '15:00:00', '10400', 'Artemiz Arias', 34000, 1700.0, 35700.0),
(5, '2024-03-07', '15:45:00', '10500', 'Diego Osorio', 0, 0.0, 0.0),
(6, '2024-03-07', '16:30:00', '10600', 'Diego Jaramillo', 0, 0.0, 0.0),
(7, '2024-03-07', '17:00:00', '10700', 'Alejandra Rojas', 0, 0.0, 0.0),
(8, '2024-03-07', '17:45:00', '10800', 'Natalia Ortiz', 0, 0.0, 0.0),
(9, '2024-03-07', '18:30:00', '10900', 'Macarena Rojas', 17499, 875.0, 18374.0),
(10, '2024-03-07', '19:15:00', '11000', 'Sebastia Ardila', 47250, 2362.5, 49612.5);

--
-- Disparadores `factura`
--
DELIMITER $$
CREATE TRIGGER `agregarCliente` AFTER INSERT ON `factura` FOR EACH ROW BEGIN
        DECLARE consulta INT;
        SET consulta = (SELECT COUNT(cedula) FROM cliente WHERE cedula = NEW.id_cliente);
        IF (consulta = 0) THEN
            INSERT INTO cliente VALUES(NEW.id_cliente,NEW.nombre_cliente);
        END IF;
    END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `facturaproducto`
--

CREATE TABLE `facturaproducto` (
  `id_facturaProducto` int(11) NOT NULL,
  `numReferencia` int(11) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `suma_total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `facturaproducto`
--

INSERT INTO `facturaproducto` (`id_facturaProducto`, `numReferencia`, `id_producto`, `cantidad`, `suma_total`) VALUES
(1, 1, 2, 2, 25998),
(2, 9, 1, 1, 5999),
(3, 10, 4, 3, 47250),
(4, 1, 5, 5, 49995),
(5, 3, 8, 1, 14999),
(6, 3, 10, 2, 35000),
(7, 4, 3, 4, 34000),
(8, 3, 7, 3, 18750),
(9, 9, 9, 1, 11500),
(10, 1, 6, 1, 7500);

--
-- Disparadores `facturaproducto`
--
DELIMITER $$
CREATE TRIGGER `calcularSumaTotal` BEFORE INSERT ON `facturaproducto` FOR EACH ROW SET NEW.suma_total = NEW.cantidad * (SELECT precio_unitario FROM producto WHERE id_producto = NEW.id_producto)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `sumarFactura` AFTER INSERT ON `facturaproducto` FOR EACH ROW BEGIN
        
        DECLARE impuesto DECIMAL(7,1);
        DECLARE partial_cost DECIMAL(8,1);
        DECLARE pago DECIMAL(8,1);
        SET partial_cost=(SELECT SUM(suma_total) FROM facturaProducto WHERE numReferencia = NEW.numReferencia);
        SET impuesto = partial_cost * 0.05;
        SET pago = partial_cost + impuesto;
        
        UPDATE factura SET sub_total = partial_cost, iva = impuesto, total = pago WHERE numReferencia = NEW.numReferencia;
    END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `farmacia`
--

CREATE TABLE `farmacia` (
  `NIT_farmacia` varchar(12) NOT NULL,
  `nombre` varchar(25) DEFAULT NULL,
  `direccion` varchar(40) DEFAULT NULL,
  `telefono` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `farmacia`
--

INSERT INTO `farmacia` (`NIT_farmacia`, `nombre`, `direccion`, `telefono`) VALUES
('1001', 'Cruz Verde', 'Calle 1 Ciudad Jardin', '1234567890'),
('1002', 'Drogas la Rebaja', 'Avenida 2 Pueblo rico', '4567890123'),
('1003', 'Drogueria Alemana', 'Carrera 3 Villa santana', '7890123456'),
('1004', 'Cruz Verde', 'Calle 4  victoria', '2345678901'),
('1005', 'Drogueria Alemana', 'Avenida 5 Puebla', '5678901234'),
('1006', 'Drogas la rebaja', 'Carrera 6 Villa maria', '8901234567'),
('1007', 'Drogas la rebaja', 'Calle 7 venecia', '3456789012'),
('1008', 'Cruz Verde', 'Avenida 8 Boston', '6789012345'),
('1009', 'Cruz verde', 'Carrera 9 Palermo', '9012345678'),
('1010', 'Drogueria Alemana', 'Calle 10 Canan', '1232345678');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historialestados_farmacia`
--

CREATE TABLE `historialestados_farmacia` (
  `id_estado` int(11) NOT NULL,
  `NIT_farmacia` varchar(12) DEFAULT NULL,
  `nombre` enum('activo','inactivo') DEFAULT NULL,
  `fecha_cambio` date DEFAULT NULL,
  `comentario` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historialestados_farmacia`
--

INSERT INTO `historialestados_farmacia` (`id_estado`, `NIT_farmacia`, `nombre`, `fecha_cambio`, `comentario`) VALUES
(1, '1001', 'activo', '2024-03-15', 'estado de creacion'),
(2, '1002', 'activo', '2024-03-15', 'estado de creacion'),
(3, '1003', 'activo', '2024-03-15', 'estado de creacion'),
(4, '1004', 'activo', '2024-03-15', 'estado de creacion'),
(5, '1005', 'activo', '2024-03-15', 'estado de creacion'),
(6, '1006', 'activo', '2024-03-15', 'estado de creacion'),
(7, '1007', 'activo', '2024-03-15', 'estado de creacion'),
(8, '1008', 'activo', '2024-03-15', 'estado de creacion'),
(9, '1009', 'activo', '2024-03-15', 'estado de creacion'),
(10, '1010', 'activo', '2024-03-15', 'estado de creacion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `nombre_producto` varchar(25) DEFAULT NULL,
  `volumen` enum('mg','ml') DEFAULT NULL,
  `precio_unitario` decimal(7,1) DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `ingredientes` text DEFAULT NULL,
  `usos` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre_producto`, `volumen`, `precio_unitario`, `fecha_vencimiento`, `ingredientes`, `usos`) VALUES
(1, 'Paracetamol', 'ml', 5999.0, '2026-12-31', 'Paracetamol', 'Alivio del dolor y fiebre'),
(2, 'Amoxicilina', 'mg', 12999.0, '2024-06-30', 'Amoxicilina', 'Antibiotico para infecciones'),
(3, 'Ibuprofeno', 'mg', 8500.0, '2026-11-15', 'Ibuprofeno', 'Antiinflamatorio y analgesico'),
(4, 'Omeprazol', 'mg', 15750.0, '2026-09-30', 'Omeprazol', 'Alivio de acidez estomacal'),
(5, 'Loratadina', 'mg', 9999.0, '2024-04-15', 'Loratadina', 'Antihistaminico para alergias'),
(6, 'Vitamina C', 'mg', 7500.0, '2026-10-31', 'Acido asc?rbico', 'Suplemento vitaminico'),
(7, 'Aspirina', 'mg', 6250.0, '2024-01-20', 'Acido acetilsalic?lico', 'Analgesico y antipiretico'),
(8, 'Simvastatina', 'mg', 14999.0, '2026-08-31', 'Simvastatina', 'Reduccion de colesterol'),
(9, 'Hidroclorotiazida', 'mg', 11500.0, '2026-12-01', 'Hidroclorotiazida', 'Diuretico'),
(10, 'Sertralina', 'mg', 17500.0, '2024-03-01', 'Sertralina', 'Antidepresivo selectivo de la recaptacion de serotonina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `NIT_proveedor` varchar(12) NOT NULL,
  `nombre_proveedor` varchar(40) DEFAULT NULL,
  `direccion` varchar(40) DEFAULT NULL,
  `telefono` char(10) DEFAULT NULL,
  `correo` varchar(35) DEFAULT NULL,
  `persona_contacto` varchar(35) DEFAULT NULL,
  `estado` enum('activo','inactivo') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`NIT_proveedor`, `nombre_proveedor`, `direccion`, `telefono`, `correo`, `persona_contacto`, `estado`) VALUES
('NIT1', 'BioPharma Solutions', 'Direcci?n 1', '111-111-11', 'biopharma@example.com', 'Carlos Londo?o', 'inactivo'),
('NIT10', 'PrecisionMed Labs', 'Direcci?n 10', '101-010-10', 'precisionmed@example.com', 'Ivan Lopez', 'activo'),
('NIT2', 'MedicoGen Labs', 'Direcci?n 2', '222-222-22', 'medicogen@example.com', 'Anna Barreras', 'activo'),
('NIT3', 'CureLife Pharmaceuticals', 'Direcci?n 3', '333-333-33', 'curelife@example.com', 'Orlando Diarte', 'activo'),
('NIT4', 'NovaCare Pharma', 'Direcci?n 4', '444-444-44', 'novacare@example.com', 'Omar Ortiz', 'activo'),
('NIT5', 'VitalTech Pharmaceuticals', 'Direcci?n 5', '555-555-55', 'vitaltech@example.com', 'Nilson Londo?o', 'activo'),
('NIT6', 'BioCure Sciences', 'Direcci?n 6', '666-666-66', 'biocure@example.com', 'Vanesa Cadavid', 'inactivo'),
('NIT7', 'NaturPharma Andina', 'Direcci?n 7', '777-777-77', 'naturpharma@example.com', 'David Ortega', 'activo'),
('NIT8', 'VitaSalud Cient?fica', 'Direcci?n 8', '888-888-88', 'vitasalud@example.com', 'Marta Bola?os', 'activo'),
('NIT9', 'Innovaci?n M?dica Colombiana', 'Direcci?n 9', '999-999-99', 'innovacionmedica@example.com', 'Pedro Miranda', 'activo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock`
--

CREATE TABLE `stock` (
  `id_stock` int(11) NOT NULL,
  `NIT_farmacia` varchar(12) DEFAULT NULL,
  `id_producto` int(11) DEFAULT NULL,
  `proveedor` varchar(12) DEFAULT NULL,
  `cant_entrante` int(11) DEFAULT NULL,
  `cant_restante` int(11) DEFAULT NULL,
  `estado` enum('activo','inactivo') DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `fecha_descontinuacion` date DEFAULT NULL,
  `comentario` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `stock`
--

INSERT INTO `stock` (`id_stock`, `NIT_farmacia`, `id_producto`, `proveedor`, `cant_entrante`, `cant_restante`, `estado`, `fecha_registro`, `fecha_descontinuacion`, `comentario`) VALUES
(1, '1003', 1, 'NIT6', 50, 50, 'activo', '2024-03-15', NULL, ''),
(2, '1009', 2, 'NIT6', 100, 100, 'activo', '2024-03-15', NULL, ''),
(3, '1004', 3, 'NIT4', 120, 120, 'activo', '2024-03-15', NULL, ''),
(4, '1001', 4, 'NIT1', 30, 30, 'activo', '2024-03-15', NULL, ''),
(5, '1007', 5, 'NIT9', 10, 10, 'activo', '2024-03-15', NULL, ''),
(6, '1005', 6, 'NIT3', 10, 10, 'activo', '2024-03-15', NULL, ''),
(7, '1010', 7, 'NIT10', 90, 90, 'activo', '2024-03-15', NULL, ''),
(8, '1002', 8, 'NIT5', 86, 86, 'activo', '2024-03-15', NULL, ''),
(9, '1009', 9, 'NIT7', 100, 100, 'activo', '2024-03-15', NULL, ''),
(10, '1001', 10, 'NIT7', 20, 20, 'activo', '2024-03-15', NULL, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `cedula` char(10) DEFAULT NULL,
  `nombre_usuario` varchar(35) DEFAULT NULL,
  `usuario` varchar(20) DEFAULT NULL,
  `clave` varchar(225) DEFAULT NULL,
  `rol` enum('administrador','encargado') DEFAULT NULL,
  `estado` enum('activo','inactivo') DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_termino` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `cedula`, `nombre_usuario`, `usuario`, `clave`, `rol`, `estado`, `fecha_inicio`, `fecha_termino`) VALUES
(1, '20011', 'Pedro Perez', 'pepito23', 'eb52fc9a4b3a81a2000a9e774d5aa515', 'administrador', 'activo', '2024-03-15', NULL),
(2, '20012', 'Maria Gomez', 'MGomez', 'f5ca2d0fea818f7c46b004aa04214791', 'encargado', 'activo', '2024-03-15', NULL),
(3, '20013', 'Carolina Ruiz', 'Car30Ruiz', '83cbbd381252d74d77a3ec135966d15e', 'encargado', 'activo', '2024-03-15', NULL),
(4, '20014', 'Laura Mora', 'Laures123', 'aadf05d077c1419eb76771f8caf0828a', 'encargado', 'activo', '2024-03-15', NULL),
(5, '20015', 'Pedro Lopez', 'PedroL', 'ba39166c4681e6127889f3bcdced3a8e', 'encargado', 'activo', '2024-03-15', NULL),
(6, '20016', 'Alicia Garcia', 'AGarcia', '50eacbdd8a9604709e7831c99302636d', 'encargado', 'activo', '2024-03-15', NULL),
(7, '20017', 'Daniel Sanchez', 'Dani2024', '5d7845ac6ee7cfffafc5fe5f35cf666d', 'encargado', 'activo', '2024-03-15', NULL),
(8, '20018', 'Luisa Diaz', 'SofiaDiaz', '89adf009fae20ab8f30c686174fe8df1', 'administrador', 'activo', '2024-03-15', NULL),
(9, '20019', 'Diego Perez', 'DiegoH14', 'b4af804009cb036a4ccdc33431ef9ac9', 'encargado', 'activo', '2024-03-15', NULL),
(10, '20020', 'Omar Castellano', 'Usuario24', 'ba73637a27dfcb35a5d4310a1ef995f3', 'encargado', 'activo', '2024-03-15', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuariofarmacia`
--

CREATE TABLE `usuariofarmacia` (
  `id_usuarioFarmacia` int(11) NOT NULL,
  `id_usuario` int(11) DEFAULT NULL,
  `NIT_farmacia` varchar(12) DEFAULT NULL,
  `estado` enum('activo','inactivo') DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_termino` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuariofarmacia`
--

INSERT INTO `usuariofarmacia` (`id_usuarioFarmacia`, `id_usuario`, `NIT_farmacia`, `estado`, `fecha_inicio`, `fecha_termino`) VALUES
(1, 1, '1003', 'activo', '2024-03-15', NULL),
(2, 1, '1009', 'activo', '2024-03-15', NULL),
(3, 1, '1004', 'activo', '2024-03-15', NULL),
(4, 1, '1001', 'activo', '2024-03-15', NULL),
(5, 2, '1003', 'activo', '2024-03-15', NULL),
(6, 3, '1009', 'activo', '2024-03-15', NULL),
(7, 4, '1004', 'activo', '2024-03-15', NULL),
(8, 5, '1001', 'activo', '2024-03-15', NULL),
(9, 6, '1007', 'activo', '2024-03-15', NULL),
(10, 7, '1005', 'activo', '2024-03-15', NULL),
(11, 9, '1010', 'activo', '2024-03-15', NULL),
(12, 10, '1009', 'activo', '2024-03-15', NULL),
(13, 8, '1001', 'activo', '2024-03-15', NULL),
(14, 8, '1007', 'activo', '2024-03-15', NULL),
(15, 8, '1005', 'activo', '2024-03-15', NULL),
(16, 8, '1010', 'activo', '2024-03-15', NULL),
(17, 8, '1009', 'activo', '2024-03-15', NULL);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`cedula`);

--
-- Indices de la tabla `factura`
--
ALTER TABLE `factura`
  ADD PRIMARY KEY (`numReferencia`);

--
-- Indices de la tabla `facturaproducto`
--
ALTER TABLE `facturaproducto`
  ADD PRIMARY KEY (`id_facturaProducto`),
  ADD KEY `numReferencia` (`numReferencia`),
  ADD KEY `id_producto` (`id_producto`);

--
-- Indices de la tabla `farmacia`
--
ALTER TABLE `farmacia`
  ADD PRIMARY KEY (`NIT_farmacia`);

--
-- Indices de la tabla `historialestados_farmacia`
--
ALTER TABLE `historialestados_farmacia`
  ADD PRIMARY KEY (`id_estado`),
  ADD KEY `NIT_farmacia` (`NIT_farmacia`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`NIT_proveedor`);

--
-- Indices de la tabla `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id_stock`),
  ADD KEY `NIT_farmacia` (`NIT_farmacia`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `proveedor` (`proveedor`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- Indices de la tabla `usuariofarmacia`
--
ALTER TABLE `usuariofarmacia`
  ADD PRIMARY KEY (`id_usuarioFarmacia`),
  ADD KEY `id_usuario` (`id_usuario`),
  ADD KEY `NIT_farmacia` (`NIT_farmacia`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `numReferencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `facturaproducto`
--
ALTER TABLE `facturaproducto`
  MODIFY `id_facturaProducto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `historialestados_farmacia`
--
ALTER TABLE `historialestados_farmacia`
  MODIFY `id_estado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `stock`
--
ALTER TABLE `stock`
  MODIFY `id_stock` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `usuariofarmacia`
--
ALTER TABLE `usuariofarmacia`
  MODIFY `id_usuarioFarmacia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `facturaproducto`
--
ALTER TABLE `facturaproducto`
  ADD CONSTRAINT `facturaproducto_ibfk_1` FOREIGN KEY (`numReferencia`) REFERENCES `factura` (`numReferencia`),
  ADD CONSTRAINT `facturaproducto_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`);

--
-- Filtros para la tabla `historialestados_farmacia`
--
ALTER TABLE `historialestados_farmacia`
  ADD CONSTRAINT `historialestados_farmacia_ibfk_1` FOREIGN KEY (`NIT_farmacia`) REFERENCES `farmacia` (`NIT_farmacia`);

--
-- Filtros para la tabla `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`NIT_farmacia`) REFERENCES `farmacia` (`NIT_farmacia`),
  ADD CONSTRAINT `stock_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`),
  ADD CONSTRAINT `stock_ibfk_3` FOREIGN KEY (`proveedor`) REFERENCES `proveedor` (`NIT_proveedor`);

--
-- Filtros para la tabla `usuariofarmacia`
--
ALTER TABLE `usuariofarmacia`
  ADD CONSTRAINT `usuariofarmacia_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`),
  ADD CONSTRAINT `usuariofarmacia_ibfk_2` FOREIGN KEY (`NIT_farmacia`) REFERENCES `farmacia` (`NIT_farmacia`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
