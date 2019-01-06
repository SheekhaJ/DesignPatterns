public class ErrorBasedLogger extends Logger{
    public ErrorBasedLogger(int levels){
        this.levels = levels;
    }

    protected void displayLogInfo(String message){
        System.out.println("Error Log Info: "+message);
    }
}