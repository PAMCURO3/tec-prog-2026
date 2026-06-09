/*const se utiliza para valores constantes que no
pueden ser reasignados*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);

/* fechaNacimiento = 2003;
/* console.log(fechaNacimiento); // solo se ejecuta console anteior
/*
Evitar repetir tu código
DRY (Don't Repeat Yourself)
*/

let days = [
    'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado','Domingo'];

function getDay(n) {
    if (n < 1 || n > 7) {
        throw now error('out of range')
    }
}
//Ampliando el valor del uso let y const
/*
con var puede reasignar en cualquier momento este
forma parte del ambito global
un error es que sobreesciba*/

var nombre = "Ariel";
nombre = "Osvaldo";
console.log(nombre);

function saludar (){
    var nombre = "Natalia";
    console.log(nombre);
}
console.log(nombre); //Aquí no lee el dato en la función

if(true){
    var edad = 34;
    console.log(edad)
}
console.log(edad); //en la función funcionó correctamente en la estructura ir falló

/* 
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito de bloque,
solo dispone dentro de un bloque de llaves 
o dentro de una función
*/

