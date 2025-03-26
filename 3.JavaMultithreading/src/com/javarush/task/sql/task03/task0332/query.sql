-- Write your code here:
select last_name as author, genre as genre, date_released as book_genre
from authors as аuth RIGHT JOIN books as book ON аuth.author_id = book.author_id
where date_released < 1900
GROUP BY book.genre, book.date_released;