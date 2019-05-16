package entity;

import java.io.Serializable;
//数据库Classes表
public class Classes implements Serializable {
    private int id;
    private String cName;

    public Classes() {
    }

    public Classes(int id, String cName) {
        this.id = id;
        this.cName = cName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", cName='" + cName + '\'' +
                '}';
    }
}
