-- Write your code here:
select department, position, count(*) as total
from employee
GROUP BY department, position
HAVING position = ' backend developer' AND total = 1