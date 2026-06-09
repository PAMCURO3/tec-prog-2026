/*const se utiliza para valores constantes que no
pueden ser reasignados*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);

/* fechaNacimiento = 2003;
/* console.log(fechaNacimiento); // solo se ejecuta console anteior
/*
Evitar repetir tu código
DRY (Don't Repeat Yourself)
*/

let days = [
    'Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes', 'Sábado','Domingo'];

function getDay(n) {
    if (n < 1 || n > 7) {
        throw now error('out of range')
    }
}