import javax.print.DocFlavor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Reader {
    public static String read(){

        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder();
        for(int i = 0; i < 4; i++){
            System.out.print("Please enter a character: ");
            out.append(s.nextLine());
            out.append("\n");
        }

        return out.toString();
    }

    public static String read(String filename){

        File f = new File(filename);
//
        Scanner s = null;
        try {
           if (!f.createNewFile()) {
               return null;
           }
            s = new Scanner(f);
        }catch (FileNotFoundException e){
            System.out.println("file " + filename + " not found");
            return null;
        }catch (IOException e){
            System.out.println("Could not create " + filename);
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (s.hasNext()){
            sb.append(s.nextLine());
        }

        return sb.toString();
    }
}
