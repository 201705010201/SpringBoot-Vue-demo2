package com.xm.pojo;

/**
 * name:学生实体
 * @author xxm
 *
 */
public class Student {
    /**
     * content:学号
     */
    private String sno;
    /**
     * content:姓名
     */
    private String sname;
    /**
     * content:性别
     */
    private String ssex;
    /**
     * content:年龄
     */
    private int sage;
    /**
     * content:系别
     */
    private String sdept;

    public Student() {
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSdept() {
        return sdept;
    }

    public void setSdept(String sdept) {
        this.sdept = sdept;
    }

    @Override
    public String toString() {
        return "Student{" + "sno=" + sno + ", sname=" + sname + ", ssex=" + ssex + ", sage=" + sage + ", sdept=" + sdept + '}';
    }
           
}
