-- Write your code here:
select YEAR(date_of_birth), MONTH(date_of_birth), count(*)
from employee
GROUP BY YEAR(date_of_birth), MONTH(date_of_birth)
