package challenge01.json.transformer;

import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractTransformer;

import challenge01.json.object.Log4j2;

public class ObjectTransformer  extends AbstractTransformer {

	private String fileName;
	
	@Override
	protected Object doTransform(Object src, String enc)
			throws TransformerException {
		if(src instanceof Log4j2){
			((Log4j2) src).setName(getFileName());
			return src;
		}
		return null;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	
	
}
