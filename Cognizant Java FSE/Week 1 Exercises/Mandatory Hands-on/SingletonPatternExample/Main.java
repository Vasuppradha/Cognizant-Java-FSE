public class Main{
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Starting the application...");

        Logger logger2 = Logger.getInstance();
        logger2.log("This is an another log entry");

        if(logger1==logger2){
            System.out.println("Both the instances are same, hence it is Singleton Pattern");
        }else{
            System.out.println("It is not the Singleton Pattern");
        }
    }
}