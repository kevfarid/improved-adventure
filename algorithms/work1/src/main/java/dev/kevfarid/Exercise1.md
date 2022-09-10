# Ejercicio 1 - Pseudocode

- Crear una array con un tamaño de 4.
```java
int[] vector = new vector[1];
```

- Sacar el valor total de index `0` y `1` y sacar su portentaje
```java
  int valor1 = (vector[0] + vector[2]);
```
- Hacer lo mismo con el valor total de index `2` y `3`
```java
  int valor2 = vector[2] + vector[3];
```

- Sacar porcentaje del valor `1` con el `40%` y valor `2` con el `60%` 

```java
double porcentaje1 = (valor1 * 40) /100;
double porcentaje2 = (valor2 * 60) /100;
```

- Sumar el porcentaje 1 y 2

```java
double total = porcentaje1 + porcentaje2;
```

- Por ultimo mostrar el total en usando la interfaz de swing. Recuerde importar la libreria `javax.swing.JOptionPane`.

```java
JOptionPane.showMessageDialog(null, "Total: " + total);
```
