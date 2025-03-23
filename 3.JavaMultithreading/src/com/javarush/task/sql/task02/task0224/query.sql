-- Write your code here:
select employee.department, count(*) as result
from employee
where position = 'backend developer'
GROUP BY department