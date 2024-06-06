package br.com.ericvinienterprises.task;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, UUID> {
    
}
