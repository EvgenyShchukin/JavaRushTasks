-- Write your code here:
select country as author_country, count(book_id) as book_count
from authors as author JOIN books as book ON author.author_id = book.author_id
where genre = 'novel'
GROUP BY country
HAVING count(book_id) > 2