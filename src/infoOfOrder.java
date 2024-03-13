public class infoOfOrder extends Thread{
    public void run(){
        Singleton singleton = Singleton.getInstance();
        System.out.println("Delivary from: "+singleton.getAddressOfSender()+" to: "+singleton.getAddressOfClient()+"\n"+"time: "+singleton.getHourofDelivery()+"h"+"\n"+"cost: "+singleton.getCost() + "tenge" );
    }

}
