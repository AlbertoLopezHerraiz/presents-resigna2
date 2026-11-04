CREATE TABLE if not exists regalos.relations (
    code VARCHAR(5) NOT NULL,
    name VARCHAR(20) NOT NULL,
    PRIMARY KEY (code)
);

INSERT INTO regalos.relations (code, name) VALUES
('SOC', 'Partner'),
('FAM', 'Familiar'),
('AMI', 'Friend'),
('OTR', 'Other');