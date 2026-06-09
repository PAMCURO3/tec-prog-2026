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