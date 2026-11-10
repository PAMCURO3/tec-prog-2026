'''
Leer 10 numeros e imprimir cuantos son positivos,
cuantos negativos y cuantos neutros
'''


conteo_pos = 0
conteo_neg = 0
conteo_neu = 0
i = 1
while i <= 10:
    num = int(input("Ingrese un numero: "))
    if num == 0:
        conteo_neu = conteo_neu + 1
    else:
        if num > 0:
            conteo_pos = conteo_pos + 1
        else
            conteo_neg = conteo_neg + 1
    i = i + 1
print(f"Hay {conteo_neu} numeros neutros.")
print(f"Hay {conteo_pos} numeros positivos.")
print(f"Hay {conteo_neg} numeros negativos.")