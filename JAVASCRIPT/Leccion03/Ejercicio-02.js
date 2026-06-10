// Número definido directamente en el código
//Ejercicio para encontrar números pares
let numero = 18;

// Verificamos si es par o impar
if (numero % 2 == 0) {
    console.log("El número es par");
} else {
    console.log("El número es impar");
}

//Ejercicio: es mayor de edad
let edad = 18, adulto = 18;
if (edad >= adulto) {
    console.log("Usted es una persona adulta")
}
else{
    console.log("Usted es una persona menor de edad")
}   

//Ejercicio: Dentro de un rango
let dentroRango = 5; // Aqui vamos a cambiar el valor para ver si estamos en el rango
let valMin = 0, valMax = 10;
if(dentroRango >= valMin && dentroRango <= valMax){
    console.log("Está dentro del rango establecido")
}
else{
    console.log("Está fuera del rango establecido")
}

//Ejercicio: si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if (vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre no puede asistir al juego de su hijo")
}

//Ejercicio: Mi abuelita
let abuelita = true, viva = true;
if( abuelita || viva){
    console.log("Mi abuelita está viva")
}
else{
    console.log("Si mi abuelita no se hubiera muerto estaría viva")
}

// operador ternario
//Ejercicio mayor que
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log("Verdadero") 
let numero2 = 8;
resultado2 = numero2 % 2 == 0 ? "Es un número PAR" : "Es un número IMPAR";
console.log(resultado2)