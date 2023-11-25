package ru.dbp.queryexecutorservice;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final ModelRepository repository;
    @PostMapping(value = "/post")
    public ResponseEntity<?> post(){
        Model model= new Model();
        model.setName("sdfsdf");
        return ResponseEntity.ok(repository.save(model));
    }
}
