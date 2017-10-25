package single;
/*
* 任何一个类，都只在其被用到的时候才会加载。所以静态内部类，在使用的时候才被加载。即：
*  调用 getSingleModel方法的时候，才会被使用。
*  这样就避免了饿汉式，一开始就创立一个对象。
*    当实例化 或者 类.静态成员  的时候
*    1.获取 类的 .class字节码文件。
*    2. 执行静态代码块 和 初始化静态成员。  静态内部类无任何影响。
*    3. 如果要实例化，那么在堆中的新生代中创建一个对象，并把基本类型初始化。
*    4.调用构造函数。
* */



/** 静态内部类 * 		静态成员，只有被创建对象或者被显示调用的时候，才会加载，且只加载一次。
 * Created by horse on 2017/4/30.
 */
public class SingleModel3 {
	public SingleModel3(){
		System.out.println("single 初始化");
	}
	//静态内部类只是刚好写在了另一个类里面，实际上和外部类没什么附属关系。
	//而私有的静态内部类只能被外类访问到。
	private static  class loadLazy{
		static {
			System.out.println("loadlazy jingtai");
		}
		//final 修饰的变量，不能再被初始化了。
		public loadLazy(){       //当 类.静态成员 的时候，并不会执行构造方法，之后实例化才会。
			System.out.println("loadlazy");
		}
		private static final SingleModel3 SINGLE_MODEL=new SingleModel3();
	}
	static{
		System.out.println("执行静态代码快");
	}
	public static SingleModel3 getSingleModel(){
		//真正调用了getSingleModel方法时，才会加载loadLazy。
		return loadLazy.SINGLE_MODEL;
	}
	public static void get(){
		System.out.println("singleModel3 static");
	}

	public void get2(){
		System.out.println("singleModel no Static");
	}
}
