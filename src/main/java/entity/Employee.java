package entity;

import hannotation.Column;
import hannotation.Entity;
import hannotation.Id;

import java.util.Date;
import java.util.HashMap;

@Entity(tableName = "employee")
public class Employee {
    @Id
    @Column(columnName = "idEmployee", columnType = "varchar(200)")
    private String id;
    @Column(columnName = "name", columnType = "varchar(200)")
    private String fullName;
    @Column(columnName = "address", columnType = "varchar(200)")
    private String address;
    private Date birthday;
    @Column(columnName = "position", columnType = "varchar(200)")
    private String position;
    @Column(columnName = "department", columnType = "varchar(200)")
    private String department;

    public Employee(String id, String fullName, String address, Date birthday, String position, String department) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.birthday = birthday;
        this.position = position;
        this.department = department;
    }

    public Employee() {
    }

    public Employee(String id, String name, String address, String birthday, String position, String department) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public boolean isValid() {
        return false;
    }
    public HashMap<String, String> getErrors() {
        return new HashMap<>();
    }
}
