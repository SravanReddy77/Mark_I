package File_IO_Types;

import java.io.*;

public class CharacterStreamOutput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream in = null;
        FileOutputStream out = null;
        try{
            in = new FileInputStream("/Users/srava/Documents/input.txt");
            out = new FileOutputStream("/Users/srava/Documents/output1.txt");
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
