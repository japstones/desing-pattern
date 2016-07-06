# Adapter
El patron Adapter se utiliza para transformar una interfaz en otra, de tal modo que una clase que no pudiera utilizar
la primera, haga uso de ella a traves de la segunda.

### Proposito
Convierte la interfaz de una clase en otra interfaz que el cliente espera. Adapter permite a las clases trabajar juntas,
lo que de otra manera no podria hacerlo debito a sus interfaces incompatibles.

### El problema
Supongamos que tenemos un sistema que trabaja con diferentes tipo de motores(Comun, Economico) que comparten caracteristicas
comunes asi como su funcionamiento, se desea vincular al sistema una clase de tipo motor Electrocio con un funcionamiento
diferente al de los demas, se debe adatar la nueva clase sin que esto afecte la logca inicial de la aplicacion.

### Aplicaciones
Se puede utilizar cuando:
a. Queremos usar una clase existente, y ésta no tiene la interfaz que necesitamos.
b. Queremos crear una clase reutilizable que coopere con clases con las que no
   está relacionada. Por tanto, que no tendrán interfaces compatibles.

c. (Sólo la versión de objetos) Necesitamos usar varias subclases existentes pero
   sin tener que adaptar su interfaz creando una nueva subclase de cada una. Un
   adaptador de objetos puede adaptar la interfaz de su clase padre.