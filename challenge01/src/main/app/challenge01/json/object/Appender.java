package challenge01.json.object;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class Appender  implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("RollingFile")
	private RollingFile rollingFile;

	public RollingFile getRollingFile() {
		return rollingFile;
	}

	public void setRollingFile(RollingFile rollingFile) {
		this.rollingFile = rollingFile;
	}
	
	
	
}
