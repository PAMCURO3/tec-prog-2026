//Ejercicio 1: Calcular estacion del año
let mes = 4
let estacion; //Undefined
if(mes == 1 || mes == 2 || mes == 12){
	estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
	estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
	estacion = "Invierno";
}
else if(mes == 9 || mes == 10 || mes == 11){
	estacion = "Primavera";
}
else{
	estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estacion del año: "+estacion);

//Ejercicio 2 Video 37: Hora del día
/* 
de 6 a 11 nos saluda: Good morning
de 12 a 16 nos saluda: Good afternoon
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night
Trabajaremos con 24 horas
*/
let horaDia = 9;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
	mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
	mensaje = "Good Afternoon";
}
else if(horaDia >= 17 && horaDia <= 19){
	mensaje = "Good evening";
}
else if(horaDia >= 20 && horaDia <= 23){
	mensaje = "Good night";
}
else{
	mensaje = "valor incorrecto";
}
console.log(mensaje);