-- Write your code here:
select YEAR(date_of_birth) as year_of_birth, count(date_of_birth)
from employee
where position LIKE '%developer'
GROUP BY YEAR(date_of_birth)