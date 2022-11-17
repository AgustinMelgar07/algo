import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    JPanel panel =new JPanel(); //creacion de un panel
    public  Ventana(){
        setSize(500,500);//establecemos el tamaño
        // setLocation(550,200);//estableces la posicion
       // setBounds(300,200,500,500);//establece la poscion y el tamaño de la ventana
        setTitle("Nombres");//el titulo de la ventana
        setLocationRelativeTo(null);//establecemos la pantalla en el centro
        setMinimumSize(new Dimension(200,200));//establece el tamaño minimo

        iniciarcomponentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la venta se cierra el programa

    }


    private  void iniciarcomponentes(){
        colocarPaneles();
        //colocarEtiquetas();
        //colocarBotones();
        //colocarRadiosBotones();
        //colocarCajasDeTexto();
        //colocarAreasDeTexto();
        //colocarListasDespegables();
    }

    private  void colocarPaneles(){
        panel = new JPanel();
        panel.setBackground(Color.black);
        panel.setLayout(null);//elimina la ubicacion por defecto de los elementos del poanel
        this.getContentPane().add(panel);

    }
    private  void colocarEtiquetas(){
        JLabel etiqueta =new JLabel();//creamos un etiqueta de texto
        etiqueta.setText("ingrese nombre: ");
        etiqueta.setBounds(100,100,200,40);
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);//establecemos la lineacion horizontal del texto
        //etiqueta.setOpaque(true);//habilitamos cambiar el fondo de la etiqueta
        etiqueta.setForeground(Color.white);//cambiamos color de las letras
        //etiqueta.setBackground(Color.red);//el color de fondo de la etiqueta
        etiqueta.setFont(new Font("arial",3,20)); //Establecemos el nombre, estilo y el tamaño
        panel.add(etiqueta);

        ImageIcon imagen = new ImageIcon("C:\\Users\\AMD Ryzen\\untitled10\\hi.jpg");
        JLabel etiqueta2 = new JLabel();
        //tambien se puede ocupar el setIcon para insertar la imagen
        etiqueta2.setBounds(80,90,350,350);
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(),etiqueta2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(etiqueta2);

    }
    private  void colocarBotones(){
        //boton 1 boton de texto
        JButton boton1 = new JButton("guardar");
        //boton1.setText("guardar"); // establer el nombre del btoon
        boton1.setBounds(100,100,100,40);
        boton1.setEnabled(true);//establer la interaccion con el boton
        boton1.setMnemonic('a'); //establecemos el alt + letra que elegimos para interactuar con el boton
        boton1.setForeground(Color.blue);
        boton1.setFont(new Font("arial",3,15));
        panel.add(boton1);


        //boton sobre imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,100);
        //boton2.setBackground(Color.blue);//establecemos color de fondo
        ImageIcon save = new ImageIcon("C:\\Users\\AMD Ryzen\\untitled10\\save.jfif");
        boton2.setIcon(new ImageIcon(save.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));
        panel.add(boton2);

        //


    }
    //este tipo de boton son los que hay que  seleccionar en el circulo para ver si son true o false
    private void colocarRadiosBotones(){
        JRadioButton radioBoton1= new JRadioButton("opcion 1", false);
        radioBoton1.setBounds(50,100,100,50);
        panel.add(radioBoton1);
        JRadioButton radioBoton2= new JRadioButton("opcion 2", false);
        radioBoton2.setBounds(50,150,100,50);
        panel.add(radioBoton2);
//esto nos permite agrupar los botones y  que solamente uno pueda ser true y al seleccionar uno los demas seran falsos
        ButtonGroup grupobotones = new ButtonGroup();
        grupobotones.add(radioBoton1);
        grupobotones.add(radioBoton2);

    }

    private void colocarCajasDeTexto(){
        JTextField cajaTexto = new JTextField();
        cajaTexto.setBounds(50,50,200,30);

        panel.add(cajaTexto);
    }
    private  void    colocarAreasDeTexto(){
        JTextArea areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        areaTexto.append("sdfosd");//agrega mas texto al area, esta opcion no esta en la caja de texto
        areaTexto.setEditable(true);//esto permite o ono si se puede editar o no el texto


        panel.add(areaTexto);

    }

    private  void     colocarListasDespegables(){
        String [] nombres = {"pepe","richardo","paisa","ahre"};

        JComboBox listaDespegable = new JComboBox(nombres);
        listaDespegable.setBounds(20,20,100,30);
        listaDespegable.addItem("momo");
        listaDespegable.setSelectedItem("momo");

        panel.add(listaDespegable);

    }


}
