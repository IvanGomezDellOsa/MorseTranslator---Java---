[Español](Readme.md) | [English](Readme.en.md)

Este es un programa que he creado con el objetivo de convertir palabras entre el alfabeto y el código Morse, y viceversa.

Estructura del código:

He estructurado el código en diferentes métodos para manejar la lógica de traducción y la impresión de resultados. Haciendo que el código sea fácil de entender y mantener.

Manejo de la Entrada:

He implementado un manejo de entrada para asegurarme de que la entrada del usuario sea válida. Verifico si la entrada contiene caracteres alfabéticos o si ya está en código Morse, y proporciono diferentes mensajes de error si la entrada no cumple con los criterios.

Traducción de Palabras a Código Morse:

Para traducir palabras a código Morse, itero sobre cada letra de la palabra ingresada y busco su equivalente en código Morse en el arreglo alphabetLetters. Luego, imprimo el código Morse correspondiente, manteniendo la estructura correcta (espacios entre letras y dos espacios entre palabras).

Traducción de Código Morse a Palabras:

Para traducir código Morse a palabras, divido el código Morse ingresado por el usuario en letras individuales y busco su equivalente en el arreglo morseCode. Luego, imprimo la letra correspondiente del alfabeto, manteniendo la estructura correcta (espacios entre palabras).
