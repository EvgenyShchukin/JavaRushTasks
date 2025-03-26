-- Write your code here:
select last_name as surname, order_id
from customers LEFT JOIN orders ON customers.customer_id = orders.customer_id