-- Write your code here:
SELECT *
FROM films
WHERE films.title LIKE (
    SELECT title
    FROM films
    WHERE title LIKE 'The%r'
    LIMIT 1
)