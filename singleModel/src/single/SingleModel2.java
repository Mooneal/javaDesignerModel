package single;

/**单例模式2 懒汉式
 * Created by horse on 2017/4/30.
 */
public class SingleModel2 {

	private SingleModel2(){}

	//由于饿汉式会存在一定的内存消耗。所以可以采用饿汉式。
	private static SingleModel2 singleModel=null;


	/*
	这种方式，如果在多线程的情况下，很有可能产生多个对象，这是线程不安全的。
	* */
	public static SingleModel2 getSingleModel(){
		if(singleModel==null){
			singleModel=new SingleModel2();
		}
		return singleModel;
	}
	/*
	* 这种方式，利用了线程同步代码块，在第一次访问的时候才实现同步。不用每次都去同步
	* */
	public static SingleModel2 getSingleModel2(){
		if(singleModel==null){
			synchronized (SingleModel2.class){
				if(singleModel==null)
					singleModel=new SingleModel2();
			}
		}
		return singleModel;
	}

}
