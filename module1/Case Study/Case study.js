// //bài 3 vẽ tam giác cân
// let h = 5;
// for (i = 1; i <= h; i++) {
//     for (j = 1; j < 2 * h; j++) {//in hàng ngang
//         if (Math.abs((h - j)) <= (i - 1)) {
//             document.write(" * ");
//         } else {
//             document.write(' 1 ');
//         }
//     }
//     document.write("<br>");
//
//
// }

//bài 4 vẽ tam giác cân rỗng ruột
// let h = 10;
// for (i = 10; i >= 1; i--) { //in hàng dọc vị trí ngang
//     for (j = 19; j > 0; j--) { //in hàng ngang vị trí dọc
//         if (Math.abs((h - j)) == (i - 1) || i == 10) {
//             document.write(" *");
//         } else {
//             document.write(' &nbsp&nbsp ');
//         }
//     }
//     document.write("<br>");
// }

//bài 5 câu điều kiện if else|| switch case
// let n=prompt('nhập số lương của nhân viên vào');
// let luong;
// if(n>=15000000){
//     luong=n*0.2;
//     let thuc=n-luong;
//     document.write('số lương thực mà bạn nhận được là '+thuc);
// } else if(7<=n<15){
//     luong=n*0.15;
//     let thuc=n-luong;
//     document.write('số lương thực mà bạn nhận được là '+thuc);
// } else {
//     luong=n*0.5;
//     let thuc=n-luong;
//     document.write('số lương thực mà bạn nhận được là '+thuc);
// }

//bài 6 viết chương trình kiểm tra một ký tự trong bảng chữ cái tiếng anh là nguyên âm
// let n=prompt('nhập kiểm tra xem nó là nguyên âm hay phụ âm');
// if (n=='o'||n=="u"||n=="i"||n=="a"||n=="e"||n=='O'||n=='U'||n=='I'||n=='A'||n=='E'){
//     alert('bạn đã nhập nguyên âm '+n);
// } else
// {
//     alert('yêu cầu bạn phải nhập lại, vì bạn nhập phụ âm');
// }

//III//MANG
//bài 1:
// let a=prompt('nhập độ dài mảng');
// let arr1=[];
// let arr=[];
// let b=0;
// for (i=0;i<a;i++) {
//     arr[i] = parseInt(prompt('nhập giá trị cho mảng'));
// }
//         for (j=0;j<a;j++){
//            b=b+arr[j];
//
//         arr1[j]=b;
//             console.log(arr1);
//         }
//

//bài 2
// let arr1=[7,2,5,3,5,3];
// let arr=[7,2,5,4,6,3,5,3];
// for (i=0;i<arr1.length;i++);{
//     if (arr1[i]!=arr[i]){
//         document.write(arr1[i]);
//     }
// }

//bài 3 //CÓ VẤN ĐỀ RẤT LỚN.
// let num=[];
// let deno=[];
// let d=0;
// let e=0;
// let f=0;
// let a=prompt('nhập độ dài của mảng A');
// let o=prompt('nhập độ dài của mảng B');
// for (i=0;i<a;i++);{
//     num[i]=prompt('nhập giá trị cho mảng A');
//     console.log(i);
// }
// for (j=0;j<o;j++);{
//     deno[j]=prompt('nhập giá trị cho mảng B');
//     console.log(j);
// }
// for (u=0;u<a;u++){
//     let c= num[u]/deno[u];
//     if(c>d){
//         d=c;
//         e=num[u];
//         f=deno[u];
//     }
// }
// d=d-parseInt(d);
// alert('phân số lớn nhất là' +e+'/'+f);
// alert('có chỉ số là' +d);

//Bài 4
// let b=0;
// let so=[];
// let chu=["một",'hai','ba','bốn','năm','sáu','bảy','tám','chín'];
// let a=parseInt(prompt('nhập số lượng sô muốn nhập'));
// for (i=0;i<a;i++){
//     so[i]=parseInt(prompt('nhập một số bạn muốn'));
//     b=so[i];
//     document.write(chu[b-1]+' ');
// }

