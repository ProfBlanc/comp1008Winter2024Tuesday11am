package classbasics;

public class Cellphone {

    String make;
    int ram;

    double[] dimensions = new double[2];

    boolean original;

    //preset values aka drop-down options => enum

    //list the possible values
    enum HardDriveTypes {SSD, HD, SATA}

    // create an attribute (instance variable) that holds one of the possible preset values
    HardDriveTypes selectHardDrive = HardDriveTypes.HD;

    public Cellphone(){}

    public Cellphone(String make, int ram, double[] dimensions,
                     boolean original, HardDriveTypes selectHardDrive) {
        this.make = make;
        this.ram = ram;
        this.dimensions = dimensions;
        this.original = original;
        this.selectHardDrive = selectHardDrive;
    }
}
