#CLASE 1 SEGUNDO SEMESTRE COHORTE 2026 LECCIÓN 4
#LISTAS CONJUNTO DE ELEMENTOS POR EJEMPLO LISTA DE NOMBRES
# STRING ARIEL, NATALIA, OSVALDO, LILIANA
# EL INDICE COMIENZA DESDE CERO ESO SIGNIFICA ARIEL=0
from selectors import SelectSelector

nombres = ['Naty', 'Osvaldo', 'Lily','Ariel']
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-1])
print(nombres[-2])

#Recuperar nombres dentro de una lista

print(nombres)
print(nombres[0:2]) #solo muestra las posiciones del indice
#ir del inicio de la lista al indice (sin incluirlo)
print(nombres[ :3])#indices a mostrar 0,1,2
#desde el indice indicado hasta el final
print(nombres[1: ])

#modificar un valor dentro de la lista
nombres[2] = 'Liliana'
nombres[0] = 'Natalia'
print(nombres)

#iterar la lista con un ciclo for
for nombre in nombres: #nombre es singular la lista es plural
    print(nombre)
else:
    print('Se acabaron los elementos de la lista')

#al finalizar el recorrido del ciclo for imprime 'se acabaron los elementos de la lista

#preguntamos cuantos elementos tiene una lista
print(len(nombres))#le pasamos como parametro de nuestra lista

#agregamos un elemento
nombres.append('Marcelo')
print(nombres)

#Insertar un elemento en un indice especifico
nombres.insert(1, 'Alberto')
print(nombres)
nombres.insert(3, 'Debora')
print(nombres)

#eliminamos un elemento de la lista
nombres.remove('Alberto')
print(nombres)

#eliminar el ultimo elemento
nombres.pop()
print(nombres) #elimina el ultimo elemento de la lista

#eliminar un indice especifico
del nombres[2]
print(nombres)


#eliminar, borrar o limpiar todos los elementos de la lista
nombres.clear()
print(nombres)

#eliminar la lista
del nombres
#print(nombres) #aqui mostrara error


#tupla sigue el orden de los elementos que se agregan no se pueden eliminar son inmutables
cocina = ('cuchara','cuchillo','tenedor')
print(cocina)

print(len(cocina))

#Acceder a un elemento, para esto utilizamos corchetes no parentesis
print(cocina[0])
#mostrar de manera inversa
print(cocina[-1])

#como acceder a un rango
print(cocina[0:2])

#la tupla necesita la coma si o si despues de un elemento

verdura = ('papa') #si no tiene coma es sting tipo cadena

#recorremos los elementos de la tupla
for cocinar in cocina:#print esta usando \n para saltos de lineas
    print(cocinar, end=' ') #usamos end= para eliminar los saltos de lineas

#cocina[0] = 'Plato'
#print(cocina)
#no es posible realizar modificaciones en la tupla de esta manera

#se puede modificar una tupla pero no es una buena practica de programación

cocinaLista = list(cocina) #conversion de tupla a lista
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista) #conversion de lista a tupla
print('\n', cocina)


#Esto es para eliminar la tupla
#del cocina
#print(cocina)




