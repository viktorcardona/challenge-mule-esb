package challenge01.json.transformer;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.api.transport.PropertyScope;
import org.mule.transformer.AbstractMessageTransformer;

import challenge01.json.object.Log4j2;

/**
 * http://stackoverflow.com/questions/15083985/how-to-pass-variable-from-xml-to-java-class-in-mule
 * http://stackoverflow.com/questions/26291931/access-mule-global-variable-from-a-custom-transformer
 * 
 * @author viccardo
 *
 */
public class Log4JTransformer extends AbstractMessageTransformer {

	@Override
	public Object transformMessage(MuleMessage message, String outputEncoding)
			throws TransformerException {
		Object src = message.getPayload();
		if(src instanceof Log4j2){
			final String fileName = message.getProperty("fileName", PropertyScope.INVOCATION);
			((Log4j2) src).setName(fileName);
			return src;
		}
		return null;
	}

}
