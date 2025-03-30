-- Write your code here:
select *
from event
where date_time BETWEEN DATE_SUB(CURDATE(), INTERVAL 2 WEEK) and CURDATE()