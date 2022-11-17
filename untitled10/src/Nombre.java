import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Nombre extends JFrame {
private JPanel panel;
private JLabel saludo;
private JTextField cajaTexto;
private  JButton boton;
private  JTextArea areaTexto;


public Nombre (){
    setBounds(50,50,500,500);
    setTitle("Nombres");//el titulo de la ventana
    iniciarcomponentes();
    setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la venta se cierra el programa

}
    private  void iniciarcomponentes(){
        colocarPaneles();
        colocarEtiquetas();
        //colocarBotones();
        colocarCajasDeTexto();
        colocarAreasDeTexto();
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

        eventodelteclado();
    }
    private  void    colocarAreasDeTexto(){
    areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        panel.add(areaTexto);

    }

    private  void colocarBotones(){
    boton = new JButton("guardar");
        boton.setBounds(150,100,150,40);
        boton.setFont(new Font("arial",3,15));
        panel.add(boton);


        saludo = new JLabel();
        saludo.setBounds(50,200,300,40);
        saludo.setFont(new Font("arial",3,20));
        panel.add(saludo);
        //oyentedeAccion();
        //eventoOyentodeRaton();

    }
    private  void oyentedeAccion(){
        ActionListener oyecnteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                saludo.setText("hola "+ cajaTexto.getText());
            }
        };

        boton.addActionListener(oyecnteDeAccion);

    }
    private  void eventoOyentodeRaton(){
    //agregando poyente de raton mouse listner
        MouseListener oyenteraton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                areaTexto.append("mouseClicked\n");//apretar y soltar el boton dentro de lboton
            }

            @Override
            public void mousePressed(MouseEvent e) {
                areaTexto.append("mouse pressed \n");//solo apretar el boton
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                areaTexto.append("mouseReals \n");//se peude paretar y soltar afuera del boton

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                areaTexto.append("mouseentered\n");//solo se debe entrar en el area del boton sin precionarlo para activar esta opcion

            }

            @Override
            public void mouseExited(MouseEvent e) {
                areaTexto.append("mouseExted \n");// cuando salgo del area del boton se activa esto

            }
        };
    boton.addMouseListener(oyenteraton);
    }
    public  void eventodelteclado(){
    KeyListener eventoteclado = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            areaTexto.append("keyTyped\n");//pero no sirve con las teclas especiales alt shft etc
        }

        @Override
        public void keyPressed(KeyEvent e) {
areaTexto.append("keyPressed\n");//solo hace presionar cualquier tecla
        }

        @Override
        public void keyReleased(KeyEvent e) {
            areaTexto.append("keyReleased\n");//funciona con cualqueir tecla pero solo sirve cuando apretas y soltas una tecla
        }
    };

    cajaTexto.addKeyListener(eventoteclado);
    }

}
