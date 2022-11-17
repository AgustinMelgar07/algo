import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class ConjuntoName extends JFrame {
    private JPanel panel1;
    private JTextField texto;
    private JButton botonGuardar;
    String[] conjnom = new String[10];

    public ConjuntoName() {
        setSize(400, 300);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setContentPane(panel1);
        colocarBotones();
        colocarCajasDeTexto();
    }

    ;

    private void colocarCajasDeTexto() {
        texto = new JTextField();

        System.out.println(texto);
    }

    private void colocarBotones() {
        botonGuardar = new JButton("guardar");

        botonGuardar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {

                String textoEscrito = texto.getText();
                System.out.println("El texto copiado es " + textoEscrito + texto.getText());
                conjnom[0] = textoEscrito;
                try {
                    FileWriter crearficherodenombres = new FileWriter(" C:\\Users\\AMD Ryzen\\untitled10\\name.txt", true);

                    for (int i = 0; i < textoEscrito.length(); i++) {
                        crearficherodenombres.write(textoEscrito.charAt(i));
                    }
                    crearficherodenombres.write("\n");
                    crearficherodenombres.close();
                } catch (IOException a) {
                    a.printStackTrace();
                }

            }
        });

    }
}