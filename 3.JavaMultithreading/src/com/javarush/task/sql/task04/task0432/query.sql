-- Write your code here:
SELECT MONTHNAME(date) AS month_name, COUNT(*) AS error_count
FROM event
WHERE status IN ('ERROR', 'FAILED')
GROUP BY MONTHNAME(date)
ORDER BY error_count DESC
LIMIT 1