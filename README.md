# Software-Tetramino---Grupo-3-Panfis-corp--JulianPenuela--yeisonVela--NicolasTellez
En este repositorio se encontrará toda la información y el código fuente de un algoritmo que permita enviar las coordenadas de una figura de tetris a otro servicio web que lo requiera , en este caso sera la figura "s" y "z"

1.Verificación de diseño inicial. 
2.Estructura de archivos. 	
3.Estándares de declaración de variables y métodos. 
4.Especificaciones de la forma de firma. 

1. Verificación de diseño inicial. 
1). Vista lógica: 
-Nos correspondió el tetramino s y z, los cuales se representarán en java por medio de matrices de 3x3, cada tetramino va a tener 3 operaciones básicas que son: 
1. rotar a la derecha 
2. rotar a la izquierda 
3. desplazar hacia abajo  
 
A para modelar cada rotación del tetramino se conocerán sus distintas posiciones como estados, en este caso para las figuras solo tiene dos posibles casos cuando se rotan que se explicaran en el siguiente gráfico, se supone que cada figura dispone de 4 estados pero la figura s y z son un caso especial ya que básicamente solo cambia una vez de posición y vuelve a su estado inicial esto lo podríamos considerar como una relación bidireccional entre estados. 

![alt text](https://killforlife123.blogspot.com/2019/04/blog-post.html)
