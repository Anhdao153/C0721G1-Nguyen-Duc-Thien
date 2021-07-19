/*if (browser == 'Edge') {
    alert("You've got the Edge!");
} else if (browser == 'Chrome' || browser == 'Firefox' || browser == 'Safari' || browser == 'Opera') {
    alert('Okay we support these browsers too');
} else {
    alert('We hope that this page looks ok!');
}
/*
/* switch (browser) {
    case 'edge':
        alert("you've got the Edge!");
        break;
    case 'chrome':
    case 'Firefox':
    case 'Safari':
    case 'Opera':
        alert("okay we support these browsers too");
        break
    default:
        alert('We hope that this page looks ok!');
}
/*
 */
/*
let a = prompt('a?', '');

if (a == 0) {
    alert(0);
}

if (a == 1) {
    alert(1);
}

if (a == 2 || a == 3) {
    alert('2,3');
}*/
/* switch (a) {
    case 0:
        alert(0);
        break;
    case 1:
        aler(0);
        break
    case 2:
    case 3:
        alert('2,3');
        break;

}
 */
let so= prompt('nhap so vao, neu >0 sẽ hiển thị 1')
if(so>0){
    alert(1);
    if (so<0){
        alert(-1);
    }
} else {
    alert(0);
}