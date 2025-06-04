package model

import controller.observer.{Observer, Subject}

import scala.collection.mutable.ListBuffer

class Jake extends Subject {
  private var Stamina = 100
  private val observers: ListBuffer[Observer] = ListBuffer()

  def getStamina: Int = {
    Stamina
  }

  def loseStamina(loss:Int): Unit = {
    if (Stamina - loss < 0) {
      notifyObserver()
    }
    else
      Stamina=Stamina - loss
  }

  def registerObserver(observer: Observer): Unit = {
    observers += observer
  }

  def notifyObserver():Unit={
    observers.foreach(_.update())
  }

}
