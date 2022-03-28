package File_IO_Types;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class ByteStreamOutput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader in = null;
        FileWriter out = null;
        try{
            in = new FileReader("/Users/srava/Documents/input.txt");
            out = new FileWriter("/Users/srava/Documents/output.txt");
            int i = 0;
            //while loop
            while((i = in.read()) !=-1){
                out.write(i);
                System.out.print((char)i);
            }
        } finally {
            if (in != null){
                in.close();
                out.close();
            }
        }
    }
}
