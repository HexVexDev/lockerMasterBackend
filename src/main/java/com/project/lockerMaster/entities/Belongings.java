package com.project.lockerMaster.entities;

import javax.persistence.*;

@Entity
//This entity represents a series of belongings that a student has left in the locker and had to be removed
//by the admin. This serves to remind students to pick up their belongings.

public class StudentBelongings {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="belongings_id")
    private int studentbelongingsid;

    //The list of found belongings in the locker
    @Basic
    @Column(name= "belongings_list")
    private String belongings_list;


    //The user to whom the belongings belong to or student user
    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private int user_id;

    //The locker id where the belongings where found and removed, this will serve to view incidences per locker.
    @OneToMany(targetEntity = Locker.class)
    @JoinColumn(name = "locker_id", referencedColumnName = "locker_id")
    private int locker_id;



    public int getId(){ return studentbelongingsid;}
public int getStudentbelongingsid() {
    return studentbelongingsid;
}
public void setStudentbelongingsid(int studentbelongingsid) {
    this.studentbelongingsid = studentbelongingsid;
}
public String getStudent_name() {
    return student_name;
}
public void setStudent_name(String student_name) {
    this.student_name = student_name;
}
public String getStudent_mail() {
    return student_mail;
}
public void setStudent_mail(String student_mail) {
    this.student_mail = student_mail;
}
public String getBelongings_list() {
    return belongings_list;
}
public void setBelongings_list(String belongings_list) {
    this.belongings_list = belongings_list;
}
public int getLocker_id() {
    return locker_id;
}
public void setLocker_id(int locker_id) {
    this.locker_id = locker_id;
}
public void setId(int id){this.studentbelongingsid = id;}

public int getUser_id(){return user_id;}
public void setUser_id (int user_id){this.user_id = user_id;}
}

