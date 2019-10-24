package nz.co.lionel.neo4ogmzoneddatetime.main;

import nz.co.lionel.neo4ogmzoneddatetime.entity.Point;
import nz.co.lionel.neo4ogmzoneddatetime.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.ZonedDateTime;

@Component
public class Main implements CommandLineRunner {

    @Autowired
    private PointService pointService;

    @Override
    public void run(String... args) {
        pointService.savePoint(new Point(14.5, 43.5, ZonedDateTime.parse("2018-06-23T00:00:00.000000+12:00")));
    }
}