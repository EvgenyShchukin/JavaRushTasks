-- Write your code here:
SELECT DISTINCT b.title
FROM book b JOIN author a ON b.author_id = a.id
WHERE a.full_name = 'Edgar Allan Po