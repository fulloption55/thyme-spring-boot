package com.example.thymespringboot.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class HandlerInterceptor extends HandlerInterceptorAdapter {
//    @Autowired
//    private LocaleResolver localeResolver;
//
//    private String[] browserCnLocale = { "zh_CN" };
//    private String[] browserTwLocale = { "zh_Hant", "zxh_Hans", "zh_TW", "zh", "zh_CN", "zh__#Hant" };
//    private String[] browserEnLocale = { "en_US", "en" };
//    private String[] browserKoLocale = { "ko_KR", "ko" };
//    private String[] browserJpLocale = { "ja_JP", "ja" };
//
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String requestLocale = request.getLocale().toString();
//        setLocale(request, response, requestLocale);
//
//        return true;
//    }
//
//    private void setLocale(HttpServletRequest request, HttpServletResponse response, String requestLocale) {
//        if (matchPattern(requestLocale, browserEnLocale)) {
//            localeResolver.setLocale(request, response, new Locale("en", "US"));
//            request.setAttribute("locale", "en_US");
//        } else if (matchPattern(requestLocale, browserKoLocale)) {
//            localeResolver.setLocale(request, response, new Locale("ko", "KR"));
//            request.setAttribute("locale", "ko_KR");
//        } else if (matchPattern(requestLocale, browserJpLocale)) {
//            localeResolver.setLocale(request, response, new Locale("ja", "JP"));
//            request.setAttribute("locale", "ja_JP");
//        } else if (matchPattern(requestLocale, browserCnLocale)) {
//            localeResolver.setLocale(request, response, Locale.CHINA);
//            request.setAttribute("locale", "zh_CN");
//        } else if (matchPattern(requestLocale, browserTwLocale)) {
//            localeResolver.setLocale(request, response, Locale.TAIWAN);
//            request.setAttribute("locale", "zh_TW");
//        } else {
//            localeResolver.setLocale(request, response, new Locale("th", "TH"));
//            request.setAttribute("locale", "th_TH");
//        }
//    }
//
//    private boolean matchPattern(String compareString, String[] patterns) {
//        for (String pattern : patterns) {
//            if (compareString.equalsIgnoreCase(pattern)) {
//                return true;
//            }
//        }
//
//        return false;
//    }
}
