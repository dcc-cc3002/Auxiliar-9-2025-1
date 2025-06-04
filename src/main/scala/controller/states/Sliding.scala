package controller.states

import controller.GameController
import model.Jake

class Sliding(context:GameController) extends GameState(context){

  override def doStaminaLoss(target: Jake): Unit = {
    target.loseStamina(1)
  }

  override def toRunningState(): Unit = {
    context.setState(new Running(context))
  }
}
