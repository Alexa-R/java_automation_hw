SET SQL_SAFE_UPDATES = 0;

CREATE DATABASE goodsDB;

USE goodsDB;

CREATE TABLE goods(
id int auto_increment primary key NOT NULL,
product_type_id int,
product_name varchar(31) not null,
product_count int CHECK (product_count>=0),
cost_of_unit double CHECK (cost_of_unit>0) 
);

CREATE TABLE type_of_goods (
	id int auto_increment primary key not null,
    type_name varchar(31) unique
);

CREATE TABLE shops(
id int auto_increment primary key,
shop_name varchar(31) unique
);

CREATE TABLE goods_to_shop(
goods_id int not null,
shop_id int not null,
primary key (goods_id, shop_id)
);

INSERT INTO shops VALUES
	(null,'Zara'),
	(null,'Mango'),
	(null,'Kotop');
	
INSERT INTO goods_to_shop VALUES
	(1,1),
	(2,2),
	(3,3),
	(13,1),
	(14,1),
	(4,2),
	(5,2),
	(6,3),
	(7,2),
	(8,1),
	(9,3),
    (10,3),
    (11,2),
    (12,2);
		
INSERT INTO goods VALUES
	(null, 1, 'Mauri', 56, 99.99),
	(null, 1, 'Safari', 15, 103.50),
	(null, 1, 'Sleeve', 21, 149.99),
	(null, 2, 'PlanaB', 25, 69.99),
	(null, 2, 'Pocket', 30, 98.98),
	(null, 2, 'Chalacro', 29, 54.20),
	(null, 3, 'Berlina', 72, 85.99),
	(null, 3, 'MOM', 33, 56.99),
    (null, 3, 'Bowie', 49, 86.54),
	(null, 4, 'Nune06', 62, 119.99),
    (null, 4, 'WCamo Insp HDY', 36, 59.10),
	(null, 4, 'Ikonik', 72, 40.99),
    (null, 5, 'Elna', 36, 20.59),
	(null, 5, 'Gardens', 30, 129.25),
    (null, 5, 'Windgates', 48, 89.40),
    (null, 1, 'Something', 20, 200.0);
        
INSERT INTO type_of_goods VALUES
	(null, 'DRESS'),
	(null, 'SHIRT'),
	(null, 'TROUSERS'),
    (null, 'SWEATER'),
	(null, 'SKIRT');   
    
INSERT INTO goods VALUES
(null, 5, 'Gardens', 30, 129.25);
    
INSERT INTO goods VALUES
(null, null, 'Smth', 30, 129.25);
    
ALTER TABLE type_of_goods ADD description varchar(31);
ALTER TABLE type_of_goods DROP COLUMN description;
UPDATE goods SET cost_of_unit = 210.0 WHERE product_name = 'Something';
DELETE FROM goods WHERE product_name = 'Something';
    
SELECT*FROM goods;
SELECT*FROM type_of_goods;
    
SELECT product_name, product_count FROM goods;
SELECT product_name, cost_of_unit FROM goods WHERE cost_of_unit < 70.0;
SELECT product_name, cost_of_unit FROM goods WHERE cost_of_unit IN (69.99, 54.2);
SELECT product_name, product_count FROM goods WHERE product_count BETWEEN 25 AND 35;
SELECT product_name FROM goods WHERE product_name LIKE '%ina';
SELECT product_name, product_count FROM goods WHERE product_count BETWEEN 25 AND 35 ORDER BY product_name;
    
    
SELECT DISTINCT product_name FROM goods WHERE product_count BETWEEN 25 AND 35;
SELECT product_name, type_name FROM goods g JOIN type_of_goods t ON g.product_type_id = t.id;
    
SELECT product_name, type_name FROM goods g LEFT JOIN type_of_goods t ON g.product_type_id = t.id;
SELECT product_name, type_name FROM goods g RIGHT JOIN type_of_goods t ON g.product_type_id = t.id;
SELECT product_name, type_name FROM goods g INNER JOIN type_of_goods t ON g.product_type_id = t.id;
    
SELECT product_name, product_count FROM goods GROUP BY product_name;

SELECT product_name, product_count FROM goods
GROUP BY product_name
HAVING product_count<30;
    
SELECT*FROM goods g WHERE EXISTS (SELECT * FROM type_of_goods t WHERE g.product_type_id = t.id);
SELECT*FROM goods g WHERE NOT EXISTS (SELECT * FROM type_of_goods t WHERE g.product_type_id = t.id);
    
SELECT product_name FROM goods
UNION
SELECT type_name FROM type_of_goods;
    
SELECT SUM(product_count) as 'Total product count' FROM goods;
SELECT MIN(cost_of_unit) as 'Min cost of unit' FROM goods;
SELECT MAX(cost_of_unit) as 'Max cost of unit' FROM goods;
SELECT AVG(cost_of_unit) as 'Average cost of unit' FROM goods;
SELECT COUNT(id) from goods;

SELECT DISTINCT product_type_id from goods;

SELECT AVG(cost_of_unit),type_name FROM goods, type_of_goods where product_type_id = 1
UNION
SELECT AVG(cost_of_unit), type_name FROM goods, type_of_goods where product_type_id = 2;
    
SELECT type_name, AVG(cost_of_unit)
FROM goods g join type_of_goods t on g.product_type_id = t.id
GROUP BY type_name;

SELECT COUNT( DISTINCT product_type_id) FROM goods;
    
SELECT COUNT(id) FROM goods;


    
    
    
    
