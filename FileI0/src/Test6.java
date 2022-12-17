import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.Format;
import java.util.Formatter;

public class Test6 {
    public static void main(String[] args) {
        File dir=new File("C:\\Users\\rvivy\\Desktop\\direct");
        dir.mkdir();

        File file1=new File("C:\\Users\\rvivy\\Desktop\\direct\\abc.txt");

        String name="Limon";
        int id= 291;

        String name2="Masud";
        int id2=074;


        try{
            if(file1.exists()){
                System.out.println("File exists, writing to directly.....");
                Formatter f1f=new Formatter("C:\\Users\\rvivy\\Desktop\\direct\\abc.txt");
                f1f.format("Name: %s\n",name);
                f1f.format("ID: %d",id);
                f1f.close();
            }else{
                System.out.println("File doesn't exist, creating file.....");
                file1.createNewFile();
                FileWriter fw=new FileWriter("C:\\Users\\rvivy\\Desktop\\direct\\abc.txt");
                fw.write("Name: "+name2+"\n"+"ID: "+id2);
                fw.close();
            }

        }catch (IOException e){
            System.out.println("Exception: "+e);
        }

        finally {
            System.out.println("File written successfully");
        }


    }
}
