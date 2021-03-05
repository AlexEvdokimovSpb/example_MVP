package gb.myhomework.example_mvp.mvp.presenter

import gb.myhomework.example_mvp.mvp.view.MainView
import gb.myhomework.example_mvp.mvp.model.CountersModel

class MainPresenter(private val mainView: MainView) {
    private val model = CountersModel()

    fun counterOneClick() {
        val nextValue = model.next(BUTTON_ONE)
        mainView.setOneButtonText(nextValue.toString())
    }

    fun counterTwoClick() {
        val nextValue = model.next(BUTTON_TWO)
        mainView.setTwoButtonText(nextValue.toString())
    }

    fun counterThreeClick() {
        val nextValue = model.next(BUTTON_THREE)
        mainView.setThreeButtonText(nextValue.toString())
    }

    companion object {
        private const val BUTTON_ONE = 0
        private const val BUTTON_TWO = 1
        private const val BUTTON_THREE = 2
    }
}