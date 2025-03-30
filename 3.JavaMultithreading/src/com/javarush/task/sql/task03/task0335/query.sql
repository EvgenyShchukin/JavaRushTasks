-- Write your code here:
select author.country as author_country, count(book.book_id) as book_count
from authors as author JOIN books as book ON author.author_id = book.author_id
where book.genre = 'novel'
GROUP BY author.country
HAVING count(book.book_id) > 2