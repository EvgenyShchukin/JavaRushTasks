-- Write your code here:
select YEAR(date_of_birth), MONTH(date_of_birth)
from employee
GROUP BY YEAR(date_of_birth), MONTH(date_of_birth)
