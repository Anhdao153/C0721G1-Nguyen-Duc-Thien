function botinh() {
    let tinhsongay = parseInt(document.getElementById('date').value);
switch (tinhsongay) {
    case 2:
    alert('Tháng 2 có 28 ngày')
    break;
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        alert('tháng này có 31 ngày')
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        alert('tháng này có 30 ngày')
        break;
    default:
        alert('không có tháng này tồn tại trên đời thằng ngu này ' +tinhsongay)
}
}