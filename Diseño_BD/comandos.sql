--TABLA ROL
CREATE TABLE rol(
id_rol INT PRIMARY KEY AUTO_INCREMENT,
nombre ENUM('encargado','administrador'),
descripcion TEXT);

--TABLA MODULO
CREATE TABLE modulo(
id_modulo INT PRIMARY KEY AUTO_INCREMENT,
nombre_modulo VARCHAR(20));

--TABLA PERMISOS
CREATE TABLE permisos(
id_rol INT,
id_modulo INT,
PRIMARY KEY(id_rol,id_modulo),
FOREIGN KEY(id_rol) REFERENCES rol(id_rol),
FOREIGN KEY(id_modulo) REFERENCES modulo(id_modulo),
insertar BOOLEAN DEFAULT false,
seleccionar BOOLEAN DEFAULT false,
actualizar BOOLEAN DEFAULT false,
borrar BOOLEAN DEFAULT false);

--TRIGGER ROl
DELIMITER //
CREATE TRIGGER conectarRol_permisos AFTER INSERT ON rol
FOR EACH ROW
    BEGIN
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
// DELIMITER ;

--TRIGGER MODULO
DELIMITER //
CREATE TRIGGER conectarModulo_permisos AFTER INSERT ON modulo
FOR EACH ROW
    BEGIN
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
// DELIMITER ;

--TABLA FARMACIA
CREATE TABLE farmacia(
id_farmacia INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(25),
direccion VARCHAR(40),
telefono CHAR(10));

--TABLA USUARIO
CREATE TABLE usuario(
id_usuario INT PRIMARY KEY AUTO_INCREMENT,
nombre_usuario VARCHAR(20),
clave VARCHAR(15),
farmacia INT,
rol INT,
FOREIGN KEY(farmacia)REFERENCES farmacia(id_farmacia),
FOREIGN KEY(rol)REFERENCES rol(id_rol));

--TABLA PRODUCTO
CREATE TABLE producto(
id_producto INT PRIMARY KEY AUTO_INCREMENT,
nombre_producto VARCHAR(25),
volumen ENUM('gramos','mililitros'),
precio_unitario DECIMAL(7,1),
fecha_vencimiento DATE,
ingredientes TEXT,
usos TEXT);

--TABLA FACTURA
CREATE TABLE factura(
numReferencia INT PRIMARY KEY AUTO_INCREMENT,
fecha DATE,
hora TIME,
id_cliente CHAR(10),
nombre_cliente VARCHAR(35),
sub_total INT,
iva DECIMAL(7,1),
total DECIMAL(8,1));

--TABLA AGREGAR PRODUCTO
CREATE TABLE agregarProducto(
numReferencia INT,
id_producto INT,
PRIMARY KEY(numReferencia,id_producto),
FOREIGN KEY(numReferencia) REFERENCES factura(numReferencia),
FOREIGN KEY(id_producto) REFERENCES producto(id_producto),
cantidad INT,
suma_total INT);

--TRIGGERS AGREGAR PRODUCTO

CREATE TRIGGER calcularSumaTotal BEFORE INSERT ON agregarProducto
FOR EACH ROW
    SET NEW.suma_total = NEW.cantidad * (SELECT precio_unitario FROM producto WHERE id_producto = NEW.id_producto)
;

DELIMITER //
CREATE TRIGGER sumarFactura AFTER INSERT ON agregarProducto
FOR EACH ROW
    BEGIN
        
        DECLARE impuesto DECIMAL(7,1);
        DECLARE partial_cost DECIMAL(8,1);
        DECLARE pago DECIMAL(8,1);
        SET partial_cost=(SELECT SUM(suma_total) FROM agregarProducto WHERE numReferencia = NEW.numReferencia);
        SET impuesto = partial_cost * 0.05;
        SET pago = partial_cost + impuesto;
        
        UPDATE factura SET sub_total = partial_cost, iva = impuesto, total = pago WHERE numReferencia = NEW.numReferencia;
    END
// DELIMITER;

--TABLA CLIENTE
CREATE TABLE cliente(
cedula CHAR(10) PRIMARY KEY,
nombre VARCHAR(35));


--TRIGGER FACTURA
DELIMITER //
CREATE TRIGGER agregarCliente AFTER INSERT ON factura
FOR EACH ROW
    BEGIN
        DECLARE consulta INT;
        DECLARE nombre VARCHAR(35);
        SET consulta = (SELECT COUNT(cedula) FROM cliente WHERE cedula = NEW.id_cliente);
        IF (consulta = 0) THEN
            INSERT INTO cliente VALUES(NEW.id_cliente,NEW.nombre_cliente);
        END IF;
    END
