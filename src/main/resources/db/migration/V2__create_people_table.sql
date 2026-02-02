CREATE TABLE regalos.people (
    id uuid DEFAULT gen_random_uuid(),
    name VARCHAR(50) NOT NULL,
    first_subname VARCHAR(50) NOT NULL,
    second_subname VARCHAR(50) NULL,
    relation VARCHAR(5) NOT NULL,
    PRIMARY KEY (id)
);