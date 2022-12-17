import java.io.*;

public class CT {
    public static void main(String[] args) {
        try {
            BufferedWriter Writer = new BufferedWriter(new FileWriter("C:\\Users\\rvivy\\Desktop\\direct\\Student.txt",true));

            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\rvivy\\Desktop\\direct\\deanslist.txt"));

            String Sr;

            while ((Sr = reader.readLine()) != null) {
                // Writer.write(Sr+"\n");
                String sr2 = reader.readLine();
                double a = Double.parseDouble(sr2);
                if(a>3.67)
                {
                    Writer.write(Sr+"\n");
                    Writer.write(sr2+"\n");
                }

            }
            Writer.close();
            reader.close();

        } catch (IOException e) {
            // throw new RuntimeException(e);
            System.out.println(e);
        }
    }
}
