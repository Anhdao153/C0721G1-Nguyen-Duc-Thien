let user= prompt("hãy nhập user:");
if (user=="Admin") {
    let password= prompt("hãy nhập password");
    if (password == "TheMaster") {
        alert("welcome");
    } else {
        alert("Wrong password");
    }
}

 else if (user!="Admin") {
    alert("this user does't exist");
}
 else {
     alert("cancel");
}