public class AcceptOrder extends Thread{
    public void run() {
        Singleton singleton = Singleton.getInstance();

        double length = singleton.getLength();
        double weight = singleton.getWeight();
        String weather = singleton.getWeather();
        double percentOFWeather = 0;

        if(weather=="Rainy"){
            percentOFWeather=0.10;
        } else if (weather=="Snowy") {
            percentOFWeather=0.25;
        }else if(weather=="Warm"){
            percentOFWeather=0;
        }

        if(percentOFWeather != 0 || percentOFWeather < 0){
            double cost=((length*800)*(weight*0.1));
            cost=cost+(cost*percentOFWeather);
            double time=((length*percentOFWeather)*(weight*0.2));
            singleton.setHourofDelivery(Math.ceil(time));
            singleton.setCost(cost);
        } else{
            double cost=((length*800)*(weight*0.1));
            double time=length*(weight*0.2);
            singleton.setHourofDelivery(Math.ceil(time));
            singleton.setCost(cost);
        }

    }


}



// c =  (км + 0,25)
// ((c * 3)*вес)

