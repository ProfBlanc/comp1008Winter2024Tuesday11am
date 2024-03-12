package wk9;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class Week9{
    static void example1(){
        String name = "Ben Blanc";
        System.out.println(name.charAt(0));
        for(char letter : name.toCharArray()){
            if(letter == 66 || letter == 'a'){
                System.out.println(letter);
            }
        }
    }

    static void example2(){

        Path path = Path.of(".");
        String[] allFilesAndFolders = path.toFile().list();

        for(String item : allFilesAndFolders){
            System.out.println(item);
        }

    }
    static void example3(){

        Path path = Path.of(".");
        File[] allFilesAndFolders = path.toFile().listFiles();

        for(File item : allFilesAndFolders){
            System.out.println(item.getName());
            System.out.println(item.length());
            System.out.println(item.isFile());
            System.out.println(item.isDirectory());
            System.out.println("-".repeat(20));
        }

    }

    static void example4(){
        //attempt to create a folder in src/wk9/testdir1
        Path path = Path.of("./src/wk9/testdir1");
        if(!path.toFile().exists() || !Files.exists(path)){
            //System.out.println(path.toAbsolutePath() + " does not exist!");

        }
    }
    static void example5(){
        Path path = Path.of("./src/wk9/testdir1/testdir2/test3/test4/test5");
        try{
            Files.createDirectory(path); //will throw exception if exists
            //Files.createDirectories(path);
        }
        catch (Exception e){
            System.err.println(e);
        }

    }
    static void example6(){
        Path path = Path.of("./src/wk9/testdir1/testdir2/test3/");
        try{
            Files.delete(path); //will throw exception if exists
            //Files.createDirectories(path);
        }
        catch (Exception e){
            System.err.println(e);
        }

    }
    static void example7(){
        Path path1 = Path.of("./src/wk9/testdir1/testdir2");
        Path path2 = Path.of("./src/wk9/testdir1/testdir22");
        try{
            Files.move(path1, path2); //will throw exception if exists
            //Files.createDirectories(path);
        }
        catch (Exception e){
            System.err.println(e);
        }

    }
    static void example8(){
        Path path = Path.of("./src/wk9/testdir1/myfile.txt");
        try{
            //Files.createFile(path);
            Files.copy(path, Path.of("./src/wk9/testdir1/testdir22/myfile.txt"));
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    static void example9(){
        Path path = Path.of("./src/wk9/testdir1/myfile.txt");
        try{
            String content = "Hello World\n";
            Files.writeString(path, content, StandardOpenOption.APPEND);
        }
        catch (Exception e){
            System.err.println(e);
        }
    }

    static void example10(){
        Path path = Path.of("./src/wk9/testdir1/myfile.txt");
        try{
            //String content = Files.readString(path);
            List<String> allLines = Files.readAllLines(path);
            for(String line : allLines){
                System.out.println(line);
            }
        }
        catch (Exception e){
            System.err.println(e);
        }
    }
    static boolean validateYear(String year){
        boolean isInvalid = false;
        if(year.length() == 4){
            for(char digit : year.toCharArray()){
                if(digit >= 48 || digit <= 57){
                }
                else{
                    isInvalid = true;
                    break;
                }
            }
        }
        return isInvalid;
    }
    static void funtask(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Student Organizer app");
        System.out.println("Enter the year");
        String year = input.nextLine();
        if(validateYear(year)){
            System.err.println("Invalid year!");
        }
        else{
            System.out.println("Enter the semester");
            String semester = input.nextLine();
            Path rootPath = Path.of("./src/wk9/" + year + "/" + semester);
            try{
                Files.createDirectories(rootPath);

                System.out.println("Start to ask user for their courses");
                while(true){
System.out.println(String.format("Enter a course for the %s semester " +
        "of year %s. Enter quit or '' to escape", semester, year));
                    String userInput = input.nextLine();
                    if(userInput.trim().length() == 0 ||
                            userInput.toLowerCase().charAt(0) == 'q'){
                        break;
                    }

                    //
                    Files.createDirectory(rootPath.resolve(userInput));

                }

                File[] courses = rootPath.toFile().listFiles();
                for(File course : courses){
                    System.out.println("Enter the mid-term grade for the course " + course.getName());
                    String midtermGrade = input.nextLine();

                    System.out.println("Enter the final grade for the course " + course.getName());
                    String finalGrade = input.nextLine();

Files.writeString(rootPath.resolve(course.getName()).resolve("mid-term.txt"), midtermGrade);
Files.writeString(rootPath.resolve(course.getName()).resolve("final.txt"), finalGrade);
                }

            }
            catch (Exception e){
                System.err.println(e);
            }
        }

    }
    public static void main(String[] args) {
        //example10();
        funtask();
    }

}
