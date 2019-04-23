/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetraminos;

/**
 *
 * @author BOG-A409-E-012
 */
public class TetraminoZ extends Tetramino {

    int iz1 = 0, iz2 = 0, iz3 = 1, iz4 = 1;
    int jz1 = 5, jz2 = 4, jz3 = 6, jz4 = 5;
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

    public void RotarInicialZ() {
       this.iz1 = iz1;
        this.jz1 = jz1;
        this.iz2 = iz2;
        this.jz2 = jz2-2;
        this.iz3 = iz3+2;
        this.jz3 = jz3;
        this.iz4 = iz4;
        this.jz4 = jz4;
    }

    public void rotarFiguraZ() {

         this.iz1 = iz1;
        this.jz1 = jz1;
        this.iz2 = iz2;
        this.jz2 = jz2+2;
        this.iz3 = iz3-2;
        this.jz3 = jz3;
        this.iz4 = iz4;
        this.jz4 = jz4;
        
       
     }
    public void BajarFigura() {
        this.iz1 = iz1 + 1;
        this.iz2 = iz2 + 1;
        this.iz3 = iz3 + 1;
        this.iz4 = iz4 + 1;


    }
   
      public void MoverDerecha() {

        this.jz1 = jz1+1;
        this.jz2 = jz2+1;
        this.jz3 = jz3+1;
        this.jz4 = jz4+1;
    }

    public void MoverIzquierda() {

        this.jz1 = jz1-1;
        this.jz2 = jz2-1;
        this.jz3 = jz3-1;
        this.jz4 = jz4-1;
    }

}
