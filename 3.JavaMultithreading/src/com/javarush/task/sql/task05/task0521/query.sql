-- Write your code here:
select CONCAT( number,', ', name) as full_name
from lego_set
order by CHAR_LENGTH(full_name) ASC