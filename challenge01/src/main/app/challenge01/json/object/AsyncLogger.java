package challenge01.json.object;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class AsyncLogger implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 4741824645088912796L;
	
	@JsonProperty("@name")
	private String name;
	
	@JsonProperty("@level")
	private String level;

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	
}
