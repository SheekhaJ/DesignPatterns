public class ChainOfResponsibilityClient{
    private static Logger doChaining(){
        Logger consoleLogger = new ConsoleBasedLogger(Logger.OUTPUTINFO);
        Logger errorLogger = new ErrorBasedLogger(Logger.ERRORINFO);
        Logger debugLogger = new DebugBasedLogger(Logger.DEBUGINFO);

        consoleLogger.setNextLevelLogger(errorLogger);
        errorLogger.setNextLevelLogger(debugLogger);

        return consoleLogger;
    }

    public static void main(String[] args){
        Logger chainLogger = doChaining();
        chainLogger.logMessage(Logger.DEBUGINFO, "Enter sequence of values");
    }
}