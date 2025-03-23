-- Write your code here:
select name, count(cars.name) as result
from cars
GROUP BY name