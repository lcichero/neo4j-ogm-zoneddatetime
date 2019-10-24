package nz.co.lionel.neo4ogmzoneddatetime.service;

import nz.co.lionel.neo4ogmzoneddatetime.entity.Point;
import nz.co.lionel.neo4ogmzoneddatetime.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointService {

    @Autowired
    private PointRepository pointRepository;

    public void savePoint(Point point) {
        pointRepository.save(point);
    }

    public Iterable<Point> findAll() {
        return pointRepository.findAll();
    }
}