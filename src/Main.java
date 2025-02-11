import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmailLogger emailLogger = new EmailLogger();
        emailLogger.log("Log mesaji");
        System.out.println();

        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new DatabaseLogger(), new EmailLogger()};
        for (BaseLogger logger : loggers) {
            logger.log("Log mesaji");
        }
        /* Logged to file
        Logged to databse
        Logged to email.*/

        System.out.println();

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
        /* Musteri eklendi
        Logged to databse */





    }

}