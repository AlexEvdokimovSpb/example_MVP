package gb.myhomework.example_mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import gb.myhomework.example_mvp.databinding.ActivityMainBinding
import gb.myhomework.example_mvp.mvp.presenter.MainPresenter
import gb.myhomework.example_mvp.mvp.view.MainView

class MainActivity : AppCompatActivity(), MainView {

    private val vb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val presenter = MainPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(vb.root)

        fun listener(id: Int) = View.OnClickListener {
            presenter.counterClick(id)
        }

        vb.btnCounter1.setOnClickListener(listener(BUTTON_ONE))
        vb.btnCounter2.setOnClickListener(listener(BUTTON_TWO))
        vb.btnCounter3.setOnClickListener(listener(BUTTON_THREE))
    }

    override fun setOneButtonText(text: String) {
        vb.btnCounter1.text = text
    }

    override fun setTwoButtonText(text: String) {
        vb.btnCounter2.text = text
    }

    override fun setThreeButtonText(text: String) {
        vb.btnCounter3.text = text
    }

    companion object {
        private const val BUTTON_ONE = 0
        private const val BUTTON_TWO = 1
        private const val BUTTON_THREE = 2
    }
}