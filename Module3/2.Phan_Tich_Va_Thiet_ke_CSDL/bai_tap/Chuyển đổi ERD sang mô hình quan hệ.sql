drop database if exists nhapxuatdonhang;
create database if not exists nhapxuatdonhang;
use nhapxuatdonhang;
create table phieu_xuat(
ngayxuat datetime,
sopx int primary key auto_increment
);
create table vat_tu(
mavattu varchar(20) key,
tenvattu varchar(20)
);
create table chitietxuatnhap(
sopx int auto_increment,
mavattu varchar(20),
dgxuat int,
slxuat int,
primary key(sopx,mavattu),
foreign key (sopx) references phieu_xuat(sopx),
foreign key (mavattu) references vat_tu(mavattu)
);
create table phieu_nhap(
sopn int auto_increment primary key,
ngaynhap datetime
);
create table chi_tiet_phieu_nhap(
mavattu varchar(20),
sopn int auto_increment,
dgnhap int,
slnhap int,
primary key (mavattu,sopn),
foreign key (mavattu) references vat_tu(mavattu),
foreign key (sopn) references phieu_nhap(sopn)
);
create table dondh(
sodh int auto_increment primary key,
ngaydh datetime
);
create table chi_tiet_don_hang(
mavattu varchar(20),
sodh int auto_increment,
 primary key(mavattu,sodh),
foreign key (mavattu) references vat_tu(mavattu),
foreign key (sodh) references dondh(sodh)
);
create table nhacc(
mancc int auto_increment primary key,
tenncc varchar(20),
diachi varchar(50)
);
create table sdt(
nhamang varchar(20),
sdt varchar(11) primary key,
mancc int,
foreign key (mancc) references nhacc(mancc)
);