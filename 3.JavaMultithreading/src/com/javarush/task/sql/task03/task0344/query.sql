-- Write your code here:
SELECT title
FROM films LEFT JOIN  (
    SELECT id, last_name
    FROM film_directors
    WHERE last_name = 'Spielberg'
    LIMIT 1
) as director ON director.id = films.director_id