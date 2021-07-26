let value = prompt('nhập giá trị gì gì đó vào đây đi ');
let numbers = [-3, 5, 1, 3, 2, 10];
for (i = 0; i < numbers.length;i++){
    if (value == numbers[i]) {
        alert("value " + numbers[i] + " found at " + i);
    }
}