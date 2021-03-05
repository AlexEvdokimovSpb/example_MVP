package gb.myhomework.example_mvp.mvp.presenter

import gb.myhomework.example_mvp.mvp.view.MainView
import gb.myhomework.example_mvp.mvp.model.CountersModel
import moxy.MvpPresenter

class MainPresenter(private val model: CountersModel) : MvpPresenter<MainView>() {

    fun counterOneClick() {
        val nextValue = model.next(BUTTON_ONE)
        viewState.setOneButtonText(nextValue.toString())
    }

    fun counterTwoClick() {
        val nextValue = model.next(BUTTON_TWO)
        viewState.setTwoButtonText(nextValue.toString())
    }

    fun counterThreeClick() {
        val nextValue = model.next(BUTTON_THREE)
        viewState.setThreeButtonText(nextValue.toString())
    }

    companion object {
        private const val BUTTON_ONE = 0
        private const val BUTTON_TWO = 1
        private const val BUTTON_THREE = 2
    }
}