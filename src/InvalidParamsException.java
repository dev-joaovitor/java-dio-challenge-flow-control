public class InvalidParamsException extends Exception {
    String message;
    public InvalidParamsException(String exceptionMessage){
        this.message = "Invalid Params | " + exceptionMessage;
    }
}
