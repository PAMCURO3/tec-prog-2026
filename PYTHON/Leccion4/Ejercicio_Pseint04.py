
calificaciones = []

print("Por favor, ingresa las calificaciones de los 10 alumnos:")

for i in range(10):
    nota = float(input(f"Calificación del alumno {i+1}: "))
    calificaciones.append(nota)

# Cálculos directos
promedio = sum(calificaciones) / len(calificaciones)
nota_mas_baja = min(calificaciones)

print("\n--- Resultados del Grupo ---")
print(f"El promedio del grupo es: {promedio:.2f}")
print(f"La calificación más baja es: {nota_mas_baja}")