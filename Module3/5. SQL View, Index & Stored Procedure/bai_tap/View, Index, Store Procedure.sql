drop database if exists demo;
create database if not exists demo;
use demo;
create table product(
id int auto_increment primary key,
productcode varchar(45) not null,
productname varchar(45) not null,
productprice int,
productamount int,
productstatus varchar(50) not null
);

insert into product
values 
(1,'java','Kế thừa',1000,5000,'đã hoàn thành'),
(2,'javascript','Đa hình',2000,6000,'chưa hoàn thành'),
(3,'SQL','Trừu tượng',3000,7000,'đã hoàn thành'),
(4,'Python','Đóng gói',4000,8000,'chưa hoàn thành');

create unique index iview_productdx_product on product(productcode);
create index idx_product2 on product(productname,productprice);

explain select*
from product;

create view view_product as 
select productcode, productname, productprice, productstatus
from product;

create or replace view view_product as
select productcode, productname, productprice, productstatus
from product
-- set productstatus='đã hoàn thành'
where  productcode='javascript';

select*
from view_product;

drop view view_product;

