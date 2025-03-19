-- Write your code here:
select description
from parts
ORDER BY required  DESC , required DESC , description DESC
LIMIT 10000
OFFSET 23