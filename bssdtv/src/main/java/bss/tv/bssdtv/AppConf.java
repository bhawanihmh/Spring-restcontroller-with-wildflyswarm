package bss.tv.bssdtv;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author bhawani.singh
 * @since 27/01/17
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan("bss.tv.bssdtv")
public class AppConf  extends SpringBootServletInitializer {

}
