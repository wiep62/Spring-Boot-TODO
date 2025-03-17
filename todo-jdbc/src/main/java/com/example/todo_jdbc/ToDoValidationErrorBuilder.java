package com.example.todo_jdbc;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;
//todo класс-фабрика который создает экземпляр ToDoValidationError
public class ToDoValidationErrorBuilder {
  public static   ToDoValidationError fromBindinqErrors(Errors errors){
        ToDoValidationError error = new ToDoValidationError("Validation failed. " + errors.getErrorCount() + " error(s)");
        for (ObjectError objectError : errors.getAllErrors()) {
            error.addValidationError(objectError.getDefaultMessage());
        }
        return error;
    }
}
