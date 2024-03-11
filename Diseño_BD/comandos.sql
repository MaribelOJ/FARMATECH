--TABLA FARMACIA
CREATE TABLE farmacia(
id_farmacia INT PRIMARY KEY AUTO_INCREMENT,
nombre VARCHAR(25),
direccion VARCHAR(40),
telefono CHAR(10)
estado ENUM('activo','inactivo'));

--TABLA HISTORIAL DE ESTADOS FARMACIA
CREATE TABLE historialEstados_farmacia(
id_estado INT PRIMARY KEY AUTO_INCREMENT,
NIT_farmacia VARCHAR(12),
FOREIGN KEY(NIT_farmacia) REFERENCES farmacia(NIT_farmacia),
nombre_estado ENUM('activo','inactivo'),
fecha_cambio DATE,
comentario TEXT);

--TRIGGER FARMACIA (para crear el primer estado de una farmacia)

CREATE TRIGGER primerEstado_farmacia AFTER INSERT ON farmacia
FOR EACH ROW
    INSERT INTO historialEstados_farmacia VALUES(NEW.NIT_farmacia,'activo',CURDATE(),'estado de creación');
;

--TRIGGER HISTORIAL DE ESTADOS FARMACIA(para actualizar automaticamente una asignación cuando se desactiva una farmacia)

DELIMITER //
CREATE TRIGGER farmaciaDesactivada BEFORE INSERT ON historialEstados_farmacia
FOR EACH ROW 
    BEGIN
        IF(NEW.nombre != OLD.name) THEN
            UPDATE usuarioFarmacia SET estado = NEW.nombre, fecha_termino = CURDATE() WHERE NIT_farmacia = NEW.NIT_farmacia;
        END IF;
    END
// DELIMITER;



--TABLA USUARIO
CREATE TABLE usuario(
id_usuario INT PRIMARY KEY AUTO_INCREMENT,
nombre_usuario VARCHAR(20),
clave VARCHAR(15),
rol ENUM('administrador','encargado'),
estado ENUM('activo','inactivo'),
fecha_inicio DATE,
fecha_termino  DATE);

--TABLA USUARIO FARMACIA
CREATE TABLE usuarioFarmacia(
NIT_farmacia VARCHAR(12) PRIMARY KEY,
id_usuario INT,
id_farmacia INT,
FOREIGN KEY(id_usuario) REFERENCES usuario(id_usuario),
FOREIGN KEY(id_farmacia) REFERENCES farmacia(id_farmacia),
estado ENUM('activo','inactivo')
fecha_inicio DATE,
fecha_termino  DATE);




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

--TABLA FACTURA PRODUCTO
CREATE TABLE facturaProducto(
id_facturaProducto INT PRIMARY KEY AUTO_INCREMENT,
numReferencia INT,
id_producto INT,
FOREIGN KEY(numReferencia) REFERENCES factura(numReferencia),
FOREIGN KEY(id_producto) REFERENCES producto(id_producto),
cantidad INT,
suma_total INT);

--TRIGGER PRODUCTO FACTURA (para calcular el valor final del producto que se va a agrega al multiplicarse por la cantidad)

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


--TRIGGER FACTURA (para agregar clientes, que no se encuentran en la bd, desde la factura)
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
id_farmacia INT,
id_producto INT,
FOREIGN KEY(id_farmacia) REFERENCES farmacia(id_farmacia),
FOREIGN KEY(id_producto) REFERENCES producto(id_producto),
proveedor VARCHAR(12),
FOREIGN KEY(proveedor) REFERENCES proveedor(NIT),
cantidad INT,
estado ENUM('activo','inactivo')
fecha_registro DATE,
fecha_descontinuacion DATE);

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
INSERT INTO farmacia(NIT_farmacia,nombre,direccion,telefono)
VALUES
    ('1001','Cruz Verde', 'Calle 1, Ciudad', '123-456-7890'),
    ('1002','Drogas la Rebaja', 'Avenida 2, Pueblo', '456-789-0123'),
    ('1003','Drogueria Alemana', 'Carrera 3, Villa', '789-012-3456'),
    ('1004','Cruz Verde', 'Calle 4, Ciudad', '234-567-8901'),
    ('1005','Drogueria Alemana', 'Avenida 5, Pueblo', '567-890-1234'),
    ('1006','Drogas la rebaja', 'Carrera 6, Villa', '890-123-4567'),
    ('1007','Drogas la rebaja', 'Calle 7, Ciudad', '345-678-9012'),
    ('1008','Cruz Verde', 'Avenida 8, Pueblo', '678-901-2345'),
    ('1009','Cruz verde', 'Carrera 9, Villa', '901-234-5678'),
    ('1010','Drogueria Alemana', 'Calle 10, Ciudad', '123-234-5678');


