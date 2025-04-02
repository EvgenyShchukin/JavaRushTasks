-- Write your code here:
CREATE TABLE user
(
    user_id      INT PRIMARY KEY AUTO_INCREMENT,
    first_name   VARCHAR(255) NOT NULL,
    last_name    VARCHAR(255) NOT NULL,
    date         DATE DEFAULT CURRENT_DATE(),
    weight       FLOAT(10) NULL
);