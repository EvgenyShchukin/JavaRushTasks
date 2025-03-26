-- Write your code here:
select year_born
from authors
where year_born <= (
    SELECT MAX(date_released)
    FROM books )