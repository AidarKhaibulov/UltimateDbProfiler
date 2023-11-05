package ru.dbp.databaseprofiler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@SpringBootApplication
@EnableScheduling
public class DatabaseProfilerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseProfilerApplication.class, args);
	}


}

