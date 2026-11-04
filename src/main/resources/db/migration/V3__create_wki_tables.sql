CREATE TABLE if not exists regalos.component_states (
    code VARCHAR(5) NOT NULL,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY (code)
);

INSERT INTO regalos.component_states (code, name) VALUES
('S', 'Solid'),
('L', 'Liquid'),
('G', 'Gas');

CREATE TABLE if not exists regalos.mesurament_units (
    code VARCHAR(5) NOT NULL,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY (code)
);

INSERT INTO regalos.mesurament_units (code, name) VALUES
('mL', 'mililiters'),
('gr', 'grams'),
('u', 'units');
