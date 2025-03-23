-- Write your code here:
select department, count(*), position
from employee
GROUP BY department, position