package proxy;

import javax.tools.Diagnostic;

/**
 * Created by horse on 2017/4/30.
 */
public class WangPo implements KindWomen {
	private KindWomen kindWomen;
	public WangPo(KindWomen kindWomen){
		this.kindWomen=kindWomen;
	}
	@Override
	public void throwEye() {
		if(true)                    //控制突出了代理的功能。
			kindWomen.throwEye();
		System.out.println("传递给武松");  //加强功能突出了装饰的功能。
	}

	@Override
	public void doSomething() {
		kindWomen.doSomething();
	}
}
