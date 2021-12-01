package Services.JSONVisitor;

import Services.ImageProxy;
import Services.Visitee;
import Services.Visitor;
import models.*;
import javax.json.*;
import java.io.File;
import java.util.LinkedList;

public class JSONVisitor implements Visitor<String> {
    private String file;
    public JSONVisitor(String filename){
        this.file = filename;
    }
    public String getJSONFile(){
        return this.file;
    }
    public String visitAuthor(Author aut){
        return String.format(
            "{\"name\":%s,\n\"surname\":%s}",
            aut.getName(),
            aut.getSurname()
        );
    }

    @Override
    public String visitBook(Book b) {
        String authors = "";
        for(Author aut: b.getAuthors())
        {
            authors = authors + visitAuthor(aut) + ",\n";
        }
        return String.format(
                "{\"title\":%s,\n\"authors\":%s}",
                b.getTitle(),
                authors);
    }



    @Override
    public String visitSection(Section s) {
        return String.format(
                "{\"title\":%s}",
                s.getTitle());
    }

    @Override
    public String visitTableOfContents(TableOfContents toc) {
        String result = "{";
        int i = 1;
        for(String content : toc.getContents())
        {
            result += String.format(
                    "\"Content %d\":%s",
                    i,
                    content);
        }
        result += "}";
        return result;
    }

    @Override
    public String visitParagraph(Paragraph p) {
       return String.format(
               "{\"text\":%s}",
               p.getText()
       );
    }

    @Override
    public String visitImageProxy(ImageProxy ip) {
        return String.format(
                "{\"url\":%s,\n" +
                        "\"dimension\":%s,\n" +
                        "\"image\":%s}\n",
                ip.url(),
                ip.dim(),
                this.visitImage(ip.loadImage())
        );
    }

    @Override
    public String visitImage(Image i) {
        return i != null ? i.getPc() != null ? String.format(
                "{\"url\":%s,\n"+
                        "\"pictureContent:\"{" +
                        "\n\"colors\":%s}" +
                        "\n}",
                i.getUrl(),
                i.getPc()
                        .getColors()
        )
                :
                String.format(
                "{\"url\":%s"+
                       "}",
                i.getUrl()
        )
                : null;
    }

    @Override
    public String visitTable(Table t) {
        return String.format(
                "{\"title\":%s}",
                t.getTitle()
        );
    }


}
