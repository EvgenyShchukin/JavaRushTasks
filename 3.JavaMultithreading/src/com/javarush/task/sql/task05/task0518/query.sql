-- Write your code here:
select released, count(*) as total
from lego_set
group by released
order by  total desc