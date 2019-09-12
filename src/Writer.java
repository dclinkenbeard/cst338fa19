import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Writer {

    public static void write(String filename, String values){
        FileWriter fw = null;

        try{
            fw = new FileWriter(filename);
            fw.write(values);
            fw.close();
        }catch (IOException e){
            System.out.println("couldn't write to file " + filename);
            System.out.println(e);
        }



    }

    public static void write(String filename){
//        String filename = "test.txt";
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename);
        }catch (IOException e){
            System.out.println("couldn't write to file " + filename);
            System.out.println(e);
        }

        List<String> chars = new ArrayList<>();
        chars.add("A");
        chars.add("B");
        chars.add("J");
        try{
            for( String s : chars){
                assert fw != null;
                fw.write(s);
                fw.write("\n");
            }
            assert fw != null;
            fw.close();
        }catch (IOException e){
            System.out.println("Can't write to file..." + e);
        } catch (NullPointerException e){
            System.out.println("Please make sure fw is not null");
        }
    }
}
