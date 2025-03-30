-- Write your code here:
SELECT b.isbn, b.title
FROM book b JOIN author a ON b.author_id = a.id
WHERE a.last_name LIKE 'S%