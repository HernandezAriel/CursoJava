package DisenoPatrones;

public class Logger {
    public static Logger log;
    private String value;
    
    private Logger(){
        
    }

    public static Logger getInstance(){
        if(log == null){
            log = new Logger();
        }
        return log;
    }
\\
    public void setValue(String msg){
        this.value = msg;
    }

    public String getValue(){
        return value;
    }
}
