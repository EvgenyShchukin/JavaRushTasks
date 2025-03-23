-- Write your code here:
select name, count(*) as car_count
from cars
GROUP BY name
HAVING car_count  < 3