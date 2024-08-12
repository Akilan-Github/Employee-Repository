package com.example.employee.exception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(AgeException.class)
	public ResponseEntity<String> responseAge(AgeException ae){
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NameNotFoundException.class)
	public ResponseEntity<String> responseName(NameNotFoundException ae){
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(StartsWithException.class)
	public ResponseEntity<String> reStartsWith(StartsWithException ae){
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(AlreadyExistException.class)
	public ResponseEntity<String> reS(AlreadyExistException ae){
		return new ResponseEntity<>(ae.getMessage(),HttpStatus.NOT_FOUND);
	}


}
