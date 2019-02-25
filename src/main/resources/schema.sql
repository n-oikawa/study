DROP TABLE IF EXISTS time_event;
CREATE TABLE time_event (
    id INT PRIMARY KEY AUTO_INCREMENT,
    event_date_time DATETIME
);

DROP TABLE IF EXISTS nyukai_event;
CREATE TABLE nyukai_event (
    id INT PRIMARY KEY AUTO_INCREMENT,
    member_id VARCHAR
);

DROP TABLE IF EXISTS credit_card_event;
CREATE TABLE credit_card_event (
    id INT PRIMARY KEY AUTO_INCREMENT,
    member_id VARCHAR,
    card_number VARCHAR(12),
    expiration_date VARCHAR(6),
    security_code VARCHAR(4)
);

DROP TABLE IF EXISTS individual_event;
CREATE TABLE individual_event (
    id INT PRIMARY KEY AUTO_INCREMENT,
    member_id VARCHAR,
    name VARCHAR,
    name_kana VARCHAR,
    gender VARCHAR,
    birthday VARCHAR(8),
    postal_code VARCHAR(7),
    street_address VARCHAR,
    phone_number VARCHAR(11),
    contact_address VARCHAR(11)
);