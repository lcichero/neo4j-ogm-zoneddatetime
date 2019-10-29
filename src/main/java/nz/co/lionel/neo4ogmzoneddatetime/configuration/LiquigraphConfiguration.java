package nz.co.lionel.neo4ogmzoneddatetime.configuration;


import org.liquigraph.core.api.Liquigraph;
import org.liquigraph.core.configuration.ConfigurationBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LiquigraphConfiguration {

    @Value("${spring.data.neo4j.uri}")
    private String databaseUrl;

    @Value("${spring.data.neo4j.username}")
    private String username;

    @Value("${spring.data.neo4j.password}")
    private String password;

    @Bean
    public void runLiquigraphMigrations() {
        org.liquigraph.core.configuration.Configuration configuration = new ConfigurationBuilder()
                .withMasterChangelogLocation("db/liquigraph/changelog.xml")
                .withUri("jdbc:neo4j:" + databaseUrl)
                .withUsername(username)
                .withPassword(password)
                .withRunMode()
                .build();

        Liquigraph liquigraph = new Liquigraph();
        liquigraph.runMigrations(configuration);
    }
}