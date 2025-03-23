-- Write your code here:
select prod_year, count(prod_year) as car_count
from cars
GROUP BY prod_year