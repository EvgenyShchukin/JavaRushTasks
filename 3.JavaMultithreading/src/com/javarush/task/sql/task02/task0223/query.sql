-- Write your code here:
select department, count(*) as result
from employee
GROUP BY department