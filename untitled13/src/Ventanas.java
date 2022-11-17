import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventanas extends JFrame {
/*
    Cliente cliente= new Cliente();
    Cuenta cuenta =new Cuenta();
    JPanel panel =new JPanel();

    public  Ventanas(){
        setSize(500,500);//establecemos el tamaño
        // setLocation(550,200);//estableces la posicion
        // setBounds(300,200,500,500);//establece la poscion y el tamaño de la ventana
        setTitle("Nombres");//el titulo de la ventana
        setLocationRelativeTo(null);//establecemos la pantalla en el centro
        setMinimumSize(new Dimension(200,200));//establece el tamaño minimo
        setVisible(true);
        iniciarcomponentes2();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la venta se cierra el programa

    }
    public   void iniciarcomponentes2(){
        colocarPaneles2();
        //colocarListasDespegables();
        colocarBotones1();
    }
    public  void colocarPaneles2(){
        panel = new JPanel();
        panel.setLayout(null);//elimina la ubicacion por defecto de los elementos del poanel
        this.getContentPane().add(panel);

    }
    public  void colocarBotones1() {
        //boton 1 boton de texto
        JButton boton1 = new JButton("agregar cuenta");
        //boton1.setText("guardar"); // establer el nombre del btoon
        boton1.setBounds(100, 100, 200, 40);
        boton1.setEnabled(true);//establer la interaccion con el boton
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("arial", 3, 15));
        panel.add(boton1);
        ActionListener oyentedeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    cuenta.nombre= (JOptionPane.showInputDialog(null, "escribe nombre de la cuenta"));
                    cuenta.monto= Double.parseDouble((JOptionPane.showInputDialog(null, "Defina el monto de la cuenta")));


                } catch (Exception a) {
                    a.printStackTrace();

                }

            }

        };

        boton1.addActionListener(oyentedeAccion);



    }

*/

}
