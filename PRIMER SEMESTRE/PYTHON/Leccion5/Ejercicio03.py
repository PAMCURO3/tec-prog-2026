# Dadas las horas trabajadas de 5 personas y la tarifa de pago,
# calcular el salario y la sumatoria de todos los salarios

i = 1
suma = 0

while i <= 5:
    print(f"\nSalario del empleado {i}")

    horas = float(input("Digite las horas trabajadas: "))
    tarifa = float(input("Digite la tarifa por hora: "))

    salario = horas * tarifa

    print("El salario es: $", salario)

    suma = suma + salario

    i = i + 1

print("\nLa suma de todos los salarios es:", suma)