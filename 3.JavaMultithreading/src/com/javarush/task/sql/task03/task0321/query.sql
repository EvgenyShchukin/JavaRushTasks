-- Write your code here:
select *
from customers JOIN test.orders on customers.customer_id = orders.customer_id
where total_cost > 100