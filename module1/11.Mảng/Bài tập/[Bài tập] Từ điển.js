let tienganh = ["chair", "man", "woman", "boy", "girl", "remote", "phone", "mouse", "laptop", "guitar"];
let tiengviet = ["ghế", "đàn ông", "phụ nữ", "con trai", "con gái","điều khiển", "chuột", "điện thoại", "laptop", "đàn guitar"];
let b=prompt('nhập số từ mà bạn muốn kiểm tra, từ 1-10');
let check=true;
for (i = 0; i <= tiengviet.length; i++) {

    console.log(tienganh[i]);
     if (tiengviet[i]===b){
         check=false;
        alert('từ mà bạn muốn dịch '+tiengviet[i]+' có ý nghĩa là '+tienganh[i]);
        break;
    }
}
if (check){
    alert("không có trong từ điển");
}