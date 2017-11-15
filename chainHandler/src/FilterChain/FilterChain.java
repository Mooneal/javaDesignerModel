package FilterChain;

import java.util.ArrayList;

/**
 * Created  on 2017/10/26.
 *
 * @author horse
 */

public class FilterChain {
	private int cursor;
	private ArrayList<AbstractFilter> filters=new ArrayList<>();
	public Servlet servlet;

	//添加过滤器
	public void addFilter(AbstractFilter filter){
		this.filters.add(filter);
	}

	public void doFilter(String request,String response){
		if(cursor<filters.size()){
			//把责任链中对象放到一个list集合中。依次调用
			filters.get(cursor++).doFilter(request,response,this);
		}else{
			servlet.service(request,response);
		}
	}
}
