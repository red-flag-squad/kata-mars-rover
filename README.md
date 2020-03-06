# Ejercicio Open/Close

Partiendo de esta implementacion parcial y simplificada de la kata Mars Rover,
refactorízala (sin cambiar ninguno de los tests) para que el conjunto de comandos
que es capaz de ejecutar (giro a la izquierda y giro a la derecha), sea extensible
cumpliendo el pricipio Open/Close de SOLID.

Cuando resuelvas la kata, trata de cuestionarte los siguientes aspectos:

- ¿Cumple el principio de responsabilidad única?
- ¿Está correctamente encapsulada o, por el contrario, exhibe su estado interno?
- ¿Cuantos cambios habría que realizar para hacer el conjunto de comandos extensible?

# Tools

- JDK 1.8 or greater.
- Maven

# Running tests

Build the project source:

```bash
$ mvn clean package
```

Run tests:

```bash
$ mvn test
```