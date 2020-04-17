import java.util.ArrayList;

public class PRINCIPAL
{
 
    public static void main(String[] args)
    {
    ArrayList<EMPLEADO> CONTRATISTAS = new ArrayList<EMPLEADO>();
    EMPLEADO EMPLEADO1 = new EMPLEADO();
    EMPLEADO1.setNOMBRE("CAMILO");
    EMPLEADO1.setAPELLIDO("MEJIA");
    
    EMPLEADO EMPLEADO2 = new EMPLEADO();
    EMPLEADO2.setNOMBRE("ANDREA");
    EMPLEADO2.setAPELLIDO("LOBO");
    
    CONTRATISTAS.add(EMPLEADO1);
    CONTRATISTAS.add(EMPLEADO2);
    
    CONTRATISTAS.forEach((EMP) -> System.out.println(EMP.getNOMBRE() + " " + EMP.getAPELLIDO()));


}

    
}
