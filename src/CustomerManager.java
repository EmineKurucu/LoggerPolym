public class CustomerManager {
    private BaseLogger logger ;

    // consturctor ekliyoruz
    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Musteri eklendi");
        this.logger.log("Log mesaji");
    }


}
