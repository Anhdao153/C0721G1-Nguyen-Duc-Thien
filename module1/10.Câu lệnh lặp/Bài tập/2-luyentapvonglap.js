// for (i=0;i<100;i++){
//     document.write(+i+ '<br>');
//     if (i==99){
//         document.write('hoàn thành')
//     }
// }
//bài 3
var f0=0;
var f1=1;
var f;

function fibonacci(n) {

    console.log(n);
    console.log(f0,f1);
    for (i=1;i<=n;i++){
         f=f0+f1;
        f0=f1;
        f1=f;

        document.write(f+ ' ');

        fibonacci(n-1);
    }
}
 function main() {
     let n=document.getElementById('fibonacci').value;
     console.log(n);
     document.write('0 1 ');
fibonacci(n-2);
}
