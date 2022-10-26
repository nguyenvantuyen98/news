package com.savvycom.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.savvycom.news.ui.news_list.NewsListFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, NewsListFragment.newInstance())
                .commitNow()
        }
    }
}