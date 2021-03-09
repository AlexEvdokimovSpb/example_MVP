package gb.myhomework.example_mvp

import android.os.Bundle
import gb.myhomework.example_mvp.databinding.ActivityMainBinding
import gb.myhomework.example_mvp.mvp.model.CountersModel
import gb.myhomework.example_mvp.mvp.presenter.MainPresenter
import gb.myhomework.example_mvp.mvp.view.MainView
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter

class MainActivity : MvpAppCompatActivity(), MainView {

    private val vb: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    private val presenter by moxyPresenter {
        MainPresenter(CountersModel())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(vb.root)

        vb.btnCounter1.setOnClickListener { presenter.counterOneClick() }
        vb.btnCounter2.setOnClickListener { presenter.counterTwoClick() }
        vb.btnCounter3.setOnClickListener { presenter.counterThreeClick() }
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

}