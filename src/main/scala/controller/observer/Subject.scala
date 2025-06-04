package controller.observer

trait Subject {
  def registerObserver(observer: Observer):Unit
  def notifyObserver():Unit
}
