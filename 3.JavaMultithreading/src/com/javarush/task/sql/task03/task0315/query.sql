-- Write your code here:
select ret.hq_location as ret_location, sup.annual_revenue_billions as sup_revenue
from top_retailers as ret, suppliers as sup
WHERE ret.hq_location NOT LIKE 'USA'