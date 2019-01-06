public class ConsoleBasedLogger extends Logger{
    public ConsoleBasedLogger(int levels){
        this.levels = levels;
    }

    protected void displayLogInfo(String message){
        System.out.println("Console Log Info: "+message);
    }
}