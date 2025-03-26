-- Write your code here:
WITH tempTable AS (
    SELECT AVG(grossed) AS averageGrossed
    FROM films
)
WITH tempTable2 AS (
    SELECT AVG(year_released) as averageYearReleased
    FROM films
)
SELECT f.title, f.genre, f.year_released, f.grossed, t.averageGrossed, t2.averageYearReleased
FROM films as f
         JOIN tempTable t ON f.grossed > t.averageGrossed
         JOIN tempTable2 t2 ON f.year_released > t2.averageYearReleased
ORDER BY f.year_released