-- Write your code here:
UPDATE employee e
    JOIN (
        SELECT employee_id
        FROM task
        GROUP BY employee_id
        HAVING MAX(exp_date) >= '2022-10-01'
    ) valid_employees ON e.id = valid_employees.employee_id
SET e.salary = e.salary + 1000;