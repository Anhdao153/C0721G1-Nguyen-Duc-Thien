drop database if exists quan_ly_furama;
create database if not exists quan_ly_furama;
use quan_ly_furama;

create table vi_tri(
id_vi_tri int auto_increment primary key,
ten_vi_tri varchar(45) not null
);

create table trinh_do(
id_trinh_do int auto_increment primary key,
trinh_do varchar(45) not null
);

create table bo_phan(
id_bo_phan int auto_increment primary key,
ten_bo_phan varchar(45) not null
);

create table nhan_vien(
id_nhan_vien int auto_increment primary key,
ho_ten varchar(45) not null,
id_vi_tri int,
foreign key (id_vi_tri) references vi_tri(id_vi_tri),
id_trinh_do int,
foreign key (id_trinh_do) references trinh_do(id_trinh_do),
id_bo_phan int,
foreign key (id_bo_phan) references bo_phan(id_bo_phan),
ngay_sinh date not null,
so_cmnd varchar(45) not null,
luong varchar(45) not null,
sdt varchar(45),
email varchar(45),
dia_chi varchar(45)
);

create table loai_khach(
id_loai_khach int auto_increment primary key,
ten_loai_khach varchar(45) not null
);

create table khach_hang(
id_khach_hang int auto_increment primary key,
id_loai_khach int,
ho_ten varchar(45) not null,
ngay_sinh date,
so_cnnd varchar(45) not null,
sdt varchar(45),
email varchar(45),
dia_chi varchar(45),
foreign key (id_loai_khach) references loai_khach(id_loai_khach)
);

create table kieu_thue(
id_kieu_thue int auto_increment primary key,
ten_kieu_thue varchar(45) not null,
gia int check(gia>=0)
);

create table loai_dich_vu(
id_loai_dich_vu int auto_increment primary key,
ten_loai_dich_vu varchar(45) not null
);

create table dich_vu(
id_dich_vu int auto_increment primary key,
ten_dich_vu varchar(45) not null,
dien_tich int check(dien_tich>0),
so_tang int  check(so_tang>0),
so_nguoi_toi_da int ,
chi_phi_thue int  check(chi_phi_thue>0),
id_kieu_thue int not null,
id_loai_dich_vu int not null,
trang_thai varchar(45),
foreign key(id_kieu_thue) references kieu_thue(id_kieu_thue),
foreign key(id_loai_dich_vu) references loai_dich_vu(id_loai_dich_vu)
);

create table hop_dong(
id_hop_dong int auto_increment primary key,
id_nhan_vien int not null,
id_khach_hang int not null,
id_dich_vu int not null,
ngay_lam_hop_dong date not null,
ngay_ket_thuc date not null,
tien_dat_coc int  check(tien_dat_coc>=0),
tong_tien int check(tong_tien>0),
foreign key(id_nhan_vien) references nhan_vien(id_nhan_vien),
foreign key(id_khach_hang) references khach_hang(id_khach_hang),
foreign key(id_dich_vu) references dich_vu(id_dich_vu)
);

create table dich_vu_di_kem(
id_dich_vu_di_kem int auto_increment primary key,
ten_dich_vu_di_kem varchar(45) not null,
gia int  check(Gia>0),
don_vi int check(don_vi>0),
trang_thai_kha_dung varchar(45)
);

create table hop_dong_chi_tiet(
id_hop_dong_chi_tiet int auto_increment primary key,
id_hop_dong int not null,
id_dich_vu_di_kem int not null,
so_luong int,
foreign key(id_hop_dong) references hop_dong(id_hop_dong),
foreign key(id_dich_vu_di_kem) references dich_vu_di_kem(id_dich_vu_di_kem)
);

insert into vi_tri
values
(1,'lễ tân'),
(2,'phục vụ'),
(3,'chuyên viên'),
(4,'giám sát'),
(5,'quản lí'),
(6,'giám đốc');

insert into trinh_do
values
(1,'trung cấp'),
(2,'cao đẳng'),
(3,'đại học'),
(4,'sau đại học');

insert into bo_phan
values
(1,'Sale – Marketing'),
(2,'Hành Chính'),
(3,'Phục vụ'),
(4,'Quản lý');

