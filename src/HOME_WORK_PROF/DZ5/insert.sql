insert into flowers( name, price) values ('Роза',100);
insert into flowers( name, price) values ('Лилии',50);
insert into flowers( name, price) values ('Ромашка',25);

select * from flowers;

insert into buyer(name,phone_number) values ('Миша','+79059748857');
insert into buyer(name,phone_number) values ('Петя','+77105834495');
insert into buyer(name,phone_number) values ('Вася','+76724578813');

select * from buyer;

insert into "order"( id_buyer, id_flower, count,  date)values (1, 2, 13, now());
insert into "order"( id_buyer, id_flower, count,  date) values (2,1,3,now()-interval '2h');
insert into "order"( id_buyer, id_flower, count,  date) values (3,3,6,now()- interval '24h');

select * from "order";