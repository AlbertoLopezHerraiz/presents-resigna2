CREATE TABLE IF NOT EXISTS regalos.colors(
     id uuid DEFAULT gen_random_uuid(),
     name VARCHAR(50) NOT NULL,
     on_stock boolean NOT NULL,
     CONSTRAINT pk_colors PRIMARY KEY(id)
);