--INSERTAR  STOCK

INSERT INTO stock(NIT_farmacia,id_producto,proveedor,cantidad,estado)
VALUES
    ('1003',1,'NIT6',50,'activo'),
    ('1009',2,'NIT6',100,'activo'),
    ('1004',3,'NIT4',120,'activo'),
    ('1001',4,'NIT1',30,'activo'),
    ('1007',5,'NIT9',10,'activo'),
    ('1005',6,'NIT3',0,'inactivo'),
    ('1010',7,'NIT10',90,'activo'),
    ('1002',8,'NIT5',86,'activo'),
    ('1009',9,'NIT7',100,'activo'),
    ('1001',10,'NIT7',20,'activo');
    

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

--INSERTAR FACTURA PRODUCTO

INSERT INTO facturaProducto(numReferencia,id_producto,cantidad,suma_total)
VALUES
    (31,2,2,0),
    (39,1,1,0),
    (40,4,3,0),
    (31,5,5,0),
    (37,8,1,0),
    (35,10,2,0),
    (40,3,4,0),
    (32,7,3,0),
    (39,9,1,0),
    (31,6,1,0);

--INSERTAR USUARIOS

INSERT INTO usuario(clave, nombre_usuario,rol,estado,fecha_inicio)
VALUES
    ('clave123', 'pepito23','administrador','activo',CURDATE()),
    ('abc456', 'MGomez','encargado','activo',CURDATE()),
    ('securePass', 'Car30Ruiz','encargado','activo',CURDATE()),
    ('userPass123', 'Laures123','encargado','activo',CURDATE()),
    ('passWord42', 'PedroL','encargado','activo',CURDATE()),
    ('strongPass', 'AGarcia','encargado','activo',CURDATE()),
    ('secret123', 'Dani2024','encargado','activo',CURDATE()),
    ('myPass789', 'SofiaDiaz','administrador','activo',CURDATE()),
    ('pass1234', 'DiegoH14','encargado','activo',CURDATE()),
    ('adminPass', 'Usuario24','encargado','activo',CURDATE());

--INSERTAR USUARIO FARMACIA

INSERT INTO usuarioFarmacia(id_usuario,NIT_farmacia,estado,fechaInicio)
VALUES
    (1,'1003','activo',CURDATE()),
    (1,'1009','activo',CURDATE()),
    (1,'1004','activo',CURDATE()),
    (1,'1001','activo',CURDATE()),
    (2,'1003','activo',CURDATE()),
    (3,'1009','activo',CURDATE()),
    (4,'1004','activo',CURDATE()),
    (5,'1001','activo',CURDATE()),
    (6,'1007','activo',CURDATE()),
    (7,'1005','activo',CURDATE()),
    (9,'1010','activo',CURDATE()),
    (10,'1009','activo',CURDATE()),
    (8,'1001','activo',CURDATE());
    (8,'1007','activo',CURDATE()),
    (8,'1005','activo',CURDATE()),
    (8,'1010','activo',CURDATE()),
    (8,'1009','activo',CURDATE()),

--TRIGGER USARIO FARMACIA (para actualizar asignación automaticamente cuando un usuario se desactiva)
DELIMITER //
CREATE TRIGGER usuarioInactivo BEFORE UPDATE usuario
FOR EACH ROW
    BEGIN
        IF(NEW.estado != OLD.estado) THEN
            UPDATE usuarioFarmacia SET estado = NEW.estado, fecha_termino = CURDATE() WHERE id_usuario = NEW.id_usuario;
        END IF;
    END
// DELIMITER;

--TRIGGER USARIO FARMACIA (para actualizar una asignación automaticamente cuando una farmacia se desactiva)
DELIMITER //
CREATE TRIGGER farmaciaInactiva BEFORE UPDATE historialEstados_farmacia
FOR EACH ROW
    BEGIN
        IF(NEW.estado != OLD.estado) THEN
            UPDATE usuarioFarmacia SET estado = NEW.estado, fecha_termino = CURDATE() WHERE id_usuario = NEW.id_usuario;
        END IF;
    END
// DELIMITER;



