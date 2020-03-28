package in.nit.LOG;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.XMLLayout;

public class XmlLayOutProgram {
	private static Logger log=Logger.getLogger(XmlLayOutProgram.class);
	
	public static void main(String[] args) {
		Layout layout=new XMLLayout();
		Appender ap=new ConsoleAppender(layout);
		log.addAppender(ap);
		hii
		log.debug("HIii");
		log.info("HIii");
		log.warn("HIii");
		log.error("HIii");
		log.fatal("HIii");
	}
}
