CREATE TABLE if not exists regalos.components (
    id uuid NOT NULL DEFAULT gen_random_uuid(),
    name VARCHAR(20) NOT NULL,
    state_code VARCHAR(5),
    quantity INTEGER,
    CONSTRAINT pk_component PRIMARY KEY (id),
    CONSTRAINT fk_component_state FOREIGN KEY(state_code) REFERENCES regalos.component_states(code)
);