// DELIMITER;

--TABLA PROVEEDOR
CREATE TABLE proveedor(
NIT VARCHAR(12) PRIMARY KEY,
nombre_proveedor VARCHAR(40),
direccion VARCHAR(40),
telefono CHAR(10),
correo VARCHAR(35),
persona_contacto VARCHAR(35),
activo BOOLEAN DEFAULT true);


--TABLA STOCK
CREATE TABLE stock(
id_farmacia INT,
id_producto INT,
PRIMARY KEY(id_farmacia, id_producto),
FOREIGN KEY(id_farmacia) REFERENCES farmacia(id_farmacia),
FOREIGN KEY(id_producto) REFERENCES producto(id_producto),
proveedor VARCHAR(12),
FOREIGN KEY(proveedor) REFERENCES proveedor(NIT),
cantidad INT);

--INSERTAR PROVEEDORES
INSERT INTO proveedor (NIT, nombre_proveedor, direccion, telefono, correo, persona_contacto, activo)
VALUES
    ('NIT1', 'BioPharma Solutions', 'Dirección 1', '111-111-1111', 'biopharma@example.com', 'Carlos Londoño', false),
    ('NIT2', 'MedicoGen Labs', 'Dirección 2', '222-222-2222', 'medicogen@example.com', 'Anna Barreras', true),
    ('NIT3', 'CureLife Pharmaceuticals', 'Dirección 3', '333-333-3333', 'curelife@example.com', 'Orlando Diarte', true),
    ('NIT4', 'NovaCare Pharma', 'Dirección 4', '444-444-4444', 'novacare@example.com', 'Omar Ortiz', true),
    ('NIT5', 'VitalTech Pharmaceuticals', 'Dirección 5', '555-555-5555', 'vitaltech@example.com', 'Nilson Londoño', true),
    ('NIT6', 'BioCure Sciences', 'Dirección 6', '666-666-6666', 'biocure@example.com', 'Vanesa Cadavid', false),
    ('NIT7', 'NaturPharma Andina', 'Dirección 7', '777-777-7777', 'naturpharma@example.com', 'David Ortega', true),
    ('NIT8', 'VitaSalud Científica', 'Dirección 8', '888-888-8888', 'vitasalud@example.com', 'Marta Bolaños', true),
    ('NIT9', 'Innovación Médica Colombiana', 'Dirección 9', '999-999-9999', 'innovacionmedica@example.com', 'Pedro Miranda', true),
    ('NIT10', 'PrecisionMed Labs', 'Dirección 10', '101-010-1010', 'precisionmed@example.com', 'Ivan Lopez', true);


--INSERTAR PRODUCTOS
INSERT INTO producto (nombre_producto, volumen, precio_unitario, fecha_vencimiento, ingredientes, usos)
VALUES
    ('Paracetamol', 'ml', 5999, '2026-12-31', 'Paracetamol', 'Alivio del dolor y fiebre'),
    ('Amoxicilina', 'mg', 12999, '2024-06-30', 'Amoxicilina', 'Antibiotico para infecciones'),
    ('Ibuprofeno', 'mg', 8500, '2026-11-15', 'Ibuprofeno', 'Antiinflamatorio y analgesico'),
    ('Omeprazol', 'mg', 15750, '2026-09-30', 'Omeprazol', 'Alivio de acidez estomacal'),
    ('Loratadina', 'mg', 9999, '2024-04-15', 'Loratadina', 'Antihistaminico para alergias'),
    ('Vitamina C', 'mg', 7500, '2026-10-31', 'Acido ascórbico', 'Suplemento vitaminico'),
    ('Aspirina', 'mg', 6250, '2024-01-20', 'Acido acetilsalicílico', 'Analgesico y antipiretico'),
    ('Simvastatina', 'mg', 14999, '2026-08-31', 'Simvastatina', 'Reduccion de colesterol'),
    ('Hidroclorotiazida', 'mg', 11500, '2026-12-01', 'Hidroclorotiazida', 'Diuretico'),
    ('Sertralina', 'mg', 17500, '2024-03-01', 'Sertralina', 'Antidepresivo selectivo de la recaptacion de serotonina');

