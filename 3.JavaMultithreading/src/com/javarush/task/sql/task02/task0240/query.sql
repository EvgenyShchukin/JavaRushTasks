-- Write your code here:
SELECT
    CASE
        WHEN EXTRACT(YEAR FROM date_of_birth) < 2000 THEN 'yes'
        ELSE 'no'
        END AS experienced,
    EXTRACT(MONTH FROM date_of_birth) AS month_of_birth
FROM employee;