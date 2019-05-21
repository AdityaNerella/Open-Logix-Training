use Users;

create table Users(
	id int not null auto_increment,
    first_name varchar(20) not null, 
    last_name varchar(20) not null,
    age int not null,
    ssn int not null, 
    email varchar(25) not null, 
    primary key(id)
);

select * from Users;

# Store Procedure
insert into Users();

