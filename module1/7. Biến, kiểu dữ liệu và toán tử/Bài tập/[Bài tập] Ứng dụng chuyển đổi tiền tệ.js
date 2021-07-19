function amountjs() {
    let nhapTien =parseFloat(document.getElementById("nhaptien").value);
    console.log("nhapTien  " +nhapTien);
    let TIGIA =parseFloat(document.getElementById("tigia").value);
    console.log("TIGIA  " +TIGIA);
    let TILE =parseFloat( document.getElementById("tile").value);
    console.log("TILE  " +TILE);
    let total = (nhapTien * TILE) / TIGIA;
    console.log("total  " +total);
    if (total === "" || TIGIA == 0) {
        alert("You have to enter values")
        return;
    }
    total = Math.round(total * 100) / 100;
    total = total.toFixed(2);
    console.log("total  " +total)
    document.getElementById("totalmoney").innerText=total;
    document.getElementById("change").innerText = TILE;
}

//https://ironhackvietnam.edu.vn/bai-tap-javascript/#2_Xay_dung_May_tinh_tien_tip_JavaScript