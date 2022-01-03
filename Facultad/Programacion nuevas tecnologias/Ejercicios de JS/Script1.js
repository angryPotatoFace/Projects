function script() {
    let aswerd = confirm("¿ Desea cambiar la tipografia ?");
    if (aswerd) {
        document.getElementById("TEXTO").className = "clase";
      /* text.style.fontFamily = "Comic Sans Ms";
       text.style.fontSize= "14px"; 
       text.style.color= "red";*/
    } else {
        alert("Se mantiene la tipografa");
    }
} 