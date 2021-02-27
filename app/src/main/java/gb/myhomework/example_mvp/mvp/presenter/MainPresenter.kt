package gb.myhomework.example_mvp.mvp.presenter

import gb.myhomework.example_mvp.mvp.view.MainView
import gb.myhomework.example_mvp.mvp.model.CountersModel

class MainPresenter(private val mainView: MainView) {
    private val model = CountersModel()

    fun counterClick(id: Int) {
        when (id) {
            BUTTON_ONE -> {
                val nextValue = model.next(0)
                mainView.setOneButtonText(nextValue.toString())
            }
            BUTTON_TWO -> {
                val nextValue = model.next(1)
                mainView.setTwoButtonText(nextValue.toString())
            }
            BUTTON_THREE -> {
                val nextValue = model.next(2)
                mainView.setThreeButtonText(nextValue.toString())
            }
        }
    }

    companion object {
        private const val BUTTON_ONE = 0
        private const val BUTTON_TWO = 1
        private const val BUTTON_THREE = 2
    }
}