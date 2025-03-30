-- Write your code here:
select a.sex as author_sex , a.country as author_country, b.copies_sold_millions as books_sold
from authors as a JOIN books as b ON a.author_id = b.author_id
where b.copies_sold_millions > 10
GROUP BY a.sex, a.country, b.copies_sold_millions
ORDER BY b.copies_sold_millions DESC