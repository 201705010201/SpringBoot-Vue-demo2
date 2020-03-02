package com.xm.pojo;

public class Course {
    private String cno;
    private String cname;
    private String cpno;
    private int ccredit;

    public Course() {
    }

    public Course(String cno, String cname, String cpno, int ccredit) {
        this.cno = cno;
        this.cname = cname;
        this.cpno = cpno;
        this.ccredit = ccredit;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCpno() {
        return cpno;
    }

    public void setCpno(String cpno) {
        this.cpno = cpno;
    }

    public int getCcredit() {
        return ccredit;
    }

    public void setCcredit(int ccredit) {
        this.ccredit = ccredit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                ", cpno='" + cpno + '\'' +
                ", ccredit=" + ccredit +
                '}';
    }
}
