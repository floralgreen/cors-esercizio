package esercizio.develhope.corsesercizio;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebSecurityConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry corsRegistry){
        CorsRegistration corsRegistration = corsRegistry.addMapping("/**");
        corsRegistration.allowedOrigins("http://localhost:63342/");
        corsRegistration.allowedMethods("GET","POST","PUT","DELETE","OPTIONS");

    }


}
