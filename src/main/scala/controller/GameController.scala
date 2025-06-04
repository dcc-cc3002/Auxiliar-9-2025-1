package controller

import controller.observer.Observer
import controller.states.{Caught, GameState, Running}
import model.Jake

class GameController extends Observer{

  private val Runner:Jake= new Jake
  Runner.registerObserver(this)
  private var state:States =new Running(this)

  def setState(newState:States):Unit={
    state=newState
  }

  def toJumpingState(): Unit={
    state.toJumpingState()
  }

  def toRunningState(): Unit={
    state.toRunningState()
  }
  def toSlidingState(): Unit={
    state.toSlidingState()
  }

  def toAttackingState(): Unit={
    state.toAttackingState()
  }

  def doAttack(): Unit={
    state.doAttack()
  }

  def doSlide(): Unit={
    state.doSlide()
  }

  def doJump(): Unit={
    state.doJump()
  }

  def doStaminaLoss(): Unit={
    state.doStaminaLoss(Runner)
  }


  def update(): Unit = {
    state=new Caught(this)
  }
}
