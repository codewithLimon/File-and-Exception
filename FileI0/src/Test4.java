import java.io.File;

//Check if a file or directory has read and write permission
public class Test4 {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\rvivy\\Desktop\\report3.pdf");

        if(file.canRead()){
            System.out.println(file.getAbsolutePath()+" have read permission");
        }
        else{
            System.out.println(file.getAbsolutePath()+" does not have read permission");
        }

        if(file.canWrite()){
            System.out.println(file.getAbsolutePath()+" have write permission");
        }
        else{
            System.out.println(file.getAbsolutePath()+" does not have write permission");
        }
    }
}
