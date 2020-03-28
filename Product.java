package in.nit.LOG;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Product {
	private static Logger log=Logger.getLogger(Product.class);
	public static void main(String[] args) {
		Layout layout=new SimpleLayout();
		Appender ap=new ConsoleAppender(layout);
		log.addAppender(ap);
		log.info("Hello");
	}
}
