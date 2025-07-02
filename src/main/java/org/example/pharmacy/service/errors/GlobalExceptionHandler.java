package org.example.pharmacy.service.errors;

import org.example.pharmacy.service.errors.DrugNotFoundError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * GlobalExceptionHandler class to handle exceptions across the whole application.
 * This class uses @ControllerAdvice to provide centralized exception handling
 * for various types of exceptions, including validation errors and custom exceptions.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles MethodArgumentNotValidException, which is thrown when
     * @Valid or @Validated annotated arguments fail validation.
     * It collects all field errors and returns them in a structured JSON response.
     *
     * @param ex The MethodArgumentNotValidException thrown during validation.
     * @return A ResponseEntity containing detailed validation errors and HttpStatus.BAD_REQUEST.
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponseEntity<Map<String, Object>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        // Iterate over all field errors and add them to the errors map
        ex.getBindingResult().getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        // Create a structured response body
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("timestamp", LocalDateTime.now());
        responseBody.put("status", HttpStatus.BAD_REQUEST.value());
        responseBody.put("error", "Bad Request");
        responseBody.put("message", "Validation failed for object='" + ex.getBindingResult().getObjectName() + "'. Error count: " + ex.getBindingResult().getErrorCount());
        responseBody.put("validationErrors", errors); // Detailed field errors
        responseBody.put("path", ex.getBindingResult().getTarget().getClass().getSimpleName()); // Get the class name of the validated object

        return new ResponseEntity<>(responseBody, HttpStatus.BAD_REQUEST);
    }

    /**
     * Handles DrugNotFoundError, a custom exception for when a drug is not found.
     * Returns a 404 Not Found status with a specific error message.
     *
     * @param ex The DrugNotFoundError thrown.
     * @return A ResponseEntity containing the error message and HttpStatus.NOT_FOUND.
     */
    @ExceptionHandler(DrugNotFoundError.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<Map<String, Object>> handleDrugNotFoundException(DrugNotFoundError ex) {
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("timestamp", LocalDateTime.now());
        responseBody.put("status", HttpStatus.NOT_FOUND.value());
        responseBody.put("error", "Not Found");
        responseBody.put("message", ex.getMessage());
        // In a real application, you might want to dynamically get the request path
        // For simplicity, we'll leave it as a placeholder or remove it if not needed.
        responseBody.put("path", "/api/drugs/{id}"); // Example path for drug not found

        return new ResponseEntity<>(responseBody, HttpStatus.NOT_FOUND);
    }

    /**
     * Handles any other unhandled RuntimeExceptions.
     * Provides a generic error message and HttpStatus.INTERNAL_SERVER_ERROR.
     *
     * @param ex The RuntimeException thrown.
     * @return A ResponseEntity containing a generic error message and HttpStatus.INTERNAL_SERVER_ERROR.
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Map<String, Object>> handleAllOtherExceptions(RuntimeException ex) {
        Map<String, Object> responseBody = new HashMap<>();
        responseBody.put("timestamp", LocalDateTime.now());
        responseBody.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        responseBody.put("error", "Internal Server Error");
        responseBody.put("message", "An unexpected error occurred: " + ex.getMessage());
        responseBody.put("path", "N/A"); // Path might not be directly available for all runtime exceptions

        return new ResponseEntity<>(responseBody, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
