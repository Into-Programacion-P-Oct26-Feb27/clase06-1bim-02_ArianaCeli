# clase06-1bim
# Estructuras condicionales en Java: `if / else` anidados y `switch`

## 1. Introducción

En programación, no todas las instrucciones se ejecutan de manera secuencial. Existen situaciones en las que un programa debe tomar decisiones dependiendo de los datos ingresados por el usuario o de los resultados obtenidos durante su ejecución.

Para resolver este tipo de problemas, Java dispone de estructuras de control que permiten modificar el flujo de ejecución de un programa.

En esta clase se estudian dos mecanismos para la toma de decisiones:

- **Condicionales anidados (`if / else`):** permiten evaluar diferentes condiciones de manera progresiva.
- **Estructura `switch`:** permite seleccionar una alternativa dependiendo del valor de una expresión.

Comprender estas estructuras es fundamental para desarrollar programas capaces de resolver problemas que requieren diferentes caminos de ejecución.

---

## 2. Estructuras condicionales anidadas (`if / else`)

### ¿Qué son?

Los condicionales anidados se presentan cuando una estructura `if / else` contiene otra estructura condicional en su interior.

Esto permite establecer diferentes niveles de decisión, donde una condición puede conducir a la evaluación de nuevas condiciones.

### ¿Por qué son importantes?

Las estructuras condicionales anidadas permiten:

- **Resolver problemas con múltiples condiciones:** evaluar diferentes situaciones antes de tomar una decisión.
- **Organizar la lógica del programa:** establecer un orden para comprobar distintas condiciones.
- **Representar situaciones reales:** implementar reglas para descuentos, bonificaciones, clasificaciones y otros procesos.
- **Desarrollar el pensamiento lógico:** comprender cómo una decisión puede conducir a nuevas evaluaciones.

### Ejemplo práctico: cálculo de bonos de un empleado

En el archivo `Comercio02.java` se desarrolla un programa que calcula el sueldo final de un empleado de una empresa comercial.

El programa solicita información personal, el sueldo básico y el número de productos vendidos.

A partir de estos datos, calcula la productividad del empleado:

```java
productividad = numeroProductos * coeficiente;
```

Posteriormente, utiliza estructuras condicionales anidadas para determinar el bono que recibirá según su productividad.

```java
if (productividad <= 30) {
    bono = 25;
} else {
    if (productividad > 30 && productividad < 80) {
        bono = 50;
    } else {
        if (productividad >= 80 && productividad < 200) {
            bono = 100;
        } else {
            if (productividad >= 200) {
                bono = 200;
            }
        }
    }
}
```

### ¿Cómo funciona?

El programa evalúa inicialmente si la productividad es menor o igual a 30.

Si se cumple esta condición, asigna un bono de $25.

En caso contrario, ingresa al bloque `else`, donde encuentra otra estructura condicional que permite evaluar un nuevo intervalo de productividad.

Este proceso continúa hasta determinar el bono correspondiente.

| Productividad | Bono |
|---|---|
| Menor o igual a 30 | $25 |
| Mayor que 30 y menor que 80 | $50 |
| Desde 80 hasta menos de 200 | $100 |
| Mayor o igual a 200 | $200 |

**Importante:** Los condicionales anidados permiten evaluar distintas condiciones dentro de una misma estructura de decisión. Su correcta organización es fundamental para evitar errores lógicos y garantizar que el programa contemple las situaciones previstas.

---

## 3. Estructura de selección `switch`

### ¿Qué es?

La estructura `switch` permite seleccionar y ejecutar un conjunto de instrucciones dependiendo del valor de una expresión.

A diferencia de `if / else`, que permite evaluar condiciones mediante operadores relacionales y lógicos, el `switch` tradicional permite seleccionar alternativas a partir de valores específicos.

Es especialmente útil cuando un programa necesita ejecutar distintas operaciones dependiendo de una opción seleccionada por el usuario.

### ¿Por qué es importante?

La estructura `switch` permite:

