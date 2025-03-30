-- Write your code here:
select author.last_name as author, author.country as author_country, bookgenre as book_genre
from authors as author LEFT JOIN books as book ON author.author_id = book.author_id
where book.genre = 'fantasy'
GROUP BY author.last_name, author.country, book.genre
ORDER BY author.country ASC
LIMIT 5