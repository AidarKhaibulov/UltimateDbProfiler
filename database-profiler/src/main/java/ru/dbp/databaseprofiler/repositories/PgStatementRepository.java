package ru.dbp.databaseprofiler.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.dbp.databaseprofiler.models.PgStatement;

import java.util.List;

public interface PgStatementRepository extends JpaRepository<PgStatement,Long> {
    @Query(value = "SELECT * FROM pg_stat_statements p WHERE p.userid = (SELECT u.usesysid FROM pg_user u WHERE u.usename = :username) ORDER BY p.total_exec_time DESC", nativeQuery = true)
    List<PgStatement> findStatementsByUserIdOrderByTotalExecTimeDesc(@Param("username") String username);
}
