DROP DATABASE IF EXISTS farmatech;
CREATE DATABASE farmatech;
USE farmatech;

--TABLA FARMACIA
CREATE TABLE farmacia(
NIT_farmacia VARCHAR(12) PRIMARY KEY,
foto LONGBLOB,
nombre VARCHAR(25),
direccion VARCHAR(40),
telefono CHAR(10));

--TABLA HISTORIAL DE ESTADOS FARMACIA
CREATE TABLE historialEstados_farmacia(
id_estado INT PRIMARY KEY AUTO_INCREMENT,
NIT_farmacia VARCHAR(12),
FOREIGN KEY(NIT_farmacia) REFERENCES farmacia(NIT_farmacia),
nombre ENUM('activo','inactivo'),
fechaHora_cambio DATETIME,
comentario TEXT);

--TABLA USUARIO
CREATE TABLE usuario(
id_usuario INT PRIMARY KEY AUTO_INCREMENT,
cedula CHAR(10),
nombre_usuario VARCHAR(35),
usuario VARCHAR(20),
clave VARCHAR(15),
rol ENUM('administrador','encargado'),
estado ENUM('activo','inactivo'),
fecha_inicio DATE,
fecha_termino  DATE);

--TABLA USUARIO FARMACIA
CREATE TABLE usuarioFarmacia(
id_usuarioFarmacia INT PRIMARY KEY AUTO_INCREMENT,
id_usuario INT,
NIT_farmacia VARCHAR(12),
FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
FOREIGN KEY(NIT_farmacia) REFERENCES farmacia(NIT_farmacia),
estado ENUM('activo','inactivo'),
fecha_inicio DATE,
fecha_termino DATE);

--TABLA PRODUCTO
CREATE TABLE producto(
id_producto INT PRIMARY KEY AUTO_INCREMENT,
nombre_producto VARCHAR(25),
medicamento LONGBLOB,
volumen ENUM('mg','ml'),
precio_unitario DECIMAL(7,1),
fecha_vencimiento DATE,
ingredientes TEXT,
usos TEXT);

--TABLA FACTURA
CREATE TABLE factura(
numReferencia INT PRIMARY KEY AUTO_INCREMENT,
NIT_farmacia VARCHAR(12),
FOREIGN KEY(NIT_farmacia) REFERENCES farmacia(NIT_farmacia),
fecha DATE,
hora TIME,
id_cliente CHAR(10),
nombre_cliente VARCHAR(35),
sub_total INT,
iva DECIMAL(7,1),
total DECIMAL(8,1));

--TABLA FACTURA PRODUCTO
CREATE TABLE facturaProducto(
id_facturaProducto INT PRIMARY KEY AUTO_INCREMENT,
numReferencia INT,
id_producto INT,
FOREIGN KEY(numReferencia) REFERENCES factura(numReferencia),
FOREIGN KEY(id_producto) REFERENCES producto(id_producto),
cantidad INT,
suma_total INT);

--TRIGGER FACTURA PRODUCTO (para calcular el valor final del producto al multiplicarse por la cantidad)

CREATE TRIGGER calcularSumaTotal BEFORE INSERT ON facturaProducto
FOR EACH ROW
    SET NEW.suma_total = NEW.cantidad * (SELECT precio_unitario FROM producto WHERE id_producto = NEW.id_producto)
;

--TRIGGER FACTURA PRODUCTO (para calcular el subtotal, iva, y total de la factura)

DELIMITER //
CREATE TRIGGER sumarFactura AFTER INSERT ON facturaProducto
FOR EACH ROW
    BEGIN
        
        DECLARE impuesto DECIMAL(7,1);
        DECLARE partial_cost DECIMAL(8,1);
        DECLARE pago DECIMAL(8,1);
        SET partial_cost=(SELECT SUM(suma_total) FROM facturaProducto WHERE numReferencia = NEW.numReferencia);
        SET impuesto = partial_cost * 0.05;
        SET pago = partial_cost + impuesto;
        
        UPDATE factura SET sub_total = partial_cost, iva = impuesto, total = pago WHERE numReferencia = NEW.numReferencia;
    END
// 
DELIMITER ;

--TABLA CLIENTE
CREATE TABLE cliente(
cedula CHAR(10) PRIMARY KEY,
nombre VARCHAR(35));


