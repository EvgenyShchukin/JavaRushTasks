-- Write your code here:
select department, salary, name
from employee
where salary > 2200 and NOT department = 'qa'