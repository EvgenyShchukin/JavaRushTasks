-- Write your code here:
SELECT
    CASE experience
        WHEN experience < 1 THEN 'junior'
        WHEN experience BETWEEN 1 AND 2 THEN 'middle'
        WHEN experience BETWEEN 3 AND 4 THEN 'senior'
        ELSE 'unknown'
        END AS experience_status
FROM
    developers;