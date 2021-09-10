package com.example.webviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

   private lateinit var webView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView = findViewById(R.id.mywebView)

        webView.settings.javaScriptEnabled = true //자바스크립트 허용

        /*웹뷰에서 새 창이 뜨지 않도록 방지하는 구문 (안하면 기존의 웹뷰 액티비티 화면이아니고 새로운창 띄워버림)*/
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()

        webView.loadUrl("http://3.37.96.107:5000") // 링크 주소 로드

    }


}