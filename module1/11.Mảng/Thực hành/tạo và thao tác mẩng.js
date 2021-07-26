let thongso = 0;
let mang = Array();

function themsovaomang() {

    mang[thongso] = document.getElementById('themma').value;
    alert("đã thêm " + mang[thongso] + " vào mảng ở vị trí " + thongso);
    thongso++;
    document.getElementById('themma').value;
}

function hiensora() {
    let e = "<hr/>"
    for (i = 0; i < mang.length; i++) {
        e = e + "element " + i + " = " + mang[i] + "<br/>";
    }
    document.getElementById('result').innerHTML = e;
}