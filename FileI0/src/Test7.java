import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("C:\\Users\\rvivy\\Desktop\\direct\\abc.txt");

        Scanner sc=new Scanner(f);

        String s=sc.next();

        System.out.println(s);
    }
}
