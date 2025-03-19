-- Write your code here:
select brand, model, quantity, booked_quantity
from car
where brand IN ('renault', 'opel', 'seat', 'skoda') OR quantity < 10 AND booked_quantity < 10