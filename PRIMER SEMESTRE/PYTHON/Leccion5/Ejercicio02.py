# Ingresar enteros, visualizar la suma de los
# números pares de la lista, cuántos números pares
# existen y cuál es el promedio de los números
# impares

n_elementos = int(input("Digite la cantidad de elementos a ingresar: "))

i = 1

suma_pares = 0
conteo_pares = 0

suma_impares = 0
conteo_impares = 0

while i <= n_elementos:
    num = int(input(f"{i}. Digite un número: "))

    if num % 2 == 0:
        suma_pares = suma_pares + num
        conteo_pares = conteo_pares + 1
    else:
        suma_impares = suma_impares + num
        conteo_impares = conteo_impares + 1

    i = i + 1

# Cálculo de promedios
if conteo_pares > 0:
    promedio_pares = suma_pares / conteo_pares
else:
    promedio_pares = 0

if conteo_impares > 0:
    promedio_impares = suma_impares / conteo_impares
else:
    promedio_impares = 0

print("\nRESULTADOS")
print("Suma de números pares:", suma_pares)
print("Cantidad de números pares:", conteo_pares)
print("Promedio de números pares:", promedio_pares)

print("Suma de números impares:", suma_impares)
print("Cantidad de números impares:", conteo_impares)
print("Promedio de números impares:", promedio_impares)