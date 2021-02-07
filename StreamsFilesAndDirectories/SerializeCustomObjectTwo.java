package StreamsFilesAndDirectories;
//created by J.M.

import java.io.*;

public class SerializeCustomObjectTwo {

    private static final String PATH = "C:\\Users\\ADMIN\\IdeaProjects\\Java-Advanced\\" +
            "StreamsFilesAndDirectories\\Conditions\\Resources-Exercise\\" +
            "04. Java-Advanced-Files-and-Streams-Exercises-Resources\\course.ser";

    private static class Course implements Serializable {
        String name;
        int numberOfStudents;

        public Course(String name, int numberOfStudents) {
            this.name = name;
            this.numberOfStudents = numberOfStudents;
        }

        @Override
        public String toString() {
            return String.format("%s -> %d",this.name,this.numberOfStudents);
        }
    }

    public static void main(String[] args) {

        Course course = new Course("Java Advanced",200);
        //serialize:
        try(FileOutputStream outputStream = new FileOutputStream(PATH);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream)) {
            objectOutputStream.writeObject(course);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        //deserialize:
        try(FileInputStream inputStream = new FileInputStream(PATH);
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
            Course deserializeCourse = (Course) objectInputStream.readObject();
            System.out.println(deserializeCourse);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
