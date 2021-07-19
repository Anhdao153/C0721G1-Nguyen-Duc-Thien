function main() {
    let a = parseFloat(document.getElementById("inputyear").value);
    document.write(+a);
    console.log(a);
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                alert(year + " is a leap year");
            } else {
                alert(year + " is NOT a leap year");
            }
        } else {
            alert(year + " is a leap year");
        }
    } else {
        alert(year + " is NOT a leap year");
    }
}