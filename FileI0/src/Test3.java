import java.io.File;

/*
Check if a file or directory specified by pathname exists or not
 */
public class Test3 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\rvivy\\Desktop\\report3.pdf");

        if(file.exists()){
            System.out.println("File exists? \n"+true);
        }
        else{
            System.out.println("File exists? \n"+false);
        }

    }
}
