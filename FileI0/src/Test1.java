import java.io.File;

/*
 Write a Java program to get a list of all file/directory names from the given
 */
public class Test1 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\rvivy\\Downloads\\Programs");

        String[] list= file.list();

        for(String x: list){
            System.out.println(x);
        }
    }
}
