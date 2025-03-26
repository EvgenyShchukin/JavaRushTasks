-- Write your code here:
select last_name as author, country as author_country, genre as book_genre
from authors as author LEFT JOIN books as book ON author.author_id = book.author_id
where genre = 'fantasy'
GROUP BY last_name, country, genre
ORDER BY country ASC
LIMIT 5