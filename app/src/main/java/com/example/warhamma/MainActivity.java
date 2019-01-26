package com.example.warhamma;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.webkit.WebView;

import static android.util.Base64.*;

public class MainActivity extends AppCompatActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);

        // NOTE: either load a webpage or an unencoded HTML, as there is only webview, loading both crashes the app!

        // code base for web page input
        // loadURL("https://www.google.se/");
        //myWebView.loadUrl("https://www.google.se/");
        myWebView.loadUrl("http://warhammahweb.azurewebsites.net/");


        //code base for static html input
        //String unencodedHtml =
           //     "<html><h1>hello David!</h1><table><tr><th>Type</th><th>Quantity</th></tr></tr><th>Orc</th><th>10</th></tr><tr><th>Marine</th><th>20</th></tr></table></html>";
        //loadUnencodedHTMLAsString(unencodedHtml);
        //String encodedHtml = encodeToString(unencodedHtml.getBytes(), NO_PADDING);
        //myWebView.loadData(encodedHtml, "text/html", "base64");

        // src:
        //https://developer.android.com/guide/webapps/webview#java
    }

    // loads an url into myWebView
    public void loadURL(String inputURL){
        myWebView.loadUrl(inputURL);
    }
}
