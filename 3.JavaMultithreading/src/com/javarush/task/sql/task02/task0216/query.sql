-- Write your code here:
select
CASE position
        WHEN 'backend developer' THEN 'yes'
        WHEN 'frontend developer' THEN 'yes'
        ELSE 'no'
END AS position_status
from employee
where department = 'cool devs'