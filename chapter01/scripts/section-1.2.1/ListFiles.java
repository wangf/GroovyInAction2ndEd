import java.io.*;
// JAVA !!

public class ListFiles {
    public static void main(String[] args) {
        new File(".").eachFileRecurse(    // imagine Java had this 
                new FileListener() {
                    public void onFile(File file) {
                        System.out.println(file.toString());
                    }
                }
        );
    }
}
