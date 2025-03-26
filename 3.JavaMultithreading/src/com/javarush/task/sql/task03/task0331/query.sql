-- Write your code here:
select last_name as author, title as book_title, copies_sold_millions as books_sold
from authors as a RIGHT JOIN books as b ON a.author_id = b.author_id
where copies_sold_millions > 50