-- Write your code here:
select ip_from, ip_to, country_name
from ip2country
ORDER BY ip_to DESC
LIMIT 10000
OFFSET 74