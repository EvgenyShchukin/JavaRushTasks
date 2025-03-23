-- Write your code here:
SELECT position,
       GROUP_CONCAT(name ORDER BY name SEPARATOR ', ') AS result
FROM employee
GROUP BY position
HAVING position LIKE '%developer%'