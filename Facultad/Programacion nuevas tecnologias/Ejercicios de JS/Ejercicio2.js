function AgregarFila() {
    const i = 1, j = 2;
    var f= incr();
    var fila = document.getElementById('FILA');
    var clon = fila.cloneNode(true);
    var cuerpo = document.getElementById('CUERPO_TABLA');
    clon.children[0].textContent = 'Celda {'+f+','+i+'}';
    clon.children[1].textContent = 'Celda {'+f+','+j+'}';
    cuerpo.appendChild(clon);
}

var incr = (function () {
    var i = 3;
    return function () {
        return i++;
    }
})();

