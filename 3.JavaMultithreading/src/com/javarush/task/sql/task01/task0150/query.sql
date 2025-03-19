-- Write your code here:
select *
from parts
WHERE id BETWEEN 7 AND 23 AND identifier IS NULL
LIMIT 2