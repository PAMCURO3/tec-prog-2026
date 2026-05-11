//Tipos de datos en Java Script
/* estos comentarios son de multiples lineas
La sintaxis en lo que es comnetarios es muy similar a la
de java, realmente diriamos que es identica
El circulo blanco siginifica que tiene autoguardado, pero al mismo
tiempo necesita tener una ubicación
Para los datos de tipo string podemos utilizar las dobles comillas
"string" o cadena de textos en javascript
doble comilla, simple, acento invertido backticks
Al igual que los array los string comienzan a contar desde cero

*/
var nombre = 'Pamela'; //tipo str
console.log(typeof nombre);// acá lo imprimimos

nombre = 7;
console.log(typeof nombre);

var nombre = 12.3;
console.log(typeof nombre);

var numero = 3000; //Tipo numerico
console.log(typeof numero); //acá lo imprimimos

var objeto = {
    nombre : "Pamela", // para agregar mas items en el objeto se colocan comas
    apellido: "Cuello",
    telefono: "2604349050" // aca no hace falta cerrar con coma
    
}

console.log(objeto);

//TIPO DE DATOS BOOLEANOS TRUE OR FALSE
//se reconocen como bandera cuando estan en verde se avanza y cuando 
//esta en rojo se detiene

var bandera = true;
console.log(bandera);

//tipo de dato función nos permite reutilizar variables
function miFuncion(){}
console.log(typeof miFuncion);

//tipo de dato Symbol
var simbolo = Symbol("Mi simbolo");
console.log(simbolo);


//tipo de dato clase es una funcion
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre; //significa a los atributos de la clase
        this.apellido = apellido;
    }
}

console.log(typeof Persona); //hay que tener cuidado con las mayusculas y minusculas

//tipo de dato undefined es un tipo de dato
var x;
console.log(typeof x);

x = undefined;
console.log(typeof x);

//una palabra null:significa ausencia de un valor

var y = null; //null no es tipo de dato, su ogigen es objeto - object
console.log(typeof y); // es de tipo object


//array o arreglos son de tipo objeto usamos corchetes
var autos = ['Citroen','Audi','Fiat','Renault','McLaren'];
console.log(autos);
console.log(typeof autos) //acá preguntamos que tipo de datos es

var z = '';
console.log(z); //esto se refiere a que es una cadena vacia
console.log(typeof z);


