package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        TextReport textReport = new HtmlReport();
        String text = textReport.generate("Report's name", "Report's body");
        System.out.println(text);
        JSONReport jsonReport = new JSONReport();
        System.out.println(jsonReport.generate("Report's name", "Report's body"));
    }
}
