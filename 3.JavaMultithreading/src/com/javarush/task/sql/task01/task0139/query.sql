-- Write your code here:
select country_code, ip_from, ip_to
from ip2country
ORDER BY ip_from ASC
LIMIT 17