-- Write your code here:s
select employee.name, employee.position
from employee
where DAYNAME(date_of_birth) = 'Monday'