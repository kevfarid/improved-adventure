Se instacia la clase `Scanner` para poder tomar los datos por el usuario.

```java
Scanner scanner = new Scanner(System.in);
```

Se pide los numeros al usuario y se asigna a las variables.

```java
System.out.print("Digite el primer numero: ");
int num1 = scanner.nextInt();

System.out.print("Digite el segundo numero: ");
int num2 = scanner.nextInt();
```
Se toma la diferencia entre los dos numeros para darle el tamaño a la array.
```java
int range = Math.abs(num1 - num2) + 1;
int[][] results = new int[range][10];
```
Se declara un contador para tomar como referencia para hacer las multiplicaciones.
```java
int count = num1;
```
Se crea su respetivos ciclos para recorrer el array.
- El primero ciclo se toma limite el rango o la diferencia de los datos dados por el usuario.
- El segundo ciclo se toma como limite el tamaño de la `fila` en este caso es `10`
```java
for(int col = 0; col < range; col++) {
    for(int row = 0; row < results[0].length; row++){
        // Code
    }
}
```
Dentro el segundo ciclo se crea la operación con el contador.

```java
results[col][row] = count * (row + 1);
```
Despues al mismo tiempo de imprime.
```java
System.out.print(results[col][row] + "\t");
```
Quedaria de la siguiente forma
```java
for(int col = 0; col < range; col++) {
    for(int row = 0; row < results[0].length; row++){
        results[col][row] = count * (row + 1);
        System.out.print(results[col][row] + "\t");
    }
}
```

Despues del segundo ciclo, se suma o se resta el contador depediendo si el primer numero de usario es mayor.
`Se usa  un operador ternario`
```java
count = num1 < num2 ? count + 1 : count - 1;
```
Despues crea una linea nueva para comenzar otra vez.
```java
System.out.print("\n");
```

A final quedaria asi:
```java
for(int col = 0; col < range; col++) {
    for(int row = 0; row < results[0].length; row++){
        results[col][row] = count * (row + 1);
        System.out.print(results[col][row] + "\t");
    }

    count = num1 < num2 ? count + 1 : count - 1;
    System.out.print("\n");
}
```

Resultado de la consola:

```shell
Digite el primer numero: 7
Digite el segundo numero: 3

7	14	21	28	35	42	49	56	63	70	
6	12	18	24	30	36	42	48	54	60	
5	10	15	20	25	30	35	40	45	50	
4	8	12	16	20	24	28	32	36	40	
3	6	9	12	15	18	21	24	27	30
```