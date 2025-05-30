package controller

import model.Jake

trait States {

  def toJumpingState():Unit
  def toRunningState():Unit
  def toAttackingState():Unit
  def toSlidingState():Unit
  def doAttack():Unit
  def doSlide():Unit
  def doJump():Unit
  def doStaminaLoss(target:Jake):Unit
}
