-- Write your code here:
SELECT YEAR(date), MONTH(date), DAY(date), count(*) as result
FROM event
WHERE id = 3 and type = 'SOLVE_TASK' and status = 'OK'
GROUP BY YEAR(date), MONTH(date), DAY(date)