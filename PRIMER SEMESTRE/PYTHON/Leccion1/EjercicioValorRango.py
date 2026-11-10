# Ejercicio: Valor dentro de un rango
valor =int(input("Digite un número dentro del rango de 0 a 5: "))
ValorMinimo = 0
ValorMaximo = 5
dentroRango = valor >= ValorMinimo and valor <= ValorMaximo
if dentroRango:
    print(f'El valor es {valor} está dentro del rango')
else:
    print(f'El valor es {valor} No está dentro del rango')

