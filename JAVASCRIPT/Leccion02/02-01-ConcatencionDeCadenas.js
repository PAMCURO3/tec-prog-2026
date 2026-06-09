var nombre = 'Jose';
var apellido = ' Montes';
var nombreCompleto = nombre+' '+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel'+' '+'Betancud';
console.log(nombreCompleto2);
var juntos = nombre+ 219; //Lee de izq a derecha siguiendo la cadena lee el numero de tipo string
console.log(juntos);
juntos = nombre + (78 + 17); // aqui se puede diferenciar a traves de los parentesis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; //Terecera manera de concatenar usando el operador de simplificado
console.log(nombre);

//hoy no se usa var se utiliza let y const
let nombre2 = "pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido 2= "Peres"; una constante no puede ser modificada
console.log(apellido2)

let x, y; //se pueden crear varias variables dentro de una misma linea
x = 17, y = 21; // se puede hacer asignacion de varias variables dentro de una misma linea
let z = x + y; //se asigna el valor de la operacion
console.log(z)

let _1num = 31; // No utlizar números para iniciar el nombre de una variable
let rompiendo = "rompe"; // No utilizar palabras reservadas para variables

console.log(_1num)
console.log(rompiendo)
