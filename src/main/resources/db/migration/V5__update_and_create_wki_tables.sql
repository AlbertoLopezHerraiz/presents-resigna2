-- Renombrar la tabla
ALTER TABLE regalos.mesurament_units
RENAME TO measurements_units;

-- Crear tabla de motivos de regalo
CREATE TABLE IF NOT EXISTS regalos.gift_reasons (
    code VARCHAR(4) NOT NULL PRIMARY KEY,
    name VARCHAR(20) NOT NULL
);

-- Insertar motivos iniciales
INSERT INTO regalos.gift_reasons (code, name) VALUES
    ('BITH', 'Birthday'),
    ('XMAS', 'Christmas'),
    ('SANT', 'Saint''s day');