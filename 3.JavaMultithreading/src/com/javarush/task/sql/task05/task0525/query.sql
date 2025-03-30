-- Write your code here:
SELECT a.full_name,
       COUNT(b.book_id
             FROM book b JOIN author a ON a.id = b.author_id
             GROUP BY a.full_name
             HAVING COUNT(b.book_id) > 1