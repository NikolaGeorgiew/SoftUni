package StreamsExe;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) throws IOException {


        String path = "resources2/picture.jpg";
        FileInputStream fis = new FileInputStream(path);
        FileOutputStream fos = new FileOutputStream("copy-picture.jpg");

        byte[] bytes = new byte[1024];

        while (fis.read(bytes) >= 0) {
            fos.write(bytes);
        }

    }

}
