create table member (
   id             int ,
   email          varchar(255),
   name           varchar(255),
   password       varchar(255),
   register_date    date,
   constraint pk_id primary key (id)   
);

create sequence member_id_seq

insert into member(id, email, name, password) 
values(member_id_seq.nextval,'wkddnjs','장원','1234');

update member set register_date ="2015/11/11" , password ='1234' where id ='2';

alter table member add(aa varchar(255));

delete from member where id='1' ;

select * from member;

-- city 
--selectAll()
select id, 
      name,
      countrycode,
      district,
      population
  from city
  
-- selectByCountryCode(String countryCode)
select id, 
      name,
      countrycode,
      district,
      population
  from city
 where countrycode ='KOR'
 
 --
 -- city
 --
 drop table city;
 
 create table city (
  id 			numeric(11) ,
  name 			char(35) ,
  countrycode	char(3) ,
  district 		char(20) ,
  population 	numeric(11) ,
  constraint pk_id primary key (id)
)

select * from city;














