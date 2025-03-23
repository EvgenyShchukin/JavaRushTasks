-- Write your code here:
select name, sum(price)
from cars
GROUP BY name