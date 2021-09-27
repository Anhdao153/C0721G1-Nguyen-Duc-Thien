use quanlybanhang;
insert into customer
value
(1,'Minh Quan',18),
(2,'Ngoc Oanh',20),
(3,'Hong Ha',50);

insert into orderr(cID,oDate)
values
(1,'03-21-2006'),
(2,'03/21/2006'),
(1,'03/16/2006');
insert into product
values
(1,'máy giặc',3),
(2,'tủ lạnh',5),
(3,'điều hòa',7),
(4,'quạt',1),
(5,'bếp điện',2);

insert into orderdetail
values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice của tất cả các hóa đơn trong bảng Order

select oID, pID, oDate
from orderproduct;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua bởi các khách

select custormer.cName, product.pName
from orderdetail
inner join orderproduct on orderdetail.oID=orderproduct.oID join custormer on custormer.cID=orderproduct.cID
inner join product on orderdetail.pID=product.pID ;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

select cName
from custormer
left join orderproduct on custormer.cID=orderproduct.cID
where oID is null;

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn 

select orderdetail.oID, orderproduct.oDate, (odQTY*pPrice) as giá
from orderdetail
inner join orderproduct on orderdetail.oID=orderproduct.oID
inner join product on orderdetail.pID=product.pID ;
