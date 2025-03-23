-- Write your code here:
SELECT
    IF(age <= 12, 'child',
       IF(age >= 20, 'adult',
          IF(age BETWEEN 13 AND 19, 'teenager', NULL))) AS age_group
FROM
    customers
LIMIT 5;