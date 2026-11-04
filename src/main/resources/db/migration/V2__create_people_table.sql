CREATE TABLE if not exists regalos.people (
    id uuid DEFAULT gen_random_uuid(),
    name VARCHAR(50) NOT NULL,
    first_subname VARCHAR(50) NOT NULL,
    second_subname VARCHAR(50) NULL,
    relation VARCHAR(5) NOT NULL,
    CONSTRAINT pk_person PRIMARY KEY(id),
    CONSTRAINT fk_person_relation FOREIGN KEY(relation) REFERENCES regalos.relations(code),
    CONSTRAINT uq_person_full_name UNIQUE (name, first_subname, second_subname)
);