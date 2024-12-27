# Metodos Numericos

Este proyecto está dedicado a la implementación de métodos numéricos utilizando Java. Los métodos numéricos son técnicas matemáticas utilizadas para resolver problemas matemáticos que son difíciles o imposibles de resolver analíticamente. Este repositorio incluye varios ejercicios que demuestran cómo estos métodos pueden ser aplicados.

## Contenido del Proyecto

### Implementaciones de Métodos Numéricos

1. **Bisección**: Método para encontrar raíces de ecuaciones no lineales.
2. **Newton-Raphson**: Método iterativo para encontrar aproximaciones de las raíces de una función real.
3. **Secante**: Similar al método de Newton-Raphson pero no requiere la derivada de la función.
4. **Punto Fijo**: Método iterativo para encontrar un punto fijo de una función.
5. **Interpolación de Lagrange**: Método para construir un polinomio que pasa por un conjunto dado de puntos.
6. **Regresión Lineal**: Técnica para modelar la relación entre una variable dependiente y una o más variables independientes.
7. **Integración por el Método de Simpson**: Técnica para aproximar el valor de una integral definida.

### Ejercicios

Cada ejercicio en este repositorio está diseñado para demostrar la aplicación práctica de los métodos numéricos mencionados. A continuación se enumera cada ejercicio junto con una breve descripción:

1. [**Problema1 - Newton-Raphson**](https://github.com/ItielSanzAXO/MetodoNumericos/blob/master/Problema1.java): Utiliza el método de Newton-Raphson para determinar una raíz de la función \( f(x) = -x^2 + 1.8x + 2.5 \) con \( x_0 = 5 \) hasta que el error sea menor que \( es = 0.05\% \).
2. [**Problema2 - Newton-Raphson**](https://github.com/ItielSanzAXO/MetodoNumericos/blob/master/Problema2.java): Determina las raíces reales de \( f(x) = -1 + 5.5x - 4x^2 + 0.5x^3 \) usando el método de Newton-Raphson con un error menor que \( es = 0.01\% \).
3. [**Problema3 - Newton-Raphson**](https://github.com/ItielSanzAXO/MetodoNumericos/blob/master/Problema3.java): Aplica el método de Newton-Raphson para encontrar una raíz de \( f(x) = 0.0074x^4 - 0.284x^3 + 3.355x^2 - 12.183x + 5 \) con \( x_0 = 16.15 \).
4. [**Problema4 - Newton-Raphson**](https://github.com/ItielSanzAXO/MetodoNumericos/blob/master/Problema4.java): Determina la raíz real más grande de \( f(x) = 0.95x^3 - 5.9x^2 + 10.9x - 6 \) usando el método de Newton-Raphson con 5 iteraciones y \( x_i = 3.5 \).
5. [**Problema5 - Newton-Raphson**](https://github.com/ItielSanzAXO/MetodoNumericos/blob/master/Problema5.java): Encuentra la menor raíz positiva de \( f(x) = 8\sin(x)e^{-x} - 1 \) utilizando el método de Newton-Raphson con \( x_i = 0.3 \) e imprimiendo todas las iteraciones.

## Cómo Ejecutar

Para ejecutar los ejercicios, asegúrate de tener Java instalado en tu sistema. Cada ejercicio se puede ejecutar de la siguiente manera:

```sh
javac ProblemaN.java
java ProblemaN
