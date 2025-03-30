-- Write your code here:
select r.ret_name, r.ret_location, s.sup_name, s.sup_country
from top_retailers as r JOIN suppliers as s ON r.ret_location = s.sup_country