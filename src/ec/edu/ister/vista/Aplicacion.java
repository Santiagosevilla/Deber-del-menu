package ec.edu.ister.vista;

import ec.edu.ister.modelo.Arreglos;
import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Aplicacion {
    public static void main(String[] args) {
        int menu=0;
        Arreglos obj = new Arreglos();
        do {
            menu= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la opcion que desee realizar:"
                +"\n1) Dimensionar el arreglo"
                +"\n2) Llenar el arreglo"
                +"\n3) Ordenar el arreglo"
                +"\n4) Imprimir el arreglo"
                +"\n5) Salir del programa"));
            switch (menu){
                case 1:
                    obj.dimensionar();
                    break;
                case 2:
                    obj.llenarArreglo();
                    break;
                case 3:
                    obj.ordenar();
                    break;
                case 4:
                    obj.imprimirFacil();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null,"El programa ha finalizado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Error!!");
                    break;
            }
        } while (menu!=5);
        
        
        //JOptionPane.showMessageDialog(null,obj.tamaño());
    }

}
