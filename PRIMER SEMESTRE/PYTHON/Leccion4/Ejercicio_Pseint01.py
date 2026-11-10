# Clase 8
# Diseñar un programa que ingresado un año,
# nos devuelva, por consola si es un año bisiesto o no,
# repetir la acción hasta que el usuario lo decida

while True:
    anio = int(input("Ingrese un año (0 para salir): ")) #ingresamos el número del año

    if anio == 0: #si presionamos 0 para cerrar el programa y salimos
        print("Programa finalizado.")
        break #interrumpe inmediatamente el bucle al presionar 0

    if (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0): #si el año es bisiesto 366 días se divide por 4 - 100 o 400
        # y no debe dar decimales en la división por ejemplo 2024 fue bisiesto
        print(f"{anio} si es un año bisiesto") #en este caso imprimimos bisiesto
    else:
        print(f"{anio} no es un año bisiesto") #en este caso imprimimos no es bisiesto
