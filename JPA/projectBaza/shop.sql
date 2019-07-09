CREATE TABLE shop (
 id int(11) NOT NULL auto_increment,
 nazwa varchar(100) NOT NULL,
 kategoria_id int(9) NULL,
 address_id int(9) NULL,
 PRIMARY KEY (id),
 FOREIGN KEY (kategoria_id) REFERENCES shop_kategory(id),
 FOREIGN KEY (address_id) REFERENCES shop_adrress(id)
) ;