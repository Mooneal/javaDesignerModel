package chainhandler;

/**
 * Created  on 2017/10/26.
 *
 * @author horse
 */

public class ConcreteHandler2 extends  Handler {
	private final int FLAG=10;
	@Override
	public void request(int request) {
		if(request>FLAG){
			System.out.println("我是handler2，我处理了请求："+request);
		}else {
			System.out.println("请求"+request+"没人能处理");
		}
	}
}
