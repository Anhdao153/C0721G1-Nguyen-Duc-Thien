function yes() {
    let a = document.getElementById('yes1');
    alert('<3');
}
let flag = 1;
function no() {
    var dichuyen = 10;

    dichuyen = dichuyen + 10;
    console.log('ditconmeno')
    if (flag == 1) {
        document.getElementById('no1').style.marginTop = '90px';
        document.getElementById('no1').style.marginLeft = '500px';
        flag = 2;
        console.log(flag,'323');
        console.log('ditc3onmeno');
    } else if (flag == 2) {
        document.getElementById('no1').style.marginTop =   '90px';
        document.getElementById('no1').style.marginLeft =  '500px';
        flag = 3;
        console.log(flag,'règs');
        console.log('ditconmen2o')
    } else if (flag == 3) {
        document.getElementById('no1').style.marginTop =   '235px';
        document.getElementById('no1').style.marginRight =  '360px';
        flag = 1;
        console.log('ditcon1meno')
    }
}