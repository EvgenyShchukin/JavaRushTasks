-- Write your code here:
select name
from part
where name LIKE '%Slope%' and name NOT LIKE '%45&deg;%'