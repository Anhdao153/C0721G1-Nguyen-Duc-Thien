//bài 1
// let d=prompt('nhập vào chiều dài của mảng');
// let r=prompt('nhập vào chiều rộng của mảng');
// let mang=[[]];
// for (i=0;i<d;i++){
//     console.log('row'+i);
//     for (j=0;j<r;j++){
//        mang[i[j]]=parseInt(prompt('Nhập giá trị tại vị trí'+i+' và '+j));
//         console.log(mang[i[j]]);
//     }
// }

// bài 2
//
// let a = ['c', 's', 'c', '2', '6', '1'];
// let x = 0;
// for (i = 0; i < a.length/2; i++) {
//     x = a[i];
//     a[i] = a[a.length - 1-i];
//     a[a.length - 1-i] = x;
//
// }
// console.log(a);

// // //bài 3
// let d=prompt('nhập vào chiều dài của mảng');
// let r=prompt('nhập vào chiều rộng của mảng');
// let mang=[[]];
// for (i=0;i<d;i++){
//     console.log('row' +i);
//     for (j=0;j<r;j++){
//         mang[i[j]]=parseInt(prompt('nhập gia trị'));
//         console.log(mang[i[j]]);
//     }
// }

// //bài 4 /// xem lại
// let a=prompt('nhập độ dài của mảng');
// let mang=[];
//
// for (i=0;i<a;i++) {
//     mang[i] = prompt('nhập chuỗi');
//     let b = mang[i];
//     let mang[i]= b.split(',');
// }
// console.log(c);

//bài 5
// let a = prompt('nhập độ dài mảng số nguyên');
// let b = prompt('nhập độ dài mảng số nguyên');
// let mang1 = [];
// let mang2 = [];
// for (i = 0; i < a; i++) {
//     mang1[i] = prompt("nhập giá trị mảng 1");
//     console.log(mang1);
// }
// for (j = 0; j < b; j++) {
//     mang2[j] = prompt("nhập giá trị mảng 2");
//     console.log(mang2);
// }
// for (i = 0; i < a; i++) {
//     for (j = 0; j < b; j++) {
//         if (mang1[i] == mang2[j]) {
//             alert('2 thằng này rất giống nhau');
//         } else {
//             alert('khác nhau hoàn toàn');
//         }
//     }
// }

//bài 6
// let a = prompt('nhập độ dài mảng số nguyên');
// let mang1 = [];
// let b=[];
// for (i = 0; i < a; i++) {
//     mang1[i] = prompt("nhập giá trị mảng 1");
//     console.log(mang1);
// }
//     b=mang.split("");
// for (i=0;i<b.length;i++){
//     if (b[i]=="-"){
//         b[i]="_";
//     }
// }