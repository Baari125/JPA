CREATE TABLE item (
 id int(11) NOT NULL auto_increment,
 nazwa varchar(100) NOT NULL,
 cena float NOT NULL default '0',
 liczba int not null default '0',
 kategoria_id int(9) NULL,
 PRIMARY KEY (id),
 FOREIGN KEY (kategoria_id) REFERENCES item_kategory(id)
) ;