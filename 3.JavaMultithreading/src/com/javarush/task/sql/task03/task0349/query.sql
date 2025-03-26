-- Write your code here:
WITH tempTable AS (
    SELECT AVG(year_born) AS averageDOB
    FROM film_directors
)
SELECT fd.id, fd.full_name, fd.year_born, tt.averageDOB
FROM film_directors fd CROSS JOIN tempTable tt
WHERE fd.year_born < tt.averageDOB