create table public.flowers
(
    id serial primary key, --первмчный ключ, делает уникальным
    name varchar(30) not null ,
    price int

);




create table public.buyer
    (
    id serial primary key,
    name varchar(30) not null,
    phone_number varchar(12) not null


    );




create table public.order
(
    id serial primary key,
    id_buyer integer REFERENCES buyer (id),
    id_flower integer REFERENCES flowers(id),
    count integer ,
 --   summ integer generated always as ( count * (select price from flowers where id=id_flower)) STORED,
    date timestamp

);