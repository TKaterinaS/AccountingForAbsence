DROP TABLE IF EXISTS employee;
CREATE TABLE employee
(
    employee_id BIGSERIAL   NOT NULL PRIMARY KEY,
    first_name  VARCHAR(30) NOT NULL,
    last_name   VARCHAR(30) NOT NULL,
    salary      INT         NOT NULL
);
DROP TABLE IF EXISTS absence;
CREATE TABLE absence
(
    id          BIGSERIAL     NOT NULL PRIMARY KEY,
    reason      INT           NOT NULL,
    start_date  DATE          NOT NULL,
    duration    INT           NOT NULL,
    discounted  BOOLEAN       NOT NULL,
    description VARCHAR(1024) NOT NULL,
    employee_id INT           NOT NULL,
    FOREIGN KEY (employee_id) REFERENCES employee (employee_id)
);