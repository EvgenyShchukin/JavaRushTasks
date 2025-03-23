-- Write your code here:
select is_full_time ,count(*) as result
from students
GROUP BY is_full_time