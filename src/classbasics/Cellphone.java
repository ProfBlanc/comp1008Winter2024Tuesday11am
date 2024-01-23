package classbasics;

public class Cellphone {

    public String make;
    int ram;
    private int storage = 1000;
    double[] dimensions = new double[2];

    boolean original;

    //visibility / accessibility types
    // default (no text) aka package-private, public, protected, private

    private double priceToManufacture = 1.5;

    protected int pin = 1234;



    //preset values aka drop-down options => enum

    //list the possible values
    enum HardDriveTypes {SSD, HD, SATA}

    // create an attribute (instance variable) that holds one of the possible preset values
    HardDriveTypes selectHardDrive = HardDriveTypes.HD;

    public Cellphone(){}

    public Cellphone(String make, int ram, int storage, double[] dimensions, boolean original, double priceToManufacture, int pin, HardDriveTypes selectHardDrive) {
        this.make = make;
        this.ram = ram;
       // this.storage = storage;
        setStorage(storage);

        this.dimensions = dimensions;
        this.original = original;
        this.priceToManufacture = priceToManufacture;
        this.pin = pin;
        this.selectHardDrive = selectHardDrive;
    }

    public Cellphone(String make, int ram, double[] dimensions,
                     boolean original, HardDriveTypes selectHardDrive) {
        this.make = make;
        this.ram = ram;
        this.dimensions = dimensions;
        this.original = original;
        this.selectHardDrive = selectHardDrive;
    }



    //getters and setter to access and/or modify the value


    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        //only allow values of 1,000 to 10,000
        if(storage >= 1000 && storage <= 10000)
            this.storage = storage;
    }
}
