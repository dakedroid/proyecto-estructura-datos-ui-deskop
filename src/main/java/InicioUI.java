import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InicioUI extends JFrame {

    // Cliente - nombre del cliente , numero compras, categoria , saldo a deber

    public static Object[] columnas = {"NOMBRE DEL CLIENTE", "NUMERO DE COMPRAS", "CATEGORIA", "SALDO A DEBER"};

    public static Object[][] datos = {
            {"KEVIN MOLINA", 20, 'A', 2000.50},
            {"GAEL", 10, 'B', 10000.20},
            {"IRIS SAMAHI", 30, 'S', 200.00}
    };

    public JTable tablaClientes;

    public InicioUI() {

        crearTabla();

    }

    public void crearTabla() {

        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);
        tablaClientes = new JTable(modelo);

        tablaClientes.setPreferredScrollableViewportSize(tablaClientes.getPreferredSize());
        JScrollPane scrollPane = new JScrollPane(tablaClientes);

        JButton boton = new JButton("LLENAR TABLA");
        boton.setMinimumSize(new Dimension(100, 32));
        boton.setPreferredSize(new Dimension(100, 32));
        boton.setMaximumSize(new Dimension(100, 32));

        JButton estructaLineal = new JButton("ESTRUCTURA LINEAL");
        boton.setMinimumSize(new Dimension(100, 32));
        boton.setPreferredSize(new Dimension(100, 32));
        boton.setMaximumSize(new Dimension(100, 32));


        getContentPane().setLayout(new GridLayout(2, 1));
        getContentPane().add(scrollPane);
        getContentPane().add(boton);
        getContentPane().add(estructaLineal);


    }


    public static void main(String[] args) {
        InicioUI ventana = new InicioUI();
        ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocation(0, 0);
        ventana.setMinimumSize(new Dimension(1000, 800));
        ventana.setPreferredSize(new Dimension(1000, 800));
        ventana.setVisible(true);
    }
}
