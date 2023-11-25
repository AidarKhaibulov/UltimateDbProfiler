package ru.dbp.databaseprofiler.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.dbp.databaseprofiler.services.PostgreSQLPgStatementsProcessorService;

@RestController
@RequiredArgsConstructor
public class DatabaseStatsController {
    private final PostgreSQLPgStatementsProcessorService pgStatementsProcessorService;
    @GetMapping("/test")
    public ResponseEntity<?> getAll(){
        return ResponseEntity.ok(pgStatementsProcessorService.getAll());
    }
}
