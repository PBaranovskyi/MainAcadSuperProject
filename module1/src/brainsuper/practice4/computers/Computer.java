package brainsuper.practice4.computers;

/**
 * Created by citsym on 28.01.17.
 */
public class Computer {

    private String manufacturer;
    private int serialNumber;
    private float price;
    private int quantityCPU;
    private int frequencyCPU;

    public Computer(String manufacturer, int serialNumber, int quantityCPU, int frequencyCPU) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
        this.quantityCPU = quantityCPU;
        this.frequencyCPU = frequencyCPU;
    }


    public Computer(int frequencyCPU, int quantityCPU, int price, int serialNumber, String manufacturer) {
        this.frequencyCPU = frequencyCPU;
        this.quantityCPU = quantityCPU;
        this.price = price;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
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
}
