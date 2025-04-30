import java.io.*;
public class FixDebugSix1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("debugSix1.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("This is a test file");
            bw.newLine();
            bw.write("For debugging purposes");
            bw.close();
            
            BufferedReader br = new BufferedReader(new FileReader("debugSix1.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
