package com.beichen.hookwxx5.plugin;

public class WeixinVer6_6_6 extends WeixinVerBase {

    public WeixinVer6_6_6(){
        initX5();
        initLog();
        initAppBrandSysConfig();
        initWeiXinDebug();
        initAppBrandMenu();
        initAppBrandMenuItem();
        initAppBrandMountJs();
        initAppBrandWebViewClient();
        initAppBrandWebViewInject();
    }
    @Override
    protected void initX5() {
        X5_CLS_WEBVIEW_WEBVIEW = "com.tencent.smtt.sdk.WebView";
        X5_CLS_WEBVIEW_VALUECALLBACK = "com.tencent.smtt.sdk.ab";
        X5_SIMPLE_FUN_WEBVIEW_LOADURL = "loadUrl";
        X5_SIMPLE_FUNC_WEBVIEW_EVALUATEJAVASCRIPT = "evaluateJavascript";
        X5_SIMPLE_FUN_WEBVIEW_LOADDATA = "loadData";
        X5_SIMPLE_FUN_WEBVIEW_LOADDATAWITHBASEURL = "loadDataWithBaseURL";
    }

    @Override
    protected void initLog() {
        WXLOG_CLS_PLATFORMTOOLS_LOG = "com.tencent.mm.sdk.platformtools.w";
        WXLOG_SIMPLE_FUN_LOG_F = "f";
        WXLOG_SIMPLE_FUN_LOG_E = "e";
        WXLOG_SIMPLE_FUN_LOG_W = "w";
        WXLOG_SIMPLE_FUN_LOG_I = "i";
        WXLOG_SIMPLE_FUN_LOG_D = "d";
        WXLOG_SIMPLE_FUN_LOG_V = "v";
        WXLOG_SIMPLE_FUN_LOG_K = "k";
        WXLOG_SIMPLE_FUN_LOG_L = "l";
        ABLOG_CLS_JSAPI_PARMA0 = "com.tencent.mm.plugin.appbrand.j";
        ABLOG_CLS_JSAPI_LOG = "com.tencent.mm.plugin.appbrand.jsapi.al";
        ABLOG_SIMPLE_FUN_JSAPI_LOG = "a";
    }

    @Override
    protected void initAppBrandSysConfig() {
        ABI_CLS_APPBRAND_APPBRANDSYSCONFIG = "com.tencent.mm.plugin.appbrand.config.AppBrandSysConfig";
        ABI_CLS_APPBRAND_WXAPKGWRAPPINGINFO = "com.tencent.mm.plugin.appbrand.appcache.WxaPkgWrappingInfo";
        ABI_CLS_APPBRAND_INIT_CONFIG = "com.tencent.mm.plugin.appbrand.e$15";
        ABI_SIMPLE_FUN_APPBRAND_INIT_CONFIG = "b";
        ABI_FIELD_CONFIG_APPBRAND_DEBUG = "iyI";
        ABI_FIELD_CONFIG_APPBRAND_WXAPKGWRAPPINGINFO = "izv";
        ABI_FIELD_CONFIG_APPBRAND_APPID = "appId";
        ABI_FIELD_CONFIG_APPBRAND_GAMENAME = "etu";
        ABI_FIELD_WRAPPINGINFO_APPBRAND_DEBUG = "iqs";
    }

    @Override
    protected void initWeiXinDebug() {
        ABI_CLS_WEIXIN_CONFIG_DEBUG = "com.tencent.mm.sdk.a.b";
        ABI_SIMPLE_FUN_WEIXIN_CONFIG_DEBUG = "chT";
    }

    @Override
    protected void initAppBrandMenu() {
        ABI_CLS_APPBRAND_MENU_ADD_PARMA1 = "com.tencent.mm.plugin.appbrand.page.p";
        ABI_CLS_APPBRAND_MENU_ADD_PARMA2 = "com.tencent.mm.ui.base.n";
        ABI_SIMPLE_FUN_APPBRAND_MENU_ADD = "a";
        ABI_CLS_APPBRAND_MENU_CHICK_PARMA1 = ABI_CLS_APPBRAND_MENU_ADD_PARMA1;
        ABL_CLS_APPBRAND_MENU_CHICK_PARMA3 = "com.tencent.mm.plugin.appbrand.menu.l";
        ABI_SIMPLE_FUN_APPBRAND_MENU_CHICK = "a";
        ABI_CLS_APPBRAND_MENU_WIDGET_BASE = ABI_CLS_APPBRAND_MENU_ADD_PARMA2;
        ABI_SIMPLE_FUN_APPBRAND_MENU_ADD_WIDGET_BASE = "f";
    }

    @Override
    protected void initAppBrandMenuItem() {
        ABI_CLS_APPBRAND_MENU_DEBUG = "com.tencent.mm.plugin.appbrand.menu.MenuDelegate_EnableDebug";
        ABI_CLS_APPBRAND_MENU_FORWARD = "com.tencent.mm.plugin.appbrand.menu.h";
        ABI_CLS_APPBRAND_MENU_DISPLAYDEBUGGING = "com.tencent.mm.plugin.appbrand.menu.j";
        ABI_CLS_APPBRAND_MENU_APPID = "com.tencent.mm.plugin.appbrand.menu.c";
        ABI_CLS_APPBRAND_MENU_BASE_SHOW = "com.tencent.mm.plugin.appbrand.page.p";
        ABI_SIMPLE_FUN_APPBRAND_MENU_BASE_SHOW = "a";
    }

    @Override
    protected void initAppBrandMountJs() {
        ABI_CLS_APPBRAND_MOUNT_JS = "com.tencent.mm.plugin.appbrand.q.i";
        ABI_SIMPLE_FUN_APPBRAND_MOUNT_JS = "a";
        ABI_CLS_APPBRAND_MOUNT_JS_PARMA0 = "com.tencent.mm.plugin.appbrand.g.b";
        ABI_CLS_APPBRAND_MOUNT_JS_PARMA3 = "com.tencent.mm.plugin.appbrand.q.i$a";
    }

    @Override
    protected void initAppBrandWebViewClient() {
        ABI_CLS_APPBRAND_WEBVIEW_CLIENT0 = "com.tencent.mm.plugin.appbrand.j";
        ABI_FIELD_APPBRAND_WEBVIEW_CLIENT0 = "ibv";
        ABI_CLS_APPBRAND_WEBVIEW_CLIENT1 = "com.tencent.mm.plugin.appbrand.game.d";
        ABI_SIMPLE_FUN_APPBRAND_WEBVIEW_CLIENT1 = "aaK";
    }

    @Override
    protected void initAppBrandWebViewInject() {
        ABI_CLS_APPBRAND_WEBVIEW_INJECT = "com.tencent.mm.plugin.appbrand.game.g";
        ABI_SIMPLE_FUN_APPBRAND_WEBVIEW_EVALUATEJAVASCRIPT = "evaluateJavascript";
    }
}
