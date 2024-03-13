public class SetOrder extends Thread{
    public void run() {
    Singleton singleton=Singleton.getInstance();

        singleton.setAddressOfSender("Shymkent");
        singleton.setAddressOfClient("Taraz");
        singleton.setWeight(5);
    }

}
