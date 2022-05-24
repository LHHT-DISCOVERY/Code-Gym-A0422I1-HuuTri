function hamSo (number) { 
      let a = document.getElementById("Result");
      a.innerHTML += parseInt(number);
}
function hamTinh(pheptinh){
      let b = document.getElementById("Result");
      b.innerHTML += pheptinh ;
}
function del() {
      let e = document.getElementById("Result").innerHTML = " ";
}
function ketQuaTinhToan() {
      let c = document.getElementById("Result").innerHTML;
      document.getElementById('Result').innerHTML = eval(c);
}
