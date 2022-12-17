import java.io.File;

/*
 Write a Java program to get specific files by extensions from a specified folder
 */
public class Test2 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\rvivy\\Desktop");

        String[] list= file.list();

        for(String x:list){
            if(x.toLowerCase().endsWith(".pdf")){
                System.out.println(x);
            }
        }
    }
}
