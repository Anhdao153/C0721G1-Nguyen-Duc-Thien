// Bài 1
// let a = prompt('nhập độ dài mảng số nguyên để so sánh với 10');
// let songuyen = [a];
// let b = 0;
// for (i = 0; i < a; i++) {
//     songuyen[i] = prompt('nhập số')
// }
// for (i = 0; i < a; i++) {
//
//     if (songuyen[i] >= 10) {
//         document.write(songuyen[i] + ' ');
//         b = b + 1;
//     }
// }
// document.write('<br>có ' + b + " số nguyên hơn hơn 10 trong mảng");

// bài 2
// let a = prompt('nhập độ dài của mảng để so sánh với nhau');
// let songuyen = [a];
// let b = 0;
// let c = 0;
// for (i = 0; i < a; i++) {
//     songuyen[i] = parseInt(prompt('nhập số vào mảng'));
// }
// for (i = 0; i < a; i++) {
//     if (songuyen[i] > b) {
//         b = songuyen[i];
//         i = c;
//     } else {
//         continue;
//     }
// }
// document.write('số nguyên lớn nhất trong mảng là ' + b + ' vị trí của nó là' + c);

//bài 3
// let a = parseInt(prompt('nhập độ dài của mảng để so sánh với nhau'));
// let songuyen=[a];
// let b=0;
// let c=0;
// let d=0;
// for (i=0;i<a;i++){
//     songuyen[i]=parseInt(prompt('nhập số vào mảng'))
// }
// for (i=0;i<a;i++){
//     if (songuyen[i]>b){
//         b= songuyen[i];
//     }
//     c=songuyen[i]+c;
//
// }
// d=c/a;
// document.write('số nguyên có giá trị lớn nhất là '+b+' và tổng trung bình của các phần tử trong mảng là '+d);

// bài 4
// let a = prompt('nhập độ dài mảng số nguyên');
// let songuyen = [];
// let b = 0;
// let c = 0;
// for (i = 0; i < a; i++) {
//     songuyen[i] = parseInt(prompt("nhập giá trị"));
// }
// for (i =0; i < a%2; i++) {
//     c = songuyen[i];
//     songuyen[i] = songuyen[a-1-i];
//     songuyen[a-1-i] = c;
//
// }
// document.write(' số ' + songuyen);

// //bai5
// let a = prompt('nhập độ dài mảng số nguyên');
// let songuyenam = [];
// let b = 0;
// let c = 0;
// for (i = 0; i < a; i++) {
//     songuyenam[i] = parseInt(prompt("nhập giá trị"));
// }
// for (i = 0; i < a; i++) {
//     if (songuyenam[i] < 0) {
//         document.write('in số nguyên âm ' + songuyenam[i]);
//     } else {
//         document.write('in số nguyên dương ' + songuyenam[i]);
//     }
// }

// // /bài 6
// let a = prompt('nhập độ dài mảng số nguyên');
// let songuyenam = [];
// let b = 0;
// let c = 0;
// for (i = 0; i < a; i++) {
//     songuyenam[i] = parseInt(prompt("nhập giá trị"));
// }
// let v = prompt('nhập phần tử mảng số nguyên');
// for (i=0;i<a;i++){
//     if(v==songuyenam[i]){
//         alert("V thuộc phần tử của mảng với giá trị "+v);
//         break;
//     }
//
// }
// if (v!=songuyen[i]) {
//     alert("v không thuộc phần tử nào");
// }

// //bài 7
// let a = prompt('nhập độ dài mảng số nguyên');
// let songuyenam = [];
// let b = 0;
// let c = 0;
// for (i = 0; i < a; i++) {
//     songuyenam[i] = parseInt(prompt("nhập giá trị"));
// }
// let v = prompt('nhập phần tử mảng số nguyên');
// for (i=0;i<a;i++){
//     if(v==songuyenam[i]){
//         songuyenam[i]=songuyenam[i+1];
//     }
// }
// document.write(songuyenam);

//bài 8
// let a = prompt('nhập độ dài mảng số nguyên');
// let songuyen = [];
// let b = 0;
// let c = 0;
// for (i = 0; i < a; i++) {
//     songuyen[i] = parseInt(prompt("nhập giá trị"));
// }
// for (i = 0; i < a; i++) {
//     for (j = 0; j <= i; j++) {
//         if (songuyen[j] < songuyen[i]) {
//             b = songuyen[i];
//             songuyen[i] = songuyen[j];
//             songuyen[j] = b;
//         }
//     }
//
// }
// document.write(' số ' + songuyen);

// //bài 9
// let a = prompt('nhập độ dài mảng số nguyên âm');
// let songuyenam = [];
// let songuyen = [];
// let c = prompt('nhập độ dài mảng số nguyên');
// let noi = [];
// for (i = 0; i < a; i++) {
//     songuyenam[i] = parseInt(prompt("nhập giá trị số nguyên âm"));
// }
//
// for (j = 0; j < c; j++) {
//     songuyen[j] = parseInt(prompt("nhập giá trị số nguyên"));
// }
// noi = songuyenam.concat(songuyen);
// document.write(noi);