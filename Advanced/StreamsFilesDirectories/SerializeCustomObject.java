package StreamsFilesDirectories;

import java.io.Serializable;

public class SerializeCustomObject {
    public static void main(String[] args) {



    }
    class Cube implements Serializable {
        String color;
        double width;
        double height;
        double depth;
        public  Cube(String color, double width,double height, double depth) {
            this.color = color;
            this.width = width;
            this.height = height;
            this.depth = depth;
        }

    }
}
