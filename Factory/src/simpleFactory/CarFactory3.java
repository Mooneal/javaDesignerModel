package simpleFactory;

import java.lang.reflect.Type;

/**
 * Created  on 2017/10/25.
 *
 * @author horse
 */

public class CarFactory3 {
	/**
	 * 因为泛型类中的泛型参数的实例化是在定义泛型类型对象（例如ArrayList<Integer>）的时候指定的，
	 * 而静态变量和静态方法不需要使用对象来调用。
	 * 对象都没有创建，如何确定这个泛型参数是何种类型，所以当然是错误的。
	 * @param clazz
	 * @return
	 *
	 * 这中工厂模式，有个很大的问题就是 reflection 的效率问题。
	 * 一般来说，
	 */
	public static Object getCar(Class clazz){

		Object t=null;
		try {
			t=clazz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return t;
	}
}
