package br.com.ericvinienterprises.task.exceptions.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class ErrorMessageDTO {
    public String message;
    public String field;
}
