-- Write your code here:
select ret_name, ret_revenue, sup_name, sup_revenue
from top_retailers as retailer JOIN suppliers as supplier ON ret_revenue = sup_revenue
WHERE sup_revenue > 50