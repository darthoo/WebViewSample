package sample.webview.com.webviewsample.webinterface;

import android.content.Context;
import android.webkit.JavascriptInterface;

/**
 * Created by darthoo on 16.06.17.
 */

public class BashInterface {

    Context mContext;

    public BashInterface(Context mContext) {
        this.mContext = mContext;
    }

    @JavascriptInterface
    public void cutText(){

    }
}
