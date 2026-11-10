# Pedir un mes
mes = int(input("Ingrese un mes del año (1-12): "))

# Que sea válido
if mes < 1 or mes > 12:
    print("Mes inválido. Debe ingresar un número entre 1 y 12.")
else:
    estacion = None

    if mes == 12 or mes == 1 or mes == 2:
        estacion = "Verano"
    elif mes >= 3 and mes <= 5:
        estacion = "Otoño"
    elif mes >= 6 and mes <= 8:
        estacion = "Invierno"
    else:
        estacion = "Primavera"

if estacion != None:
    print("La estación del año es:", estacion)