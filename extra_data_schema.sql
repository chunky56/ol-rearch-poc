CREATE TABLE csa_vests (
    id serial PRIMARY KEY,
    code character varying(50) UNIQUE NOT NULL
);

ALTER TABLE csa_vests OWNER TO postgres;

CREATE TABLE csa_vest_attribute_types (
    id serial PRIMARY KEY,
    code character varying(50) UNIQUE NOT NULL,
    description text,
    format text NOT NULL
);

ALTER TABLE csa_vest_attribute_types OWNER TO postgres;

CREATE TABLE csa_vest_attributes (
    id serial PRIMARY KEY,
    code character varying(50) UNIQUE NOT NULL,
    csavestid integer REFERENCES csa_vests (id),
    csavestattributetypeid integer REFERENCES csa_vest_attribute_types (id),
    value text NOT NULL
);

ALTER TABLE csa_vest_attributes OWNER TO postgres;
