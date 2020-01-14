package hoangytm.muiltiple_languages.i18n;

import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import org.springframework.web.servlet.support.RequestContextUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author PhanHoang
 * 1/13/2020
 */
public class Interceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver(request);

        if (localeResolver == null) {
            throw new IllegalStateException("No LocaleResolver found: not in a DispatcherServlet request?");
        }

        // Lấy ra thông tin Locale từ LocaleResolver URL
        Locale locale = localeResolver.resolveLocale(request);

        localeResolver.setLocale(request, response, locale);

        return true;
    }
}
