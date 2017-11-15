package FilterChain;

/**
 * Created  on 2017/10/26.
 *
 * @author horse
 */

public abstract class AbstractFilter {
	public abstract void doFilter(String request,String response,FilterChain filterChain);
}
