#### Composite Pattern
El patron Composite sirve para construir objetos complejos a partir de otros mas simples y similares entre si, gracias
a la composicion recursiva y a una estructura en forma de arbol.

Esto simplifica el tratamiento de los objetos creados ya que al poseer todos ellos una interfaz comun, se tratan todos
de la misma manera. Dependiendo de la implementacion, pueden aplicarse procedimientos al total o una de las partes de
la estructura compuesta como si de un nodo final se tratara, aunque dicha parte esté compuesta a sus vez de muchas otras.
Un claro ejemplo de uso extendido de este patrón se da en los entornos de programación 2D para aplicaciones gráficas.
Un videojuego puede contener diferentes capas "layers" de sprites (como una capa de enemigos) pudiéndose invocar un
método que actúe sobre toda esta capa de sprtes a la vez (por ejemplo para ocultarlos, darles un filtro de color, etc).

##### Cunado usarlo?
1. Cuando quieras representar una jerarquia parte-todo de objetos.
2. Cuando tus clientes sean capaces de ignorar la diferencia entre composiciones de objetos y objetos individuales.