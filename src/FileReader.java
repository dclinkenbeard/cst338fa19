import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {
    private static void listing(String[] list){
        for(String s : list){
            System.out.println(s.trim());
        }
    }

    public static void main(String[] args) {

        String filename = "myFile.txt";
        File f = new File(filename);

        Scanner scan = null;

        try{
            if(f.createNewFile()){
                System.out.println(filename + " created successfully");
            }else{
                System.out.println(filename + " not created... does it already exist?");
            }
            scan = new Scanner(f);
        }catch (FileNotFoundException e){
            System.out.println("couldn't find " + filename);
            System.out.println("error : " +e);
        }
        catch (IOException e){
            System.out.println("Problem with making the file... " + e);
            e.printStackTrace();
        }

        while(scan != null && scan.hasNext()){
            String input = scan.nextLine();
            System.out.println(input);
            listing(input.split(","));
        }

//        boolean loop = true;
//        while (loop){
//            System.out.print("Enter something (zz to exit) : ");
//            String input = scan.nextLine();
////            scan.close();
//
//            if(input.trim().toLowerCase().equals("zz")){
//                loop = false;
////                break;
//            }
//            System.out.println("You entered " + input);
//        }
    }
}
