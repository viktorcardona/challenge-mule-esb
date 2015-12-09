package challenge01.json.object;

import java.io.Serializable;


import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class Log4j2 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@JsonProperty("Configuration")
	private Configuration configuration;
	
	private String name;
	
	public Configuration getConfiguration() {
		return configuration;
	}
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*

 <?xml version="1.0" encoding="utf-8"?>
<Configuration>
    <Appenders>
        <RollingFile name="file" fileName="${sys:mule.home}${sys:file.separator}logs${sys:file.separator}challenge01.log" 
                 filePattern="${sys:mule.home}${sys:file.separator}logs${sys:file.separator}challenge01-%i.log">
            <PatternLayout pattern="%d [%t] %-5p %c - %m%n" />
            <SizeBasedTriggeringPolicy size="10 MB" />
            <DefaultRolloverStrategy max="10"/>
        </RollingFile>
    </Appenders>
    <Loggers>
        <!-- CXF is used heavily by Mule for web services -->
        <AsyncLogger name="org.apache.cxf" level="WARN"/>

        <!-- Apache Commons tend to make a lot of noise which can clutter the log-->
        <AsyncLogger name="org.apache" level="WARN"/>

        <!-- Reduce startup noise -->
        <AsyncLogger name="org.springframework.beans.factory" level="WARN"/>

        <!-- Mule classes -->
        <AsyncLogger name="org.mule" level="INFO"/>
        <AsyncLogger name="com.mulesoft" level="INFO"/>

        <!-- Reduce DM verbosity -->
        <AsyncLogger name="org.jetel" level="WARN"/>
        <AsyncLogger name="Tracking" level="WARN"/>
        
        <AsyncRoot level="INFO">
            <AppenderRef ref="file" />
        </AsyncRoot>
    </Loggers>
</Configuration>
	 
	 * */
	
	
	
}
