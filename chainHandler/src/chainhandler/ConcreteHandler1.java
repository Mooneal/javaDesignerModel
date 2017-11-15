package chainhandler;

/**
 * Created  on 2017/10/26.
 *
 * @author horse
 */

public class ConcreteHandler1 extends Handler{
	@Override
	public void request(int request) {
		if(request<10){
			System.out.println("我是handler1，我处理了请求："+request);
		}else {
			this.handler.request(request);
		}
	}
}
