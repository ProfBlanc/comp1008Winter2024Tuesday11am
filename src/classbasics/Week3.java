package classbasics;

public class Week3 {

    public static void main(String[] args) {
        example4();
    }

    static void example3(){

        /*

         */
        String[] example1 = new String[5];
        System.out.println(example1[1]);  // null

        example1[1] = "updated value";

        double[] example2 = new double[5];
        System.out.println(example2[1]);
        example2[2] = 2.2;

        Object[] example3 = new Object[5];
        System.out.println(example3[0]);
        example3[0] = true;
        example3[1] = 1;
        example3[2] = 'a';

        Object[] example4 = {"hi", 1.23, true, 'a', 5f, 2};
        System.out.println(example4.length);  // 6
        for(int i = 0; i < example4.length; i++){

            System.out.println(example4[i]);

        }
    }
    static void example4(){

        /*
                Monday      Tuesdays        Wednesdays

                php         java            business
                sql        mssql            math

         */
        String[][] schedule1 = new String[3][2];
        schedule1[0][0] = "php";
        schedule1[0][1] = "sql";
        schedule1[1][0] = "java";
        schedule1[1][1] = "mssql";
        schedule1[2][0] = "business";
        schedule1[2][1] = "math";

String[][] schedule2 = { {"php", "sql"}, {"java", "mysql"}, {"business", "math"} };

    for(int i = 0; i < schedule2.length; i++)

        for(int j = 0; j < schedule2[i].length; j++){
            System.out.println(schedule2[i][j]);
        }
    }

    static void example2(){

        Cellphone c1 = new Cellphone("iPhone", 123,
                new double[]{123,456}, true, Cellphone.HardDriveTypes.SATA);

        System.out.println(c1.pin);

        c1.setStorage(12345);
        System.out.println(c1.getStorage());

        System.out.println(Cellphone.HardDriveTypes.HD);
    }
    static void example1(){

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
