use quan_ly_ban_hang;
create table Customer(
cid int auto_increment  primary key,
cname varchar(50) not null,
cage int not null
);
create table orderr(
cid int,
oid int auto_increment primary key,
odate datetime,
ototalprice float not null check (ototalprice>0),
foreign key (cid) references customer (cid)
);
create table orderdetail(
oid int,
pid int,
odqty int,
primary key(oid,pid),
foreign key (oid) references orderr (oid),
foreign key (pid) references product (pid)
);
create table product(
pid int auto_increment primary key,
pname varchar(30) not null,
price float not null check (price>0)
);