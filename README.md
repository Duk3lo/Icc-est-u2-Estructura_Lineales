# Stack con Lista Enlazada

Proyecto simple que implementa una **pila (Stack)** usando una **lista
enlazada** en Java.

## Funcionalidades

-   push(T data): Inserta un elemento en la cima.
-   pop(): Quita y devuelve el elemento de la cima.
-   peek(): Devuelve el elemento de la cima sin quitarlo.
-   isEmpty(): Verifica si la pila está vacía.
-   size(): Devuelve la cantidad de nodos en la pila.
-   printAllNodes(): Muestra todos los elementos de la pila.

## Ejemplo de uso

    Stack<String> s = new Stack<>();
    s.push("A");
    s.push("B");
    s.push("C");

    System.out.println(s.size());  // 3
    System.out.println(s.pop());   // C
    s.printAllNodes();             // Cima -> B -> A -> FIN

## Nombre

-   Joshue Avecillas
