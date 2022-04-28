\\\\package DisenoPatrones;

public class Main {
    public static void main(String[] arg){
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.setValue("Hola");
        log2.setValue("Hola 2");  
        System.out.println(log1.getValue());
    }
    
}
