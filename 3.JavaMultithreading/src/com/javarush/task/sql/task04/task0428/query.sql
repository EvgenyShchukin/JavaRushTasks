-- Write your code here:
select *
from event
where MONTH(date_time) = MONTH(CURDATE())
  AND YEAR(date_time) = YEAR(CURDATE())