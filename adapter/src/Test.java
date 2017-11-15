import java.io.BufferedInputStream;

/**
 * Created by horse on 2017/7/18.
 */

public class Test {
	@org.junit.Test
	public void testAdapter1(){
		SourceOrderApi sourceOrderApi = new SourceOrderApiImp();
		sourceOrderApi.updateDate("123456", "2014-10-15", "user");
	}

	@org.junit.Test
	public void testAdapter2(){
		AppOrderApi appOrderApi=new AppOrderApiImp();
		appOrderApi.updateDate("123456", "user");
	}
}
