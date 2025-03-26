-- Write your code here:
select phone as cust_phone, order_date, total_cost, store_id
from customers RIGHT JOIN orders on customers.customer_id = orders.customer_id
where city = 'New York' AND order_status = 'PROCESSING'