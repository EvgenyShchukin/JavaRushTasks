-- Write your code here:
select id, identifier, description
from parts
ORDER BY identifier DESC , required DESC , description ASC