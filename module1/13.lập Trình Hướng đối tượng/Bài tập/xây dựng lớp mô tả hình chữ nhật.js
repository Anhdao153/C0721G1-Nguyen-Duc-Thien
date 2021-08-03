// let hcn = function (chieudai, chieurong) {
//     this.chieudai = chieudai;
//     this.chieurong = chieurong;
//     this.getDai = function () {
//         return chieudai;
//     };
//     this.getRong = function () {
//         return chieurong;
//     };
//     this.setDai = function (x) {
//         this.chieudai = x;
//     };
//     this.setRong = function (y) {
//         this.chieurong = y;
//     };
//     this.dientich = function () {
//         return chieudai * chieurong;
//     };
//     this.chuvi = function () {
//         return (chieurong + chieudai) * 2;
//     };
//
//     this.veHcn = function () {
//         ctx = document.getElementById("h1").getContext("2d");
//         ctx.fillStyle = "#ff0000";
//         ctx.fillRect(0, 0, this.getRong() * 10, this.getDai() * 10);
//
//     }
// };
//
// let HCN = new hcn(10, 5);
// HCN.veHcn();
// document.write(HCN.veHcn());

let Rectangle = function (x, y) {
    this.dai = x;
    this.rong = y;
    this.getDai = function () {
        return x;
    };
    this.setDai = function (x) {
        this.dai = x;
    };
    this.getRong = function () {
        return y;
    };
    this.setRong = function (y) {
        this.rong = y;
    };
    this.dientich = function () {
        return x * y;
    };
    this.chuvi = function () {
        return (x + y) * 2;
    };
    this.chuvi = function () {
        return (x + y) * 2;
    };
    this.draw = function () {
        let ctx = document.getElementById("myCanvas").getContext("2d");
        ctx.fillStyle = "#fff9f8";
        ctx.fillRect(0, 0, this.getDai() * 10, this.getRong() * 10);
    }
};
function change() {
    a.setDai(parseInt(prompt("nhap chieu dai")));
    a.setRong(parseInt(prompt("nhap chieu rộng")));
    document.getElementById('kq').innerText = "diện tích và chu vi của hình chữ nhật khi thay đổi: " + a.dientich() + ", " + a.chuvi();
    // document.write(a.draw());
}

let a = new Rectangle(parseInt(prompt("nhap chieu dai")), parseInt(prompt("nhap chieu rong")));
console.log("diện tích và chu vi của hình chữ nhật: " + a.dientich() + ", " + a.chuvi());
a.draw();
document.write(a.draw());

