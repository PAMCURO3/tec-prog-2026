const prompt = require('prompt');
prompt.start();
prompt.get([{
    name: 'nota',
    description: 'Ingrese una nota del 0 al 10'
}], function (err, result) {

    let nota = parseFloat(result.nota);

    if (nota >= 9) {
        console.log("A");
    } else if (nota >= 8) {
        console.log("B");
    } else if (nota >= 7) {
        console.log("C");
    } else if (nota >= 6) {
        console.log("D");
    } else if (nota >= 0) {
        console.log("E");
    } else {
        console.log("Nota no válida");
    }
});