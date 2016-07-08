# Patron de diseño Bridge
El patron Bridge o Puente es normalmente uno de los patrones que mas cuesta entender, especialmente si nos ceñimos
únicamente a su descripción. La idea tras este patrón, sin embargo, es sencilla: dado que cualquier cambio que se
realice sobre una abstracción afectará a otdas las clases que la implementan, Bridge propone añadir un nuevo nivel de
abstracción entre ambos elementos que permitan que puedan desarrollarse cada uno por su lado.

## Objetivo
Desacoplar una abstraccion de su implementacion de modo que los dos puedan ser modificados de forma independiente.

Fuente
https://danielggarcia.wordpress.com/2014/03/17/patrones-estructurales-iv-patron-bridge/