insert into nhan_vien
values
(1,'nguyễn đức thiện',6,4,2,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','Đà Nẵng'),
(2,'Nguyễn tế công',1,1,1,'1999-12-12',206764234,5000000,090534345,'nguyenson@gmail.com','hải dương'),
(3,'Nguyễn thị thảo',1,1,3,'1988-04-13',206184291,5000000,0905768796,'vanan@gmail.com','phú thọ'),
(4,'nguyễn thị thủy',2,3,4,'1995-02-12',206184291,10000000,0905453657,'lethu@gmail.com','nghệ an'),
(5,'Trương Văn Tuấn',2,3,1,'1989-02-09',206915647,10000000,0909452456,'vantuan@gmail.com','Hồ Chí Minh'),
(6,'Trần minh hiệu',3,3,2,'1991-12-17',202914563,20000000,0905567345,'tranchi@gmail.com','yên bái'),
(7,'hoàng văn trung',3,3,1,'1988-02-12',206566914,20000000,09055467846,'trunghoang@gmail.com','lào cai'),
(8,'trần văn đoàn',4,4,4,'1978-02-12',206184291,50000000,0905345432,'khue@gmail.com','hưng yên'),
(9,'đặng thị kim thanh',6,4,2,'1978-02-18',20657478,30000000,0935678567,'thanh.kin@gmail.com','hà nam'),
(10,'trần ngọc yến',5,4,1,'1990-02-12',20656465,40000000,0905345768,'voanh@gmail.com','hà tây');

insert into loai_khach
values
(1,'Diamond'),
(2,'Platinium'),
(3,'Gold'),
(4,'Silver'),
(5,'Member');	

insert into khach_hang
values
(1,2,'Số một','1989-02-09','234345345','0904034054','adadzczx@gmail.com','Hai Phong'),
(2,3,'số hai','1991-12-17','223445398','095643457','fghssdf@gmail.com','hà nam'),
(3,1,'Số ba','1990-02-12','342345456','0906456756','dfbdfb@gmail.com','đan phượng'),
(4,4,'Số bốn','1978-02-12','234345665','0935678767','qqqdsac@gmail.com','hưng yên'),
(5,5,'Số năm','1995-02-12','323454345','090542546','5555@gmail.com','Hà Nội');

insert into loai_dich_vu
values
(1,'Villa'),
(2,'House'),
(3,'Room');

insert into kieu_thue
values
(1,'năm',90000000),
(2,'tháng',1200000),
(3,'ngày',2000000),
(4,'giờ',200000);

insert into dich_vu
values
(1,'thuê view biển villa',200,2,'12',5000000,3,1,'tốt nhất'),
(2,'thuê view biển house',100,2,'9',4000000,3,2,'tốt nhất'),
(3,'thuê view biển room',30,2,'3',3000000,3,3,'tốt nhất'),
(4,'thuê view trung tâm villa',200,2,'12',4000000,3,1,'tốt nhất'),
(5,'thuê view trung tâm house',100,2,'9',3000000,3,2,'tốt nhất'),
(6,'thuê view trung tâm room',30,2,'3',2000000,3,3,'tốt nhất');

insert into hop_dong
values
(1,2,1,1,'2020-12-12','2021-01-02',3000000,5000000),
(2,3,4,2,'2021-01-12','2021-01-20',400000,7000000),
(3,6,3,4,'2020-03-12','2021-03-22',5000000,10000000);

insert into dich_vu_di_kem
values
(1,'massage',500000,1,'hoàn thành'),
(2,'karaoke',400000,1,'một giờ'),
(3,'thức ăn',100000,1,'một khẩu phần'),
(4,'nước uống',20000,1,'chai'),
(5,'thuê xe di chuyển tham quan resort',1000000,1,'tour');

insert into hop_dong_chi_tiet
values
(1,1,2,3),
(2,2,1,2),
(3,3,4,2);

use quan_ly_furama;
-- task 2
select *
from nhan_vien
where (ho_ten like ('h%')
 or ho_ten like ("t%")
 or ho_ten like ("k%"))
 and character_length(ho_ten)<15;
 
 -- task 3
 use quan_ly_furama;
 select *
 from khach_hang
 where dia_chi="hà nam" or dia_chi="hà nội"
 and ( TIMESTAMPDIFF (YEAR, ngay_sinh, CURDATE()) between 18 and 50);
 
  -- task 4
  use quan_ly_furama;
  select khach_hang.*,count(hop_dong.id_hop_dong)as lan_dat
  from khach_hang
  inner join hop_dong on khach_hang.id_khach_hang=hop_dong.id_khach_hang
  where id_loai_khach=1
  group by id_khach_hang
  order by lan_dat;

  -- task 5
use quan_ly_furama;
select khach_hang.id_khach_hang, khach_hang.ho_ten,loai_khach.ten_loai_khach,hop_dong.id_hop_dong,
dich_vu.ten_dich_vu,hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc,
 sum(dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia) as tong_tien
 from khach_hang
left join loai_khach on khach_hang.id_loai_khach=loai_khach.id_loai_khach
left join hop_dong on khach_hang.id_khach_hang=hop_dong.id_Khach_hang
left join dich_vu on hop_dong.id_dich_vu=dich_vu.id_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong=hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem=dich_vu_di_kem.id_dich_vu_di_kem
group by khach_hang.id_khach_hang;
    
  -- task 6
  use quan_ly_furama;
  select dich_vu.id_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich,
  dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
  from  dich_vu
  inner join loai_dich_vu on dich_vu.id_loai_dich_vu=loai_dich_vu.id_loai_dich_vu
  inner join hop_dong on hop_dong.id_dich_vu=dich_vu.id_dich_vu
  where dich_vu.id_dich_vu 
	not in (select hop_dong.id_dich_vu from hop_dong 
			where (year(ngay_lam_hop_dong)=2019) 
					and (month(ngay_lam_hop_dong) in (01,02,03)));
   -- task 7
 use quan_ly_furama;
 select dich_vu.id_dich_vu,dich_vu.ten_dich_vu,dich_vu.dien_tich,dich_vu.so_nguoi_toi_da,dich_vu.chi_phi_thue,loai_dich_vu.ten_loai_dich_vu
 from dich_vu
 join loai_dich_vu on dich_vu.id_loai_dich_vu=loai_dich_vu.id_loai_dich_vu
 join hop_dong on hop_dong.id_dich_vu=dich_vu.id_dich_vu
 where year(ngay_lam_hop_dong=2018) 
 and year(ngay_lam_hop_dong)
	not in (select year(ngay_lam_hop_dong) from hop_dong
			where year(ngay_lam_hop_dong=2019));

       -- task 8
	use quan_ly_furama;   
    select ho_ten
    from khach_hang
    group by khach_hang.ho_ten;
   --  cách 2
   use quan_ly_furama;   
    select distinct ho_ten
    from khach_hang;
       --  cách 3
	use quan_ly_furama;   
    select ho_ten
    from khach_hang
    union 
	select ho_ten
    from khach_hang;
    
    -- task 9
    use quan_ly_furama;   
    select month(hop_dong.ngay_lam_hop_dong) as thang,
    hop_dong.tong_tien, khach_hang.id_khach_hang,count(khach_hang.id_khach_hang) as so_luong_khach_hang
    from hop_dong
    join dich_vu on dich_vu.id_dich_vu=hop_dong.id_dich_vu
    join khach_hang on khach_hang.id_khach_hang=hop_dong.id_khach_hang
    where year(hop_dong.ngay_lam_hop_dong)=2020
    group by month(ngay_lam_hop_dong);
    
     -- task 10
     use quan_ly_furama;
     select hop_dong.id_hop_dong, ngay_lam_hop_dong , ngay_ket_thuc,
     tien_dat_coc,
     count(hop_dong_chi_tiet.id_dich_vu_di_kem), dich_vu_di_kem.ten_dich_vu_di_kem,
     count(ID_hop_dong_chi_tiet),dich_vu_di_kem.id_dich_vu_di_kem
     from hop_dong 
     join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong 
     join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
	 group by id_hop_dong
    ;
     
	 -- task 11
     use quan_ly_furama;
	 select khach_hang.id_khach_hang,ten_loai_khach, dich_vu_di_kem.ten_dich_vu_di_kem,
dich_vu_di_kem.gia,dich_vu_di_kem.don_vi, hop_dong_chi_tiet.so_luong
from khach_hang
join loai_khach on khach_hang.id_loai_khach = loai_khach.id_loai_khach
join hop_dong on hop_dong.id_khach_hang = khach_hang.id_khach_hang
join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
where ten_loai_khach = 'Diamond' and ( dia_chi = 'vinh' or dia_chi = 'quang ngai');
	
    -- task 12
select hop_dong.id_hop_dong, nhan_vien.ho_ten as nhan_vien, khach_hang.ho_ten as khach_hang, khach_hang.sdt, loai_dich_vu.ten_loai_dich_vu, count(id_hop_dong_chi_tiet) as so_luong_dich_vu_di_kem, sum(tien_dat_coc) as tien_dat_coc
from hop_dong
left join khach_hang on hop_dong.id_khach_hang = khach_hang.id_khach_hang
left join dich_vu on dich_vu.id_dich_vu = hop_dong.id_dich_vu
left join loai_dich_vu on loai_dich_vu.id_loai_dich_vu= dich_vu.id_loai_dich_vu
left join hop_dong_chi_tiet on hop_dong.id_hop_dong = hop_dong_chi_tiet.id_hop_dong
left join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
left join nhan_vien on nhan_vien.id_nhan_vien = hop_dong.ID_nhan_vien 
where (year(ngay_lam_hop_dong)=2019  and month(ngay_lam_hop_dong) between 10 and 12) 
not in(year(ngay_lam_hop_dong)=2019  and month(ngay_lam_hop_dong) between 1 and 9)
group by id_hop_dong;

-- task 13
select dich_vu_di_kem.*, sum(so_luong) as tong_so_luong, count(dich_vu_di_kem.id_dich_vu_di_kem) as tong_lan_dat
from  hop_dong_chi_tiet
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by id_dich_vu_di_kem;
-- task 14

select dich_vu_di_kem.*, sum(so_luong) as so_luong, count(dich_vu_di_kem.id_dich_vu_di_kem) as tong_lan_dat
from  hop_dong_chi_tiet
join dich_vu_di_kem on hop_dong_chi_tiet.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
group by id_dich_vu_di_kem
having tong_lan_dat=1;

-- task 15	Hiển thi thông tin của tất cả nhân viên bao gồm IDNhanVien, HoTen, TrinhDo, TenBoPhan, SoDienThoai,
--  DiaChi mới chỉ lập được tối đa 3 hợp đồng từ năm 2018 đến 2019.

select nhan_vien.id_nhan_vien, nhan_vien.ho_ten, trinh_do.trinh_do, bo_phan.ten_bo_phan, nhan_vien.sdt, nhan_vien.dia_chi,count(id_hop_dong) so_luong_hop_dong,ngay_lam_hop_dong
from nhan_vien
left join trinh_do on nhan_vien.ID_trinh_do = trinh_do.ID_trinh_do
left join bo_phan on bo_phan.ID_bo_phan = nhan_vien.ID_bo_phan
left join hop_dong on nhan_vien.ID_nhan_vien = hop_dong.ID_nhan_vien
group by nhan_vien.ID_nhan_vien
having count(id_hop_dong) <=3 and (hop_dong.ngay_lam_hop_dong between '2018-01-01' and '2019-12-31' or hop_dong.ngay_lam_hop_dong is null);


-- task 16

delete from nhan_vien
where id_nhan_vien not in (select id_nhan_vien from hop_dong where year(ngay_lam_hop_dong) between 2017 and 2019);

-- task 17

update khach_hang
set id_loai_khach=1
where id_loai_khach=2 and id_khach_hang in (select id_khach_hang from hop_dong where hop_dong.tong_tien >=10000000 );


-- task 18

delete from khach_hang
where id_khach_hang in (select id_khach_hang from hop_dong where year(ngay_lam_hop_dong)<2016);

-- task 19

update dich_vu_di_kem
set gia=gia*2
where id_dich_vu_di_kem 
in (select id_dich_vu_di_kem 
from hop_dong_chi_tiet  
group by id_dich_vu_di_kem 
having count(id_dich_vu_di_kem)>=10);

-- task 20
-- ID (IDNhanVien, IDKhachHang), HoTen, Email, SoDienThoai, NgaySinh, DiaChi.
select id_nhan_vien, ho_ten, email, sdt, ngay_sinh, dia_chi
from nhan_vien
union all
select id_khach_hang, ho_ten, email, sdt, ngay_sinh, dia_chi
from khach_hang

-- task 21

create view v_nhan_vien as
select *
from nhan_vien
where nhan_vien.dia_chi='Hải Châu' 
and (nhan_vien.id_nhan_vien 
in (select id_nhan_vien 
from hop_dong
 where ngay_lam_hop_dong='2019-12-12' 
 group by id_nhan_vien ));


-- task 22

SET SQL_SAFE_UPDATES = 0;
update v_nhan_vien
set  dia_chi='Liên Chiểu';

-- task 23
-- CREATE UNIQUE CLUSTERED INDEX ix_khach_hang
-- ON khach_hang(id_khach_hang);


-- task 24 

CREATE UNIQUE INDEX IX_SoDT_DiaChi 
ON khach_hang(sdt, dia_chi);

explain select * from khach_hang where sdt = '123456789' and dia_chi ='da nang';


