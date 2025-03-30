-- Write your code here:
select YEAR(date), MONTH(date), DAY(date), count(*)
from event
GROUP BY YEAR(date), MONTH(date), DAY(date)
HAVING count(*) > 5