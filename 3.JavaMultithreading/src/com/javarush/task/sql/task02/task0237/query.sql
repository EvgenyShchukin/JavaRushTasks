-- Write your code here:
select cars.name, cars.prod_year, count(*)
from cars
group by name, prod_year, price