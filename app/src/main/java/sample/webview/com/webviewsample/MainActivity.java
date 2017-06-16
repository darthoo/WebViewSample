package sample.webview.com.webviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    public static final String URL = "https://www.boxrox.com/training/";
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWebView = (WebView) findViewById(R.id.mainWebView);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url)
            {
                mWebView.loadUrl(constructRemoveUnnecessaryElementsJavaScript());
                mWebView.setVisibility(View.VISIBLE);
            }
        });

        mWebView.loadUrl(URL);
        mWebView.setVisibility(View.GONE);
    }


    private String constructRemoveUnnecessaryElementsJavaScript(){
        String script =  "javascript:(function() { " +
                "document.getElementsByClassName(\"header\")[0].style.display = 'none';\n" +
                "document.getElementsByClassName(\"footer clearfix\")[0].style.display = 'none';\n" +
                "document.getElementsByClassName(\"footer-bottom\")[0].style.display = 'none';\n" +
                "document.getElementById(\"cookie_bar\").style.display = 'none';" +
                "})()";
        return script;
    }
}
