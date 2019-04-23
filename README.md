# Software-Tetramino---Grupo-3-Panfis-corp--JulianPenuela--yeisonVela--NicolasTellez
En este repositorio se encontrará toda la información y el código fuente de un algoritmo que permita enviar las coordenadas de una figura de tetris a otro servicio web que lo requiera , en este caso sera la figura "s" y "z"

1.Verificación de diseño inicial. 
2.Estructura de archivos. 	
3.Estándares de declaración de variables y métodos. 
4.Especificaciones de la forma de firma. 

#1. Verificación de diseño inicial. 
1). Vista lógica: 
-Nos correspondió el tetramino s y z, los cuales se representarán en java por medio de matrices de 3x3, cada tetramino va a tener 3 operaciones básicas que son: 
1. rotar a la derecha 
2. rotar a la izquierda 
3. desplazar hacia abajo  
 
A para modelar cada rotación del tetramino se conocerán sus distintas posiciones como estados, en este caso para las figuras solo tiene dos posibles casos cuando se rotan que se explicaran en el siguiente gráfico, se supone que cada figura dispone de 4 estados pero la figura s y z son un caso especial ya que básicamente solo cambia una vez de posición y vuelve a su estado inicial esto lo podríamos considerar como una relación bidireccional entre estados. 

![alt text](https://3.bp.blogspot.com/-Q4VQXFwyicA/XL95ahY3IvI/AAAAAAAAAgM/U-XSjZ4ONZ0BQq6b_2xKDaOZ0EB_-9b8wCLcBGAs/s1600/img.png)
Al final del programa deberá juntarse los tetraminós por medio de un servidor web con el tablero que es una matriz de 22x10 en la cual aparecerán aleatoriamente los tetraminós, el usuario podrá rotarlos en cualquier dirección además de poder hacer su movimiento horizontal y vertical en el eje -x, además de esto el usuario podrá ingresar un apodo y se le calculará un puntaje. 
![alt text](https://1.bp.blogspot.com/-E-ZQEmcim5k/XL-EUxAtg-I/AAAAAAAAAgo/_dKr9MD3j5EZhOzsqmkl1qw1jQUGL3v1ACLcBGAs/s640/Diapositiva2.PNG)

#2. vista de desarrollo:
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




