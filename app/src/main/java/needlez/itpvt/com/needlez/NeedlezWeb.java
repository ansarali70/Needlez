package needlez.itpvt.com.needlez;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class NeedlezWeb extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_needlez_web);
        wv=(WebView) findViewById(R.id.webview);
        wv.loadUrl("http://www.needlezbyshalimar.com");
    }
}
