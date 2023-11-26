package ru.dbp.queryexecutorservice.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.dbp.queryexecutorservice.models.Song;
import ru.dbp.queryexecutorservice.services.SongService;

import java.util.List;

@RestController
@RequestMapping("/songs")
@RequiredArgsConstructor
public class SongController {

    private final SongService songService;

    @GetMapping("/longerThan")
    public ResponseEntity<?> getSongsLongerThan() {
        return ResponseEntity.ok(songService.findByDurationInSecondsGreaterThan(300));
    }
    @GetMapping()
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(songService.getAllSongs());
    }
    @PostMapping("/addRandomSongs/{numberOfSongs}")
    public ResponseEntity<String> addRandomSongs(@PathVariable int numberOfSongs) {
            songService.addRandomSongs(numberOfSongs);
            return ResponseEntity.ok(numberOfSongs + " random songs added successfully.");
    }

}