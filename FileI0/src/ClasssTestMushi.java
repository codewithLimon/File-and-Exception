import java.io.*;
import java.util.Scanner;

public class ClasssTestMushi {
    public static void main(String[] args) throws FileNotFoundException {

        File st=new File("C:\\Users\\rvivy\\Desktop\\direct\\Student.txt");

        File deans=new File("C:\\Users\\rvivy\\Desktop\\direct\\deanslist.txt");

        Scanner in=new Scanner(st);
        try{
            deans.createNewFile();

            BufferedReader breader=new BufferedReader(new FileReader(st));
            BufferedWriter bwriter=new BufferedWriter(new FileWriter(deans));

            String name;

            while((name= breader.readLine())!=null){
                double cg=Double.parseDouble(breader.readLine());
                if(cg>3.67){
                    bwriter.write(name);
                    bwriter.write("\n");
                }
            }

            breader.close();
            bwriter.close();
        }catch (Exception e){
            System.out.println("Exception: "+e.getMessage());
        }
    }
}
