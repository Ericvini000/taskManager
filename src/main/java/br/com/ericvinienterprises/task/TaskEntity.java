package br.com.ericvinienterprises.task;

import java.util.UUID;
import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity(name="tasks")
public class TaskEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    private UUID id;

    @Column(nullable=false)
    private String title;

    @Column(nullable=false)
    private String status;
    
    @Column(nullable=false)
    private String description;
}
