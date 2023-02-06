CREATE table Employee(
    employee_id int primary key auto_increment,
    employee_name varchar(64)
);
CREATE table Project(
     project_id int primary key auto_increment,
     project_name varchar(64)
);

insert into Employee (employee_name) values ('Bob Sapp'), ('Bruce Lee');
insert into Project (project_name) values ('kill Bill'), ('fuck his wife');
