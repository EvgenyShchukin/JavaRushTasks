-- Write your code here:
SELECT IF(position = 'manager' AND salary > 10000, 'good',
          IF(position != 'manager' AND salary > 5000, 'good',
             IF(position = 'manager' AND salary <= 10000, 'bad',
                IF(position != 'manager' AND salary <= 5000, 'bad', null)))) AS age_group
          FROM employee
          WHERE city = 'London'
          LIMIT 5;