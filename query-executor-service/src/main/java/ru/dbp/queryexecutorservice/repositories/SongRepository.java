package ru.dbp.queryexecutorservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dbp.queryexecutorservice.models.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

}