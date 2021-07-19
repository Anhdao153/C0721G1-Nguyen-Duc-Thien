let ball= null;
ball= document.getElementById('traibong');
ball.style.position='relative';
ball.style.left='0px';

function moveright() {
ball.style.left=parseInt(ball.style.left)+10+'px'
}
window.onload = init;