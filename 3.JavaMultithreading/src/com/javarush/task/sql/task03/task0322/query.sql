-- Write your code here:
select c.customer_id, c.email, o.order_id, o.order_status
from customers as c JOIN test.orders as o on c.customer_id = o.customer_id
where o.order_status LIKE '%PAID%' OR o.order_status LIKE '$PROCESSING%'