--TRIGGER FACTURA (para agregar clientes, que no se encuentran en la bd, desde la factura)
DELIMITER //
CREATE TRIGGER agregarCliente AFTER INSERT ON factura
FOR EACH ROW
    BEGIN
        DECLARE consulta INT;
        SET consulta = (SELECT COUNT(cedula) FROM cliente WHERE cedula = NEW.id_cliente);
        IF (consulta = 0) THEN
            INSERT INTO cliente VALUES(NEW.id_cliente,NEW.nombre_cliente);
        END IF;
    END
// 
DELIMITER ;

--TABLA PROVEEDOR
CREATE TABLE proveedor(
NIT_proveedor VARCHAR(12) PRIMARY KEY,
nombre_proveedor VARCHAR(40),
direccion VARCHAR(40),
telefono CHAR(10),
correo VARCHAR(35),
persona_contacto VARCHAR(35),
estado ENUM('activo','inactivo'));


--TABLA STOCK
CREATE TABLE stock(
id_stock INT PRIMARY KEY AUTO_INCREMENT,    
NIT_farmacia VARCHAR(12),
id_producto INT,
FOREIGN KEY(NIT_farmacia) REFERENCES farmacia(NIT_farmacia),
FOREIGN KEY(id_producto) REFERENCES producto(id_producto),
proveedor VARCHAR(12),
FOREIGN KEY(proveedor) REFERENCES proveedor(NIT_proveedor),
cant_entrante INT,
cant_restante INT,
estado ENUM('activo','inactivo'),
fecha_registro DATE,
fecha_descontinuacion DATE,
comentario TEXT);

--INSERTAR PROVEEDORES
INSERT INTO proveedor (NIT_proveedor, nombre_proveedor, direccion, telefono, correo, persona_contacto, estado)
VALUES
    ('NIT1', 'BioPharma Solutions', 'Dirección 1', '111-111-1111', 'biopharma@example.com', 'Carlos Londoño', 'inactivo'),
    ('NIT2', 'MedicoGen Labs', 'Dirección 2', '222-222-2222', 'medicogen@example.com', 'Anna Barreras', 'activo'),
    ('NIT3', 'CureLife Pharmaceuticals', 'Dirección 3', '333-333-3333', 'curelife@example.com', 'Orlando Diarte', 'activo'),
    ('NIT4', 'NovaCare Pharma', 'Dirección 4', '444-444-4444', 'novacare@example.com', 'Omar Ortiz', 'activo'),
    ('NIT5', 'VitalTech Pharmaceuticals', 'Dirección 5', '555-555-5555', 'vitaltech@example.com', 'Nilson Londoño', 'activo'),
    ('NIT6', 'BioCure Sciences', 'Dirección 6', '666-666-6666', 'biocure@example.com', 'Vanesa Cadavid', 'inactivo'),
    ('NIT7', 'NaturPharma Andina', 'Dirección 7', '777-777-7777', 'naturpharma@example.com', 'David Ortega', 'activo'),
    ('NIT8', 'VitaSalud Científica', 'Dirección 8', '888-888-8888', 'vitasalud@example.com', 'Marta Bolaños', 'activo'),
    ('NIT9', 'Innovación Médica Colombiana', 'Dirección 9', '999-999-9999', 'innovacionmedica@example.com', 'Pedro Miranda', 'activo'),
    ('NIT10', 'PrecisionMed Labs', 'Dirección 10', '101-010-1010', 'precisionmed@example.com', 'Ivan Lopez', 'activo');


--INSERTAR FARMACIAS
INSERT INTO farmacia(NIT_farmacia,nombre,direccion,telefono)
VALUES
    ('1001','Cruz Verde', 'Calle 1 Ciudad Jardin', '1234567890'),
    ('1002','Drogas la Rebaja', 'Avenida 2 Pueblo rico', '4567890123'),
    ('1003','Drogueria Alemana', 'Carrera 3 Villa santana', '7890123456'),
    ('1004','Cruz Verde', 'Calle 4  victoria', '2345678901'),
    ('1005','Drogueria Alemana', 'Avenida 5 Puebla', '5678901234'),
    ('1006','Drogas la rebaja', 'Carrera 6 Villa maria', '8901234567');


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

--INSERTAR  STOCK

