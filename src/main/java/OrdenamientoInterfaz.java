import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class OrdenamientoInterfaz {


    private JPanel panelPrincipal;
    private JTable tabla;
    private JButton bubujaButton;
    private JButton quickSortButton;
    private JButton mergeSortButton;
    private JLabel resultado;


    public static Object[] columnas = {"NOMBRE DEL CLIENTE", "NUMERO DE COMPRAS", "CATEGORIA", "SALDO A DEBER"};

    public static Object[][] datos = {
            {"PATRICIA EUGENIO ", 20, 'A', 2000.50},
            {"KEVIN MOLINA", 20, 'A', 2000.50},
            {"ARAGON ELIANETH", 20, 'A', 2000.50},
            {"KEVIN JAVIER", 10, 'B', 10000.20},
            {"IRIS SAMAHI", 30, 'S', 200.00},
            {"ANDRES JAHIR ", 20, 'A', 2000.50},
    };

    public OrdenamientoInterfaz() {

        quickSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                ordenarQuickSort();

            }
        });


    }

    public void ordenarQuickSort() {

        List<String> nombres = new ArrayList<String>();

        for (int i = 0; i < tabla.getRowCount(); i++) {
            nombres.add(tabla.getValueAt(i, 0).toString());
        }

        //   MainKotlinKt.tiempoQuicksort(nombres);

      //  MainKotlinKt.imprimirListas(nombres);

        MainKotlinKt.tiempoMergeSort(nombres);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("VENTANA");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setContentPane(new OrdenamientoInterfaz().panelPrincipal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setSize(512, 512);
                frame.setLocationRelativeTo(null);
            }
        });
    }


    private void createUIComponents() {
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modelo);
    }
}
