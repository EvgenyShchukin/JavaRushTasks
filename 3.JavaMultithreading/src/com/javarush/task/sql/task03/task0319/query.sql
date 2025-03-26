-- Write your code here:
select ret_name, ret_location, sup_name, sup_country
from top_retailers as r JOIN suppliers as s ON ret_location = sup_country