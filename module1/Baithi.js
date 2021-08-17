let n = prompt('nhập số lượng phần tử vào cho mảng');
if (n <= 50) {
    let a = [];
    for (let j = 0; j < n; j++) {
        a[j] = parseInt(prompt('nhập giá trị cho mảng a tại vị trí ' + j));
    }
    document.write('mảng vừa nhập là ' + a);
    document.write('<br>các số nguyên tố chứa trong mảng là: ');
    for (let i = 0; i < n; i++) {
        if (a[i] === 2 || a[i] === 3 || a[i] === 5 || a[i] === 7) {
            document.write("<br>" + a[i]);
        } else if (a[i] % 2 !== 0 && a[i] % 3 !== 0 && a[i] % 5 !== 0 && a[i] % 7 !== 0) {
            document.write("<br>" + a[i]);
        }
    }
} else {
    alert('khởi động và nhập lại n, n phải <=50');
}
