package Services.Command;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SaveCommand implements Command{
    private String fname;
    private String content;
    public SaveCommand(String filename,String content){
        this.fname = filename;
        this.content = content;
    }
    @Override
    public void execute() {
        BufferedWriter bfw = null;
        try {
             bfw = new BufferedWriter(
                    new FileWriter(this.fname)
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            bfw.write(this.content);
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                bfw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
