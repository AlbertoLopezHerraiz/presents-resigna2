CREATE TABLE regalos.relations (
    code VARCHAR(5) NOT NULL,
    name VARCHAR(20) NOT NULL
);

INSERT INTO regalos.relations (code, name) VALUES
('SOC', 'Partner'),
('FAM', 'Familiar'),
('AMI', 'Friend'),
('OTR', 'Other');