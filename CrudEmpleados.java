import javax.swing.*;
import java.awt.*;

public class CrudEmpleados extends JFrame
{
    /**CREACION DE COLORES**/
    Color white = new Color(255, 255, 255);
    Color red = new Color(255, 0, 0);
    Color blue = new Color(59, 131, 189);
    
    /**CREACION DE FUENTE**/
    Font primaryFont = new Font("Bell MT", Font.BOLD, 20);
    Font secundaryFont = new Font("Arial", Font.PLAIN, 12);
    Font tertiaryFont = new Font("Arial", Font.PLAIN, 15);
    Font quaternaryFont = new Font("Arial", Font.PLAIN, 10);
    
    /**CREACION DE PANEL**/
    JPanel container = new JPanel();
    
    /**CREACION DE ETIQUETAS**/
    JLabel ldata1 = new JLabel();
    JLabel ldata2 = new JLabel();
    JLabel ldata3 = new JLabel();
    JLabel lname = new JLabel();
    JLabel lsurname = new JLabel();
    JLabel laddress = new JLabel();
    JLabel labelIdent = new JLabel();
    JLabel labelMail = new JLabel();
    JLabel labelPhone = new JLabel();
    JLabel labelBachi = new JLabel();
    JLabel labelUniver = new JLabel();
    JLabel labelINTS1 = new JLabel();
    JLabel labelINTS2 = new JLabel();
    JLabel labelName1 = new JLabel();
    JLabel labelName2 = new JLabel();
    JLabel labelPhone1 = new JLabel();
    JLabel labelPhone2 = new JLabel();
    JLabel labelPART1 = new JLabel();
    JLabel labelPART2 = new JLabel();
    JLabel labelYear1 = new JLabel();
    JLabel labelYear2 = new JLabel();
    JLabel labelTipo = new JLabel();
    
    /**CREACION DE INPUTS**/
    JTextField fieldNombre = new JTextField();
    JTextField fieldApellido = new JTextField();
    JTextField fieldDireccion = new JTextField();
    JTextField fieldIdent = new JTextField();
    JTextField fieldCorreoE = new JTextField();
    JTextField fieldTelefono = new JTextField();
    JTextField fieldBachi = new JTextField();
    JTextField fieldUniver = new JTextField();
    JTextField fieldINST1 = new JTextField();
    JTextField fieldINST2 = new JTextField();
    JTextField fieldNOM1 = new JTextField();
    JTextField fieldNOM2 = new JTextField();
    JTextField fieldTELF1 = new JTextField();
    JTextField fieldTELF2 = new JTextField();
    
    /**CREACION DE JCOMBOBOX**/
    JComboBox boxPART1 = new JComboBox();
    JComboBox boxPART2 = new JComboBox();
    JComboBox boxYear1 = new JComboBox();
    JComboBox boxYear2 = new JComboBox();
    JComboBox boxTipo = new JComboBox();
    
    /**CREACION DE JBUTTON**/
    JButton bot1 = new JButton();
    JButton bot2 = new JButton();
    JButton bot3 = new JButton();
    JButton bot4 = new JButton();
    JButton bot5 = new JButton();
    JButton bot6 = new JButton();
    JButton bot7 = new JButton();
    
    public CrudEmpleados()
    { 
    confiWindows();
    add(container);
    }
    
    /**CREO LA CONFIG DE VENTANA**/
    public void confiWindows()
    {
    setTitle("FORMULARIO");
    setSize(1080,1000);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    setLocationRelativeTo(null);
    container.setLayout(null);
    container.setBackground(white);
    
    //LLAMAR A LOS LABELS//
    confiLabel();
    container.add(ldata1);
    container.add(ldata2);
    container.add(ldata3);
    container.add(lname);
    container.add(lsurname);
    container.add(laddress);
    container.add(labelIdent);
    container.add(labelMail);
    container.add(labelPhone);
    container.add(labelBachi);
    container.add(labelUniver);
    container.add(labelINTS1);
    container.add(labelINTS2);
    container.add(labelName1);
    container.add(labelName2);
    container.add(labelPhone1);
    container.add(labelPhone2);
    container.add(labelPART1);
    container.add(labelPART2);
    container.add(labelYear1);
    container.add(labelYear2);
    container.add(labelTipo);
    
    //LLAMAR A LOS JTEXTFIELD//
    confiJtextField();
    container.add(fieldNombre);
    container.add(fieldApellido);
    container.add(fieldDireccion);
    container.add(fieldIdent);
    container.add(fieldCorreoE);
    container.add(fieldTelefono);
    container.add(fieldBachi);
    container.add(fieldUniver);
    container.add(fieldINST1);
    container.add(fieldINST2);
    container.add(fieldNOM1);
    container.add(fieldNOM2);
    container.add(fieldTELF1);
    container.add(fieldTELF2);
    
    //LLAMAR A LOS JCOMBOBOX//
    confiJcomboBox();
    container.add(boxPART1);
    container.add(boxPART2);
    container.add(boxYear1);
    container.add(boxYear2);
    container.add(boxTipo);
    
    //LLAMAR A LOS JBUTTON//
    confiJbutton();
    container.add(bot1);
    container.add(bot2);
    container.add(bot3);
    container.add(bot4);
    container.add(bot5);
    container.add(bot6);
    container.add(bot7);
    
    }
  
