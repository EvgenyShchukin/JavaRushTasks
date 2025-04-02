-- Write your code here:
ALTER TABLE users
    ADD FOREIGN KEY (employee_id) REFERENCES employee (id)