create table TB_MENU (
  ID int not null AUTO_INCREMENT,
  ITEM_NAME varchar(200) not null,
  PRICE DECIMAL(20,2) not null,
  IS_ACTIVE BIT not null,
  PRIMARY KEY ( ID )
);

INSERT INTO TB_MENU(ITEM_NAME, PRICE, IS_ACTIVE) VALUES ('Grilled Chicken', 12.00, 1);
INSERT INTO TB_MENU(ITEM_NAME, PRICE, IS_ACTIVE) VALUES ('Chicken Popcorn Rice', 6.00, 1);
INSERT INTO TB_MENU(ITEM_NAME, PRICE, IS_ACTIVE) VALUES ('Chicken Dum Biryani', 10.00, 1);