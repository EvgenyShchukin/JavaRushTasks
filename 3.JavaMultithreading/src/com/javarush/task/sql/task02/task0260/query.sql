-- Write your code here:
select rating, GROUP_CONCAT(name ORDER BY name SEPARATOR ', ') AS names
from employee
WHERE rating > 2
ORDER BY rating