-- Write your code here:
select department, position, count(*) as total
from employee
GROUP BY department, position
HAVING total BETWEEN 2 AND 3