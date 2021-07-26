let x = [-3, -4, 6, 10, 3, -2];
let frist = 0;
let last = x.length - 1;
while (frist < last) {
    let b = x[frist];
    x[frist] = x[last];
    x[last] = b;
    frist++;
    last--;
}
document.write(x);