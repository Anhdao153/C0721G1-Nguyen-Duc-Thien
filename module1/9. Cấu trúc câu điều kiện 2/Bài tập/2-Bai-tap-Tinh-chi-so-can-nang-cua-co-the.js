function cannang() {
    let sokg = parseFloat(document.getElementById('socan').value);
    console.log(sokg);
    let chieucao = parseFloat(document.getElementById('chieucao').value);
    console.log(chieucao);
    let BMI = sokg / (chieucao ^ 2);
    console.log(BMI);
    if (BMI < 18) {
        document.write("underweight");
    } else if (BMI < 25) {
        document.write("normal");
    } else if (BMI < 30) {
        document.write("Overweight");
    } else {
        document.write("Obese");
    }

}