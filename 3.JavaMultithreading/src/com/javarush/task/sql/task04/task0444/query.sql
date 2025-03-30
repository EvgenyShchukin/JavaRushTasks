-- Write your code here:
select CONCAT(city, '-',  LENGTH(city))
from cities
ORDER BY LENGTH(city)
LIMIT 3