-- Write your code here:
select name, YEAR(date_of_birth), MONTH(date_of_birth)
from employee
WHERE MONTH(date_of_birth) IN (12, 1, 2)