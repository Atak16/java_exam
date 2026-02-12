-- ex1
INSERT INTO items (id, category_id, name, price)
VALUES (13, 1, '鰯', 150);

INSERT INTO items (id, category_id, name, price)
VALUES (14, 2, '羊', 650);


--   ex2
UPDATE items
SET price = trunc (price * 0.9);


--   ex3
DELETE FROM employees
WHERE end_date <= '2013-3-31';


--   ex4
SELECT id, name, email, start_date, end_date
FROM employees
WHERE end_date IS NULL
ORDER BY start_date
LIMIT 1;


--   ex5
SELECT a.name AS region, b.name AS prefecture
FROM prefectures b INNER JOIN regions a ON b.region_code = a.code; 


--   ex6
SELECT SUM(population) AS population
FROM populations;
