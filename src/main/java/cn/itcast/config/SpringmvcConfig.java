package cn.itcast.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringmvcConfig implements WebMvcConfigurer{
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");
		registry.addViewController("/index").setViewName("index");
		registry.addViewController("/index.html").setViewName("index");
		
		registry.addViewController("/vueTest1").setViewName("vueTest1");
		registry.addViewController("/vueTest2").setViewName("vueTest2");
		registry.addViewController("/vueTest3").setViewName("vueTest3");
		registry.addViewController("/vueTest4").setViewName("vueTest4");
		registry.addViewController("/vueTest5").setViewName("vueTest5");
		registry.addViewController("/vueTest6").setViewName("vueTest6");
		registry.addViewController("/vueTest7").setViewName("vueTest7");
		registry.addViewController("/vueTest8").setViewName("vueTest8");
		registry.addViewController("/vueTest9").setViewName("vueTest9");
		registry.addViewController("/vueTest10").setViewName("vueTest10");
		registry.addViewController("/vueTest11").setViewName("vueTest11");
		registry.addViewController("/vueTest12").setViewName("vueTest12");
		registry.addViewController("/vueTest13").setViewName("vueTest13");
		registry.addViewController("/vueTest20").setViewName("vueTest20");
		registry.addViewController("/vueTest21").setViewName("vueTest21");
	}
}
