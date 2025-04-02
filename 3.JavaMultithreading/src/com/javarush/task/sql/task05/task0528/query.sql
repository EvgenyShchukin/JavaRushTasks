-- Write your code here:
SELECT DISTINCT p.name
FROM book b
         JOIN author a ON b.author_id = a.id
         JOIN publisher p ON b.publisher_id = p._id
WHERE p.name = 'Mark Twain';