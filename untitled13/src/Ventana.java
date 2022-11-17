import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame{
/*
    Cliente cliente= new Cliente();
    JPanel panel =new JPanel();

    public  Ventana(){
        setSize(500,500);//establecemos el tamaño
        // setLocation(550,200);//estableces la posicion
        // setBounds(300,200,500,500);//establece la poscion y el tamaño de la ventana
        setTitle("Nombres");//el titulo de la ventana
        setLocationRelativeTo(null);//establecemos la pantalla en el centro
        setMinimumSize(new Dimension(200,200));//establece el tamaño minimo
        setVisible(true);
        iniciarcomponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la venta se cierra el programa

    }



    private    void iniciarcomponentes(){
        colocarPaneles();
        //colocarListasDespegables();
        colocarBotones();
        colocarBotones2();
    }
    private  void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);//elimina la ubicacion por defecto de los elementos del poanel
        this.getContentPane().add(panel);

    }
    private void colocarCajasDeTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,200,30);

        panel.add(cajaTexto);
    }
    private  void colocarBotones() {
        //boton 1 boton de texto
        JButton boton1 = new JButton("agregar Nombre");
        //boton1.setText("guardar"); // establer el nombre del btoon
        boton1.setBounds(100, 100, 100, 40);
        boton1.setEnabled(true);//establer la interaccion con el boton
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("arial", 3, 15));
        panel.add(boton1);
        ActionListener oyentedeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    cliente.nombre= (JOptionPane.showInputDialog(null, "Escribe el nombre del cliente"));
                    cliente.ListaCliente.add(cliente.getNombre());
                    Ventanas v2 = new Ventanas();


                } catch (Exception a) {
                    a.printStackTrace();

                }

                try {

                } catch (Exception a) {
                    a.printStackTrace();

                }

            }

        };

        boton1.addActionListener(oyentedeAccion);



    }
    private  void colocarBotones2() {
        //boton 1 boton de texto
        JButton boton1 = new JButton("mostrar");
        //boton1.setText("guardar"); // establer el nombre del btoon
        boton1.setBounds(50, 50, 100, 40);
        boton1.setEnabled(true);//establer la interaccion con el boton
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("arial", 3, 15));
        panel.add(boton1);
        ActionListener oyentedeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    for (String persona : cliente.ListaCliente) {
                        System.out.println(persona);
                        JOptionPane.showMessageDialog(null,persona);
                    }

                } catch (Exception a) {
                    a.printStackTrace();

                }

            }

        };

        boton1.addActionListener(oyentedeAccion);


    }
*/

}
