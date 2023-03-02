package com.demo;

import com.demo.format.DbReportFormatter;
import com.demo.format.FileReportFormatter;
import com.demo.format.ReportFormatter;
import com.demo.print.DbReportPrinter;
import com.demo.print.FileReportPrinter;
import com.demo.print.ReportPrinter;
import com.demo.repository.DbReportRepository;
import com.demo.repository.FileReportRepository;
import com.demo.repository.ReportRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@ComponentScan
@Configuration
public class AppConfig {
    @Bean @Profile("file")
    public ReportRepository fileReportRepository(){
        return new FileReportRepository();
    }
    @Bean @Profile("db")
    public ReportRepository dbReportRepository(){
        return new DbReportRepository();
    }
    @Bean @Profile("file")
    public ReportPrinter fileReportPrinter(){
        return new FileReportPrinter();
    }
    @Bean @Profile("db")
    public ReportPrinter dbReportPrinter(){
        return  new DbReportPrinter();
    }
    @Bean @Profile("file")
    public ReportFormatter fileReportFormatter(){
        return  new FileReportFormatter();

    }
    @Bean @Profile("db")
    public  ReportFormatter dbReportFormatter(){
        return new DbReportFormatter();
    }
}
