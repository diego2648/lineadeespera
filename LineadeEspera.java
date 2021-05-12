
package lineadeespera;
/*@author diego*/
public class LineadeEspera {

    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        int[] Cliente = new int[20]; //20 clientes 
        double PROMTOCIO = 0, PROMTESPERA = 0;//promedio
        double[]  TLL = new double[20]; //tiempo de llegada
        double[]  TE = new double[20]; //tiempo de espera
        double[]  TO = new double[20]; //tiempo de ocio _ tiempo anterior y actual
        double[]  TSER = new double[20];//tiempo de servicio
        double[]  TSAL = new double[20];//tiempo de salida
        
        TLL[0] = 0;
        TE[0] = 0;
        TO[0] = 0;
        TSER[0] = (Math.random())*5;
        TSAL[0] = TLL[0] + TE[0] + TSER[0];
        
           System.out.println("        TLL          |          TO         |        TE        |       TSER       |        TSAL    ");
        System.out.println("TLL = " + TLL[0] + "|" + "|" + "|" + "TO = " + TO[0] + "|" + "|" + "|" + "TE = " + TE[0] + "|" + "|" + "|" + "TSER = " + TSER[0] + "|" + "|" + "|" + "TSAL = " + TSAL[0]);
        
        for (i=1;i<20;i++){
            TLL[i] = TLL[i-1] + (Math.random())*10;
            TE[i] = Math.max(TSAL[i-1],TLL[i])-TLL[i];
            TO[i] = Math.max(TSAL[i-1],TLL[i])-TSAL[i-1];
            TSER[i] = (Math.random())*5;
            TSAL[i] = TLL[i] + TE[i] + TSER[i];
            PROMTOCIO = PROMTOCIO + TO[i];
            PROMTESPERA = PROMTESPERA + TE[i];
            
            System.out.println("TLL = " + TLL[i] + "|" + "|" + "|" + "TO = " + TO[i] + "|" + "|" + "|" + "TE = " + TE[i] + "TSER = " + TSER[i] + "|" + "|" + "|" + "TSAL = " + TSAL[i]);
             
        }
        
        System.out.println("==============================================================================================================");
        System.out.println("Promedio de tiempo Ocio = " + PROMTOCIO/20);
        System.out.println("Promedio de tiempo de espera = " + PROMTESPERA/20);
        
    }
    
}
