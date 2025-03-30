-- Write your code here:
select CASE
               WHEN position LIKE '%developer%' THEN REPLACE(position, 'developer', 'software developer')
               ELSE position
               END
from employee
