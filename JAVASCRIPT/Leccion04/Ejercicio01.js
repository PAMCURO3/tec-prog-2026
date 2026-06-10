function getMonth(month) {
    const months = [
        "Enero", "Febrero", "Marzo", "Abril",
        "Mayo", "Junio", "Julio", "Agosto",
        "Septiembre", "Octubre", "Noviembre", "Diciembre"
    ];

    return months[month - 1] || "Mes no válido";
}

console.log(getMonth(5));  // Mayo
console.log(getMonth(12)); // Diciembre
console.log(getMonth(15)); // Mes no válido


//evitar repetir tu codigo
//dry don't repeat yourself
//let days = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"];

let days = "Domingo"; //un día en código duro
switch (days) {
    case "lunes":
        console.log("hoy es " +days);
        break;
    case "martes":
        console.log("hoy es " +days);
        break;
    case "miércoles":
        console.log("hoy es " +days);
        break;
    case "jueves":
        console.log("hoy es " +days);
        break;
    case "Viernes":
        console.log("hoy es " +days);
        break;
    case "Sábado":
        console.log("hoy es " +days);
        break;
    case "Domingo":
        console.log("hoy es " +days);
        break;
}

let days2 = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"];
function getDay(n){
    if(n < 1 || n > 7){
        throw new error('Out of range');
    }
    return days[n-1];
}
console.log(getDay);


let days3 = "1"; //un día en código duro
switch (days3) {
    case "1":
        console.log("hoy es Lunes" );
        break;
    case "2":
        console.log("hoy es Martes");
        break;
    case "3":
        console.log("hoy es Miercoles");
        break;
    case "4":
        console.log("hoy es Jueves");
        break;
    case "5":
        console.log("hoy es Viernes");
        break;
    case "6":
        console.log("hoy es Sábado");
        break;
    case "7":
        console.log("hoy es Domingo");
        break;
    default:
        console.log("Error en el ingreso del día de la semana");
        break;
}