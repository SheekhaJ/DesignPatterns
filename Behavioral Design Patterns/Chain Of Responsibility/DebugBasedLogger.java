public class DebugBasedLogger extends Logger{
    public DebugBasedLogger(int levels){
        this.levels = levels;
    }

    protected void displayLogInfo(String message){
        System.out.println("Debug Log Info: "+message);
    }
}