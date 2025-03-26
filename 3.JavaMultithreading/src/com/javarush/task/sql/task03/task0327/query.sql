-- Write your code here:
select city, store_id
from customers RIGHT JOIN test.orders on customers.customer_id = orders.customer_id
where order_status = 'SHIPPED' AND total_cost > 100