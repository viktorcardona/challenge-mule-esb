package challenge01.json.object;

import java.io.Serializable;
import java.util.List;

import org.codehaus.jackson.annotate.JsonProperty;

public class Logger  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	@JsonProperty("AsyncLogger")
	private List<AsyncLogger> logger;
	
	
	@JsonProperty("AsyncRoot")
	private AsyncRoot asyncRoot;
	
	

	public AsyncRoot getAsyncRoot() {
		return asyncRoot;
	}

	public void setAsyncRoot(AsyncRoot asyncRoot) {
		this.asyncRoot = asyncRoot;
	}

	public List<AsyncLogger> getLogger() {
		return logger;
	}

	public void setLogger(List<AsyncLogger> logger) {
		this.logger = logger;
	}
	
	
}