    /**CREO LA CONFIG DE LABEL**/
    public void confiLabel()
    {
    ldata1.setText("DATOS PERSONALES");
    ldata1.setBounds(30, 10, 210, 25);
    ldata1.setFont(primaryFont);
    ldata1.setForeground(red);
    
    ldata2.setText("DATOS EDUCATIVO");
    ldata2.setBounds(30, 195, 210, 25);
    ldata2.setFont(primaryFont);
    ldata2.setForeground(red);
    
    ldata3.setText("REFERENCIAS FAMILIARES");
    ldata3.setBounds(30, 380, 310, 25);
    ldata3.setFont(primaryFont);
    ldata3.setForeground(red);
    
    lname.setBounds(20, 50, 165, 25);
    lname.setFont(secundaryFont);
    
    lsurname.setBounds(250, 50, 165, 25);
    lsurname.setFont(secundaryFont);
    
    laddress.setBounds(20, 110, 165, 25);
    laddress.setFont(secundaryFont);
    
    labelIdent.setText("Identificacion:");
    labelIdent.setBounds(730, 50, 165, 25);
    labelIdent.setFont(secundaryFont);
    
    labelMail.setText("Correo Electronico:");
    labelMail.setBounds(300, 110, 165, 25);
    labelMail.setFont(secundaryFont);
    
    labelPhone.setText("Telefono:");
    labelPhone.setBounds(645, 110, 165, 25);
    labelPhone.setFont(secundaryFont);
    
    labelBachi.setText("Bachillerato:");
    labelBachi.setBounds(20, 240, 165, 25);
    labelBachi.setFont(secundaryFont);
    
    labelUniver.setText("Universitario:");
    labelUniver.setBounds(20, 290, 165, 25);
    labelUniver.setFont(secundaryFont);
    
    labelINTS1.setText("Instituto:");
    labelINTS1.setBounds(650, 240, 165, 25);
    labelINTS1.setFont(secundaryFont);
    
    labelINTS2.setText("Instituto:");
    labelINTS2.setBounds(650, 290, 165, 25);
    labelINTS2.setFont(secundaryFont);
    
    labelName1.setText("Nombre:");
    labelName1.setBounds(20, 430, 165, 25);
    labelName1.setFont(secundaryFont);
    
    labelName2.setText("Nombre:");
    labelName2.setBounds(20, 480, 165, 25);
    labelName2.setFont(secundaryFont);
    
    labelPhone1.setText("Telefono:");
    labelPhone1.setBounds(650, 430, 165, 25);
    labelPhone1.setFont(secundaryFont);
    
    labelPhone2.setText("Telefono:");
    labelPhone2.setBounds(650, 480, 165, 25);
    labelPhone2.setFont(secundaryFont);
    
    labelPART1.setText("Parentesco");
    labelPART1.setBounds(420, 430, 165, 25);
    labelPART1.setFont(secundaryFont);
    
    labelPART2.setText("Parentesco");
    labelPART2.setBounds(420, 480, 165, 25);
    labelPART2.setFont(secundaryFont);
    
    labelYear1.setText("Año de finalizacion");
    labelYear1.setBounds(370, 240, 165, 25);
    labelYear1.setFont(secundaryFont);
    
    labelYear2.setText("Año de finalizacion");
    labelYear2.setBounds(370, 290, 165, 25);
    labelYear2.setFont(secundaryFont);
    
    labelTipo.setText("Tipo:");
    labelTipo.setBounds(510, 50, 165, 25);
    labelTipo.setFont(secundaryFont);
    }
    
