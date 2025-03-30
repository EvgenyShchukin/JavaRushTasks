-- Write your code here:
WITH tempTable (averageDOB) AS (
    SELECT AVG(year_born)
    FROM film_directors
)
SELECT fd.id, fd.full_name, fd.year_born, tt.averageDOB
FROM film_directors fd , tempTable tt
WHERE fd.year_born < tt.averageDOB