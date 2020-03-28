package in.nit.LOG;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;

public class HtmlLayOutProgram {
	private static Logger log=Logger.getLogger(HtmlLayOutProgram.class);
	
	public static void main(String[] args) {
		Layout layout=new HTMLLayout();
		Appender ap=new ConsoleAppender(layout);
		log.addAppender(ap);
		
		log.debug("Hello");
		log.info("Hii");
		log.warn("hii");
		log.error("Hello");
		log.fatal("Correct");
	}
}
