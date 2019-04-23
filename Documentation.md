# Software-Tetramino---Grupo-3-Panfis-corp--JulianPenuela--yeisonVela--NicolasTellez
En este repositorio se encontrará toda la información y el código fuente de un algoritmo que permita enviar las coordenadas de una figura de tetris a otro servicio web que lo requiera , en este caso sera la figura "s" y "z"

1.Verificación de diseño inicial. 
2.Estructura de archivos. 	
3.Estándares de declaración de variables y métodos. 
4.Especificaciones de la forma de firma. 

# 1.Verificación de diseño inicial. 
1). Vista lógica: 
-Nos correspondió el tetramino s y z, los cuales se representarán en java por medio de matrices de 3x3, cada tetramino va a tener 3 operaciones básicas que son: 
1. rotar a la derecha 
2. rotar a la izquierda 
3. desplazar hacia abajo  
 
A para modelar cada rotación del tetramino se conocerán sus distintas posiciones como estados, en este caso para las figuras solo tiene dos posibles casos cuando se rotan que se explicaran en el siguiente gráfico, se supone que cada figura dispone de 4 estados pero la figura s y z son un caso especial ya que básicamente solo cambia una vez de posición y vuelve a su estado inicial esto lo podríamos considerar como una relación bidireccional entre estados. 

