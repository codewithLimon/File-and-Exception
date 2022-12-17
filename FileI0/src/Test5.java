import java.io.File;

//Write a Java program to check if given pathname is a directory or a file
public class Test5 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\rvivy\\Desktop\\report3.pdf");

        if(file.isDirectory()){
            System.out.println(file.getAbsolutePath()+" is a directory");
        }
        else{
            System.out.println(file.getAbsolutePath()+" is not a directory");
        }

        if(file.isFile()){
            System.out.println(file.getAbsolutePath()+" is a file");
        }
        else{
            System.out.println(file.getAbsolutePath()+" is not a file");
        }
    }
}
