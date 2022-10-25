package StreamsExe;

import java.io.*;

public class SerializeCustomObject {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Course course = new Course();
        course.name = "Java Advanced September 2022";
        course.students = 250;

        ObjectOutputStream  outputStream = new ObjectOutputStream(new FileOutputStream("resources2/course.ser"));
        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("resources2/course.ser"));

        outputStream.writeObject(course);
        Course coursefromFile = (Course) inputStream.readObject();
        System.out.println(coursefromFile.students);
        System.out.println(coursefromFile.name);

    }
    static class Course implements Serializable {
        String name;
        int students;

    }
}


