-- Write your code here:
SELECT last_name
FROM film_directors
         LEFT JOIN (SELECT director_id, grossed
                    FROM films
                    WHERE grossed > 100
                    LIMIT 1) as film ON film_directors.id = film.director_id
WHERE country = 'UK'