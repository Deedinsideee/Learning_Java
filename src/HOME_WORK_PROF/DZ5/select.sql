
--1
select b.name, phone_number,count,date,f.name as flower from "order"
join buyer b on "order".id_buyer = b.id
join flowers f on f.id = "order".id_flower;

--2
select "order".id,id_buyer,id_flower,count,date from "order"
join buyer b on b.id = "order".id_buyer
where b.id=1;

--3
select f.name,"order".count from "order"
join flowers f on f.id = "order".id_flower
where count in (select max(count) from "order");

--4
select sum("order".count * f.price) as summ from "order"
join flowers f on f.id = "order".id_flower;

