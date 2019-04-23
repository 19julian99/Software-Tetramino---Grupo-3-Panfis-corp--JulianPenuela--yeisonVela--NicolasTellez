# Descripción de métodos y Atributos.
# Atributos generales:
```	
int i1, i2, i3, i4;
int j1, j2,j3,j4; 	
```
Los atributos que se usaran para el software  son 4 variables enteras que simbolizan las  cordenadas decada punto de la figura en la matriz binaria , sus estados cambian entre 0 y 1 dependiendo el metodo que la invoque pasandolas como parametro.

# Metodo Posicion inicial:
```
public void PosicionInicialS() {
        this.is1 = is1;
        this.js1 = js1;
        this.is2 = is2;
        this.js2 = js2;
        this.is3 = is3;
        this.js3 = js3;
        this.is4 = is4;
        this.js4 = js4;
  }
```
El metodo de Posicion inicial se usa para la rotacion de la figura al estado inicial, internamente modifica e iguala las posciciones con las coordenadas inciales para modificar la matriz binaria dando la ilusion de que la figura giro a su posicion estandar.el metodo al modificar estas coordenadas que son heredadas de una clase mayor no retorna nada ya que de la clase que se invocan las retorna para que etsen a disposicion de otro servicio web que es el tablero.
# Metodos de Posicion inicial y final:
```  
 public void RotarInicialS() {
       this.is1 = is1;
        this.js1 = js1;
        this.is2 = is2-2;
        this.js2 = js2;
        this.is3 = is3;
        this.js3 = js3-2;
        this.is4 = is4;
        this.js4 = js4;
    }
   ```
   ___
   ```
     public void rotarFiguraS() {

        this.is1 = is1;
        this.js1 = js1;
        this.is2 = is2+2;
        this.js2 = js2;
        this.is3 = is3;
        this.js3 = js3+2;
        this.is4 = is4;
        this.js4 = js4;
       
     }
```
El metodo de rotar inicial y figura se usa para la rotacion de la figura al estado inicial, internamente modifica sumandole para rotar a la final y restandole a la final a ciertas posciciones 1 o dos valores  , esto apra que se cambien las coordenadas de  0 a 1 en la matriz binaria dando la ilusion de que la figura giro .el metodo al modificar estas coordenadas que son heredadas de una clase mayor no retorna nada ya que de la clase que se invocan las retorna para que esten a disposicion de otro servicio web que es el tablero. 

# Metodo Bajar figura:
```
 public void BajarFigura() {
        this.is1 = is1 + 1;
        this.is2 = is2 + 1;
        this.is3 = is3 + 1;
        this.is4 = is4 + 1;


    }
   ```
EL metodo de bajar figura le suma 1 a todas las cordenadas en el eje "j" de la figura ubicada en la matriz binara posibilitando el descenso de la figura.
# Metodo Mover figura a la derecha:
Este metodo le suma una poscicion a todas las coordenadas en el eje "I" pero se le suma en el eje positivo ya que esto movera a la derecha la figura.
 ```
      public void MoverDerecha() {

        this.js1 = js1+1;
        this.js2 = js2+1;
        this.js3 = js3+1;
        this.js4 = js4+1;
    }
 ```
# Metodo Mover figura a la izquierda:
Este metodo le suma una poscicion a todas las coordenadas en el eje "I" pero se le suma en el eje negativo ya que esto movera a la izquierda la figura.
 ```
  public void MoverIzquierda() {

        this.js1 = js1-1;
        this.js2 = js2-1;
        this.js3 = js3-1;
        this.js4 = js4-1;
    }
 ```
