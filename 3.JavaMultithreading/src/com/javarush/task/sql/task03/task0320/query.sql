-- Write your code here:
select retailer.ret_name, retailer.ret_revenue, supplier.sup_name, supplier.sup_revenue
from top_retailers as retailer JOIN suppliers as supplier ON retailer.ret_revenue = supplier.sup_revenue
WHERE supplier.sup_revenue > 50