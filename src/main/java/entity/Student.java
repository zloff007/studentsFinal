package entity;

import java.sql.Date;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private String sername;
    private String group;
    private Date date;
    private int status;

    public Student() {

    }

    public Student(int id, String name, String sername, String group, Date date, int status) {
        this.id = id;
        this.name = name;
        this.sername = sername;
        this.group = group;
        this.date = date;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSername() {
        return sername;
    }

    public String getGroup() {
        return group;
    }

    public Date getDate() {
        return date;
    }

    public int getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                status == student.status &&
                Objects.equals(name, student.name) &&
                Objects.equals(sername, student.sername) &&
                Objects.equals(group, student.group) &&
                Objects.equals(date, student.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sername, group, date, status);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sername='" + sername + '\'' +
                ", group='" + group + '\'' +
                ", date=" + date +
                ", status=" + status +
                '}';
    }
}
