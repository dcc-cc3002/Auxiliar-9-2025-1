package controller.states

import controller.GameController
import model.Jake

class Jumping(context:GameController)extends GameState(context){


  override def doStaminaLoss(target: Jake): Unit = {
    target.loseStamina(5)
  }
  override def toRunningState(): Unit = {
    context.setState(new Running(context))
  }

  override def toAttackingState(): Unit = {
    context.setState(new Attacking(context))
  }

  override def doAttack(): Unit = {
    this.toAttackingState()
    context.doStaminaLoss()
  }

}
