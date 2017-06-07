package single;

/**
 * Created by horse on 2017/4/30.
 */

public class SingleModel {
	/*
* 单例模式1 饿汉式
* 	缺陷是：不管是否使用这个类，都会创建出这样一个对象。有一定内存消耗。
* 好处是，线程安全。
* */
	private static SingleModel singleModel=new SingleModel();
	private SingleModel(){}
	public static SingleModel getSingleModel(){
		return singleModel;
	}
}
