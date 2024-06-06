package br.com.ericvinienterprises.task;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepo;

    public List<TaskEntity> read(){
        return taskRepo.findAll();
    };

    public TaskEntity create(@RequestBody TaskEntity payload){
        taskRepo.save(payload);
        return payload;
    };

    public TaskEntity retrieve(UUID uuid) {
        return taskRepo.findById(uuid).get();
    }

    public void remove(UUID uuid) {
        TaskEntity task = taskRepo.findById(uuid).get();
        taskRepo.delete(task);
        return;
    }
    
}
