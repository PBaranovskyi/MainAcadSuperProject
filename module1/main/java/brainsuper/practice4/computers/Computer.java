package brainsuper.practice4.computers;

/**
 * Created by citsym on 28.01.17.
 */
public class Computer {

    public static int numberOfComputers = 0;

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    {
        System.out.println("CVariables defined: " + serialNumber +" " + manufacturer);
    }

    public Computer(String manufacturer, int serialNumber, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
        System.out.println("Constructor is running "+ serialNumber +" " + manufacturer);
    }


    public Computer(int frequencyCPU, int quantityCPU, int price, int serialNumber, String manufacturer) {
        this(manufacturer, serialNumber, quantityCPU, frequencyCPU);
        this.price = price;
    }

    public void view (){
        System.out.println("Производитель: " + getManufacturer() + ", Серийный номер: " + getSerialNumber()+
                ", цена: " + getPrice() + ", кол-во: " + getQuantityCPU()+ ", частота " + getFrequencyCPU());
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacturer='" + manufacturer + '\'' +
                ", serialNumber=" + serialNumber +
                ", price=" + price +
                ", quantityCPU=" + quantityCPU +
                ", frequencyCPU=" + frequencyCPU +
                '}';
    }
}
