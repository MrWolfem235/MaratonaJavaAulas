package br.com.maratonajava.aula.ZZInnerClass.test;

class Company{
    public void makeDayReport(){
        class Report{
            public String name;
            public Report(String name) {
                this.name = name;
            }
            public void print(){
                System.out.println(this.name);
            }
            public static void printReports(Report... reports){
                for (Report report : reports) {
                    System.out.print("Report Printer: -> ");
                    report.print();
                }
            }
        }
        Report morningReport = new Report("Morning report");
        Report afternoonReport = new Report("Afternoon report");
        Report nightReport = new Report("Night report");
        Report.printReports(morningReport, afternoonReport, nightReport);
    }
}

public class LocalClassTest01 {
    public static void main(String[] args) {
        Company macDonalds = new Company();
        macDonalds.makeDayReport();
    }
}
