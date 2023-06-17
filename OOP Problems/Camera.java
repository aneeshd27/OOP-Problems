public class Camera {
    private String brand;
    private double cost;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Camera(String brand, double cost) {
        this.brand = brand;
        this.cost = cost;
    }

    public Camera() {

    }
}
class DigitalCamera extends Camera
{
    private int memory;

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public DigitalCamera(String brand, double cost, int memory) {
        super(brand, cost);
        this.memory = memory;
    }
    public void display()
    {

    }
    public static void main(String args[])
    {
        DigitalCamera obj=new DigitalCamera("Nikon",100,16);
        System.out.println(obj.getBrand()+" "+obj.getCost()+"$ "+obj.getMemory()+"GB");

    }
}
