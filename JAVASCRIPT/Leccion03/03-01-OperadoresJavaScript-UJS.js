//Ejercicio: si el padre puede asistir al juego de su hijo
let vacaciones = false, diaDescanso = false;
if (vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego de su hijo")
}
else{
    console.log("El padre no puede asistir al juego de su hijo")
}

// Ejercicio para encontrar números pares
let parImpar = 1;
if(parImpar % 2 ==0){
    console.log("Es un número PAR");
}
else{
    console.log("Es un número IMPAR");
}

// operador ternario
//Ejercicio mayor que
let resultado2 = 3 > 2 ? "Verdadero" : "Falso";
console.log("Verdadero") 
let numero2 = 8;
resultado2 = numero2 % 2 == 0 ? "Es un número PAR" : "Es un número IMPAR";
console.log(resultado2)

//Video 33 8 - clase Convertir String a numero
let miNumero = "17"; //Es una cadena
console.log(typeof miNumero);
let edad2 = Number(miNumero); //esta es una funcion
console.log(typeof edad2);// lo trasnformamos en nuemro a lo que era en cadena

if(edad2 >= 18){
    console.log("Puede votar")
}
else{
    console.log("No puede votar, es muy joven")
}
//Operador ternario
let resultado3 = edad2 >= 18 ? "Puede votar" : "No puede votar, es muy joven";
console.log(resultado3);
