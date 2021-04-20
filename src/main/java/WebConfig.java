import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan("com.controller")
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    InternalResourceViewResolver resolver(){
        System.out.println("--------->Call WebConfig");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/view"); //Config xuong view
        resolver.setSuffix(".jsp");
        return resolver;
    }
}