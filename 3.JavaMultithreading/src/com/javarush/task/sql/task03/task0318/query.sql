-- Write your code here:
select top_retailers.ret_name, top_retailers.ret_revenue, suppliers.sup_name, suppliers.sup_revenue
from top_retailers JOIN suppliers ON top_retailers.ret_revenue = suppliers.sup_revenue