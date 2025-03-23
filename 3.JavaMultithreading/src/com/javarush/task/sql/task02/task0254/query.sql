-- Write your code here:
select name, MIN(price), MAX(price)
from cars
GROUP BY name