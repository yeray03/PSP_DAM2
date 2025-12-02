# Ejercicio 02: Enviar Objeto - Recibir Objeto

## Descripción

Crea un programa Cliente que le pase al Servidor un objeto tipo `Persona`. 

El Servidor evaluará si la Persona se llama "Juan", y si es así, le responderá con otro objeto `Persona` con los datos de su padre o madre. 

Si no, responderá con un objeto nulo.

## Requisitos

- **Cliente**: Envía un objeto `Persona` al servidor
- **Servidor**: 
  - Recibe el objeto `Persona`
  - Verifica si el nombre es "Juan"
  - Si es "Juan": responde con un objeto `Persona` (padre/madre)
  - Si no es "Juan": responde con `null`