-- Write your code here:
select sex as author_sex , country as author_country, copies_sold_millions as books_sold
from authors as a JOIN books as b ON a.author_id = b.author_id
where copies_sold_millions > 10
GROUP BY sex, country, copies_sold_millions
ORDER BY copies_sold_millions DESC