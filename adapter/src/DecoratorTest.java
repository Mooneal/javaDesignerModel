import org.junit.*;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by horse on 2017/7/19.
 */

public class DecoratorTest {
	@org.junit.Test
	public void test(){
	//	Input in=new Input(); 不能直接实例化
		Input in=new FilterInput(new FileInput());  //这样也是不行的。因为FilterInput中持有一个Input类型
		in.read();
		BufferInput bufferInput=new BufferInput(in);
		bufferInput.read();
	}
}
