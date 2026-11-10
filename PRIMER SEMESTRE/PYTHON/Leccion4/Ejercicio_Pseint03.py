#Leer 10 números e imprimir cuantos son positivos
#cuantos negativos y cuantos neutros.

positivo = 0
negativo = 0
neutro = 0

print("Por favor ingrese 10 números: ")

for i in range(10):
    numero = float(input(f"Número {i +1}: "))

    if numero > 0:
        positivo += 1
    elif numero < 0:
        negativo += 1
    else:
        neutro += 1

print("\n--- Resultados ---")
print(f"Positivo: {positivo}")
print(f"Neutro: {neutro}")
print(f"Negativo: {negativo}")
