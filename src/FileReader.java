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
                System.out.println("file created: " + filename);
            }else{
                System.out.println("file not created: " + filename +" maybe it already is there?");
            }
            scan = new Scanner(f);
        }catch(FileNotFoundException e){
            System.out.println("could not find " + filename + "\n" + e);
        }catch(IOException e){
            System.out.println("problem when making the file... maybe it already exists" + e);
            e.printStackTrace();
        }

        while(scan != null && scan.hasNext()){
            String input = scan.nextLine();
            listing(input.split(","));
        }

//        boolean loop = true;
//        while(loop){
//            System.out.print("Enter something (zz to exit): ");
//            String input = scan.nextLine();
//
//            if(input.trim().toLowerCase().equals("zz")){
//                loop = false;
////                continue;
//            }
//            System.out.println("You entered " + input);
//        }
    }
}
