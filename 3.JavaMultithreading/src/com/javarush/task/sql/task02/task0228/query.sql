select department, count(*) as number_of_employees
from employee
GROUP BY department
