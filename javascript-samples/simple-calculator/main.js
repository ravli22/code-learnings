function getHistory(){
   return this.document.getElementById("history-value").innerText
}
function printHistory(num){
    this.document.getElementById("history-value").innerText=num;
}
function getOutput(){
    return this.document.getElementById("output-value").innerText
}
function printOutput(num){
    if(num==""){
        this.document.getElementById("output-value").innerText=num
    }
    else{
        this.document.getElementById("output-value").innerText=getFormattedNumber(num);
    }
}
function getFormattedNumber(num){
    if(num=='-'){
        return ""
    }
    var n = Number(num);
    return n.toLocaleString("en");
}
function reverseNumberFormat(num){
    return Number(num.replace(/,/g,''));//the str you want to replace should be in the mid of / and /g, followed by the str you to use
}


var operators = this.document.getElementsByClassName("operator");
for(var i=0;i<operators.length;i++){
    operators[i].addEventListener('click',function(){
         if(this.id=='clear'){
             printOutput("");
             printHistory("");
         }
         else if(this.id=='backspace'){
             var output = reverseNumberFormat(getOutput()).toString()
             if(output){
                 output = output.substr(0,output.length-1);
                 printOutput(output)
             }
         }else{
            var output = getOutput();
            var history = getHistory();
            if(output=="" && history != ""){
                if(isNaN(history[history.length-1])){
                    history = history.substr(0,history.length-1);
                }
            }
             if(output!="" || history!=""){
                 output = output==""?output:reverseNumberFormat(getOutput());
                 history=history+output;
                 if(this.id=='='){
                    var result = eval(history);
                    printOutput(result);
                    printHistory("")
                 }
                 else{
                    history = history+this.id;
                    printHistory(history);
                    printOutput("");
                 }

                
                
             }
         }

    })
}

var numbers = this.document.getElementsByClassName("number");
for(var i=0;i<numbers.length;i++){
    numbers[i].addEventListener('click',function(){
        var output = reverseNumberFormat(getOutput());
        if(output!=NaN){
            output=output+this.id;
            printOutput(output);
        }
    })
}