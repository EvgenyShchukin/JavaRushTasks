-- Write your code here:
select name, count(*) as result
from cars
GROUP BY name
HAVING result > 1

