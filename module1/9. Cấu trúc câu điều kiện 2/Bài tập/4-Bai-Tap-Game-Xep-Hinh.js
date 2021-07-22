var hinh;
var hinh2;
var hinh3;
var hinh4;
function chuyenanh() {
    var anh1 = document.getElementById('img1');
    if (anh1.src.match("phandau.png")) {
        anh1.src = "../../phandau2.png"
        hinh = 2;
    } else {
        anh1.src = "../../phandau.png"
        hinh =1;
    }
    console.log(hinh);
}

function chuyenanh2() {
    var anh2 = document.getElementById('img2');
    if (anh2.src.match("phanthan.png")) {
        anh2.src = "../../phanthan2.png"
        hinh2 = 2;
    } else {
        anh2.src = "../../phanthan.png"
        hinh2 = 1;
    }
    console.log(hinh2);
}

function chuyenanh3() {
    var anh3 = document.getElementById('img3');
    if (anh3.src.match("phannguc2.png")) {
        anh3.src = "../../phannguc.png"
        hinh3 = 1;
    } else {
        anh3.src = "../../phannguc2.png"
        hinh3 = 2;
    }
    console.log(hinh3);
}

function chuyenanh4() {
    var anh4 = document.getElementById('img4');
    if (anh4.src.match("phanchan.png")) {
        anh4.src = "../../phanchan2.png"
        hinh4 = 2;
    } else {
        anh4.src = "../../phanchan.png"
        hinh4 = 1;
    }
    console.log(hinh4);
}

function winer() {

    if ((hinh == 1 && hinh2 == 1 && hinh3 == 1 && hinh4 == 1) || (hinh == 2 && hinh2 == 2 && hinh3 == 2 && hinh4 == 2)) {
        alert('winner');

    }
}