import javax.swing.*;
import java.awt.*;

public class CrudContratistas
{
    
    public CrudContratistas(String TITle)
    {
        //CREO INSTANCIA DE VENTA
    JFrame Window1 = new JFrame(TITle);
    Window1.setTitle("FORMULARIO");
    Window1.setSize(1080,1000);
    Window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Window1.setVisible(true);
    Window1.setLocationRelativeTo(null);
    
    //CREACION DE COLORES
    Color White = new Color(255, 255, 255);
    Color Red = new Color(255, 0, 0);
    Color Blue = new Color(59, 131, 189);
    
    //CREACION DE FUENTE
    Font primaryFont = new Font("Bell MT", Font.BOLD, 20);
    Font secundaryFont = new Font("Arial", Font.PLAIN, 12);
    Font tertiaryFont = new Font("Arial", Font.PLAIN, 15);
    Font quaternaryFont = new Font("Arial", Font.PLAIN, 10);
    //CREACION DE PANEL
    JPanel PANEL1 = new JPanel();
    Window1.add(PANEL1);
    PANEL1.setLayout(null);
    PANEL1.setBackground(White);
    
    
    //CREACION DE TITULOS
    JLabel LabelTI1 = new JLabel();
    LabelTI1.setText("DATOS PERSONALES");
    LabelTI1.setBounds(30, 10, 210, 25);
    LabelTI1.setFont(primaryFont);
    LabelTI1.setForeground(Red);
    
    JLabel LabelTI2 = new JLabel();
    LabelTI2.setText("DATOS EDUCATIVO");
    LabelTI2.setBounds(30, 195, 210, 25);
    LabelTI2.setFont(primaryFont);
    LabelTI2.setForeground(Red);
    
    JLabel LabelTI3 = new JLabel();
    LabelTI3.setText("REFERENCIAS FAMILIARES");
    LabelTI3.setBounds(30, 380, 310, 25);
    LabelTI3.setFont(primaryFont);
    LabelTI3.setForeground(Red);
    
    
    
    //CREACION DE FORMULARIO
    JLabel LabelName = new JLabel("Nombre:");
    LabelName.setBounds(20, 50, 165, 25);
    LabelName.setFont(secundaryFont);
    JTextField fieldNombre = new JTextField();
    fieldNombre.setBounds(70, 50, 145, 25);
    
    JLabel LabelSurname = new JLabel("Apellido:");
    LabelSurname.setBounds(250, 50, 165, 25);
    LabelSurname.setFont(secundaryFont);
    JTextField fieldApellido = new JTextField();
    fieldApellido.setBounds(300, 50, 145, 25);
    
    JLabel LabelAddress = new JLabel("Direccion:");
    LabelAddress.setBounds(20, 110, 165, 25);
    LabelAddress.setFont(secundaryFont);
    JTextField fieldDireccion = new JTextField();
    fieldDireccion.setBounds(80, 110, 185, 25);
    
    JLabel LabelIdent = new JLabel("Identificacion:");
    LabelIdent.setBounds(730, 50, 165, 25);
    LabelIdent.setFont(secundaryFont);
    JTextField fieldIdent = new JTextField();
    fieldIdent.setBounds(810, 50, 165, 25);
    
    JLabel LabelMail = new JLabel("Correo Electronico:");
    LabelMail.setBounds(300, 110, 165, 25);
    LabelMail.setFont(secundaryFont);
    JTextField fieldCorreoE = new JTextField();
    fieldCorreoE.setBounds(407, 110, 185, 25);
    
    JLabel LabelPhone = new JLabel("Telefono:");
    LabelPhone.setBounds(645, 110, 165, 25);
    LabelPhone.setFont(secundaryFont);
    JTextField fieldTelefono = new JTextField();
    fieldTelefono.setBounds(697, 110, 185, 25);
    
    JLabel LabelBachi = new JLabel("Bachillerato:");
    LabelBachi.setBounds(20, 240, 165, 25);
    LabelBachi.setFont(secundaryFont);
    JTextField fieldBachi = new JTextField();
    fieldBachi.setBounds(90, 240, 185, 25);
    
    JLabel LabelUniver = new JLabel("Universitario:");
    LabelUniver.setBounds(20, 290, 165, 25);
    LabelUniver.setFont(secundaryFont);
    JTextField fieldUniver = new JTextField();
    fieldUniver.setBounds(93, 290, 185, 25);
    
    JLabel LabelINTS1 = new JLabel("Instituto:");
    LabelINTS1.setBounds(650, 240, 165, 25);
    LabelINTS1.setFont(secundaryFont);
    JTextField fieldINST1 = new JTextField();
    fieldINST1.setBounds(700, 240, 185, 25);
    
    JLabel LabelINTS2 = new JLabel("Instituto:");
    LabelINTS2.setBounds(650, 290, 165, 25);
    LabelINTS2.setFont(secundaryFont);
    JTextField fieldINST2 = new JTextField();
    fieldINST2.setBounds(700, 290, 185, 25);
    
    JLabel LabelName1 = new JLabel("Nombre:");
    LabelName1.setBounds(20, 430, 165, 25);
    LabelName1.setFont(secundaryFont);
    JTextField fieldNOM1 = new JTextField();
    fieldNOM1.setBounds(70, 430, 185, 25);
    
    JLabel LabelName2 = new JLabel("Nombre:");
    LabelName2.setBounds(20, 480, 165, 25);
    LabelName2.setFont(secundaryFont);
    JTextField fieldNOM2 = new JTextField();
    fieldNOM2.setBounds(70, 480, 185, 25);
    
    JLabel LabelPhone1 = new JLabel("Telefono:");
    LabelPhone1.setBounds(650, 430, 165, 25);
    LabelPhone1.setFont(secundaryFont);
    JTextField fieldTELF1 = new JTextField();
    fieldTELF1.setBounds(703, 430, 185, 25);
    
    JLabel LabelPhone2 = new JLabel("Telefono:");
    LabelPhone2.setBounds(650, 480, 165, 25);
    LabelPhone2.setFont(secundaryFont);
    JTextField fieldTELF2 = new JTextField();
    fieldTELF2.setBounds(703, 480, 185, 25);
    
    JLabel LabelPART1 = new JLabel("Parentesco");
    LabelPART1.setBounds(420, 430, 165, 25);
    LabelPART1.setFont(secundaryFont);
    JComboBox BoxPART1 = new JComboBox();
    BoxPART1.setBounds(495, 430, 100, 25);
    BoxPART1.addItem("ESPOSA/O");
    BoxPART1.addItem("AMIGO");
    BoxPART1.addItem("TIO/A");
    BoxPART1.addItem("PRIMO/A");
    BoxPART1.addItem("ABUELO/A");
    BoxPART1.addItem("MADRE");
    BoxPART1.addItem("PADRE");
    
    JLabel LabelPART2 = new JLabel("Parentesco");
    LabelPART2.setBounds(420, 480, 165, 25);
    LabelPART2.setFont(secundaryFont);
    JComboBox BoxPART2 = new JComboBox();
    BoxPART2.setBounds(495, 480, 100, 25);
    BoxPART2.addItem("ESPOSA/O");
    BoxPART2.addItem("AMIGO");
    BoxPART2.addItem("TIO/A");
    BoxPART2.addItem("PRIMO/A");
    BoxPART2.addItem("ABUELO/A");
    BoxPART2.addItem("MADRE");
    BoxPART2.addItem("PADRE");
    
    JLabel LabelYear1 = new JLabel("Año de finalizacion");
    LabelYear1.setBounds(370, 240, 165, 25);
    LabelYear1.setFont(secundaryFont);
    JComboBox BoxYear1 = new JComboBox();
    BoxYear1.setBounds(495, 240, 80, 25);
    BoxYear1.addItem("2000");
    BoxYear1.addItem("2005");
    BoxYear1.addItem("2010");
    BoxYear1.addItem("2015");
    BoxYear1.addItem("2020");
    
   JLabel LabelYear2 = new JLabel("Año de finalizacion");
    LabelYear2.setBounds(370, 290, 165, 25);
    LabelYear2.setFont(secundaryFont);
    JComboBox BoxYear2 = new JComboBox();
    BoxYear2.setBounds(495, 290, 80, 25);
    BoxYear2.addItem("2000");
    BoxYear2.addItem("2005");
    BoxYear2.addItem("2010");
    BoxYear2.addItem("2015");
    BoxYear2.addItem("2020");
    
    JLabel LabelTipo = new JLabel("Tipo:");
    LabelTipo.setBounds(510, 50, 165, 25);
    LabelTipo.setFont(secundaryFont);
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
    BOT1.setForeground(White);
    BOT1.setFont(tertiaryFont);
    BOT1.setBackground(Blue);
    
    JButton BOT2 = new JButton();
    BOT2.setBounds(315, 650, 80, 25);
    BOT2.setText(">>");
    BOT2.setForeground(White);
    BOT2.setFont(tertiaryFont);
    BOT2.setBackground(Blue);
    
    JButton BOT3 = new JButton();
    BOT3.setBounds(152, 650, 80, 25);
    BOT3.setText("<");
    BOT3.setForeground(White);
    BOT3.setFont(tertiaryFont);
    BOT3.setBackground(Blue);
    
    JButton BOT4 = new JButton();
    BOT4.setBounds(233, 650, 80, 25);
    BOT4.setText(">");
    BOT4.setForeground(White);
    BOT4.setFont(tertiaryFont);
    BOT4.setBackground(Blue);
    
    JButton BOT5 = new JButton();
    BOT5.setBounds(708, 650, 80, 25);
    BOT5.setText("+");
    BOT5.setForeground(White);
    BOT5.setFont(tertiaryFont);
    BOT5.setBackground(Blue);
    
    JButton BOT6 = new JButton();
    BOT6.setBounds(790, 650, 80, 25);
    BOT6.setText("SALIR");
    BOT6.setForeground(White);
    BOT6.setFont(tertiaryFont);
    BOT6.setBackground(Blue);
    
    JButton BOT7 = new JButton();
    BOT7.setBounds(708, 682,80, 25);
    BOT7.setText("SALVAR");
    BOT7.setForeground(White);
    BOT7.setFont(quaternaryFont);
    BOT7.setBackground(Blue);
    
    //AGREGAR A PANEL
    PANEL1.add(LabelName);
    PANEL1.add(LabelSurname);
    PANEL1.add(LabelAddress);
    PANEL1.add(LabelMail);
    PANEL1.add(LabelTI1);
    PANEL1.add(LabelTI2);
    PANEL1.add(LabelTI3);
    PANEL1.add(LabelIdent);
    PANEL1.add(LabelTipo);
    PANEL1.add(LabelPhone);
    PANEL1.add(LabelBachi);
    PANEL1.add(LabelUniver);
    PANEL1.add(LabelYear1);
    PANEL1.add(LabelYear2);
    PANEL1.add(LabelINTS1);
    PANEL1.add(LabelINTS2);
    PANEL1.add(LabelName1);
    PANEL1.add(LabelName2);
    PANEL1.add(LabelPART1);
    PANEL1.add(LabelPART2);
    PANEL1.add(LabelPhone1);
    PANEL1.add(LabelPhone2);
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
    PANEL1.add(BoxYear1);
    PANEL1.add(BoxYear2);
    PANEL1.add(BoxPART1);
    PANEL1.add(BoxPART2);
    PANEL1.add(BOT1);
    PANEL1.add(BOT3);
    PANEL1.add(BOT4);
    PANEL1.add(BOT2);
    PANEL1.add(BOT5);
    PANEL1.add(BOT6);
    PANEL1.add(BOT7);
    }

  
}
