var balanceParcial=0;

function obtenerFecha(){
    let fecha = new Date();
    fecha = (fecha.getDate() + "/0"+ (fecha.getMonth()+1) + "/"+ fecha.getFullYear());
    return fecha;
}


function obtenerBalanceParcial() {     
    var fila = document.getElementById("fila");
    var clon = fila.cloneNode(true);
    var balance = clon.childNodes[5].textContent;
    balance = balance.substring(1);
    balance = parseFloat(balance);
    return balance;
 }

function AgregarFila(fecha, balance, movimiento){
    var fila = document.getElementById('fila');
    var clon = fila.cloneNode(true);
    var cuerpo = document.getElementById('CUERPO_TABLA');
    clon.childNodes[1].textContent = (fecha);
    clon.childNodes[3].textContent = (movimiento);
    clon.childNodes[5].textContent = (balance);
   // Balance.setBalance(movimiento);
    cuerpo.appendChild(clon);
}

function CalculaImporte(movimiento) {
    var fecha = obtenerFecha();
    balanceParcial += movimiento;
    AgregarFila(fecha, balanceParcial, movimiento);
}



