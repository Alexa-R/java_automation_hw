## Задание:

 * 1 Создать базу данных для хранения информации приложения разработанного в рамках задания к первому модулю
 * 2 Привести примеры использования в рамках созданной базы данных.
 * 3 Все результаты хранить в специально созданном каталоге в репозитории и задокументировать примеры использования в README.md файле данного каталога.

##
## Примеры использования:
#
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
