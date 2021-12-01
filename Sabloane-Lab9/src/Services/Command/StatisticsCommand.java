package Services.Command;

import java.util.Map;
import java.util.TreeMap;

public class StatisticsCommand implements Command{
    private String content;
    private String resContent;
    private Map<String, Integer> stats = new TreeMap<String, Integer>();
    public StatisticsCommand(String content){
        this.content = content;
    }
    public String getContent(){
        return this.resContent;
    }
    @Override
    public void execute() {
        String[] lines = this.content.split("\n");
      //  System.out.println(lines);
        for(String line:lines)
        {
            if(line.contains("Capitolul"))
            {
                if(!this.stats.containsKey("sections"))
                    this.stats.put("sections",1);
                else
                    this.stats.put("sections",this.stats.get("sections")+1);
            }
            else
                if(line.contains("Paragraph"))
                {
                    if(!this.stats.containsKey("paragraphs"))
                        this.stats.put("paragraphs",1);
                    else
                        this.stats.put("paragraphs",this.stats.get("paragraphs")+1);
                }
                else
                    if(line.contains("Table"))
                    {
                        if(!this.stats.containsKey("tables"))
                            this.stats.put("tables",1);
                        else
                            this.stats.put("tables",this.stats.get("tables")+1);
                    }
                    else{
                        if(!this.stats.containsKey("images"))
                            this.stats.put("images",1);
                        else
                            this.stats.put("images",this.stats.get("images")+1);
                    }
        }
        System.out.println("Statistics:\n{");
        this.resContent += "{\n";
        for(String key:this.stats.keySet())
            this.resContent +=
                    String.format(
                            "\"%s\":%d,",
                            key,
                            this.stats.
                                    get(key));

        this.resContent += "\n}";
        System.out.println(this.resContent);
    }
}
