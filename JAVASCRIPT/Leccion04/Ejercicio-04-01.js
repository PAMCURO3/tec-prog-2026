/*const se utiliza para valores constantes que no
pueden ser reasignados*/

const fechaNacimiento1 = 2006;
console.log(fechaNacimiento1);

/* fechaNacimiento = 2003;
/* console.log(fechaNacimiento); // solo se ejecuta console anteior
/*
Evitar repetir tu código
DRY (Don't Repeat Yourself)
*/

let days = [
    'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado', 'Domingo'
];

function getDay(n) {
    if (n < 1 || n > 7) {
        throw new Error('out of range');
    }

    return days[n - 1];
}

try {
    console.log(getDay(1)); // Lunes
    console.log(getDay(5)); // Viernes
    console.log(getDay(8)); // Error
} catch (err) {
    console.log(err.message);
}
//Ampliando el valor del uso let y const
/*
con var puede reasignar en cualquier momento este
forma parte del ambito global
un error es que sobreesciba*/

var nombre1 = "Ariel";
nombre1 = "Osvaldo";
console.log(nombre1);

var nombre2 = "Natalia"
nombre2 = "Romina"
console.log(nombre2);

function saludar (){
    var nombre2 = "Natalia";
    console.log(nombre2);
}
console.log(nombre2); //Aquí no lee el dato en la función

if(true){
    var edad2 = 34;
    console.log(edad2)
}
console.log(edad2); //en la función funcionó correctamente en la estructura ir falló

/* 
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ambito de bloque,
solo dispone dentro de un bloque de llaves 
o dentro de una función
*/
function saludar2(){
    let nombre2 = "Ariel";
    console.log(nombre2);
}
console.log (nombre2);

if(true){
    let edad2 = 33;
    console.log(edad2);
}
console.log(edad2);

/* 
Const se utiliza para valores constantes 
que no pueden ser
reasignados
*/

const fechaNacimiento2 = 2006;
console.log(fechaNacimiento2);
fechaNacimiento3 = 2003;
console.log(fechaNacimiento3); //Solo se ejecuta el console anterior
