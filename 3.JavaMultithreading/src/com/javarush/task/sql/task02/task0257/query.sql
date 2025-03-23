-- Write your code here:
select name, AVG(price), SUM(price)
from cars
GROUP BY name
HAVING AVG(price) > 100000