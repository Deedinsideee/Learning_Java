create table public.books
(
    id serial primary key, --��������� ����, ������ ����������
    title varchar(30) not null,
    aurthor varchar(30) not null,
    date_added timestamp not null

);