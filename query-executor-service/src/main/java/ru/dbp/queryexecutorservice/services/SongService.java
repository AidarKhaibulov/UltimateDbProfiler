package ru.dbp.queryexecutorservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.dbp.queryexecutorservice.models.Song;
import ru.dbp.queryexecutorservice.repositories.SongRepository;

import java.util.List;
import java.util.Optional;


@Service
@RequiredArgsConstructor
public class SongService {
    private final SongRepository songRepository;


    public List<Song> getAllSongs() {
        return songRepository.findAll();
    }

    public Optional<Song> getSongById(Long id) {
        return songRepository.findById(id);
    }

    public Song createSong(Song song) {
        return songRepository.save(song);
    }


    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }
}
