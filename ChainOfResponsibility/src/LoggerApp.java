public class LoggerApp {
    public static Logger chainOfLoggers(){
        Logger consoleLogger = new ConsoleLogger(Logger.log);
        Logger warningLogger = new WarningLogger(Logger.warning);
        Logger errorLogger  = new ErrorLogger(Logger.error);
        consoleLogger.setNextLogger(warningLogger);
        warningLogger.setNextLogger(errorLogger);

        return consoleLogger;
    }
    public static void main(String[] args) {
        Logger chainLogger = chainOfLoggers();
        chainLogger.logMessage(Logger.log,"This is general information.");
        chainLogger.logMessage(Logger.warning,"This a a warning");
        chainLogger.logMessage(Logger.error,"You have an error in your code");
    }
}
