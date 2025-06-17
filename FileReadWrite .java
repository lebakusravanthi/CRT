import java.io.*;
public class FileReadWrite {
public static void main(String[] args) throws IOException {
FileWriter writer=new FileWriter("Output.txt");
Writer.write("Hello,Java FileWriter!");
Writer.close();
FileReader reader =new FileReader("Output.txt")
int ch;
while((ch=reader.read())!=-1){
System.out.print((char(ch));
}
reader.close();
}
}

