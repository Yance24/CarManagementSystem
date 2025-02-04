package com.example.carmanagementsystem

import android.content.Intent
import android.net.Uri
import android.net.http.SslError
import android.os.Bundle
import android.util.Log
import android.webkit.CookieManager
import android.webkit.SslErrorHandler
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.carmanagementsystem.ui.theme.CarManagementSystemTheme
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity


class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val webView: WebView = findViewById(R.id.webview)
//
//        // Enable JavaScript
//        webView.settings.javaScriptEnabled = true
//
//        // Enable caching
//        webView.settings.cacheMode = WebSettings.LOAD_DEFAULT
//
//        val cookieManager = android.webkit.CookieManager.getInstance()
//        cookieManager.setAcceptCookie(true)
//
//        webView.settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
//
//        webView.webViewClient = object : WebViewClient() {
//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//                // Allow the WebView to handle redirects
//                return false
//            }
//        }
//
//        // Set a WebViewClient to handle navigation
//        webView.webViewClient = object : WebViewClient() {
//            override fun onReceivedError(
//                view: WebView?,
//                request: WebResourceRequest?,
//                error: WebResourceError?
//            ) {
//                super.onReceivedError(view, request, error)
//                Log.e("WebViewError", "Error: ${error?.description}")
//            }
//        }
//
//        // Clear cache before loading the URL
//        webView.clearCache(true)
//
//        // Load the dashboard URL
//        webView.loadUrl("https://dev.vehicle.hilon.co.id/")
//    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define the URL
        val url = "https://car.hilon.co.id/mobile"
//        var url = "http://192.168.4.202:9091/"


        // Create an intent to open the browser
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)

        // Close the app
        finish()
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarManagementSystemTheme {
        Greeting("Android")
    }
}