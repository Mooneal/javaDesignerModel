package FilterChain;

/**
 * Created  on 2017/10/26.
 *
 * @author horse
 */

public class EncodeFilter extends FilterChain.AbstractFilter {
	@Override
	public void doFilter(String request, String response, FilterChain filterChain) {
		System.out.println("对request做utf-8编码");
		filterChain.doFilter(request, response);
		System.out.println("对response做utf-8编码");
	}
}
