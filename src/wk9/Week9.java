package wk9;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

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
    public static void main(String[] args) {
        example10();
    }

}
