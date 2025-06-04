package controller.states

import controller.{GameController, States}
import exceptions.{InvalidActionException, InvalidTransitionException}
import model.Jake

abstract class GameState(protected val context:GameController) extends States{

  context.setState(this)

  def toJumpingState():Unit={
    transitionError("toJumpingState")
  }
  def toRunningState(): Unit ={
    transitionError("toRunningState")
  }
  def toAttackingState():Unit={
    transitionError("toAttackingState")
  }
  def toSlidingState():Unit={
    transitionError("toSlidingState")
  }
  def doAttack():Unit={
    ActionError("doAttack")
  }
  def doSlide():Unit={
    ActionError("doSlide")
  }
  def doJump():Unit={
    ActionError("doJump")
  }
  def doStaminaLoss(target:Jake):Unit={
    ActionError("doStaminaLoss")
  }


  private def transitionError(targetState: String): Unit = {
    throw new InvalidTransitionException(
      s"Cannot transition from ${getClass.getSimpleName} to $targetState"
    )
  }

  private def ActionError(action: String): Unit = {
    throw new InvalidActionException(
      s"Cannot do $action in ${getClass.getSimpleName}"
    )
  }

}
