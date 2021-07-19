function Addition() {
    let A=parseFloat(document.getElementById("numberA").value);
    let B=parseFloat(document.getElementById("numberB").value);
    console.log("in ra số " +A);
    console.log("in ra số " +B);
    let Result= A+B;
    console.log("in ra số " +Result);
    document.getElementById("dapso").innerText=(Result);
}
function Subtraction() {
    let A=parseFloat(document.getElementById("numberA").value);
    let B=parseFloat(document.getElementById("numberB").value);
    console.log("in ra số " +A);
    console.log("in ra số " +B);
    let Result1= A-B;
    console.log("in ra số " +Result1);
    document.getElementById("dapso").innerText=(Result1);
}
function Multiplication() {
    let A=parseFloat(document.getElementById("numberA").value);
    let B=parseFloat(document.getElementById("numberB").value);
    console.log("in ra số " +A);
    console.log("in ra số " +B);
    let Result2= A*B;
    console.log("in ra số " +Result2);
    document.getElementById("dapso").innerText=(Result2);
}
function Division() {
    let A=parseFloat(document.getElementById("numberA").value);
    let B=parseFloat(document.getElementById("numberB").value);
    console.log("in ra số " +A);
    console.log("in ra số " +B);
    let Result3= A/B;
    console.log("in ra số " +Result3)
    document.getElementById("dapso").innerText=(Result3);
}