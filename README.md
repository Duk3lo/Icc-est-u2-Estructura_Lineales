# Lista Enlazada, Stack y Queue en Java

Proyecto simple que implementa **Lista Enlazada**, **Pila (Stack)** y
**Cola (Queue)** usando nodos en Java.

## Funcionalidades principales

### Lista Enlazada

-   append(T data): Inserta un nodo al final.
-   deleteFirst(): Elimina el primer nodo.
-   deleteLast(): Elimina el último nodo.
-   deleteNode(T data): Elimina un nodo específico.
-   printAllNodes(): Muestra todos los nodos.
-   size(): Devuelve la cantidad de nodos.

### Stack (Pila)

-   push(T data)
-   pop()
-   peek()
-   isEmpty()
-   size()
-   printAllNodes()

### Queue (Cola)

-   enqueue(T data)
-   dequeue()
-   getFirst()
-   getLast()
-   isEmpty()
-   size()
-   printAllNodes()

## Ejemplo (simplificado)

``` java
Stack<String> s = new Stack<>();
s.push("A");
s.push("B");
s.push("C");

System.out.println(s.size()); // 3
System.out.println(s.pop());  // C
s.printAllNodes();
```

## Nombre

-   Joshue Avecillas
