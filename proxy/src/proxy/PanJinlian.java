package proxy;
/*
* 代理模式 与 装饰模式
* 两者其实本质是一样的：
* 	1.代理与被代理，装饰与被装饰 都实现同一个接口或者类。
* 	2.代理类中持有一个 被代理的对象。
* 两个区别是，代理主要是在代理类中对被代理进行控制，
* 			  装饰主要是在装饰类中对被装饰类进行功能增强。
* */
/**
 * Created by horse on 2017/4/30.
 */
public class PanJinlian  implements KindWomen {
	public void throwEye(){
		System.out.println("抛媚眼");
	}
	public void doSomething(){
		System.out.println("doSomething");
	}
}
