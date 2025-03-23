-- Write your code here:
select department as department_name, count(*) as count
from employee
WHERE position = 'frontend developer'
GROUP BY department