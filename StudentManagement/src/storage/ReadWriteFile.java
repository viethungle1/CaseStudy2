package storage;
import model.Student;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class ReadWriteFile implements IReadWriteFile {
    public List<Student> readFile() {
        File file = new File("student.dat");
        try {
            InputStream inputStream = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(inputStream);
            List<Student> studentList = null;
            studentList = (List<Student>) ois.readObject();
            return studentList;
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            return new ArrayList<>();
        } catch (ClassNotFoundException e) {
            return new ArrayList<>();
        }
    }
    public void writeFile(List<Student> studentList) {
        File file = new File("student.dat");
        try {
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(os);
            objectOutputStream.writeObject(studentList);
            objectOutputStream.close();
            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static ReadWriteFile instance;
    public static ReadWriteFile getInstance() {
        if (instance==null)
            synchronized (ReadWriteFile.class){
                if(instance==null)
                    instance=new ReadWriteFile();
            }

        return instance;
    }
}
