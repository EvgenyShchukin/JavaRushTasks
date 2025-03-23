-- Write your code here:
select name, count(name)
from cars
WHERE prod_year = 2021
GROUP BY name