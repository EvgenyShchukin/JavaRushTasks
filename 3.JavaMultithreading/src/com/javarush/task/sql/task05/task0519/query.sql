-- Write your code here:
select released, count(*) as total
from lego_set
where released < 10000
group by released
order by  total desc