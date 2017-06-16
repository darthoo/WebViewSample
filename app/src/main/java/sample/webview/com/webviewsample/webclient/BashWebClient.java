package sample.webview.com.webviewsample.webclient;

import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by darthoo on 16.06.17.
 */

public class BashWebClient extends WebViewClient {


    @Override
    public void onPageFinished(WebView view, String url) {
        view.loadUrl(getJsCutFunction());
    }

    private String getJsCutFunction(){
        return "var sliced = text.slice(0,10);\n" +
                "if (sliced.length < text.length) {\n" +
                "sliced += '...';\n" +
                "}";
    }
}

