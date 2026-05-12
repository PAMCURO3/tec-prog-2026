#Mostrar "Del 1 al 10, como estuvo tu dia?"
from string import punctuation
print("Del 1 al 10, como estuvo tu día?")
dia = int(input("poner puntuación: "))
if dia >= 8:
    print("Tu dia estuvo excelente")
elif dia >= 5:
   print("Tu día estuvo normal! ")
else:
    print("Tu día estuvo muy malo, mañana será mejor! ")