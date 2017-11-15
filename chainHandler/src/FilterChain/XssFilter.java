package FilterChain;

/**
 * Created  on 2017/10/26.
 *
 * @author horse
 */

public class XssFilter extends AbstractFilter {
	@Override
	public void doFilter(String request, String response, FilterChain filterChain) {
		System.out.println("过滤request的xss内容");
		filterChain.doFilter(request, response);
		System.out.println("过滤response的xss内容");
	}
}
