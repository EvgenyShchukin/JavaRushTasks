-- Write your code here:
select required, identifier, description
from parts
WHERE description is null OR required = 1