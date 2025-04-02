-- Write your code here:
SELECT
    a.full_name,
    COUNT(DISTINCT b.publisher_id) AS publishers
FROM
    author a LEFT JOIN book b ON a.id = b.author_id
LEFT JOIN publisher p  ON b.publisher_id = p.id
GROUP BY a.id