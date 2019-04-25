/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetraminos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Esta es la clase principal de nuestro proyecto aca lo que se realiza es un menu 
 * donde se llaman los metodos de las figuras tetramino S y tetramino Z, con ello 
 * consiguiendo imprimir el tablero donde se muestra la posicion actual de la figura que se escogio
 * @author Julian Peñuela
 * @author Nicolas Tellez 
 * @author Yeison Vela
 * @version 1.0.0
 * @since 1.0
 */
public class Main {

    /**
     * @param args the command line arguments 22x12
     * @throws java.io.IOException el método puede manejar excepciones de tipo IOException
     * @since 1.0
     */
    public static void main(String[] args) throws IOException {
        
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
     
     
        int tablero[][] = new int[22][12];
        int x, y;
        for (int i = 0; i < 22; i++) {
            for (int j = 0; j < 12; j++) {
                tablero[i][j] = 0;

            }
        }

        TetraminoS s = new TetraminoS();
        TetraminoZ z = new TetraminoZ();
        System.out.println("que tetramino desea probar? \n1. tetramino 1 \n2. tetramino 2");
         System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
        int elec = Integer.parseInt(br.readLine());
        if (elec == 1) {
            while (true) {
                
                System.out.println("0.probar \n1.pos inicial \n2.bajar \n3.izq \n4.der \n5.pos final \n7.Salir");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                int op = 0;
                op = Integer.parseInt(br.readLine());
                switch (op) {
                    case 0: {
                        s.PosicionInicialS();
                        tablero[s.is1][s.js1] = 1;
                        tablero[s.is2][s.js2] = 1;
                        tablero[s.is3][s.js3] = 1;
                        tablero[s.is4][s.js4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    }
                    break;
                    case 1: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        s.RotarInicialS();
                        tablero[s.is1][s.js1] = 1;
                        tablero[s.is2][s.js2] = 1;
                        tablero[s.is3][s.js3] = 1;
                        tablero[s.is4][s.js4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    }
                    break;
                    case 2: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        s.BajarFigura();
                        tablero[s.is1][s.js1] = 1;
                        tablero[s.is2][s.js2] = 1;
                        tablero[s.is3][s.js3] = 1;
                        tablero[s.is4][s.js4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    }
                    break;
                    case 3: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        s.MoverIzquierda();
                        tablero[s.is1][s.js1] = 1;
                        tablero[s.is2][s.js2] = 1;
                        tablero[s.is3][s.js3] = 1;
                        tablero[s.is4][s.js4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

                    }
                    break;
                    case 4: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        s.MoverDerecha();
                        tablero[s.is1][s.js1] = 1;
                        tablero[s.is2][s.js2] = 1;
                        tablero[s.is3][s.js3] = 1;
                        tablero[s.is4][s.js4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    }
                    break;
                    case 5: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        s.rotarFiguraS();
                        tablero[s.is1][s.js1] = 1;
                        tablero[s.is2][s.js2] = 1;
                        tablero[s.is3][s.js3] = 1;
                        tablero[s.is4][s.js4] = 1;
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        
                       
                        }
                         System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    }
                    break;
                    default: {
                        System.exit(0);
                    }

                }

            }
        }else {
            
            while (true) {
                
                System.out.println("0.probar \n1.pos inicial \n2.bajar \n3.izq \n4.der \n5.pos final \n7.Salir");
                System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                int op1 = 0;
                op1 = Integer.parseInt(br.readLine());
                switch (op1) {
                    case 0: {
                        z.PosicionInicialZ();
                        tablero[z.iz1][z.jz1] = 1;
                        tablero[z.iz2][z.jz2] = 1;
                        tablero[z.iz3][z.jz3] = 1;
                        tablero[z.iz4][z.jz4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                    }
                    break;
                     
                    case 1: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        z.RotarInicialZ();
                        tablero[z.iz1][z.jz1] = 1;
                        tablero[z.iz2][z.jz2] = 1;
                        tablero[z.iz3][z.jz3] = 1;
                        tablero[z.iz4][z.jz4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    }
                    break;
                    case 2: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        z.BajarFigura();
                        tablero[z.iz1][z.jz1] = 1;
                        tablero[z.iz2][z.jz2] = 1;
                        tablero[z.iz3][z.jz3] = 1;
                        tablero[z.iz4][z.jz4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    }
                    break;
                    case 3: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        z.MoverIzquierda();
                        tablero[z.iz1][z.jz1] = 1;
                        tablero[z.iz2][z.jz2] = 1;
                        tablero[z.iz3][z.jz3] = 1;
                        tablero[z.iz4][z.jz4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");

                    }
                    break;
                    case 4: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        z.MoverDerecha();
                        tablero[z.iz1][z.jz1] = 1;
                        tablero[z.iz2][z.jz2] = 1;
                        tablero[z.iz3][z.jz3] = 1;
                        tablero[z.iz4][z.jz4] = 1;

                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    }
                    break;
                    case 5: {
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                tablero[i][j] = 0;

                            }
                        }
                        z.rotarFiguraZ();
                        tablero[z.iz1][z.jz1] = 1;
                        tablero[z.iz2][z.jz2] = 1;
                        tablero[z.iz3][z.jz3] = 1;
                        tablero[z.iz4][z.jz4] = 1;
                        for (int i = 0; i < 22; i++) {
                            for (int j = 0; j < 12; j++) {
                                System.out.print("[");
                                System.out.print(tablero[i][j]);
                                System.out.print("]");
                            }
                            System.out.println("");

                            
                        }
                        System.out.println("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+");
                    }
                    break;
                    default: {
                        System.exit(0);
                    }
                }
            }
        }

    }

}
