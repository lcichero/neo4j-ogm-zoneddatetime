package nz.co.lionel.neo4ogmzoneddatetime;

import nz.co.lionel.neo4ogmzoneddatetime.entity.Point;
import nz.co.lionel.neo4ogmzoneddatetime.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.ZonedDateTime;

@SpringBootApplication
public class Neo4OgmZoneddatetimeApplication {

    public static void main(String[] args) {
        SpringApplication.run(Neo4OgmZoneddatetimeApplication.class, args);
    }
}