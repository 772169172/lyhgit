package entity;

import java.io.Serializable;
import java.util.Date;

public class Student implements Serializable {
    private int id;
    private String sName;
    private Date birthday;
    private String gender;
    private String telephone;
    private String email;
    private int classId;
    private String cName;

    public Student() {
    }

    public Student(int id, String sName, Date birthday, String gender, String telephone, String email, int classId, String cName) {
        this.id = id;
        this.sName = sName;
        this.birthday = birthday;
        this.gender = gender;
        this.telephone = telephone;
        this.email = email;
        this.classId = classId;
        this.cName = cName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sName='" + sName + '\'' +
                ", birthday=" + birthday +
                ", gender='" + gender + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", classId=" + classId +
                ", cName='" + cName + '\'' +
                '}';
    }
}
