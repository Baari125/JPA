CREATE TABLE shop_to_item (
 shop_id int(11) NOT NULL,
 item_id int(11) NOT NULL,
 PRIMARY KEY (shop_id,item_id),
 CONSTRAINT FK_SHOP FOREIGN KEY (shop_id)
 REFERENCES shop (id),
 CONSTRAINT FK_ITEM FOREIGN KEY (item_id)
 REFERENCES item (id)
);