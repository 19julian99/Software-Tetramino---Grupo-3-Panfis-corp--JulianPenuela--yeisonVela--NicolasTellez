/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetraminos;

/**
 * En esta clase se encuentran los metodos y las variables de la figura de
 * tetris que en este caso es el tetramino Z
 *
 * @author Julian Peñuela
 * @author Nicolas Tellez
 * @author Yeison Vela
 * @version 1.0.0
 * @since 1.0
 */
public class TetraminoZ extends Tetramino {

    int iz1 = 0, iz2 = 0, iz3 = 1, iz4 = 1;
    int jz1 = 5, jz2 = 4, jz3 = 6, jz4 = 5;

    /**
     * El metodo de Posicion inicial se usa para la rotacion de la figura al
     * estado inicial internamente modifica e iguala las posciciones con las
     * coordenadas inciales para modificar la matriz binaria dando la ilusion de
     * que la figura giro a su posicion estandar
     * @since 1.0
     */
    public void PosicionInicialZ() {
        this.iz1 = iz1;
        this.jz1 = jz1;
        this.iz2 = iz2;
        this.jz2 = jz2;
        this.iz3 = iz3;
        this.jz3 = jz3;
        this.iz4 = iz3;
        this.jz4 = jz4;
    }
    
    
    
    
    /**
     * El metodo de rotar inicial se usa para la rotacion de la figura al estado
     * inicial, internamente modifica sumandole para rotar a la final y
     * restandole a la final a ciertas posciciones 1 o dos valores, esto para
     * que se cambien las coordenadas de 0 a 1 en la matriz binaria dando la
     * ilusion de que la figura giro
     * @since 1.0
     */
    public void RotarInicialZ() {
        this.iz1 = iz1;
        this.jz1 = jz1;
        this.iz2 = iz2;
        this.jz2 = jz2 - 2;
        this.iz3 = iz3 + 2;
        this.jz3 = jz3;
        this.iz4 = iz4;
        this.jz4 = jz4;
    }

    
    
    /**
     * El metodo de rotar Figura se usa para la rotacion de la figura al estado
     * Final, internamente modifica sumandole para rotar a la final y
     * restandole a la final a ciertas posciciones 1 o dos valores, esto para
     * que se cambien las coordenadas de 0 a 1 en la matriz binaria dando la
     * ilusion de que la figura giro
     * @since 1.0
     */
    public void rotarFiguraZ() {

        this.iz1 = iz1;
        this.jz1 = jz1;
        this.iz2 = iz2;
        this.jz2 = jz2 + 2;
        this.iz3 = iz3 - 2;
        this.jz3 = jz3;
        this.iz4 = iz4;
        this.jz4 = jz4;

    }
    

    /**
     * EL metodo de bajar figura le suma 1 a todas las cordenadas en el eje "j"
     * de la figura ubicada en la matriz binara posibilitando el descenso de la
     * figura.
     * @since 1.0
     */
    public void BajarFigura() {
        this.iz1 = iz1 + 1;
        this.iz2 = iz2 + 1;
        this.iz3 = iz3 + 1;
        this.iz4 = iz4 + 1;

    }
    
    
    /**
     * Este metodo le suma una poscicion a todas las coordenadas en el eje "I" 
     * pero se le suma en el eje positivo ya que esto movera a la derecha la figura.
     * @since 1.0
     */

    public void MoverDerecha() {

        this.jz1 = jz1 + 1;
        this.jz2 = jz2 + 1;
        this.jz3 = jz3 + 1;
        this.jz4 = jz4 + 1;
    }
    
    
    /**
     * Este metodo le suma una poscicion a todas las coordenadas en el eje "I" 
     * pero se le suma en el eje negativo ya que esto movera a la izquierda la figura.
     * @since 1.0
     */ 
    
    public void MoverIzquierda() {

        this.jz1 = jz1 - 1;
        this.jz2 = jz2 - 1;
        this.jz3 = jz3 - 1;
        this.jz4 = jz4 - 1;
    }

}
