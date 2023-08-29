CREATE TABLE employee
(
    employee_id BIGSERIAL   NOT NULL PRIMARY KEY,
    last_name   VARCHAR(30) NOT NULL,
    first_name  VARCHAR(30) NOT NULL
);
CREATE TABLE absence
(
    id          BIGSERIAL     NOT NULL PRIMARY KEY,
    reason      INT           NOT NULL,
    start_date  DATE          NOT NULL,
    duration    INT           NOT NULL,
    discounted  BOOLEAN       NOT NULL,
    description VARCHAR(1024) NOT NULL,
    employee_id INT           NOT NULL
);
ALTER TABLE absence
ADD COLUMN employee_id BIGINT REFERENCES employee(employee_id);
