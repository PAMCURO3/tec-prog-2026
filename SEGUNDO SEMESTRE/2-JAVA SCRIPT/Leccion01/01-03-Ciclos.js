//while
let contador = 0;
while(contador < 3){
    console.log(contador);
    contador++;
}
console.log("Fin del ciclo while");

// do while
let conteo = 0;
do{
        console.log(conteo);
    conteo++;
}while(conteo < 3);
console.log("Fin del ciclo do while");


//for
for(let contando = 0; contando < 3; contando++ ){
    console.log(contando);
}
console.log("Final del ciclo for");

//break palabra reservada

for(let contando = 0 ; contando < 10; contando++){
    if(contando % 2 == 0){
        console.log(contando); //muestra los pares
        break;
    }   
}
console.log("Termina el ciclo al encontrar los pares");

//la palabra continue

for(let contando = 0 ; contando <= 10; contando++){
    if(contando % 2 !== 0){
        continue;//esto continua a la sgte iteracion
    }   
    console.log(contando);
}
console.log("Termina el ciclo");

//La palabra continue y Etiquetas lebels

inicio:
for(let contando = 0 ; contando <= 10; contando++){
    if(contando % 3 !== 0){
       continue inicio;//esto continua a la sgte iteracion
    }   
    console.log(contando);
}
console.log("Termina el ciclo");

