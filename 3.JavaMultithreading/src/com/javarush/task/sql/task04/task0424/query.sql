-- Write your code here:
select employee.name, employee.position
from employee
where DAYOFYEAR(date_of_birth) <= 200