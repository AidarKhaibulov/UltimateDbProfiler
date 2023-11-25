package ru.dbp.databaseprofiler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.dbp.databaseprofiler.models.PgStatement;

public interface PgStatementRepository extends JpaRepository<PgStatement,Long> {
}