    /**CREO LA CONFIG DE JTEXTFIELD**/
    public void confiJtextField()
    {
    fieldNombre.setBounds(70, 50, 145, 25);
    fieldApellido.setBounds(300, 50, 145, 25);
    fieldDireccion.setBounds(80, 110, 185, 25);
    fieldIdent.setBounds(810, 50, 165, 25);
    fieldCorreoE.setBounds(407, 110, 185, 25);
    fieldTelefono.setBounds(697, 110, 185, 25);
    fieldBachi.setBounds(90, 240, 185, 25);
    fieldUniver.setBounds(93, 290, 185, 25);
    fieldINST1.setBounds(700, 240, 185, 25);
    fieldINST2.setBounds(700, 290, 185, 25);
    fieldNOM1.setBounds(70, 430, 185, 25);
    fieldNOM2.setBounds(70, 480, 185, 25);
    fieldTELF1.setBounds(703, 430, 185, 25);
    fieldTELF2.setBounds(703, 480, 185, 25);
    }
    
    /**CREO LA CONFIG DE JCOMBOBOX**/
    public void confiJcomboBox()
    {
    boxPART1.setBounds(495, 430, 100, 25);
    boxPART1.addItem("ESPOSA/O");
    boxPART1.addItem("AMIGO");
    boxPART1.addItem("TIO/A");
    boxPART1.addItem("PRIMO/A");
    boxPART1.addItem("ABUELO/A");
    boxPART1.addItem("MADRE");
    boxPART1.addItem("PADRE");
    
    boxPART2.setBounds(495, 480, 100, 25);
    boxPART2.addItem("ESPOSA/O");
    boxPART2.addItem("AMIGO");
    boxPART2.addItem("TIO/A");
    boxPART2.addItem("PRIMO/A");
    boxPART2.addItem("ABUELO/A");
    boxPART2.addItem("MADRE");
    boxPART2.addItem("PADRE");
    
    boxYear1.setBounds(495, 240, 80, 25);
    boxYear1.addItem("2000");
    boxYear1.addItem("2005");
    boxYear1.addItem("2010");
    boxYear1.addItem("2015");
    boxYear1.addItem("2020");
    
    boxYear2.setBounds(495, 290, 80, 25);
    boxYear2.addItem("2000");
    boxYear2.addItem("2005");
    boxYear2.addItem("2010");
    boxYear2.addItem("2015");
    boxYear2.addItem("2020");
    
    boxTipo.setBounds(540, 50, 165, 25);
    boxTipo.addItem("CEDULA");
    boxTipo.addItem("T.IDENTIDAD");
    boxTipo.addItem("PASAPORTE");
    boxTipo.addItem("CEDULA EXT");
    }
    
    /**CREO LA CONFIG DE JBUTTON**/
    public void confiJbutton()
    {
    bot1.setBounds(70, 650, 80, 25);
    bot1.setText("<<");
    bot1.setForeground(white);
    bot1.setFont(tertiaryFont);
    bot1.setBackground(blue);
      
    bot2.setBounds(315, 650, 80, 25);
    bot2.setText(">>");
    bot2.setForeground(white);
    bot2.setFont(tertiaryFont);
    bot2.setBackground(blue);
     
    bot3.setBounds(152, 650, 80, 25);
    bot3.setText("<");
    bot3.setForeground(white);
    bot3.setFont(tertiaryFont);
    bot3.setBackground(blue);
      
    bot4.setBounds(233, 650, 80, 25);
    bot4.setText(">");
    bot4.setForeground(white);
    bot4.setFont(tertiaryFont);
    bot4.setBackground(blue);
     
    bot5.setBounds(708, 650, 80, 25);
    bot5.setText("+");
    bot5.setForeground(white);
    bot5.setFont(tertiaryFont);
    bot5.setBackground(blue);
     
    bot6.setBounds(790, 650, 80, 25);
    bot6.setText("SALIR");
    bot6.setForeground(white);
    bot6.setFont(tertiaryFont);
    bot6.setBackground(blue);
    
    bot7.setBounds(708, 682,80, 25);
    bot7.setText("SALVAR");
    bot7.setForeground(white);
    bot7.setFont(quaternaryFont);
    bot7.setBackground(blue);
    }
}

