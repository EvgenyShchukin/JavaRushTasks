-- Write your code here:
select prod_year, count(*) as result
from cars
where name = 'Blue Car'
GROUP BY prod_year