- **Organizar múltiples alternativas:** establecer claramente las opciones disponibles.
- **Facilitar la lectura del código:** identificar qué instrucciones corresponden a cada alternativa.
- **Implementar menús:** permitir que el usuario seleccione una operación.
- **Evitar comparaciones repetitivas:** simplificar la selección entre diferentes valores específicos.
- **Desarrollar el pensamiento lógico:** comprender cómo un valor determina el camino que seguirá el programa.

### Ejemplo práctico: operaciones trigonométricas

En el archivo `Ejemplo04.java` se desarrolla un programa que permite calcular una función trigonométrica según la opción seleccionada por el usuario.

El programa presenta el siguiente menú:

```text
Ingrese la opción trigonométrica.
1 seno
2 coseno
3 tangente
```

Posteriormente, solicita un valor expresado en radianes y utiliza `switch` para determinar qué operación debe ejecutar.

```java
switch (opcion) {
    case 1:
        resultado = Math.sin(radianes);
        break;

    case 2:
        resultado = Math.cos(radianes);
        break;

    case 3:
        resultado = Math.tan(radianes);
        break;

    default:
        System.out.println("Ninguna de las opciones anteriores es correcta");
        break;
}
```

### ¿Cómo funciona?

La estructura `switch` evalúa el valor almacenado en la variable `opcion` y ejecuta las instrucciones correspondientes.

- **`switch (opcion)`:** indica el valor que se utilizará para seleccionar una alternativa.
- **`case 1`:** calcula el seno del valor ingresado.
- **`case 2`:** calcula el coseno del valor ingresado.
- **`case 3`:** calcula la tangente del valor ingresado.
- **`break`:** finaliza la ejecución de la estructura `switch`.
- **`default`:** se ejecuta cuando el valor ingresado no corresponde a ninguna de las opciones establecidas.

Por ejemplo, si el usuario selecciona la opción `2`, el programa calcula el coseno del valor ingresado mediante:

```java
resultado = Math.cos(radianes);
```

**Importante:** La estructura `switch` resulta conveniente cuando se necesita seleccionar una operación a partir de valores específicos, como las opciones de un menú.

---

## 4. Diferencias entre `if / else` anidados y `switch`

Aunque ambas estructuras permiten tomar decisiones, existen diferencias importantes en su funcionamiento.

| Característica | `if / else` anidados | `switch` |
|---|---|---|
| Forma de tomar decisiones | Mediante condiciones | Mediante valores específicos |
| Operadores relacionales (`>`, `<`, `>=`) | Sí | No directamente en los `case` tradicionales |
| Operadores lógicos (`&&`, `\|\|`) | Sí | No directamente en los `case` tradicionales |
| Evaluación de intervalos | Sí | No directamente |
| Selección mediante opciones numéricas | Sí | Sí |
| Uso de `break` | No es necesario | Se utiliza para finalizar cada caso en el `switch` tradicional |
| Ejemplo de aplicación | Asignación de bonos según productividad | Selección de operaciones trigonométricas |

### ¿Cuándo utilizar cada estructura?

**Utilizar `if / else` cuando:**

- Se necesita evaluar condiciones mediante operadores relacionales.
- Existen diferentes intervalos de valores.
- Una decisión requiere comprobar nuevas condiciones.

**Utilizar `switch` cuando:**

- Se necesita seleccionar una alternativa a partir de un valor específico.
- El programa presenta un menú de opciones.
- Existen diferentes operaciones asociadas a valores determinados.

---

## 5. Reflexión final

Las estructuras condicionales permiten desarrollar programas que toman decisiones y ejecutan diferentes instrucciones dependiendo de las situaciones que se presentan.

Los condicionales anidados permiten resolver problemas que requieren evaluar varias condiciones relacionadas entre sí, mientras que `switch` facilita la selección de alternativas a partir de valores específicos.

**Aprender a identificar cuándo utilizar cada estructura es tan importante como conocer su sintaxis.** Una adecuada selección permite construir programas más organizados, comprensibles y fáciles de mantener.

El objetivo no es únicamente aprender a escribir instrucciones en Java, sino desarrollar la capacidad de analizar un problema, identificar las decisiones necesarias y seleccionar la estructura de control más adecuada para resolverlo.
