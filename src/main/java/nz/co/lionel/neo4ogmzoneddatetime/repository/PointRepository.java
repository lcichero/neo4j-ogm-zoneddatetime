package nz.co.lionel.neo4ogmzoneddatetime.repository;

import nz.co.lionel.neo4ogmzoneddatetime.entity.Point;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PointRepository extends Neo4jRepository<Point, Long> {
}
