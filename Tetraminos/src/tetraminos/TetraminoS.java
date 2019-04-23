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
public class TetraminoS extends Tetramino {
 int is1=0,is2=0,is3=1,is4=1;
 int js1=5,js2=6,js3=4,js4=5;   
 
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
    public void BajarFigura() {
        this.is1 = is1 + 1;
        this.is2 = is2 + 1;
        this.is3 = is3 + 1;
        this.is4 = is4 + 1;


    }
   
      public void MoverDerecha() {

        this.js1 = js1+1;
        this.js2 = js2+1;
        this.js3 = js3+1;
        this.js4 = js4+1;
    }

    public void MoverIzquierda() {

        this.js1 = js1-1;
        this.js2 = js2-1;
        this.js3 = js3-1;
        this.js4 = js4-1;
    }
    
}
