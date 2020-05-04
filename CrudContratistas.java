import javax.swing.*;
import java.awt.*;

public class CrudContratistas
{
    
    public CrudContratistas(String TITle)
    {
        //CREO INSTANCIA DE VENTA
    JFrame VENTANA1 = new JFrame(TITle);
    VENTANA1.setSize(1080,1000);
    VENTANA1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    VENTANA1.setVisible(true);
    //CREACION DE COLORES
    Color Blanco = new Color(255, 255, 255);
    Color Rojo = new Color(255, 0, 0);
    Color Azul = new Color(59, 131, 189); 
    //CREACION DE PANEL
    JPanel PANEL1 = new JPanel();
    
    VENTANA1.add(PANEL1);
    PANEL1.setLayout(null);
    PANEL1.setBackground(Blanco);
    
    
    //CREACION DE TITULOS
    JLabel LabelTI1 = new JLabel();
    LabelTI1.setText("DATOS PERSONALES");
    LabelTI1.setBounds(30, 10, 210, 25);
    LabelTI1.setFont(new Font("Bell MT", Font.BOLD, 20));
    LabelTI1.setForeground(Rojo);
    
    JLabel LabelTI2 = new JLabel();
    LabelTI2.setText("DATOS EDUCATIVO");
    LabelTI2.setBounds(30, 195, 210, 25);
    LabelTI2.setFont(new Font("Bell MT", Font.BOLD, 20));
    LabelTI2.setForeground(Rojo);
    
    JLabel LabelTI3 = new JLabel();
    LabelTI3.setText("REFERENCIAS FAMILIARES");
    LabelTI3.setBounds(30, 380, 310, 25);
    LabelTI3.setFont(new Font("Bell MT", Font.BOLD, 20));
    LabelTI3.setForeground(Rojo);
    
    
    
    //CREACION DE FORMULARIO
    JLabel LabelNombre = new JLabel("Nombre:");
    LabelNombre.setBounds(20, 50, 165, 25);
    LabelNombre.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldNombre = new JTextField();
    fieldNombre.setBounds(70, 50, 145, 25);
    
    JLabel LabelApellido = new JLabel("Apellido:");
    LabelApellido.setBounds(250, 50, 165, 25);
    LabelApellido.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldApellido = new JTextField();
    fieldApellido.setBounds(300, 50, 145, 25);
    
    JLabel LabelDireccion = new JLabel("Direccion:");
    LabelDireccion.setBounds(20, 110, 165, 25);
    LabelDireccion.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldDireccion = new JTextField();
    fieldDireccion.setBounds(80, 110, 185, 25);
    
    JLabel LabelIdent = new JLabel("Identificacion:");
    LabelIdent.setBounds(730, 50, 165, 25);
    LabelIdent.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldIdent = new JTextField();
    fieldIdent.setBounds(810, 50, 165, 25);
    
    JLabel LabelCorreoE = new JLabel("Correo Electronico:");
    LabelCorreoE.setBounds(300, 110, 165, 25);
    LabelCorreoE.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldCorreoE = new JTextField();
    fieldCorreoE.setBounds(407, 110, 185, 25);
    
    JLabel LabelTelefono = new JLabel("Telefono:");
    LabelTelefono.setBounds(645, 110, 165, 25);
    LabelTelefono.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldTelefono = new JTextField();
    fieldTelefono.setBounds(697, 110, 185, 25);
    
    JLabel LabelBachi = new JLabel("Bachillerato:");
    LabelBachi.setBounds(20, 240, 165, 25);
    LabelBachi.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldBachi = new JTextField();
    fieldBachi.setBounds(90, 240, 185, 25);
    
    JLabel LabelUniver = new JLabel("Universitario:");
    LabelUniver.setBounds(20, 290, 165, 25);
    LabelUniver.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldUniver = new JTextField();
    fieldUniver.setBounds(93, 290, 185, 25);
    
    JLabel LabelINTS1 = new JLabel("Instituto:");
    LabelINTS1.setBounds(650, 240, 165, 25);
    LabelINTS1.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldINST1 = new JTextField();
    fieldINST1.setBounds(700, 240, 185, 25);
    
    JLabel LabelINTS2 = new JLabel("Instituto:");
    LabelINTS2.setBounds(650, 290, 165, 25);
    LabelINTS2.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldINST2 = new JTextField();
    fieldINST2.setBounds(700, 290, 185, 25);
    
    JLabel LabelNOM1 = new JLabel("Nombre:");
    LabelNOM1.setBounds(20, 430, 165, 25);
    LabelNOM1.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldNOM1 = new JTextField();
    fieldNOM1.setBounds(70, 430, 185, 25);
    
    JLabel LabelNOM2 = new JLabel("Nombre:");
    LabelNOM2.setBounds(20, 480, 165, 25);
    LabelNOM2.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldNOM2 = new JTextField();
    fieldNOM2.setBounds(70, 480, 185, 25);
    
    JLabel LabelTELF1 = new JLabel("Telefono:");
    LabelTELF1.setBounds(650, 430, 165, 25);
    LabelTELF1.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldTELF1 = new JTextField();
    fieldTELF1.setBounds(703, 430, 185, 25);
    
    JLabel LabelTELF2 = new JLabel("Telefono:");
    LabelTELF2.setBounds(650, 480, 165, 25);
    LabelTELF2.setFont(new Font("Arial", Font.PLAIN, 12));
    JTextField fieldTELF2 = new JTextField();
    fieldTELF2.setBounds(703, 480, 185, 25);
    
    JLabel LabelPART1 = new JLabel("Parentesco");
    LabelPART1.setBounds(420, 430, 165, 25);
    LabelPART1.setFont(new Font("Arial", Font.PLAIN, 12));
    JComboBox BoxPART1 = new JComboBox();
    BoxPART1.setBounds(495, 430, 100, 25);
    BoxPART1.addItem("ESPOSA/O");
    BoxPART1.addItem("AMIGO");
    BoxPART1.addItem("TIO/A");
    BoxPART1.addItem("PRIMO/A");
    BoxPART1.addItem("ABUELO/A");
    
    JLabel LabelPART2 = new JLabel("Parentesco");
    LabelPART2.setBounds(420, 480, 165, 25);
    LabelPART2.setFont(new Font("Arial", Font.PLAIN, 12));
    JComboBox BoxPART2 = new JComboBox();
    BoxPART2.setBounds(495, 480, 100, 25);
    BoxPART2.addItem("ESPOSA/O");
    BoxPART2.addItem("AMIGO");
    BoxPART2.addItem("TIO/A");
    BoxPART2.addItem("PRIMO/A");
    BoxPART2.addItem("ABUELO/A");
    
    JLabel LabelAÑO1 = new JLabel("Año de finalizacion");
    LabelAÑO1.setBounds(370, 240, 165, 25);
    LabelAÑO1.setFont(new Font("Arial", Font.PLAIN, 12));
    JComboBox BoxAÑO1 = new JComboBox();
    BoxAÑO1.setBounds(495, 240, 80, 25);
    BoxAÑO1.addItem("2000");
    BoxAÑO1.addItem("2005");
    BoxAÑO1.addItem("2010");
    BoxAÑO1.addItem("2015");
    BoxAÑO1.addItem("2020");
    
   JLabel LabelAÑO2 = new JLabel("Año de finalizacion");
    LabelAÑO2.setBounds(370, 290, 165, 25);
    LabelAÑO2.setFont(new Font("Arial", Font.PLAIN, 12));
    JComboBox BoxAÑO2 = new JComboBox();
    BoxAÑO2.setBounds(495, 290, 80, 25);
    BoxAÑO2.addItem("2000");
    BoxAÑO2.addItem("2005");
    BoxAÑO2.addItem("2010");
    BoxAÑO2.addItem("2015");
    BoxAÑO2.addItem("2020");
    
    JLabel LabelTipo = new JLabel("Tipo:");
    LabelTipo.setBounds(510, 50, 165, 25);
    LabelTipo.setFont(new Font("Arial", Font.PLAIN, 12));
    JComboBox BoxTipo = new JComboBox();
    BoxTipo.setBounds(540, 50, 165, 25);
    BoxTipo.addItem("CEDULA");
    BoxTipo.addItem("T.IDENTIDAD");
    BoxTipo.addItem("PASAPORTE");
    BoxTipo.addItem("CEDULA EXT");
    
    //CREACION DE BOTONES
    JButton BOT1 = new JButton();
    BOT1.setBounds(70, 650, 80, 25);
    BOT1.setText("<<");
    BOT1.setForeground(Blanco);
    BOT1.setFont(new Font("Bell MT", Font.BOLD, 15));
    BOT1.setBackground(Azul);
    
    JButton BOT2 = new JButton();
    BOT2.setBounds(315, 650, 80, 25);
    BOT2.setText(">>");
    BOT2.setForeground(Blanco);
    BOT2.setFont(new Font("Bell MT", Font.BOLD, 15));
    BOT2.setBackground(Azul);
    
    JButton BOT3 = new JButton();
    BOT3.setBounds(152, 650, 80, 25);
    BOT3.setText("<");
    BOT3.setForeground(Blanco);
    BOT3.setFont(new Font("Bell MT", Font.BOLD, 15));
    BOT3.setBackground(Azul);
    
    JButton BOT4 = new JButton();
    BOT4.setBounds(233, 650, 80, 25);
    BOT4.setText(">");
    BOT4.setForeground(Blanco);
    BOT4.setFont(new Font("Bell MT", Font.BOLD, 15));
    BOT4.setBackground(Azul);
    
    JButton BOT5 = new JButton();
    BOT5.setBounds(708, 650, 80, 25);
    BOT5.setText("+");
    BOT5.setForeground(Blanco);
    BOT5.setFont(new Font("Bell MT", Font.BOLD, 15));
    BOT5.setBackground(Azul);
    
    
    
    JButton BOT6 = new JButton();
    BOT6.setBounds(790, 650, 80, 25);
    BOT6.setText("SALIR");
    BOT6.setForeground(Blanco);
    BOT6.setFont(new Font("Bell MT", Font.BOLD, 15));
    BOT6.setBackground(Azul);
    
    //AGREGAR A PANEL
    PANEL1.add(LabelNombre);
    PANEL1.add(LabelApellido);
    PANEL1.add(LabelDireccion);
    PANEL1.add(LabelCorreoE);
    PANEL1.add(LabelTI1);
    PANEL1.add(LabelTI2);
    PANEL1.add(LabelTI3);
    PANEL1.add(LabelIdent);
    PANEL1.add(LabelTipo);
    PANEL1.add(LabelTelefono);
    PANEL1.add(LabelBachi);
    PANEL1.add(LabelUniver);
    PANEL1.add(LabelAÑO1);
    PANEL1.add(LabelAÑO2);
    PANEL1.add(LabelINTS1);
    PANEL1.add(LabelINTS2);
    PANEL1.add(LabelNOM1);
    PANEL1.add(LabelNOM2);
    PANEL1.add(LabelPART1);
    PANEL1.add(LabelPART2);
    PANEL1.add(LabelTELF1);
    PANEL1.add(LabelTELF2);
    PANEL1.add(fieldNombre);
    PANEL1.add(fieldApellido);
    PANEL1.add(fieldDireccion);
    PANEL1.add(fieldIdent);
    PANEL1.add(fieldCorreoE);
    PANEL1.add(fieldTelefono);
    PANEL1.add(fieldBachi);
    PANEL1.add(fieldUniver);
    PANEL1.add(fieldINST1);
    PANEL1.add(fieldINST2);
    PANEL1.add(fieldNOM1);
    PANEL1.add(fieldNOM2);
    PANEL1.add(fieldTELF1);
    PANEL1.add(fieldTELF2);
    PANEL1.add(BoxTipo);
    PANEL1.add(BoxAÑO1);
    PANEL1.add(BoxAÑO2);
    PANEL1.add(BoxPART1);
    PANEL1.add(BoxPART2);
    PANEL1.add(BOT1);
    PANEL1.add(BOT3);
    PANEL1.add(BOT4);
    PANEL1.add(BOT2);
    PANEL1.add(BOT5);
    PANEL1.add(BOT6);
    }

  
}
