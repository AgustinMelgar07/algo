import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.LinkedList;

public class ConjuntoNombres extends JFrame  implements Serializable {
    private JPanel panel;
    private JLabel saludo;
    private JTextField cajaTexto;
    private  JButton boton;
    String conjnom[]=new String[10];
    String nombre;
    private JTextField textoPegado;

    public ConjuntoNombres (){
        setBounds(50,50,500,500);
        setTitle("Nombres");//el titulo de la ventana
        iniciarcomponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la venta se cierra el programa

    }
    private  void iniciarcomponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
        colocarCajasDeTexto();
        colocarBotones2();
    }
    private  void colocarPaneles(){
        panel = new JPanel();
        panel.setLayout(null);//elimina la ubicacion por defecto de los elementos del poanel
        this.add(panel);

    }
    private  void colocarEtiquetas(){
        saludo =new JLabel("ingrese nombre: ");//creamos un etiqueta de texto
        saludo.setBounds(30,10,200,30);
        saludo.setFont(new Font("arial",3,20)); //Establecemos el nombre, estilo y el tamaño
        panel.add(saludo);

    }
    private void colocarCajasDeTexto(){
        cajaTexto = new JTextField();

        cajaTexto.setBounds(30,50,150,30);
        panel.add(cajaTexto);
        System.out.println(cajaTexto);

    }
    private  void colocarBotones(){
        boton = new JButton("guardar");
        boton.setBounds(150,100,150,40);
        panel.add(boton);

        ActionListener oyenteAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoEscrito = cajaTexto.getText();
                System.out.println("El texto copiado es "+textoEscrito);
                conjnom[0] = textoEscrito;
                try{
        

                    FileWriter escriturua = new FileWriter("C:\\Users\\AMD Ryzen\\untitled10\\nombres.txt", true);

                    for(int i =0; i < textoEscrito.length(); i++){
                        escriturua.write(textoEscrito.charAt(i));
                    }
                    escriturua.write("\n");
                    escriturua.close();
                        } catch (IOException a) {
                        a.printStackTrace();
                    }

                }
        };

        boton.addActionListener(oyenteAccion);
        }

    private  void colocarBotones2() {
        boton = new JButton("Ver Lista");
        boton.setBounds(150, 300, 150, 40);
        panel.add(boton);

        ActionListener oyenteAccion2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String textoEscrito = cajaTexto.getText();
                System.out.println("El texto copiado es " + textoEscrito);
                conjnom[0] = textoEscrito;
                try {


                    FileWriter escriturua = new FileWriter("C:\\Users\\AMD Ryzen\\untitled10\\nombres.txt", true);

                    for (int i = 0; i < textoEscrito.length(); i++) {
                        escriturua.write(textoEscrito.charAt(i));
                    }
                    escriturua.write("\n");
                    escriturua.close();
                } catch (IOException a) {
                    a.printStackTrace();
                }

            }
        };

        boton.addActionListener(oyenteAccion2);
    }


    }
