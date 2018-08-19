package qbeer.github.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

    private static final int BUFFER_SIZE = 2000;

    public static void main(String[] args) {

        String userDir = System.getProperty("user.dir") + "/src/qbeer/github/io/";

        try {
            System.out.println(firstLineOfFile(userDir + "text.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            copy(userDir + "text.txt", userDir + "text-copy.txt");
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String firstLineOfFile(String path) throws IOException {
        try(BufferedReader br = new BufferedReader(
                new FileReader(path)
        )){
            return br.readLine();
        }
    }

    private static void copy(String src, String dst) throws IOException {
        try(InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
            byte[] buffer = new byte[BUFFER_SIZE];
            int n;
            while((n = in.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
        }
    }

}