--INSERTAR FARMACIAS
INSERT INTO farmacia(nombre,direccion,telefono)
VALUES
    ('Cruz Verde', 'Calle 1, Ciudad', '123-456-7890'),
    ('Drogas la Rebaja', 'Avenida 2, Pueblo', '456-789-0123'),
    ('Drogueria Alemana', 'Carrera 3, Villa', '789-012-3456'),
    ('Cruz Verde', 'Calle 4, Ciudad', '234-567-8901'),
    ('Drogueria Alemana', 'Avenida 5, Pueblo', '567-890-1234'),
    ('Drogas la rebaja', 'Carrera 6, Villa', '890-123-4567'),
    ('Drogas la rebaja', 'Calle 7, Ciudad', '345-678-9012'),
    ('Cruz Verde', 'Avenida 8, Pueblo', '678-901-2345'),
    ('Cruz verde', 'Carrera 9, Villa', '901-234-5678'),
    ('Drogueria Alemana', 'Calle 10, Ciudad', '123-234-5678');

--INSERTAR  STOCK

INSERT INTO stock(id_farmacia,id_producto,proveedor,cantidad)
VALUES
    (3,12,'NIT6',50),
    (9,11,'NIT6',100),
    (4,14,'NIT4',120),
    (1,20,'NIT1',30),
    (7,18,'NIT9',10),
    (5,20,'NIT3',10),
    (10,20,'NIT10',90),
    (2,13,'NIT5',86),
    (9,13,'NIT7',100),
    (1,14,'NIT7',48);
    

--INSERTAR FACTURAS

INSERT INTO factura(fecha, hora, id_cliente, nombre_cliente, sub_total, iva, total)
VALUES
    ('2024-03-07', '12:30:00', '10100', 'Camila Murillo', 0,0,0),
    ('2024-03-07', '13:45:00', '10200', 'Alejandra Garces', 0,0,0),
    ('2024-03-07', '14:15:00', '10300', 'Catalina Rojas', 0,0,0),
    ('2024-03-07', '15:00:00', '10400', 'Artemiz Arias', 0,0,0),
    ('2024-03-07', '15:45:00', '10500', 'Diego Osorio', 0,0,0),
    ('2024-03-07', '16:30:00', '10600', 'Diego Jaramillo', 0,0,0),
    ('2024-03-07', '17:00:00', '10700', 'Alejandra Rojas', 0,0,0),
    ('2024-03-07', '17:45:00', '10800', 'Natalia Ortiz', 0,0,0),
    ('2024-03-07', '18:30:00', '10900', 'Macarena Rojas', 0,0,0),
    ('2024-03-07', '19:15:00', '11000', 'Sebastia Ardila', 0,0,0);

--INSERTAR AGREGAR PRODUCTOS

INSERT INTO agregarProducto(numReferencia,id_producto,cantidad,suma_total)
VALUES
    (31,12,2,0),
    (39,11,1,0),
    (40,14,3,0),
    (31,20,5,0),
    (37,18,1,0),
    (35,20,2,0),
    (40,20,4,0),
    (32,13,3,0),
    (39,13,1,0),
    (31,14,1,0);

--INSERTAR ROLES

INSERT INTO rol(nombre,descripcion)
VALUES
    ('Administrador', 'registra y gestiona farmacias, encargados y proveedores'),
    ( 'encargado', 'gestiona el catalogo y registra compras');


--INSERTAR MODULOS

INSERT INTO modulo(nombre_modulo)
VALUES
    ('farmacia'),
    ('stock'),
    ('proveedor'),
    ('producto'),
    ('agregarProducto'),
    ('cliente'),
    ('usuario'),
    ('rol'),
    ('modulo'),
    ('permisos'),
    ('factura');

--INSERTAR USUARIOS

INSERT INTO usuario(clave, nombre_usuario,farmacia,rol)
VALUES
    ('clave123', 'pepito23', 1, 1),
    ('abc456', 'MGomez', 2, 2),
    ('securePass', 'Car30Ruiz', 3, 2),
    ('userPass123', 'Laures123', 4, 2),
    ('passWord42', 'PedroL', 5, 2),
    ('strongPass', 'AGarcia', 6, 2),
    ('secret123', 'Dani2024', 7,2),
    ('myPass789', 'SofiaDiaz', 8, 2),
    ('pass1234', 'DiegoH14', 9, 2),
    ('adminPass', 'Usuario24', 10, 2);


