package controller.states

import controller.GameController

class Graffiting(context:GameController) extends GameState(context){

  override def toRunningState(): Unit = {
    context.setState(new Running(context))
  }

}
