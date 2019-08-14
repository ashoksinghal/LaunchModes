package com.example.launchmodes

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class ThirdActivity : AppCompatActivity(), View.OnClickListener {
    val str = StringBuilder(this.javaClass.simpleName)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView2.text = ThirdActivity::class.java.simpleName
        button.setOnClickListener(this)
        updateText("onCreate")
    }

    override fun onRestart() {
        super.onRestart()
        updateText("onRestart")
    }

    override fun onResume() {
        super.onResume()
        updateText("onResume")
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        updateText("onNewIntent")
    }

    override fun onPause() {
        super.onPause()
        updateText("onPause")
    }

    override fun onStop() {
        super.onStop()
        updateText("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        updateText("onDestroy")
    }

    private fun updateText(s: String) {
        str.append(" | ").append(s)
        textView2.text = str.toString()
    }

    override fun onClick(v: View?) {
        val intent: Intent = Intent(this@ThirdActivity, SecondActivity::class.java)
        startActivity(intent)
    }


}
