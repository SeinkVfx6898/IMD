function habilitarTarjeta(tarjeta){
    var tarjeta=document.getElementById("tarjeta");
    var transferencia=document.getElementById("transferencia");
    tarjeta.style.display="block";
    transferencia.style.display="none";
}
function habilitarTransferencia(transferencia){
    var tarjeta=document.getElementById("tarjeta");
    var transferencia=document.getElementById("transferencia");
    tarjeta.style.display="none";
    transferencia.style.display="block";
}


