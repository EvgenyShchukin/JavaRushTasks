-- Write your code here:
select YEAR(date), MONTH(date), DAY(date), sum(total)
from data
GROUP BY YEAR(date), MONTH(date), DAY(date)