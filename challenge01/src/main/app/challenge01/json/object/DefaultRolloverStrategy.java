package challenge01.json.object;

import java.io.Serializable;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonProperty;

@JsonAutoDetect
public class DefaultRolloverStrategy  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@JsonProperty("@max")
	private String max;

	public String getMax() {
		return max;
	}

	public void setMax(String max) {
		this.max = max;
	}
	
	
}
