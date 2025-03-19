-- Write your code here:
select id, identifier, description
from parts
ORDER BY identifier ASC , required DESC , description DESC
LIMIT 7