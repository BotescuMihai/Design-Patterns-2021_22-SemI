package Services;
import models.*;
public interface Visitor<T> {
	T visitBook(Book b);
	T visitSection(Section s) ;
	T visitTableOfContents(TableOfContents toc);
	T visitParagraph(Paragraph p);
	T visitImageProxy(ImageProxy ip);
	T visitImage(Image i);
	T visitTable(Table t);
}
