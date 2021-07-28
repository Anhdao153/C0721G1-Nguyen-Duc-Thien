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
