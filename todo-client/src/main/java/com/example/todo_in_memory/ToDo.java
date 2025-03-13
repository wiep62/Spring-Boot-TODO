package com.example.todo_in_memory;

import lombok.Data;
import javax.validation.constraints.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ToDo {
  //  @NotNull
    private String id;
  //  @NotNull //это поле != 0
  //  @NotBlank//это поле никогда не будет пустым
    private String deskription;
    private LocalDateTime created;
    private LocalDateTime modified;
    private boolean completed;
public ToDo(){
    LocalDateTime date = LocalDateTime.now();
    this.id  = UUID.randomUUID().toString();
    this.created = date;
    this.modified = date;
}
    public ToDo(String deskription) {
        this();
        this.deskription = deskription;
    }
}
