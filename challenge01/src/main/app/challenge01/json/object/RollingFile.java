package challenge01.json.object;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class RollingFile  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("@name")
	private String name;
	
	@JsonProperty("@fileName")
	private String fileName;
	
	@JsonProperty("@filePattern")
	private String filePattern;
	
	@JsonProperty("PatternLayout")
	private PatternLayout patternLayout;
	
	@JsonProperty("SizeBasedTriggeringPolicy")
	private SizeBasedTriggeringPolicy sizeBasedTriggeringPolicy;
	
	@JsonProperty("DefaultRolloverStrategy")
	private DefaultRolloverStrategy defaultRolloverStrategy;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFilePattern() {
		return filePattern;
	}
	public void setFilePattern(String filePattern) {
		this.filePattern = filePattern;
	}
	public PatternLayout getPatternLayout() {
		return patternLayout;
	}
	public void setPatternLayout(PatternLayout patternLayout) {
		this.patternLayout = patternLayout;
	}
	public SizeBasedTriggeringPolicy getSizeBasedTriggeringPolicy() {
		return sizeBasedTriggeringPolicy;
	}
	public void setSizeBasedTriggeringPolicy(
			SizeBasedTriggeringPolicy sizeBasedTriggeringPolicy) {
		this.sizeBasedTriggeringPolicy = sizeBasedTriggeringPolicy;
	}
	public DefaultRolloverStrategy getDefaultRolloverStrategy() {
		return defaultRolloverStrategy;
	}
	public void setDefaultRolloverStrategy(
			DefaultRolloverStrategy defaultRolloverStrategy) {
		this.defaultRolloverStrategy = defaultRolloverStrategy;
	}
	
	
}
