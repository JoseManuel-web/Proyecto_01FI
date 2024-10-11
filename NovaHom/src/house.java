import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

public class house {
    public static void main(String[] args) {
        configuracion cng=new configuracion();//Organizar el main varios metodos 
        int opcion;
        Menu inicio= new Menu();
        List<String> menI=Arrays.asList("Ingrese una opción:\n","1) Listar dispositivos\n",
        "2) Agregar dispositivo\n","3) Buscar dispositivo\n","4) Salir\n");
        int NmenI=menI.size();
        JOptionPane.showMessageDialog(null, "Bienvenid@ al gestor de una casa inteligente!",
        "Saludo",1);
        do { 
            opcion=inicio.mostrar(menI.toString(), NmenI-1,"Inicio");
            switch (opcion) {
                case 0:
                    return;
                case 1:
                    //Caso listar
                    cng.listar();
                    break;

                case 2:
                    cng.crear();
                    break;
                case 3:
                    //Buscar dispositivos
                    cng.buscarDispositivos();
                    break;
                case 4:
                    String[] nombreIngregrantes = {
                        "JOSE MANUEL CALDERON SANDOVAL\n",
                        "LUIS ALEJANDRO EMBA REYES\n",
                        "GUSTAVO LOPEZ LUNA\n",
                        "GUSTAVO FABIAL OLALDE\n"
                    };
                    JOptionPane.showMessageDialog(
                        null, 
                        nombreIngregrantes,
                        "Agradecimientos",
                        JOptionPane.INFORMATION_MESSAGE,
                        null
                        );
                    break;
                default:
                    throw new AssertionError();
            }
        } while (opcion !=4 );
    }
}