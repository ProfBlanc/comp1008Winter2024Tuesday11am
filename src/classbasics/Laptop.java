package classbasics;

public class Laptop {


    //attributes / characteristics

    //storage, harddrive type, screen dimensions, screen resolution, make, model

    double storage;
    String harddriveType, make, model;
    double[] dimensions = {1000, 2000};
    float screenResolution;


    //constructor: build the object
    //special method: no return data type. name class name

    public Laptop(){}  // default constructor: always be present

    //alt + insert
    // right-click: Generate

    public Laptop(double storage, String make, String model) {
        this.storage = storage;
        this.make = make;
        this.model = model;
    }

    public Laptop(String make, String model,
                  double storage, String harddriveType,
                  float screenResolution, double[] dimensions) {
        this.storage = storage;
        this.harddriveType = harddriveType;
        this.make = make;
        this.model = model;
        this.dimensions = dimensions;
        this.screenResolution = screenResolution;
    }


//actions

}
