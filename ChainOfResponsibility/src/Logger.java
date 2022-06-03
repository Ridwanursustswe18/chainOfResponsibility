public abstract class Logger {
  public  static  int  log = 1;
  public static int warning = 2;
  public static int error = 3;
  protected int level;
  protected Logger nextLogger;
  public void setNextLogger(Logger nextLogger){
      this.nextLogger = nextLogger;
  }
  public void logMessage(int level,String message){
      if (this.level == level){
          write(message);
      }
      if(nextLogger != null){
          nextLogger.logMessage(level,message);
      }
  }

   abstract protected void write(String message);

}
