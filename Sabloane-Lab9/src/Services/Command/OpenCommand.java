package Services.Command;

import Services.ImageProxy;
import Services.JSONVisitor.JSONVisitor;
import models.Image;
import models.Paragraph;
import models.Section;
import models.Table;

import java.io.*;

public class OpenCommand implements Command{
    private BufferedReader bfr;
    private String content;
    private String fname;
    public String getContent(){
        return this.content;
    }
    public OpenCommand(String filename) {
        this.fname = filename;
        try {
            bfr = new BufferedReader(new FileReader(filename));
        }catch(FileNotFoundException fnfex){
            System.out.println("The file was not found!");
        }
    }
    @Override
    public void execute() {
        try{
            String line = "";
            while((line = bfr.readLine()) != null){
                this.content += line +"\n";
            }
        }catch(IOException ioe){
            System.out.println("Caught exception at reading from file!");
        }finally{
            try {
                bfr.close();
            }catch(IOException ioe1){
                System.out.println("Caught exception at closing file!");
            }
        }
        System.out.println(this.content);
    }
}
