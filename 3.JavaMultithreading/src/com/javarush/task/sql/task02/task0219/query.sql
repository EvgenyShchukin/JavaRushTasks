-- Write your code here:
SELECT
      IF(euro IS NULL, 'good', 'bad') AS euro_rating
FROM cars