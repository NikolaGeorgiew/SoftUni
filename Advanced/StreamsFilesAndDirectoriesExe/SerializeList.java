package StreamsExe;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("list.ser"));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("list.ser"));

        outputStream.writeObject(list);
        List<Integer> listFromFile = (List<Integer>) inputStream.readObject();
        for (Integer number : listFromFile) {
            System.out.println(number);
        }
    }
}
