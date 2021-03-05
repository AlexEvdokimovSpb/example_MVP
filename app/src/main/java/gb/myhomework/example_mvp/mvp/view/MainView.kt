package gb.myhomework.example_mvp.mvp.view

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType

@StateStrategyType(AddToEndSingleStrategy::class)
interface MainView : MvpView {
    fun setOneButtonText(text: String)
    fun setTwoButtonText(text: String)
    fun setThreeButtonText(text: String)
}