package models;
import Services.*;
import Services.Command.Command;
import Services.Command.OpenCommand;
import Services.Command.SaveCommand;
import Services.Command.StatisticsCommand;
import Services.JSONVisitor.JSONVisitor;

public class Main {
	public static void main(String[] args) throws Exception {
		Section cap1 = new Section("Capitolul 1");
		Paragraph p1 = new Paragraph("Paragraph 1");
		cap1.add(p1);
		Paragraph p2 = new Paragraph("Paragraph 2");
		cap1.add(p2);
		Paragraph p3 = new Paragraph("Paragraph 3");
		cap1.add(p3);
		Paragraph p4 = new Paragraph("Paragraph 4");
		cap1.add(p4);
		cap1.add(new ImageProxy("ImageOne"));
		cap1.add(new Image("ImageTwo",null));
		cap1.add(new Paragraph("Some text"));
		cap1.add(new Table("Table 1"));
		BookStatistics stats = new BookStatistics();
		stats.visitParagraph(p1);
		stats.visitSection(cap1);
		stats.visitParagraph(p2);
		stats.visitImage(new Image("ImageOne", null));
		//cap1.accept(stats);
	//	stats.printStatistics();
		cap1.accept(new JSONVisitor("books.json"));
		Command oc = new OpenCommand("books.json");
		oc.execute();
		Command scd = new StatisticsCommand(((OpenCommand) oc).getContent());
		scd.execute();
		Command svcd = new SaveCommand("books_statistics.json", ((StatisticsCommand) scd).getContent());
		svcd.execute();
		}
    }

