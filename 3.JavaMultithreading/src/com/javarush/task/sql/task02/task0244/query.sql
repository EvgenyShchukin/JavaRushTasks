-- Write your code here:
select YEAR(prod_date) as prod_year , MONTH(prod_date) as prod_month , count(*)
from cars
WHERE name = 'Black Car' AND price > 99000
GROUP BY prod_year, prod_month