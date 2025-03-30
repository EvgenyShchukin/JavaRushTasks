-- Write your code here:
SELECT
    a.full_name,
    COUNT(DISTINCT b.publisher_id) AS publishers
FROM
    author a LEFT JOIN book b ON a.author_id = b.id
GROUP BYa.author_id, a.first_name, a.last_name;