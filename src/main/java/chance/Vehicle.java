package chance;

public abstract class Vehicle extends Product{
    private int speed;
    private float price;
    private Engine engine;
    protected final float TAX_AMT = .10f;

    public Vehicle(String name) {
        super(name);
    }

    public Vehicle(int speed, double price, Engine engine){
        this.speed = speed;
        this.price = (float) price;
        this.engine = engine;

    }

    public  int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public float getTAX_AMT() {
        return TAX_AMT;
    }

    public void printVehicleType(Vehicle vehicle){
        System.out.println(vehicle.getName());
    }

    public void formattedPriceAfterTax(){
        System.out.printf("Here is your total price: $ %.2f", getPriceAfterTax() );
    }

    public float getPriceAfterTax(){
        float tax = TAX_AMT / 100;
        float amount = getPrice() * tax;
        float total = getPrice() + amount;

        return total;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "speed=" + speed +
                ", price=" + price +
                ", engine=" + engine +
                ", TAX_AMT=" + TAX_AMT +
                '}';
    }
}
