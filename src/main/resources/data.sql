DROP TABLE IF EXISTS persons;

create table persons (
    id int auto_increment primary key,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL
);

insert into persons (first_name,last_name) values
('Bill','Gates'),
('Steve','Jobs'),
('Jeff','Bezos'),
('Elon','Musk');