package ss5_access_modifier_static_method_static_property.static_property;

public class Car {
    private String name;
    private String engine;
    private boolean on ;
    public static int numberOfCar = -1 ;
    public Car(String name , String engine){
        this.setName(name);
        this.setEngine(engine);
        numberOfCar++ ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void On() {

        this.on = true;
    }
    public String toString(){
        if(on){
            return " Car " + numberOfCar + " is " + getName() + " Author is " + getEngine();
        }
        return  " " ;
    }
}
