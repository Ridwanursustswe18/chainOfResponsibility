public
class ConsoleLogger extends Logger{
    public ConsoleLogger(int level){
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("This is a standard message:s "+message);
    }
}
