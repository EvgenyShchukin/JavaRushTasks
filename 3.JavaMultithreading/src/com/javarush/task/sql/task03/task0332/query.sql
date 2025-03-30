-- Write your code here:
select аuth.last_name as author, book.genre as book_genre, book.date_released
from authors as аuth RIGHT JOIN books as book ON аuth.author_id = book.author_id
where book.date_released < 1900
GROUP BY аuth.last_name, book.genre, book.date_released