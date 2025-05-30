package exceptions

/**
 * Exception thrown when an invalid action is attempted in the game.
 *
 * @param message The error message describing the reason for the exception.
 */
class InvalidActionException(message:String) extends Exception(message){

}
