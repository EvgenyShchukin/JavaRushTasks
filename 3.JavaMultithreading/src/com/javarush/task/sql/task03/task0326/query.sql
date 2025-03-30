-- Write your code here:
select customers.email, orders.orders.*
from customers RIGHT JOIN test.orders on customers.customer_id = orders.customer_id