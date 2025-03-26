-- Write your code here:
select ret_name, ret_revenue, sup_name, sup_revenue
from top_retailers JOIN suppliers ON ret_revenue = sup_revenue