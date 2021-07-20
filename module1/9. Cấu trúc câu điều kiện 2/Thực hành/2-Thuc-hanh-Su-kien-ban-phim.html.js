var dichuyen = 10;

document.addEventListener("keydown", main)

function main(event) {

    console.log(event.keyCode)
    switch (event.keyCode) {
        case 37:
            dichuyen = dichuyen + 10;
            document.getElementById('doraemon').style.paddingLeft = dichuyen + 'px'
            break;
        case 38:
            dichuyen = dichuyen + 10;
            document.getElementById('doraemon').style.paddingTop = dichuyen + 'px'
            break;
        case 39:
            dichuyen = dichuyen - 10;
            document.getElementById('doraemon').style.paddingLeft = dichuyen + 'px'
            break;
        case 40:
            dichuyen = dichuyen - 10;
            document.getElementById('doraemon').style.paddingTop = dichuyen + 'px'
            break;
    }
}