INSERT INTO stock(NIT_farmacia,id_producto,proveedor,cant_entrante,cant_restante,estado,fecha_registro)
VALUES
    ('1003',1,'NIT6',50,50,'activo', CURDATE()),
    ('1006',2,'NIT6',100,100,'activo', CURDATE()),
    ('1004',3,'NIT4',120,120,'activo', CURDATE()),
    ('1001',4,'NIT1',30,30,'activo', CURDATE()),
    ('1002',5,'NIT9',10,10,'activo', CURDATE()),
    ('1005',6,'NIT3',10,10,'activo', CURDATE()),
    ('1006',7,'NIT10',90,90,'activo', CURDATE()),
    ('1002',8,'NIT5',86,86,'activo', CURDATE()),
    ('1005',9,'NIT7',100,100,'activo', CURDATE()),
    ('1001',10,'NIT7',20,20,'activo', CURDATE());
    

--INSERTAR FACTURAS

INSERT INTO factura(NIT_farmacia,fecha, hora, id_cliente, nombre_cliente, sub_total, iva, total)
VALUES
    ('1001','2024-03-07', '12:30:00', '10100', 'Camila Murillo', 0,0,0),
    ('1001','2024-03-07', '13:45:00', '10200', 'Alejandra Garces', 0,0,0),
    ('1001','2024-03-07', '15:45:00', '10500', 'Diego Osorio', 0,0,0),
    ('1002','2024-03-07', '16:30:00', '10600', 'Diego Jaramillo', 0,0,0),
    ('1006','2024-03-07', '14:15:00', '10300', 'Catalina Rojas', 0,0,0),
    ('1005','2024-03-07', '15:00:00', '10400', 'Artemiz Arias', 0,0,0),  
    ('1003','2024-03-07', '17:00:00', '10700', 'Alejandra Rojas', 0,0,0),
    ('1004','2024-03-07', '17:45:00', '10800', 'Natalia Ortiz', 0,0,0),
    ('1004','2024-03-07', '18:30:00', '10900', 'Macarena Rojas', 0,0,0),
    ('1005','2024-03-07', '19:15:00', '11000', 'Sebastia Ardila', 0,0,0);



--INSERTAR FACTURA PRODUCTO

INSERT INTO facturaProducto(numReferencia,id_producto,cantidad,suma_total)
VALUES
    (1,10,2,0),
    (1,4,5,0),
    (9,3,1,0),
    (4,9,1,0),
    (7,1,2,0),
    (7,1,1,0),
    (3,7,4,0),
    (3,2,3,0),
    (10,9,1,0),
    (10,6,3,0),
    (2,10,1,0),
    (5,4,4,0),
    (6,8,3,0),
    (8,3,1,0);


--INSERTAR USUARIOS

INSERT INTO usuario(cedula, nombre_usuario, clave,usuario,rol,estado,fecha_inicio)
VALUES
    ('20011','Pedro Perez','clave123', 'pepito23','administrador','activo',CURDATE()),
    ('20012','Maria Gomez','abc456', 'MGomez','encargado','activo',CURDATE()),
    ('20013','Carolina Ruiz','securePass', 'Car30Ruiz','encargado','activo',CURDATE()),
    ('20014','Laura Mora','userPass123', 'Laures123','encargado','activo',CURDATE()),
    ('20015','Pedro Lopez','passWord42', 'PedroL','encargado','activo',CURDATE()),
    ('20016','Alicia Garcia','strongPass', 'AGarcia','encargado','activo',CURDATE()),
    ('20017','Daniel Sanchez','secret123', 'Dani2024','encargado','activo',CURDATE());


--INSERTAR USUARIO FARMACIA

INSERT INTO usuarioFarmacia(id_usuario,NIT_farmacia,estado,fecha_inicio)
VALUES
    (1,'1001','activo',CURDATE()),
    (1,'1002','activo',CURDATE()),
    (1,'1003','activo',CURDATE()),
    (1,'1004','activo',CURDATE()),
    (1,'1005','activo',CURDATE()),
    (1,'1006','activo',CURDATE()),
    (2,'1001','activo',CURDATE()),
    (3,'1002','activo',CURDATE()),
    (4,'1003','activo',CURDATE()),
    (5,'1004','activo',CURDATE()),
    (6,'1005','activo',CURDATE()),
    (7,'1006','activo',CURDATE());
    





