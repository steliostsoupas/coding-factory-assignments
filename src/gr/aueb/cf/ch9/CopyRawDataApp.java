package gr.aueb.cf.ch9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyRawDataApp {

    public static void main(String[] args) {
        int b = 0;
        int count = 0;
        byte[] buffer = new byte[4096];
        long start, end;
        double elapsed;

        try (FileInputStream in = new FileInputStream("C:\\Users\\Stelios\\Desktop\\CodingFactory4\\CodingFactory4\\video\\trailer.mp4");
        FileOutputStream out = new FileOutputStream("C:/temp/v3out.mp4")) {

            start = System.currentTimeMillis();
            while ((b = in.read(buffer)) != -1) {
                out.write(buffer, 0, b);
                count += b;
            }
            end = System.currentTimeMillis();
            elapsed = (end - start) / 1000.0;
            System.out.println(elapsed + "secs");


        } catch (IOException e) {
            throw new RuntimeException();
        }

        System.out.println(count / (1024 * 1000));
        System.out.printf("%.2f KB", Math.ceil((double) count / 1024) );
    }
}
