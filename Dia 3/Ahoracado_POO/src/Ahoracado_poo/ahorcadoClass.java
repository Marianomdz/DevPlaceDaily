/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ahoracado_poo;

/**
 *
 * @author Mariano_mdz
 */
public class ahorcadoClass {
    
    char[] vectorPalabra;
    char[] vectorEncontradas;
    String palabraAdivinar;
    int letrasEncontradas;
    int cantJugadas;

    public ahorcadoClass() {
    }

       public ahorcadoClass(char[] vectorPalabra,String palabraAdivinar, char[] vectorEncontradas, int letrasEncontradas, int cantJugadas) {
        this.vectorPalabra = palabraAdivinar.toCharArray();
        this.palabraAdivinar = palabraAdivinar;
        this.vectorEncontradas = vectorEncontradas;
        this.letrasEncontradas = letrasEncontradas;
        this.cantJugadas = cantJugadas;
           
    }

    public ahorcadoClass(String palabraAdivinar, String palabra2, int letrasEncontradas, int cantJugadas) {
        this.vectorPalabra = palabraAdivinar.toCharArray();
        this.palabraAdivinar = palabraAdivinar;
        this.vectorEncontradas = palabra2.toCharArray();
        this.letrasEncontradas = letrasEncontradas;
        this.cantJugadas = cantJugadas;
          // System.out.println("ddd"+palabraAdivinar);
           
//           for (int i = 0; i < vectorPalabra.length; i++) {
//               System.out.print(vectorPalabra[i]);
//           }
//           System.out.println("");
    }

       
       
    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    public char[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(char[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    public char[] getVectorEncontradas() {
        return vectorEncontradas;
    }

    public void setVectorEncontradas(char[] vectorEncontradas) {
        this.vectorEncontradas = vectorEncontradas;
    }
    
    
    
    
}
