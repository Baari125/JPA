CREATE TABLE user_roles (
 id BIGINT(50) NOT NULL AUTO_INCREMENT,
 user_id BIGINT(50) NOT NULL,
 role_id BIGINT(50) NOT NULL,
 PRIMARY KEY (id)
);
