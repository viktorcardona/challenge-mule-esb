package challenge01.json.object;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonProperty;

public class AsyncRoot  implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@JsonProperty("@level")
	private String level;
	
	@JsonProperty("AppenderRef")
	private AppenderRef ref;
	
	

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public AppenderRef getRef() {
		return ref;
	}

	public void setRef(AppenderRef ref) {
		this.ref = ref;
	}
	
	
}
