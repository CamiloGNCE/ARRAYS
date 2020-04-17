
public class PERSONA
{
    String NOMBRE;
    String APELLIDO;
    String TELEFONO;
    String MOVIL;
    String DIRECCION;
    String FECHA_NACIMIENTO;
    String LUGAR_NACIMIENTO;
    //CONSTRUCTOR 
    public PERSONA()
    {
   
    }
    
    public PERSONA(String NOM,String APE,String TELF,String MOV,String DIRC,String FN,String LN){
     this.NOMBRE = NOM;
     this.APELLIDO = APE;
     this.TELEFONO = TELF;
     this.MOVIL = MOV;
     this.DIRECCION = DIRC;
     this.FECHA_NACIMIENTO = FN;
     this.LUGAR_NACIMIENTO = LN;
    }
    //CREANDO LOS SETTERS
    public void setNOMBRE(String NOM){
     this.NOMBRE = NOM;
    }
    
    public void setAPELLIDO(String APE){
    this.APELLIDO = APE;
    }
    
    public void setTELEFONO(String TELF){
    this.TELEFONO = TELF;
    }
    
    public void setMOVIL(String MOV){
    this.MOVIL = MOV;
    }
    
    public void setDIRECCION(String DIRC){
    this.DIRECCION = DIRC;
    }
    
    public void setFECHA_NACIMIENTO(String FN){
    this.FECHA_NACIMIENTO = FN;
    }
    
    public void setLUGAR_NACIMIENTO(String LN){
    this.LUGAR_NACIMIENTO = LN;
    }
    
    //CREANDO LOS GETTERS
    public String getNOMBRE(){
     return this.NOMBRE;
    }
    
    public String getAPELLIDO(){
     return this.APELLIDO;
    }
    
    public String getTELEFONO(){
     return this.TELEFONO;
    }
    
    public String getMOVIL(){
     return this.MOVIL;
    }
    
    public String getDIRECCION(){
     return this.DIRECCION;
    }
    
    public String getFECHA_NACIMIENTO(){
     return this.FECHA_NACIMIENTO;
    }
    
    public String getLUGAR_NACIMIENTO(){
     return this.LUGAR_NACIMIENTO;
    }
}