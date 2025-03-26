-- Write your code here:
select *
from authors
where authors.author_id NOT IN (
    SELECT books.author_id
    FROM books
    WHERE books.author_id = 7 AND title = 'War and Peace'
    )