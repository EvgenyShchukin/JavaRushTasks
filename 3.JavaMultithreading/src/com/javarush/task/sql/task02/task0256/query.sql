-- Write your code here:
select name, SUM(price), AVG(price)
from cars
GROUP BY name