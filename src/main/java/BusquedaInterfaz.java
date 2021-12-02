import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BusquedaInterfaz {
    private JPanel panelPrincipal;
    private JTable tabla;
    private JTextField valorABuscarCampoTexto;
    private JButton buscarKotlinButton;
    private JButton busquedaLinealButton;
    private JButton busquedaBinariaButton;

    public static Object[] columnas = {"NOMBRE DEL CLIENTE", "NUMERO DE COMPRAS", "CATEGORIA", "SALDO A DEBER"};

    public static Object[][] datos = {
            {"PATRICIA EUGENIO ", 20, 'A', 2000.50},
            {"KEVIN MOLINA", 20, 'A', 2000.50},
            {"ARAGON ELIANETH", 20, 'A', 2000.50},
            {"KEVIN JAVIER", 10, 'B', 10000.20},
            {"IRIS SAMAHI", 30, 'S', 200.00},
            {"ANDRES JAHIR ", 20, 'A', 2000.50},
            {"IRIS SAMAHI", 32, 'C', 200.00},
    };

    public BusquedaInterfaz() {
        buscarKotlinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarKotlin();
            }
        });
        busquedaLinealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarLinealKotlin();
            }
        });
        busquedaBinariaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                busquedaBinaria();
            }
        });
    }

    public void buscarKotlin() {

        List<String> nombres = new ArrayList<String>();

        for (int i = 0; i < tabla.getRowCount(); i++) {
            nombres.add(tabla.getValueAt(i, 0).toString());
        }

        String valorABuscar = valorABuscarCampoTexto.getText();

        MetodosBusquedaKt.busquedaPorKotlin(nombres, valorABuscar);

    }

    // NO SE USA
    public int buscarLinealJava(List<String> list, String valorABuscar) {

        for (int index = 0; index < list.size(); index++) {
            if (list.get(index).equals(valorABuscar)) {
                return index;
            }
        }

        return -1;
    }

    public void buscarLinealKotlin() {

        List<String> nombres = new ArrayList<String>();

        for (int i = 0; i < tabla.getRowCount(); i++) {
            nombres.add(tabla.getValueAt(i, 0).toString());
        }

        String valorABuscar = valorABuscarCampoTexto.getText();

        MetodosBusquedaKt.busquedaLineal(nombres, valorABuscar);

    }

    public void busquedaBinaria() {

        List<String> nombres = new ArrayList<String>();

        for (int i = 0; i < tabla.getRowCount(); i++) {
            nombres.add(tabla.getValueAt(i, 0).toString());
        }

        String valorABuscar = valorABuscarCampoTexto.getText();

        MetodosBusquedaKt.busquedaBinaria(nombres, valorABuscar);


    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("VENTANA");
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setContentPane(new BusquedaInterfaz().panelPrincipal);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
                frame.setSize(800, 512);
                frame.setLocationRelativeTo(null);
            }
        });
    }

    private void createUIComponents() {
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        tabla = new JTable(modelo);
    }
}
