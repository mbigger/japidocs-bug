package com.example.demo;

import io.github.yedaxia.apidocs.Docs;
import io.github.yedaxia.apidocs.DocsConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		DocsConfig config = new DocsConfig();
		config.setProjectPath("/media/benwen/_dde_data/work/demo"); // root project path
		config.setProjectName("EPOWER-V2"); // project name
		config.setApiVersion("V1.0");       // api version
		config.setDocsPath("/media/benwen/_dde_data/work/demo/docs"); // api docs target path
		config.setAutoGenerate(Boolean.TRUE);  // auto generate
		Docs.buildHtmlDocs(config); // execute to generate
	}
}
