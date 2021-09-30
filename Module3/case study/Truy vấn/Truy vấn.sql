use quan_ly_furama;
-- task 2
select *
from nhan_vien
where (ho_ten like ('h%')
 or ho_ten like ("t%")
 or ho_ten like ("k%"))
 and character_length(ho_ten)<15;
 -- task 3
 select *
 from khach_hang
 where dia_chi="hà nam" or dia_chi="hà nội"
 and ( TIMESTAMPDIFF (YEAR, ngay_sinh, CURDATE()) between 18 and 50);
  -- task 4
  select *,ten_loai_khach
  from khach_hang,loai_khach
  where ten_loai_khach='diamond'