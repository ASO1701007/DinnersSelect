package jp.ac.asojuku.st.dinnersselect

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt0.setOnClickListener { onSelectButtonTaped(it) };
        bt1.setOnClickListener { onKakuninButtonTaped(it) };
    }
    //選択ボタンが押された時
    fun onSelectButtonTaped(view: View?){

    }

    //確認ボタンが押された時
    fun onKakuninButtonTaped(view: View?){

    }
    //画面
}
