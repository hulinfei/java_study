import java.io.*;
import java.nio.file.*;
import java.nio.file.Path;
import java.util.Arrays;

public class TestFile {
    public static void main(String[] args){
        System.out.println(File.separator);
        File file = new File("/Users/hlf/Downloads/1701052366012.jpg");
        System.out.println(file);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.canWrite());
        System.out.println(file.length());
        File file1 = new File("/Users/hlf");
        File[] files = file1.listFiles();
        System.out.println(Arrays.toString(file1.listFiles()));
        if (files != null) {
            for (File f : files
                 ) {
                System.out.println(f.length());
            }
        }
        Path path = Paths.get(".","project","stuty");
        System.out.println(path);
        Path path1 = path.toAbsolutePath();
        System.out.println(path1);
        Path path2 = path1.normalize();
        System.out.println(path2);
        Path path3 = path2.toFile().toPath();
        System.out.println(path3);
        for (Path p : Paths.get("..").toAbsolutePath()
             ) {
            System.out.println(" " + p);
        }
    }
    public void writeFile() throws IOException{
        try(OutputStream outputStream = new FileOutputStream("out/readme.txt")){
            outputStream.write("Hello Moto".getBytes("UTF-8"));
        }
    }
}
