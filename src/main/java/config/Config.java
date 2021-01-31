package config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:qa.properties")
@Getter
@Setter
public class Config {

    @Value("https://zarzucamysieci.pl")
    private String host;

}
