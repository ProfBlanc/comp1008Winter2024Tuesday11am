package classbasics;

public class Week3 {

    public static void main(String[] args) {
        String s = "hello";
        Laptop dell = new Laptop();

        int a = 10;
        a += 20;  // a = a + 20;

//        Laptop hp = new Laptop();
//
//        Laptop mac = new Laptop();
        dell.make = "Dell";
        dell.model = "latitude";
        dell.storage = 1000000;
        dell.screenResolution = 12345f;
        dell.harddriveType = "SSD";
        dell.dimensions[0] = 1024;
        dell.dimensions[1] = 2048;

        System.out.println(dell.make);

        System.out.println(dell.storage);


        Laptop asus = new Laptop("Asus",
                "ROG", 12345d,
                "SSD", 567f,
                new double[]{123, 456});

        System.out.println(asus.model);
    }
}
