-- Write your code here:
select c.customer_id, order_id
from customers as c LEFT JOIN test.orders o on c.customer_id = o.customer_id
where shipped_date IS NULL