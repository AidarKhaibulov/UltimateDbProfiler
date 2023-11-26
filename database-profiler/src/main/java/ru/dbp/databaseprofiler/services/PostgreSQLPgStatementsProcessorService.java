package ru.dbp.databaseprofiler.services;

import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.dbp.databaseprofiler.models.PgStatement;
import ru.dbp.databaseprofiler.repositories.PgStatementRepository;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostgreSQLPgStatementsProcessorService {

    private final PgStatementRepository pgStatementRepository;

    @Value("${spring.datasource.username}")
    private String currentUser;

    public List<PgStatement> getTop5SlowestQueries(){
        List<PgStatement> statements = pgStatementRepository.findStatementsByUserIdOrderByTotalExecTimeDesc(currentUser);

        return statements;
    }
}
