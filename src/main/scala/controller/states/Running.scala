package controller.states

import controller.GameController

class Running(context:GameController)extends GameState(context){

  override def doAttack(): Unit = {
    this.toAttackingState()
    context.doStaminaLoss()
  }

  override def doJump(): Unit = {
    this.toJumpingState()
    context.doStaminaLoss()

  }

  override def doSlide(): Unit = {
    this.toSlidingState()
    context.doStaminaLoss()
  }

  override def toAttackingState(): Unit = {
    context.setState(new Attacking(context))
  }

  override def toJumpingState(): Unit = {
    context.setState(new Jumping(context))
  }



}
