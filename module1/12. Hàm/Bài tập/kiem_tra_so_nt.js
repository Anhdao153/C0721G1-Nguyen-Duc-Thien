function main(a) {
    for (i=2;i<a;i++){
    if (a%i!=0){
        document.write('số bạn vừa nhập là số nguyên tố '+a);
        break;
    } else {
        document.write('Số bạn vừa nhập không phải số nguyên tố '+a);
        break;
    }
    }
    return a;
}
function secondmain(b) {
b=document.getElementById('input').value;
main(b);
}

function beta(c) {
    let d=1000;
document.write('2,3,5,7 ');
    for (i=2;i<1000;i++){
            if (i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0){
                document.write(+i+ "<br>");
            }
        }

    }

