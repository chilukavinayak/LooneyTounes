package com.java.learn.mokito;

import java.util.Date;

public interface ReportGenerator {
    void generateReport(ReportEntity entity);
}

class ReportEntity{

    private Long reportId;
    private Date startDate;
    private Date endDate;
    private byte[] content;

    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}

class ReportGeneratorService {

    private ReportGenerator reportGenerator;
    void generateReport(Date startDate, Date endDate, byte[] content) {
        ReportEntity report = new ReportEntity();
        report.setContent(content);
        report.setStartDate(startDate);
        report.setEndDate(endDate);
        reportGenerator.generateReport(report);
    }
}