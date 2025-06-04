package controller.states

import controller.GameController
import model.Jake

class Attacking(context:GameController) extends GameState(context){

  override def doStaminaLoss(target:Jake):Unit={
    target.loseStamina(10)
  }

  override def toRunningState(): Unit = {
    context.setState(new Running(context))
  }

}
