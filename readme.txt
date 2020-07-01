
---------------
README.txt
---------------
Contextualización del problema:
El siguiente programa resuelve la solicitud de crear un juego con diferentes atributos y características
que deben contener estructuras dentro de elementos específicos. Para ello, se debe definir las clases que
se utilizarán en cada fuente propia del programa.

Las clases se entregan definidas de la siguiente forma:
- Carro.java
- Kromi.java
- Caguano.java
- Trupalla.java
- Huevo.java
- Tablero.java
- Principal.java

A continuación, explicaremos la solución a la cual hemos llegado.

Estructura del ejercicio

El contenido del programa se devide en cuatro grandes grupos de SRC (árbol de origen del programa):

1- Controlador
	- Tablero.java
2- Ayudantes
	- Ubicacion.java
	- Funciones.java
	- AleatorioFecha.java
	- AleatorioNombre.java
3- Modelos
	- Carro.java
	- Kromi.java
	- Caguano.java
	- Trupalla.java
	- Huevo.java
4- Main
	- Principal.java

Se procede a explicar el modelo desarrollado para crear el contenido de cada una de las clases y subclases.

Para ello iniciaremos la revisión por Carro y sus subclases Kromi, Caguano y Trupalla.

La clase Carro está definida como abstracta dado que necesitemos crear una clase padre donde
únicamente coloquemos la estructura de una abstracción, una estructura muy general,
dejando que sean las clases hijas quienes definan los detalles.
Seguidamente definimos los atributos que se solicitan para las clases indicadas. Carro tiene definidos unos atributos y
las subclases de esta tienen los propios.

Se crea un constructor que genera los valores de los atributos de forma aleatoria, a excepción de
la "Ubicación"(que será explicada en la sección ayudantes).

Aplicamos los métodos de acceso, que son públicos, que nos sirven para obtener el valor del atributo
que serán utilizados en los diferentes métodos.

Finalmente mostramos el contenido del objeto Carro.

Para cada una de las clases hijas dependientes de Carro, se heredan las lógicas centrales que se complementan con 
atributos particulares de cada clase.

En la clase kromi, se solicita declarar dos atributos: fabricación y marca. Para el caso de fabricación, se define
un ayudante de forma aleatoria llamado FECHA. Para el caso de marca se entrega un valor fijo, dado que no es
relevante para el objeto del trabajo. Se crea el constructor y los métodos, junto con el toString y generamos
un get para que nos devuelva el tipo de Carro que es.

En la clase Caguano, hay un cambio en los atributos (color de confeti (se define fijo) y efectividad de tiro (variable
con rango matemático)), mientras que el resto de la lógica se mantiene similar a la definida en la clase Kromi.

En la clase Trupalla, se repite el modelo, pero con los atributos armadura (random) y manipulador (aleatorio de nombres
preingresados).

En la clase Huevo se vuelve a replicar el modelo, con los atributos "puntaje" (valores definidos en el enunciado)
y "ubicación" (ayudante).

Las clases definidas como Ayudantes tienen la finalidad de externalizar procesos de forma de darle claridad al código
de las clases que las utilizan.

La clase Ubicacion la aplicamos para localizar la fila y columna (atributos) donde se insertarán los Carros que 
contendrá el Tablero.

La clase Funciones busca verificar que los datos ingresados por el usuario sean válidos, indicándole los límmites
para su ingreso.

La clase AleatorioFecha se basa en la importación de una biblioteca java.util relacionada con el calendario, que permite
generar al azar los valores de fechas dentro de un rango definido de años. Para el caso del día, se define un
valor entre 1 y 365 (366 si es bisiesto) el que es convertido al correspondiente en el calendario gregoriano.

La clase AleatorioNombre entrega una alta combinación de constantes entre nombres y apellidos definidos por los
programadores trainee around the world.

La clase Tablero es el elemento central del programa, ya que es el controlador de este.
Se detallan las actividades que realiza.
Genera un tablero de tamaño definido, incorporando los Carros definidos anteriormente en las clases anteriores.
Además se implementan funciones que controlan el rendimiento del juego en función de los requerimientos solicitados.
En esta clase se definen la cantidad de carros que aparecerán en el tablero, el puntaje que se obtendrá cuando se 
acierte a cada carro; adicionalmente se entregará un puntaje extra a Kromi y Caguano, como se solicitó en el 
enunciado del problema.
El atributo "juego" se define como boolean para indicar si se muestra o no el contenido de las celdas, donde en estas
se almacenan las etiquetas del juego (K-C-T-H). Además se almacena el puntaje y, através de un conjunto de ArrayList 
para Huevos y Carros, se genere un listado de ambos.

En el constructor de la clase Tablero insertamos la cantidad de carros que va a tener este, los que estaban definidos
en el enunciado del problema.

Se determina individualizar los métodos por clase de carro (Kromi, Caguano y Trupalla), si bien todos comparten que 
no pueden insertar carro en una celda ya ocupada. Cada método tiene la lógica propia del tipo de carro, para determinar
la cantidad de posiciones que se ocuparán en el tablero (Kromi 3 vertical, Caguano 2 horizontal, Trupalla 1), y
posteriormente, agregándolos al tablero.

El siguiente método determina como se debe comportar el programa cuando se arroja un huevo al tablero, verificando si esta
se encuentra ocupada por algún tipo de carro, entregando como respuesta el resultado del lanzamiento. En el caso de acertar
a un carro, se suman los puntos que le corresponden, tanto en el acierto individual como en el del carro completo.

El siguiente método crea la estructura visual del tablero de juego, de modo de poder apreciar de forma intuitiva cada una 
de las casillas de este. Se entregan además los valores del puntaje total hasta el momento, el listado de carros generados
por la aplicación, el listado de huevos lanzados por el jugador, y cambia la variable de juego.

Para finalizar se muestra de forma ordenada el tablero del juego actual.

La clase Principal es la encargada de generar la interacción con el usuario, donde se determinan las lógicas de consulta a este,
para que defina cómo desea proceder.