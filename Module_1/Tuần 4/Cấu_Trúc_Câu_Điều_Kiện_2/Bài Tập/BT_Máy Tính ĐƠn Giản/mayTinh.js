function hamSo (number) { 
      let a = document.getElementById("Result");
      a.innerHTML += parseInt(number);
}
function hamTinhCong(phepcong){
      let b = document.getElementById("Result");
      b.innerHTML += phepcong ;
}
function hamTinhTru(pheptru) {
      let d = document.getElementById("Result");
      d.innerHTML -= pheptru;

}
function ketQuaTinhToan() {
      let c = document.getElementById("Result").innerHTML;
      console.log(c)
      document.getElementById('Result').innerHTML = eval(c);
      console.log(eval(c))
}
