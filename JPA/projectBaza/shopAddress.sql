CREATE TABLE shop_adrress (
	id int not null auto_increment,
    street varchar(64) not null,
    city varchar(64) not null,
    zipcode varchar(6) not null,
    PRIMARY KEY (id)
);