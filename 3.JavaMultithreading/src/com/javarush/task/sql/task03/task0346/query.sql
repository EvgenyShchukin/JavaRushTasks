-- Write your code here:
SELECT *
FROM films JOIN  (
    SELECT id, year_born
    FROM film_directors
    WHERE year_born < 1940
) as director ON director.id = films.director_id
WHERE genre = 'sci-fi'