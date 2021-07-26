//bai1 đã làm ở file trc rồi
//bài 2
// let n=prompt('hãy nhập số nguyên dương');
// let total=1
// for (i=1;i<=n;i++){
//     total=total*i;
//
// }
// document.write('giai thừa của '+n+' là: ' +total);
// bài 3
// for(i=0;i<=4;i++){
//     document.write('* ');
//
//     for (n=1;n<=i;n++){
//         document.write('* ');
//     }
//     document.write('<br>');
// }
//bài 4
// for (n=4;n>=1;n--){
//
//     document.write('*');
//
//     for (i=1;i<n;i++){
//         document.write('*');
//     }document.write('<br>');
// }
//bài 5
// for (i = 4; i >=1; i--) {
//     for (j =1; j < i; j++) {
//         document.write('tt');
//     }
//     for (j = i; j > 1; j--) {
//         document.write('*');
//     }
//     document.write('<br>');
// }

//bài 6
// for (i = 0; i <=4; i++) {
//     for (j = 0; j < i; j++) {
//         document.write('tt');
//     }
//     for (j = i; j <= 4; j++) {
//         document.write('*');
//     }
//     document.write('<br>');
// }
//bài 7
// let n=prompt();
// let m=prompt();
// for (i=1;i<=n;i++){
//     for(j=1;j<=m;j++){
//         if (i==1||j==1||i==n||j==m){
//             document.write('*');
//         }
//         else{
//             document.write('tt');
//         }
//     }
//     document.write("<br>");
// }
// bài 8
//tính lãi mẹ đẻ lãi con
let n=prompt('nhập số tiền muốn vay');
let m=prompt('số tháng vay');
let total=0,lai=0;
lai=n*5/100;
for (i=1;i<=m;i++){
    total=total+lai*i;
    //có thể là sai công thức tính lãi, cần xem lại
    console.log(total);
}
document.write('tổng lãi ' +total);
//bài 9 in hình trái tim rỗng
