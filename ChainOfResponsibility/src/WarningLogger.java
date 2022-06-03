public class WarningLogger extends Logger{

    public WarningLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("This is a warning message: "+ message);
    }
}
