let a = parseFloat(prompt("nhập giá trị cho thằng a"));
let b = parseFloat(prompt("nhập giá trị cho thằng b"));
let c = a + b;
if (c < 4) {
    alert('below')
} else {
    alert('over');
}


let message = prompt('Hãy nhập tài khoản')

if (message == 'Employee') {
    alert('hello');
} else if (message === 'Director') {
    alert('Greetings');
} else if (message === "") {
    alert('No Login')
} else {
    alert('no value')
}