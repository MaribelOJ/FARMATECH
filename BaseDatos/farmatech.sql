-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-03-2024 a las 09:20:24
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

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
-- Estructura de tabla para la tabla `agregarproducto`
--

CREATE TABLE `agregarproducto` (
  `numReferencia` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `suma_total` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `agregarproducto`
--

INSERT INTO `agregarproducto` (`numReferencia`, `id_producto`, `cantidad`, `suma_total`) VALUES
(31, 12, 2, 25998),
(31, 14, 1, 15750),
(31, 20, 5, 87500),
(32, 13, 3, 25500),
(35, 20, 2, 35000),
(37, 18, 1, 14999),
(39, 11, 1, 5999),
(39, 13, 1, 8500),
(40, 14, 3, 47250),
(40, 20, 4, 70000);

--
-- Disparadores `agregarproducto`
--
DELIMITER $$
CREATE TRIGGER `calcularSumaTotal` BEFORE INSERT ON `agregarproducto` FOR EACH ROW SET NEW.suma_total = NEW.cantidad * (SELECT precio_unitario FROM producto WHERE id_producto = NEW.id_producto)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `sumarFactura` AFTER INSERT ON `agregarproducto` FOR EACH ROW BEGIN
        
        DECLARE impuesto DECIMAL(7,1);
        DECLARE partial_cost DECIMAL(8,1);
        DECLARE pago DECIMAL(8,1);
        SET partial_cost=(SELECT SUM(suma_total) FROM agregarProducto WHERE numReferencia = NEW.numReferencia);
        SET impuesto = partial_cost * 0.05;
        SET pago = partial_cost + impuesto;
        
        UPDATE factura SET sub_total = partial_cost, iva = impuesto, total = pago WHERE numReferencia = NEW.numReferencia;
    END
$$
DELIMITER ;

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
(31, '2024-03-07', '12:30:00', '10100', 'Camila Murillo', 129248, 6462.4, 135710.4),
(32, '2024-03-07', '13:45:00', '10200', 'Alejandra Garces', 25500, 1275.0, 26775.0),
(33, '2024-03-07', '14:15:00', '10300', 'Catalina Rojas', 0, 0.0, 0.0),
(34, '2024-03-07', '15:00:00', '10400', 'Artemiz Arias', 0, 0.0, 0.0),
(35, '2024-03-07', '15:45:00', '10500', 'Diego Osorio', 35000, 1750.0, 36750.0),
(36, '2024-03-07', '16:30:00', '10600', 'Diego Jaramillo', 0, 0.0, 0.0),
(37, '2024-03-07', '17:00:00', '10700', 'Alejandra Rojas', 14999, 750.0, 15749.0),
(38, '2024-03-07', '17:45:00', '10800', 'Natalia Ortiz', 0, 0.0, 0.0),
(39, '2024-03-07', '18:30:00', '10900', 'Macarena Rojas', 14499, 725.0, 15224.0),
(40, '2024-03-07', '19:15:00', '11000', 'Sebastia Ardila', 117250, 5862.5, 123112.5);

--
-- Disparadores `factura`
--
DELIMITER $$
CREATE TRIGGER `agregarCliente` AFTER INSERT ON `factura` FOR EACH ROW BEGIN
        DECLARE consulta INT;
        DECLARE nombre VARCHAR(35);
        SET consulta = (SELECT COUNT(cedula) FROM cliente WHERE cedula = NEW.id_cliente);
        IF (consulta = 0) THEN
            INSERT INTO cliente VALUES(NEW.id_cliente,NEW.nombre_cliente);
        END IF;
    END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `farmacia`
--

CREATE TABLE `farmacia` (
  `id_farmacia` int(11) NOT NULL,
  `nombre` varchar(25) DEFAULT NULL,
  `direccion` varchar(40) DEFAULT NULL,
  `telefono` char(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `farmacia`
--

INSERT INTO `farmacia` (`id_farmacia`, `nombre`, `direccion`, `telefono`) VALUES
(1, 'Cruz Verde', 'Calle 1, Ciudad', '123-456-78'),
(2, 'Drogas la Rebaja', 'Avenida 2, Pueblo', '456-789-01'),
(3, 'Drogueria Alemana', 'Carrera 3, Villa', '789-012-34'),
(4, 'Cruz Verde', 'Calle 4, Ciudad', '234-567-89'),
(5, 'Drogueria Alemana', 'Avenida 5, Pueblo', '567-890-12'),
(6, 'Drogas la rebaja', 'Carrera 6, Villa', '890-123-45'),
(7, 'Drogas la rebaja', 'Calle 7, Ciudad', '345-678-90'),
(8, 'Cruz Verde', 'Avenida 8, Pueblo', '678-901-23'),
(9, 'Cruz verde', 'Carrera 9, Villa', '901-234-56'),
(10, 'Drogueria Alemana', 'Calle 10, Ciudad', '123-234-56');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modulo`
--

CREATE TABLE `modulo` (
  `id_modulo` int(11) NOT NULL,
  `nombre_modulo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `modulo`
--

INSERT INTO `modulo` (`id_modulo`, `nombre_modulo`) VALUES
(12, 'farmacia'),
(13, 'stock'),
(14, 'proveedor'),
(15, 'producto'),
(16, 'agregarProducto'),
(17, 'cliente'),
(18, 'usuario'),
(19, 'rol'),
(20, 'modulo'),
(21, 'permisos'),
(22, 'factura');

--
-- Disparadores `modulo`
--
DELIMITER $$
CREATE TRIGGER `conectarModulo_permisos` AFTER INSERT ON `modulo` FOR EACH ROW BEGIN
        DECLARE usuarios INT;
        SET usuarios = (SELECT COUNT(id_rol) FROM rol);

        IF (usuarios > 0) THEN
            
            WHILE (usuarios > 0) DO
                INSERT INTO permisos(id_rol,id_modulo) VALUES (usuarios, NEW.id_modulo);
                SET usuarios = usuarios-1;
            END WHILE;

            IF NEW.nombre_modulo IN ('farmacia', 'usuario','proveedor') THEN
                UPDATE permisos SET insertar = true, seleccionar = true, actualizar = true, borrar = true WHERE id_rol = 1;
            ELSEIF NEW.nombre_modulo IN ('stock') THEN
                UPDATE permisos SET seleccionar = true WHERE id_rol = 1;
                UPDATE permisos SET insertar = true, seleccionar = true, actualizar = true, borrar = true WHERE id_rol = 2;
            ELSEIF NEW.nombre_modulo IN ('producto') THEN
                UPDATE permisos SET seleccionar = true, actualizar = true WHERE id_rol = 1;
                UPDATE permisos SET insertar = true, seleccionar = true, actualizar = true, borrar = true WHERE id_rol = 2;
            ELSEIF NEW.nombre_modulo IN ('factura') THEN
                UPDATE permisos SET seleccionar = true, borrar = true WHERE id_rol = 1;
                UPDATE permisos SET insertar = true, seleccionar = true, actualizar = true WHERE id_rol = 2;
            ELSEIF NEW.nombre_modulo IN ('agregarProducto') THEN
                UPDATE permisos SET insertar = true, seleccionar = true, actualizar = true, borrar = true WHERE id_rol = 2;
            END IF;            
        ELSE
            SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'QUERY OK.fila tabla modulo: 1, fila tabla permisos: 0';
        END IF;
    END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `permisos`
--

CREATE TABLE `permisos` (
  `id_rol` int(11) NOT NULL,
  `id_modulo` int(11) NOT NULL,
  `insertar` tinyint(1) DEFAULT 0,
  `seleccionar` tinyint(1) DEFAULT 0,
  `actualizar` tinyint(1) DEFAULT 0,
  `borrar` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `permisos`
--

INSERT INTO `permisos` (`id_rol`, `id_modulo`, `insertar`, `seleccionar`, `actualizar`, `borrar`) VALUES
(1, 12, 1, 1, 1, 1),
(1, 13, 1, 1, 1, 1),
(1, 14, 1, 1, 1, 1),
(1, 15, 1, 1, 1, 1),
(1, 16, 1, 1, 1, 1),
(1, 17, 1, 1, 1, 1),
(1, 18, 1, 1, 1, 1),
(1, 19, 0, 1, 0, 1),
(1, 20, 0, 1, 0, 1),
(1, 21, 0, 1, 0, 1),
(1, 22, 0, 1, 0, 1),
(2, 12, 1, 1, 1, 1),
(2, 13, 1, 1, 1, 1),
(2, 14, 1, 1, 1, 1),
(2, 15, 1, 1, 1, 1),
(2, 16, 1, 1, 1, 1),
(2, 17, 1, 1, 1, 0),
(2, 18, 1, 1, 1, 0),
(2, 19, 1, 1, 1, 0),
(2, 20, 1, 1, 1, 0),
(2, 21, 1, 1, 1, 0),
(2, 22, 1, 1, 1, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id_producto` int(11) NOT NULL,
  `nombre_producto` varchar(25) DEFAULT NULL,
  `volumen` enum('miligramos','mililitros') DEFAULT NULL,
  `precio_unitario` decimal(7,1) DEFAULT NULL,
  `fecha_vencimiento` date DEFAULT NULL,
  `ingredientes` text DEFAULT NULL,
  `usos` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id_producto`, `nombre_producto`, `volumen`, `precio_unitario`, `fecha_vencimiento`, `ingredientes`, `usos`) VALUES
(11, 'Paracetamol', '', 5999.0, '2026-12-31', 'Paracetamol', 'Alivio del dolor y fiebre'),
(12, 'Amoxicilina', '', 12999.0, '2024-06-30', 'Amoxicilina', 'Antibiotico para infecciones'),
(13, 'Ibuprofeno', '', 8500.0, '2026-11-15', 'Ibuprofeno', 'Antiinflamatorio y analgesico'),
(14, 'Omeprazol', '', 15750.0, '2026-09-30', 'Omeprazol', 'Alivio de acidez estomacal'),
(15, 'Loratadina', '', 9999.0, '2024-04-15', 'Loratadina', 'Antihistaminico para alergias'),
(16, 'Vitamina C', '', 7500.0, '2026-10-31', 'Acido ascorbico', 'Suplemento vitaminico'),
(17, 'Aspirina', '', 6250.0, '2024-01-20', 'Acido acetilsalicilico', 'Analgesico y antipiretico'),
(18, 'Simvastatina', '', 14999.0, '2026-08-31', 'Simvastatina', 'Reduccion de colesterol'),
(19, 'Hidroclorotiazida', '', 11500.0, '2026-12-01', 'Hidroclorotiazida', 'Diuretico'),
(20, 'Sertralina', '', 17500.0, '2024-03-01', 'Sertralina', 'Antidepresivo selectivo de la recaptacion de serotonina');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `NIT` varchar(12) NOT NULL,
  `nombre_proveedor` varchar(40) DEFAULT NULL,
  `direccion` varchar(40) DEFAULT NULL,
  `telefono` char(10) DEFAULT NULL,
  `correo` varchar(35) DEFAULT NULL,
  `persona_contacto` varchar(35) DEFAULT NULL,
  `activo` tinyint(1) DEFAULT 1
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`NIT`, `nombre_proveedor`, `direccion`, `telefono`, `correo`, `persona_contacto`, `activo`) VALUES
('NIT1', 'BioPharma Solutions', 'Direcci?n 1', '111-111-11', 'biopharma@example.com', 'Carlos Londo?o', 0),
('NIT10', 'PrecisionMed Labs', 'Direcci?n 10', '101-010-10', 'precisionmed@example.com', 'Ivan Lopez', 1),
('NIT2', 'MedicoGen Labs', 'Direcci?n 2', '222-222-22', 'medicogen@example.com', 'Anna Barreras', 1),
('NIT3', 'CureLife Pharmaceuticals', 'Direcci?n 3', '333-333-33', 'curelife@example.com', 'Orlando Diarte', 1),
('NIT4', 'NovaCare Pharma', 'Direcci?n 4', '444-444-44', 'novacare@example.com', 'Omar Ortiz', 1),
('NIT5', 'VitalTech Pharmaceuticals', 'Direcci?n 5', '555-555-55', 'vitaltech@example.com', 'Nilson Londo?o', 1),
('NIT6', 'BioCure Sciences', 'Direcci?n 6', '666-666-66', 'biocure@example.com', 'Vanesa Cadavid', 0),
('NIT7', 'NaturPharma Andina', 'Direcci?n 7', '777-777-77', 'naturpharma@example.com', 'David Ortega', 1),
('NIT8', 'VitaSalud Cient?fica', 'Direcci?n 8', '888-888-88', 'vitasalud@example.com', 'Marta Bola?os', 1),
('NIT9', 'Innovaci?n M?dica Colombiana', 'Direcci?n 9', '999-999-99', 'innovacionmedica@example.com', 'Pedro Miranda', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id_rol` int(11) NOT NULL,
  `nombre` enum('encargado','administrador') DEFAULT NULL,
  `descripcion` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `rol`
--

INSERT INTO `rol` (`id_rol`, `nombre`, `descripcion`) VALUES
(1, 'administrador', 'registra y gestiona farmacias, encargados y proveedores'),
(2, 'encargado', 'gestiona el catalogo y registra compras');

--
-- Disparadores `rol`
--
DELIMITER $$
CREATE TRIGGER `conectarRol_permisos` AFTER INSERT ON `rol` FOR EACH ROW BEGIN
        IF ( SELECT COUNT(id_modulo) FROM modulo ) > 0 THEN
            INSERT INTO permisos(id_rol,id_modulo) VALUES (NEW.id_rol,(SELECT id_modulo FROM modulo));

            IF NEW.id_rol = 1 THEN
                UPDATE permisos SET insertar = true, seleccionar = true, actualizar = true, borrar = true WHERE id_modulo IN (SELECT id_modulo FROM modulo WHERE nombre_modulo IN ('farmacia', 'usuario','proveedor'));
                UPDATE permisos SET seleccionar = true WHERE id_modulo IN (SELECT id_modulo FROM modulo WHERE nombre_modulo IN ('stock'));
                UPDATE permisos SET seleccionar = true, actualizar = true WHERE id_modulo IN (SELECT id_modulo FROM modulo WHERE nombre_modulo IN ('producto'));
                UPDATE permisos SET seleccionar = true, borrar = true WHERE id_modulo IN (SELECT id_modulo FROM modulo WHERE nombre_modulo IN ('factura'));
            ELSE
                UPDATE permisos SET insertar = true, seleccionar = true, actualizar = true, borrar = true WHERE id_modulo IN (SELECT id_modulo FROM modulo WHERE nombre_modulo IN ('stock', 'producto', 'agregarProducto'));
                UPDATE permisos SET insertar = true, seleccionar = true, actualizar = true WHERE id_modulo IN (SELECT id_modulo FROM modulo WHERE nombre_modulo IN ('factura'));
            END IF;
        END IF;
    END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `stock`
--

CREATE TABLE `stock` (
  `id_farmacia` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `proveedor` varchar(12) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `stock`
--

INSERT INTO `stock` (`id_farmacia`, `id_producto`, `proveedor`, `cantidad`) VALUES
(1, 14, 'NIT7', 48),
(1, 20, 'NIT1', 30),
(2, 13, 'NIT5', 86),
(3, 12, 'NIT6', 50),
(4, 14, 'NIT4', 120),
(5, 20, 'NIT3', 10),
(7, 18, 'NIT9', 10),
(9, 11, 'NIT6', 100),
(9, 13, 'NIT7', 100),
(10, 20, 'NIT10', 90);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` varchar(20) DEFAULT NULL,
  `clave` varchar(15) DEFAULT NULL,
  `farmacia` int(11) DEFAULT NULL,
  `rol` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `nombre_usuario`, `clave`, `farmacia`, `rol`) VALUES
(1, 'pepito23', 'clave123', 1, 1),
(2, 'MGomez', 'abc456', 2, 2),
(3, 'Car30Ruiz', 'securePass', 3, 2),
(4, 'Laures123', 'userPass123', 4, 2),
(5, 'PedroL', 'passWord42', 5, 2),
(6, 'AGarcia', 'strongPass', 6, 2),
(7, 'Dani2024', 'secret123', 7, 2),
(8, 'SofiaDiaz', 'myPass789', 8, 2),
(9, 'DiegoH14', 'pass1234', 9, 2),
(10, 'Usuario24', 'adminPass', 10, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `agregarproducto`
--
ALTER TABLE `agregarproducto`
  ADD PRIMARY KEY (`numReferencia`,`id_producto`),
  ADD KEY `id_producto` (`id_producto`);

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
-- Indices de la tabla `farmacia`
--
ALTER TABLE `farmacia`
  ADD PRIMARY KEY (`id_farmacia`);

--
-- Indices de la tabla `modulo`
--
ALTER TABLE `modulo`
  ADD PRIMARY KEY (`id_modulo`);

--
-- Indices de la tabla `permisos`
--
ALTER TABLE `permisos`
  ADD PRIMARY KEY (`id_rol`,`id_modulo`),
  ADD KEY `id_modulo` (`id_modulo`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`NIT`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`id_farmacia`,`id_producto`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `proveedor` (`proveedor`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD KEY `farmacia` (`farmacia`),
  ADD KEY `rol` (`rol`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `factura`
--
ALTER TABLE `factura`
  MODIFY `numReferencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT de la tabla `farmacia`
--
ALTER TABLE `farmacia`
  MODIFY `id_farmacia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `modulo`
--
ALTER TABLE `modulo`
  MODIFY `id_modulo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT de la tabla `rol`
--
ALTER TABLE `rol`
  MODIFY `id_rol` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `agregarproducto`
--
ALTER TABLE `agregarproducto`
  ADD CONSTRAINT `agregarproducto_ibfk_1` FOREIGN KEY (`numReferencia`) REFERENCES `factura` (`numReferencia`),
  ADD CONSTRAINT `agregarproducto_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`);

--
-- Filtros para la tabla `permisos`
--
ALTER TABLE `permisos`
  ADD CONSTRAINT `permisos_ibfk_1` FOREIGN KEY (`id_rol`) REFERENCES `rol` (`id_rol`),
  ADD CONSTRAINT `permisos_ibfk_2` FOREIGN KEY (`id_modulo`) REFERENCES `modulo` (`id_modulo`);

--
-- Filtros para la tabla `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `stock_ibfk_1` FOREIGN KEY (`id_farmacia`) REFERENCES `farmacia` (`id_farmacia`),
  ADD CONSTRAINT `stock_ibfk_2` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id_producto`),
  ADD CONSTRAINT `stock_ibfk_3` FOREIGN KEY (`proveedor`) REFERENCES `proveedor` (`NIT`);

--
-- Filtros para la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `usuario_ibfk_1` FOREIGN KEY (`farmacia`) REFERENCES `farmacia` (`id_farmacia`),
  ADD CONSTRAINT `usuario_ibfk_2` FOREIGN KEY (`rol`) REFERENCES `rol` (`id_rol`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
