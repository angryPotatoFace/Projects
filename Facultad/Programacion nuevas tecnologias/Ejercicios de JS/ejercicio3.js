function compararTexto() {
    var textoComp = document.getElementById('texto').textContent;
    var textIngresado = document.getElementById('texto_Ingresado').value;
    var aux = document.getElementById('texto_Ingresado');
    if (textIngresado == textoComp){
        alert("Son iguales!");
        aux.className = "texto-correcto";
    } else{
        alert("No son iguales :(");
        aux.className = "texto-incorrecto";
    }
}


function onKeyUp(event) {
    var keycode = event.keyCode;
    if (keycode == '13') {
        compararTexto();
    }
}
