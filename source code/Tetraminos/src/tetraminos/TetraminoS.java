/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetraminos;

/**
 * En esta clase se encuentran los metodos y las variables de la figura de tetris 
 * que en este caso es el tetramino S 
 * 
 * @author Julian Peñuela
 * @author Nicolas Tellez 
 * @author Yeison Vela
 * @version 1.0.0
 * @since 1.0
 */

public class TetraminoS extends Tetramino {
 int is1=0,is2=0,is3=1,is4=1;
 int js1=5,js2=6,js3=4,js4=5;   
 
 /**
 * El metodo de Posicion inicial se usa para la rotacion de la figura al estado inicial
 * internamente modifica e iguala las posciciones con las coordenadas inciales para modificar 
 * la matriz binaria dando la ilusion de que la figura giro a su posicion estandar
 * @since 1.0
 */
 
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

 
 
 
    /**
     * El metodo de rotar inicial se usa para la rotacion de la figura al estado 
     * inicial, internamente modifica sumandole para rotar a la final y restandole 
     * a la final a ciertas posciciones 1 o dos valores, esto para que se cambien 
     * las coordenadas de 0 a 1 en la matriz binaria dando la ilusion de que la figura giro 
     * @since 1.0
     */
 
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
    
    
    
    /**
     * El metodo de rotar Figura se usa para la rotacion de la figura al estado
     * Final, internamente modifica sumandole para rotar a la final y
     * restandole a la final a ciertas posciciones 1 o dos valores, esto para
     * que se cambien las coordenadas de 0 a 1 en la matriz binaria dando la
     * ilusion de que la figura giro
     * @since 1.0
     */
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
    
    
    
    /**
     * EL metodo de bajar figura le suma 1 a todas las cordenadas en el eje 
     * "j" de la figura ubicada en la matriz binara posibilitando el descenso de la figura.
     * @since 1.0
     */
    
    public void BajarFigura() {
        this.is1 = is1 + 1;
        this.is2 = is2 + 1;
        this.is3 = is3 + 1;
        this.is4 = is4 + 1;


    }
    
    
    
    
    /**
     * Este metodo le suma una poscicion a todas las coordenadas en el eje "I" 
     * pero se le suma en el eje positivo ya que esto movera a la derecha la figura.
     * @since 1.0
     */
       
      public void MoverDerecha() {

        this.js1 = js1+1;
        this.js2 = js2+1;
        this.js3 = js3+1;
        this.js4 = js4+1;
    }
      
      
      
      
     /**
     * Este metodo le suma una poscicion a todas las coordenadas en el eje "I" 
     * pero se le suma en el eje negativo ya que esto movera a la izquierda la figura.
     * @since 1.0
     */  
     
    public void MoverIzquierda() {

        this.js1 = js1-1;
        this.js2 = js2-1;
        this.js3 = js3-1;
        this.js4 = js4-1;
    }
    
}
