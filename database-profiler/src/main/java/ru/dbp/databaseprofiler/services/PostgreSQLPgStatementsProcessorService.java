package ru.dbp.databaseprofiler.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.dbp.databaseprofiler.models.PgStatement;
import ru.dbp.databaseprofiler.repositories.PgStatementRepository;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostgreSQLPgStatementsProcessorService {

    private final PgStatementRepository pgStatementRepository;

    public List<PgStatement> getAll(){
        List<PgStatement> statements = pgStatementRepository.findAll();

        return statements;
    }
}
