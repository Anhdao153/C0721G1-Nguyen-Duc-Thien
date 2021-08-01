// bài 1
// function main1(a) {
// a=a*a;
// return a;
// }
// let b=prompt('nhập vào số muốn bình phương');
// main1(b);
// alert(a);

//bài 2
// function main(a) {
// a=3.14*a*a*2; /// công thức tính chu vi: 2*3.14*a;
//     alert(a);
// return a;
// }
// let b= prompt('nhập bán kính');
// main(b);

//bài 3
// let sum = 1;
// function main(a) {
//
//     for (i = 1; i <= a; i++) {
//         sum = sum * i;
//
//     }
//     alert(sum);
//     return a;
//
// }
//
// let b = parseInt(prompt('nhập số giai thừa '));
// main(b);

// //bài 4
function main (a){
    if (a-a==0){

        a=true;
        alert('ký tự bạn nhập là một số '+a);
    } else {
        a= false;
        alert('ký tự bạn nhập không phải là một số '+a);

    }
    return a;
}
let b=parseInt(prompt('nhập ký tự để kiểm tra xem nó có phải là số không '));
main(b);

//bài 5
// function main(a, s, f) {
//     let w = 0;
//     if (w < a) {
//         w = a;
//     }
//     if (w > s) {
//         w = s;
//     }
//     if (w > f) {
//         w = f;
//     }
//     alert('số nhỏ nhất là ' + w);
//     return w;
// }
//
// let b = parseInt(prompt('nhập số nguyên thứ nhất '));
// let c = parseInt(prompt('nhập số nguyên thứ hai '));
// let d = parseInt(prompt('nhập số nguyên thứ ba '));
// main(b, c, d);

//bài 6
// function main(a) {
// if (a>0){
//     a=true;
//     alert('số bạn nhập là số nguyên dương '+a);
// } else {
//     a=false;
//     alert('số bạn nhập là số nguyên âm '+a);
// }
// return a;
// }
// let b= parseInt(prompt('nhập số nguyên để kiểm tra '));
// main(b);

//bài 7
// function main(a, b) {
//     let c = 0;
//     c = a;
//     a = b;
//     b = c;
//     alert('số thứ nhất '+a);
//     alert('số thứ hai '+b);
//     return a, b;
//
// }
//
// let d = parseInt(prompt('nhập số thứ nhất '));
// let e = parseInt(prompt('nhập số thứ hai '));
// main(d, e);

//bài 8
// function main(m1) {
//     let x = 0;
//     for (i = 0; i < m1.length / 2; i++) {
//         x = m1[i];
//         m1[i] = m1[m1.length - i - 1];
//         m1[m1.length - i - 1] = x;
//     }
//     return m1;
// }
//
// let a = parseInt(prompt('nhập độ dài cho mảng '));
// let m = [];
// for (i = 0; i < a; i++) {
//     m[i] = prompt('nhập giá trị cho mảng ');
// }
// let m2=[];
// m2=main(m);
// document.write("<br>"+m2);


//bài 9
// function main(m) {
//     let a = prompt('kí tự bất kì để check');
//     let d = 0;
//     document.write(m);
//     for (i = 0; i < m.length; i++) {
//
//         if (m[i] == a) {
//             d = d + 1;
//         }
//     }
//     if (d == 0) {
//         d--;
//         document.write('<br>không có ký tự nào bị lặp')
//     } else {
//         document.write(d + ' là số lần bị lặp ');
//         document.write(a + ' là ký tự bị lặp');
//     }
//
//     return m;
// }
//
// let m2 = [];
// for (i = 0; i < 5; i++) {
//     m2[i] = prompt();
//
// }
// main(m2);
// document.write(m2);



