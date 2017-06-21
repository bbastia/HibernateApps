/*
 * � Creative Energies [2016 - 2017]
 
package org.biswajit.hiberante.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.ce.hub.web.commons.AppConstants;

*//**
 * 
 * @Description CORS filter implementation for allowing cross origin requests.
 *              This filter adds some of the headers in the request so that we
 *              can have the cross origins requests from a different browser & a
 *              different source.
 * 
 * @author Kalyana Pradhan
 * @Date Nov 10, 2016 : 1:20:33 AM
 * @version 1.0
 *//*
@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class CORSFilter implements Filter {

	*//**
	 * The <code>doFilter</code> method of the Filter is called by the container
	 * each time a request/response pair is passed through the chain due to a
	 * client request for a resource at the end of the chain. The FilterChain
	 * passed in to this method allows the Filter to pass on the request and
	 * response to the next entity in the chain.
	 *
	 * <p>
	 * A typical implementation of this method would follow the following
	 * pattern:
	 * <ol>
	 * <li>Examine the request
	 * <li>Optionally wrap the request object with a custom implementation to
	 * filter content or headers for input filtering
	 * <li>Optionally wrap the response object with a custom implementation to
	 * filter content or headers for output filtering
	 * <li>
	 * <ul>
	 * <li><strong>Either</strong> invoke the next entity in the chain using the
	 * FilterChain object (<code>chain.doFilter()</code>),
	 * <li><strong>or</strong> not pass on the request/response pair to the next
	 * entity in the filter chain to block the request processing
	 * </ul>
	 * <li>Directly set headers on the response after invocation of the next
	 * entity in the filter chain.
	 * </ol>
	 *//*
	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse response = (HttpServletResponse) res;
		HttpServletRequest request = (HttpServletRequest) req;

		
		if (!request.getMethod().equals(AppConstants.CORS_OPTIONS)) {
			chain.doFilter(req, res);
		} else {
			response.setHeader("Access-Control-Allow-Origin", "http://173.9.31.5:8080");			
			response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
			response.setHeader("Access-Control-Allow-Headers", "X-Requested-With, Authorization, Access-Control-Allow-Origin, Access-Control-Allow-Methods");
		}
	}

	@Override
	public void init(FilterConfig filterConfig) {
		*//**
		 * Un-Implemented please use the default one instead.
		 *//*
	}

	@Override
	public void destroy() {
		*//**
		 * Un-Implemented please use the default one instead.
		 *//*
	}

}*/