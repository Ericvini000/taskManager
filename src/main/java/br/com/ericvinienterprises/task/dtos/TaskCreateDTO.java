package br.com.ericvinienterprises.task.dtos;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import lombok.Data;
import jakarta.validation.constraints.NotBlank;

@Data
public class TaskCreateDTO {
    @NotBlank(message="Esse campo é obrigatório")
    @Length(message="Precisa de no mínimo 3 caracteres")
    private String title;

    @NotBlank(message="Esse campo é obrigatório")
    @Length(min = 1 ,message="Precisa de no mínimo 1 caracteres")
    private String status;

    @NotBlank(message="Esse campo é obrigatório")
    @Length(message="Precisa de no mínimo 5 caracteres")
    private String description;

    
}
