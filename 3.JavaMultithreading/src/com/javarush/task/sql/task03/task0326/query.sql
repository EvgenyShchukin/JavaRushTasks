-- Write your code here:
select email, orders.*
from customers RIGHT JOIN test.orders on customers.customer_id = orders.customer_id