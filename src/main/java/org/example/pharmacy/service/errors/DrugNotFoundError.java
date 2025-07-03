package org.example.pharmacy.service.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Exception thrown when a drug is not found.
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class DrugNotFoundError extends RuntimeException {
    /**
     * Constructs a DrugNotFoundError with a message including the drug ID.
     * @param id The ID of the drug not found.
     */
    public DrugNotFoundError(long id) {
        super("Drug with id " + id + " was not found");
    }
}