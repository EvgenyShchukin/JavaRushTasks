-- Write your code here:
select
    CASE euro
        WHEN euro > 5 THEN 'best'
        WHEN euro = 5 THEN 'good'
        ELSE 'bad'
        END AS euro_status
from cars
where prod_year > 2020
ORDER BY price
LIMIT 5