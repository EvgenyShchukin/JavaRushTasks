-- Write your code here:
select zip_code, order_id
from customers as c LEFT JOIN test.orders as o on c.customer_id = o.customer_id
where shipped_date IS NOT NULL AND store_id = 27