select * from city;
select * from country;
select * from city;

drop table member;

create table member (
   id              int AUTO_increment,
   email               varchar(255),
   name           varchar(255),
   password        varchar(255),
   register_date    date,
   constraint pk_id primary key (id)   
);

select max(id)+1 from member;

----------------------------------------
insert into member(id, email, name, password) values((select max(id)+1 from member),'dlwlstn4308','이진수','1234');

update member set register_date ="2015/11/11" , password ='1234' where id ='2';

alter table member add(aa varchar(255));

delete from member where id='2' ;

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