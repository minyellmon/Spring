package com.demo.repository;

import com.demo.ds.Report;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

//@Component @Profile("db")
public class DbReportRepository implements ReportRepository{
    @Override
    public Report save(Report report) {
        System.out.println("DbReportRepository::save()invoked");
        return report;
    }
}
