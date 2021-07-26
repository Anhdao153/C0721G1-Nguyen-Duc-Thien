// for (i=0;i<100;i++){
//     document.write(+i+ '<br>');
//     if (i==99){
//         document.write('hoàn thành')
//     }
// }
//bài 3
// var f0=0;
// var f1=1;
// var f;
//
// function fibonacci(n) {
//
//     console.log(n);
//     console.log(f0,f1);
//     for (i=1;i<=n;i++){
//          f=f0+f1;
//         f0=f1;
//         f1=f;
//
//         document.write(f+ ' ');
//
//         fibonacci(n-1);
//     }
// }
//  function main() {
//      let n=document.getElementById('fibonacci').value;
//      console.log(n);
//      document.write('0 1 ');
// fibonacci(n-2);
// }
// bài 4
// var f0=0;
// var f1=1;
// var f;
//
// function fibonacci(n) {
//
//     console.log(n);
//     console.log(f0,f1);
//     for (i=1;i<=n;i++){
//         f=f0+f1;
//         f0=f1;
//         f1=f;
//         if (f%5==0){
//         document.write(f+ ' ');
//         break;
//         }
//         fibonacci(n-1);
//     }
// }
// function main() {
//     let n=document.getElementById('fibonacci').value;
//     console.log(n);
//     document.write('0 1 ');
//     fibonacci(n-2);
// }
//bài 5
// var f0=0;
// var f1=1;
// var f;
// var tong=0;
// function fibonacci(n) {
//
//     console.log(n);
//     console.log(f0,f1);
//     for (i=1;i<=n;i++){
//         f=f0+f1;
//         f0=f1;
//         f1=f;
//         tong=tong+f;
//
//         fibonacci(n-1);
//     }
// }
// function main() {
//     let n=document.getElementById('fibonacci').value;
//     console.log(n);
//    //document.write('0 1 '); khong dùng
//     fibonacci(n);
//     document.write(tong+ ' ');
// }
// bài 6
// let sochiahet=0;
// let tong=0;
// function sochiahetcho7(n) {
// console.log(n);
// for (i=0;i<=n;i++){
//     sochiahet=sochiahet+7;
//     console.log(sochiahet);
//     if(sochiahet%7==0) {
//         tong = tong + sochiahet;
//     }
//     else {
//         break;
//     }
// }
// }
//
// function main() {
// let n=document.getElementById('fibonacci').value;
//     console.log(n);
//     sochiahetcho7(n);
//     document.write(+tong);
// }
//bài 7
// for (i = 1; i < 101; i++) {
//
//     if (i % 3 == 0 && i % 5 == 0) {
//         document.write('frizzbuzzz <br>');
//     } else if (i % 3 == 0) {
//         document.write('Frizz <br>');
//     } else if (i % 5 == 0) {
//         document.write('Buzzz <br>');
//     } else {
//         document.write(+i + '<br>');
//     }
// }
// bài  8
function main() {
    for (i = 1; i <=3; i++) {
        let n = prompt('nhập số để chơi');
        console.log(n);
        let m = Math.floor(Math.random() * 10);
        console.log(m);
        if (n == m) {
            alert("bạn đã nhập đúng" + m);
        } else {
            alert("bạn chỉ có 3 lần chơi, đã chơi" + i + "lần chơi");
        }
    }
}