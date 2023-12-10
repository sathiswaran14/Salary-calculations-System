use emp3;
select*from employees4;
create table employees4(Employeeid long,EmployeeName varchar(20),StartTime int ,EndTime int ,UpdateDate varchar(50),Hours int,salary int);
update employees4 set salary=500*(select sum(Hours)from employees4 where Employeeid= EmployeeName);