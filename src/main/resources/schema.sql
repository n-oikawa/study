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

DROP TABLE IF EXISTS course_event;
CREATE TABLE course_event (
    id INT PRIMARY KEY AUTO_INCREMENT,
    member_id VARCHAR,
    course VARCHAR
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

DROP TABLE IF EXISTS nyukai_event;
CREATE TABLE nyukai_event (
    id INT PRIMARY KEY AUTO_INCREMENT,
    member_id VARCHAR,
    password VARCHAR,
    apply_date VARCHAR,
    mail_address VARCHAR,
    system_date DATETIME
);

DROP TABLE IF EXISTS three_choice_quiz_sequence;
CREATE TABLE three_choice_quiz_sequence (id INT NOT NULL);
INSERT INTO three_choice_quiz_sequence VALUES (0);

DROP TABLE IF EXISTS three_choice_quiz_event;
CREATE TABLE three_choice_quiz_event (
    id INT PRIMARY KEY AUTO_INCREMENT,
    three_choice_quiz_number INTEGER ,
    question VARCHAR ,
    three_choice_quiz_choice_a VARCHAR ,
    correct_answer_judgement_a VARCHAR ,
    three_choice_quiz_choice_b VARCHAR ,
    correct_answer_judgement_b VARCHAR ,
    three_choice_quiz_choice_c VARCHAR ,
    correct_answer_judgement_c VARCHAR ,
    explanation VARCHAR ,
    system_date DATETIME
);