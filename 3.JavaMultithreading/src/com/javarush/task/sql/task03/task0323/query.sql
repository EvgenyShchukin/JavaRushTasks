-- Write your code here:
select customers.last_name as surname, orders.order_id
from customers LEFT JOIN orders ON customers.customer_id = orders.customer_id