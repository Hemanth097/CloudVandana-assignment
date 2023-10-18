let count = 1;
let inputField = document.getElementById('input');

function insertNum(num){
    if(count){
        inputField.textContent = num;
        count= 0;
    }else{
       inputField.textContent += num;
    }
}


function equalTo(){
    try{
        const result = eval(inputField.textContent);
        inputField.textContent = result;
    }catch(error){
        inputField.textContent = "ERROR";
    }
    count = 1;
}

function clearInput(){
    inputField.textContent = '';
}