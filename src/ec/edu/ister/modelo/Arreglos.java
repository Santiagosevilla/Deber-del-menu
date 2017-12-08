package ec.edu.ister.modelo;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class Arreglos {

    private int arrayTemperaturas[];

    public void dimensionar() {
        int dim = Integer.parseInt(JOptionPane.showInputDialog("ingrese cuantas temperaturas"));
        arrayTemperaturas = new int[dim];
    }

    public int tamaño() {
        return arrayTemperaturas.length;
    }

    public void llenarArreglo(){
        for (int i = 0; i < tamaño(); i++) {
            arrayTemperaturas[i]=(int)(Math.random()*10);
            
        }
    }
    
    public void imprimir(){
       String acu="";
        for (int i = 0; i < arrayTemperaturas.length; i++) {
           acu += " "+arrayTemperaturas[i];
        }
         JOptionPane.showMessageDialog(null,acu);
    }
    
    public void imprimirFacil(){
        
        JOptionPane.showMessageDialog(null,Arrays.toString(arrayTemperaturas));
        
    }
    public void ordenar(){
        Arrays.sort(arrayTemperaturas);
    }
    public void maximo(){
        
    }
    
    
    
    
    
    
    
    
    
}
