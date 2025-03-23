-- Write your code here:
select cars.prod_year, count(prod_year) as result
from cars
group by prod_year