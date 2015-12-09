package challenge01.json.object;


import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class Configuration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("Loggers")
	private Logger logger;
	
	@JsonProperty("Appenders")
	private Appender appenders;
	
	
	
	
	
	public Logger getLogger() {
		return logger;
	}
	public void setLogger(Logger logger) {
		this.logger = logger;
	}
	public Appender getAppenders() {
		return appenders;
	}
	public void setAppenders(Appender appenders) {
		this.appenders = appenders;
	}
	
	
}
