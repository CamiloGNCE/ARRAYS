import javax.swing.*;

public class CrudContratistas
{
   
    public CrudContratistas(String TITle)
    {
        //CREO INSTANCIA DE VENTA
    JFrame VENTANA1 = new JFrame(TITle);
    VENTANA1.setSize(400,400);
    VENTANA1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    VENTANA1.setVisible(true);
    
    JPanel PANEL1 = new JPanel();
    
    VENTANA1.add(PANEL1);
    PANEL1.setLayout(null);
    
    JLabel LabelNombre = new JLabel("Nombre Completo");
    LabelNombre.setBounds(100, 20, 165, 25);
    
    JLabel LabelApellido = new JLabel("Apellidos");
    LabelApellido.setBounds(100, 40, 165, 25);
    
    PANEL1.add(LabelNombre);
    PANEL1.add(LabelApellido);
    
    }

  
}