![alt text](https://3.bp.blogspot.com/-Q4VQXFwyicA/XL95ahY3IvI/AAAAAAAAAgM/U-XSjZ4ONZ0BQq6b_2xKDaOZ0EB_-9b8wCLcBGAs/s1600/img.png)
Al final del programa deberá juntarse los tetraminós por medio de un servidor web con el tablero que es una matriz de 22x10 en la cual aparecerán aleatoriamente los tetraminós, el usuario podrá rotarlos en cualquier dirección además de poder hacer su movimiento horizontal y vertical en el eje -x, además de esto el usuario podrá ingresar un apodo y se le calculará un puntaje. 
![alt text](https://1.bp.blogspot.com/-E-ZQEmcim5k/XL-EUxAtg-I/AAAAAAAAAgo/_dKr9MD3j5EZhOzsqmkl1qw1jQUGL3v1ACLcBGAs/s640/Diapositiva2.PNG)

# 2.Vista de desarrollo:
Lista de requerimientos:
Funcionales: 

1.rotar una figura a la izquierda  
2.rotar una figura a la derecha 
3.Hacer descender la figura por la matriz 
4.desplazar figura a la derecha 
5.desplazar figura a la izquierda 

A nivel de software se planea implantar el código por medio del lenguaje de java, ya que los desarrolladores del equipo se encuentran demasiado familiarizados con él además de tener grandes fortalezas con su interfaz, se planea modelar cada tetramino por medio de una matriz y opciones por el usuario, se planea pintar por 
medio de JFrame cada tetramino dentro de una matriz, y con un Jbutton probar si se efectúa el cambio de estados pintando y despintando las casillas que no se necesiten dependiendo el movimiento. Esto lo consideramos como la zona de pruebas del prototipo, ya en la parte de código se creará una clase tetra mino con los atributos generales de un tetra mino y sus métodos estos se heredarán a la figura S y Z respectivamente, se creará una matriz binaria ósea llena de 0 y 1, esto nos servirá como condición para que cuando el usuario realiza una acción se invoque al método de rotar y esto convertirá ciertas casillas de la matriz en 1 y otras en 0 tratando de recrear el movimiento de la figura entre estados. 
Se consideran dos estados para cada figura la inicial y la final ya que se abstrajo que solo tiene dos posiciones lo cual facilita su rotación , cuando se ejecute la acción del usuario se creará un bucle donde se devuelva de inicial a final sin importar la direcciones escoja el usuario ya que como solo tienen dos estados no se notara que va a un solo lado. 
Para la parte del servicio web se planea usar una herramienta básica para la creación del servicio ya que será la primera vez que se use este tipo de plataformas para la concatenación de servicios , finalmente cuando se tenga montado el servicio en línea a través de un servicio externo que llamaremos servicio tablero se llamará aleatoriamente a un tetra mino de nuestro servidor y ya teniendo el tetra mino en el tablero el tablero con ayuda del usuario deben mover las fichas y jugar normalmente al Tetris. 

![alt text](https://4.bp.blogspot.com/-5XHCJfRpth0/XL-EU0o9OLI/AAAAAAAAAgk/WXXWY0D-9B0lv7H1ThzwThF9iOanBuMQwCLcBGAs/s1600/Diapositiva3.PNG
)
# 3).Vista de procesos 
La vista de procesos representa los flujos de trabajo paso a paso del sistema, en la siguiente figura se aprecia el diagrama de actividades para el programa donde se muestra el funcionamiento de 2 figuras de tetris, en el cual interactúa el usuario directamente con el programa. Para empezar se necesita que el usuario ingrese al programa, luego aparecerá una de las figuras que nos correspondió, en el momento de que la figura aparezca en el tablero el jugador tendrá la opción de que al momento de oprimir ciertas teclas podrá mover la figura de derecha a izquierda y viceversa, podrá girarse en dirección de derecha o izquierda, todo esto con el fin de que el usuario pueda acomodar la figura de la mejor manera en el tablero para lograr una mejor puntuación y por último tendrá la opción de bajar directamente la ficha al final del tablero, logrando así que el jugador interactúe directamente con las figuras correspondientes   
![alt text](https://2.bp.blogspot.com/-9SMral_lhPg/XL-EU1op4DI/AAAAAAAAAgs/xmppUAdQHmgX5rP7HA-D6RapKckZA-l1QCLcBGAs/s1600/Diapositiva4.PNG)
#4). Vista Física 
La vista física representa como están distribuidos los componentes entre los distintos equipos que conforman la solución, en este caso nosotros vamos a crear el programa con el que queremos realizar el movimiento de 2 fichas llamadas Tetraminos del juego de tetris, el lenguaje de programación que vamos a utilizar en este caso es java más específicamente netBeans IDE 8.2 cómo nosotros vamos a unir nuestro código con los demás códigos, los cuales probablemente estén en otros lenguajes de programación por lo cual vamos a utilizar servidores web de Oracle como por ejemplo la aplicación GlassFish con los que podamos fusionar los códigos y lograr realizar un solo programa que corra a la perfección.
Diagrama de componenetes y despliegue. 
![alt text](https://1.bp.blogspot.com/-TSLaGcEOqBs/XL-EVVx4kGI/AAAAAAAAAgw/Yy3FC6FI_v4ZlPm6lhtMYUGZgtU68pLcwCLcBGAs/s1600/Diapositiva5.PNG)
# Estructura de archivos. 
![alt text](https://1.bp.blogspot.com/-opnVLmPyySk/XL-EVq9akWI/AAAAAAAAAg0/JRmlAkwUmhwujlpR5u6gDTPuh6caZseyACLcBGAs/s1600/Diapositiva6.PNG)
# 3. Estándares de declaración de variables y métodos. 
Estándares de declaración de variables y métodos en java code: 
 Ventajas que podemos tener para el uso de estos estándares son: 
*Facilidad en Mantenimiento de la aplicación. 
*Permite el fácil entendimiento para cualquier persona. 
*Mejora de la legibilidad del código. 
___________________________________________________________________________________________________________
  ||-------------------------------------------------------------Ficheros-------------------------------------------------------------||
      Las diferentes clases en Java se las debe agrupar por paquetes, por lo que se les debe organizar de una                       
      manera jerárquica seguidos por un punto como separador, dentro del paquete principal se deben organizar                      
      los diferentes subpaquetes dependiendo de las diferentes funciones que vaya a cumplir dicha aplicación,                       
      en este caso se desarrollara un servicio web se debería tener una estructura similar atetris.webservice                       
  .data, donde tetris es el nombre de la aplicación, web service el paquete principal y data subpaquete. 
___________________________________________________________________________________________________________
  ||--------------------------------------------------Variables de clase (estáticas)--------------------------------------------------||
  En primer lugar las variables de clase públicas (public), después las protegidas (protected),         
  posteriormente las de nivel de paquete (sin modificador), y por último las privadas (private).           
___________________________________________________________________________________________________________
  ||------------------------------------------------------Variables de instancia -----------------------------------------------------||
  Primero las públicas (public), después las protegidas (protected), luego las de nivel de paquete       
  (sin modificador), y finalmente las privadas (private).                                                
  ___________________________________________________________________________________________________________
  ||------------------------------------------------------------Métodos---------------------------------------------------------------||
  Deben agruparse por funcionalidad en lugar de agruparse por ámbito o accesibilidad. Por ejemplo, un método
  privado puede estar situado entre dos métodos públicos. El objetivo es desarrollar código fácil de leer y  
  comprender.                                                                                               
_______________________________________________________________________________________________________________                                                   
# Nomenclatura: 
# Paquetes: 
Los métodos siempre se definen con letra minúscula para evitar conflictos con clases o interfaces. 
El paquete debe tener un prefijo que siempre debe corresponder a un nombre de dominio, por ejemplo:  
*es 
*eu 
*org 
*com 
*net 
Los demás componentes del paquete se deberán escribir en minúscula.
# Ejemplo:
adm.prototipo_1.logica 
java.util.ArrayList 
javax.servlet.http.HttpServletRequest 
# Clases: 
Los nombres deben ser sustantivos, deben tener la primera en mayúscula, deben ser simples y descriptivos  
# Ejemplo: 
class Ciudadano class Organigrama DAO 
class Agenda Service 
 
# Métodos: 
Deben ser verbos definidos en letra minúscula , si se componen de varias palabras se comienza con mayúscula 
# Ejemplo: 
public void Girar Derecha(Tetramino s); 
public void Girar Izquierda (Tetramino s); 
 
# Variables: 
Se deben escribir en minúscula  , si son compuestas por más  palabras se empieza por mayúscula la siguiente , no se puede comenzar con caracteres como  _ y $ . 
Deben ser nombres cortos con significado, evitar la redundancia 
# Ejemplo:
int posicion;String 
nombre tetris; 
 

# Posibles variables del software:
Las variables que se describen posteriormente son posibles variables del software , las variables de eje x y y son variables que almacenarán las posiciones de la figura en la matriz o tablero, además de eso tenemos dos matrices que generan las figuras .
int eje x;
int eje y;
int matrizS[][] = new int[4][3];
int matrizZ[][] = new int[4][3];
 
# Posibles métodos del software

Se definirán posiblemente los siguientes métodos, estos métodos son los principales , los dos primero son métodos para hacer girar las figuras y cambiar entre estados , también se tienen dos métodos que hacen mover en el tetramino en el eje Y, y por último tenemos el método que hace descender la figura hasta el final del tablero usando el eje X como referencia, todos los métodos nos retornan datos de posición que se le enviaran al tablero por medio del servicio web.

public static int Girar Derecha( eje x , eje y);

public static int Girar Izquierda( eje x , eje y);

public static int Mover Derecha( eje y);

public static int Mover Izquierda( eje y);

public static int Descender(, eje x );



