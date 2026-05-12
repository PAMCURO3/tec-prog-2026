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