// //bài 5 //Sua loi sau
// let beverage = ["Cafe", 'Cam vắt', 'Nước ép cà rốt', 'Nước ép cà chua', 'Nước lọc', 'Nước dừa'];
//
// function chonmon() {
//     let a = parseInt(document.getElementById('nhapmon').value);
//     let b = 0;
//     let c = 0;
//     switch (a) {
//         case 1:
//             b=parseInt(prompt('nhập số lượng bạn muốn order'));
//              c=b*25;
//             alert('bạn đã order '+b+' cf: '+c+'k');
//         case 2:
//             b=parseInt(prompt('nhập số lượng bạn muốn order'));
//              c=b*35;
//             alert('bạn đã order '+b+' Cam vắt:'+c+'k');
//         case 3:
//             b=parseInt(prompt('nhập số lượng bạn muốn order'));
//              c=b*35;
//             alert('bạn đã order '+b+' Nước ép cà rốt: '+c+'k');
//         case 4:
//             b=parseInt(prompt('nhập số lượng bạn muốn order'));
//              c=b*30;
//             alert('bạn đã order'+b+' Nước ép cà chua:'+c+'k');
//         case 5:
//             b=parseInt(prompt('nhập số lượng bạn muốn order'));
//              c=b*15;
//             alert('bạn đã order '+b+' Nước lọc:'+c+'k');
//         case 6:
//             b=parseInt(prompt('nhập số lượng bạn muốn order'));
//              c=b*55;
//             alert('bạn đã order '+b+' Nước dừa:'+c+'k');
//         default:
//             alert('không có món đó')
//     }
// }

//IV//String//lỗi mà k biết lỗi gì
//bai1
// let a=prompt('hãy nhập chuỗi mà bạn muốn');
// let chuoi=[];
// let chuoi2=[];
// chuoi=a.split(" ");
// for (i=0;i<chuoi.length;i++){
//     if (chuoi[i]=="  "){
//         chuoi[i]="-";
//         console.log('e')
//     }
//     chuoi2=chuoi2[i]+chuoi[i];
//
// }           /// làm cộng chuỗi thử xem.
// alert(chuoi2);

// Bài 2 //SỬA LỖI SAU
// let a = prompt('hãy nhập chuỗi mà bạn muốn');
// let chuoi = [];
// let b = 0;
// let mang=[];
// chuoi = a.split('');
// console.log(chuoi);
// for (i = 0; i < chuoi.length; i++) {
//     for (j = 0; j < chuoi.length; j++) {
//         if (chuoi[i]!=chuoi[j]){
//             b++;
//             mang[i]=chuoi[j];
//         } else{
//             chuoi[i]='';
//         }
//     }
//
// }
// console.log(mang+b);

//V YÊU CẦU 5 (MẢNG 2 CHIỀU)
//bài1
// let a = parseInt(prompt('nhập chiều độ dài của mảng'));
// let b = parseInt(prompt('nhập chiều độ rộng của mảng'));
// let mang = [[]];
// let c = 0;
// for (i = 0; i < a; i++) {
//     for (j = 0; j < b; j++) {
//         mang[i[j]] = parseInt(prompt('nhập giá trị cho mảng'))
//         console.log('giá trị tại vị trí ' + i + ' và ' + j + ' ' + mang[i[j]]);
//         if (mang[i[j]] % 2 == 0) {
//             c = c + mang[i[j]];
//             console.log(mang[i[j]]);
//         } else {
//             console.log('giá trị tại vị trí ' + i + ' và ' + j + ' ' + mang[i[j]] + 'không chia hết cho 2');
//         }
//     }
// }
// alert(c);

//bài 2
// let a = prompt('nhập độ dài của mảng');
// let b = prompt('nhập độ rộng của mảng');
// let mang = [[]];
// for (i = 0; i < a; i++) {
//     for (j = 0; j < b; j++) {
//         mang[i[j]] = parseInt(prompt('nhập số vào để kiểm xem có phải snt không'));
//         if (mang[i[j]] % 2 == 0 || mang[i[j]] % 3 == 0 || mang[i[j]] % 5 == 0 || mang[i[j]] % 7 == 0) {
//             console.log(mang[i[j]] +'không phải số nguyên tố');
//         } else {
//             console.log(mang[i[j]] + 'là số nguyên tố');
//         }
//     }
//
// }

//bài3
// let a = prompt('nhập độ dài của mảng');
// let b = prompt('nhập độ rộng của mảng');
// let mang = [[]];
// let c=1000000;
// let d=0;
// for (i = 0; i < a; i++) {
//     for (j = 0; j < b; j++) {
//         mang[i[j]] = parseInt(prompt('nhập số vào để kiểm xem có phải snn không'));
//         if (c>mang[i[j]]){
//
//             c=mang[i[j]];
//         }
//         if(d<mang[i[j]]){
//             d=mang[i[j]];
//         }
//     }
//
// }
// console.log('giá trị lớn nhất là '+d);
// console.log('giá trị nhỏ nhất là '+c);

//VI YÊU CẦU 6 OOP
//BÀI SỔ XỐ;

