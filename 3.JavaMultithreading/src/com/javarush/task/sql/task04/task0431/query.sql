-- Write your code here:
select DAYNAME(date), COUNT(*) as result
from event
where type = 'REGISTRATION'
GROUP BY DAYNAME(date)
ORDER BY result DESC
LIMIT 1