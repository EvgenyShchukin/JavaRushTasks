-- Write your code here:
select department, position, count(*) as total
from employee
GROUP BY department, position
HAVING position = 'manager' AND total = 1
LIMIT 2
OFFSET 1