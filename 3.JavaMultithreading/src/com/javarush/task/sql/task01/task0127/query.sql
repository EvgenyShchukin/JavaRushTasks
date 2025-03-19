-- Write your code here:
select *
from car
where model NOT LIKE '%a%' AND quantity BETWEEN 5 AND 500 AND booked_quantity BETWEEN 5 AND 500