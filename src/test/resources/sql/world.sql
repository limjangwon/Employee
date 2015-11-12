select * from dept;
select * from country;
select * from member;

drop table member;

create table member (
   id            number primary key ,
   email          varchar(255),
   name           varchar(255),
   password       varchar(255),
   register_date  date
     
);

insert into member(id, email, name, password) values('3','dlwlstn@naver.com','asd','1234');

update member set register_date ='2015/11/11' , password ='1234' where id ='2';

alter table member add(aa varchar(255));

delete from member where id='2';

select * from member;
select * from board;