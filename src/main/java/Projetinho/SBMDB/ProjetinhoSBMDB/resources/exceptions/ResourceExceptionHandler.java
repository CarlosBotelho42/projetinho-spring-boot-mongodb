package Projetinho.SBMDB.ProjetinhoSBMDB.resources.exceptions;

import Projetinho.SBMDB.ProjetinhoSBMDB.services.exceptions.IDNFEX;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(value = IDNFEX.class)
    public ResponseEntity<StandardError> objectNotFound(IDNFEX e, HttpServletRequest request){

        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "Não encontrado",
                e.getMessage(), request.getRequestURI());

        return ResponseEntity.status(status).body(err);

    }


}
