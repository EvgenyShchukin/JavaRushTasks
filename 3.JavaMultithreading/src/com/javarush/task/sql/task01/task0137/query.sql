-- Write your code here:
select distinct ip2country.country_name
from ip2country
where country_name NOT LIKE ' ' AND country_name NOT LIKE '% %'