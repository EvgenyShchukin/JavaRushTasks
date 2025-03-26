-- Write your code here:
select cars.name, cars.prod_year, count(*), price
from cars
group by name, prod_year, price