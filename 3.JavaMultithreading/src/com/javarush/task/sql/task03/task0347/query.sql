-- Write your code here:
SELECT *
FROM film_directors RIGHT JOIN (
    SELECT title, director_id
    FROM films
    WHERE year_released > 1990
) as film ON film_directors.id = film.director_id
WHERE country = 'USA'
LIMIT 5