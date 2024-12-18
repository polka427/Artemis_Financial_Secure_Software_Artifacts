import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(Exception.class)
	public ResponseEntity<String> handleException(Exception e) {
		// Log error (avoid exposing sensitive information)
		System.err.println(e.getMessage());
		return new ResponseEntity<>("An error occurred. Please try again later. ", HttpStatus.INTERNAL_SERVER_ERROR);
	}
}