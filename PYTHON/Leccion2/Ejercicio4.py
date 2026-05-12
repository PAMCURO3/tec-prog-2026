#Ejercicio 4: Área y longitud de un circulo, hacer un programa para ingresar el radio de un circulo
# y se reporte su área y la longitu de la circunferencia.
#Area =pi *r2
#longitu = 2 *pi*r

r = float(input("Ingrese el valor de la radio del circulo: "))
import math
area = math.pi * r**2
longitud = 2 * math.pi * r

print(f'El valor del area del circulo es: {area}')
print(f'El valor de la longitud del circulo es: {longitud}')

