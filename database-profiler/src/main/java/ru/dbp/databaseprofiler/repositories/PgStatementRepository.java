package ru.dbp.databaseprofiler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dbp.databaseprofiler.models.PgStatement;

import java.util.List;

public interface PgStatementRepository extends JpaRepository<PgStatement,Long> {
    List<PgStatement> findTop5ByOrderByTotalExecTimeDesc();
}
