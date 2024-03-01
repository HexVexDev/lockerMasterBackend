package com.project.lockerMaster.entities;

import javax.persistence.*;

@Entity
public class User {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //Id column for the user
    @Id
    @Column(name="user_id")
    private int userid;

    //Name of the user
    @Basic
    @Column(name= "user_name")
    private String user_name;

    //Email of the user
    @Basic
    @Column(name= "user_email")
    private String user_email;

    //Password of the user
    @Basic
    @Column(name= "user_password")
    private String user_password;

    //Users have a role, this is the role of the user which can be either student or admin.
    //Admins can: Create locker groups and add lockers to them, add students via borrowing a locker
    //make a locker available or unavailable, and delete lockers, view belongings of students and send mails to students
    //Students can: View the status of the locker and belongings found within the locker if the time expires and the locker
    //has to be opened by the admin.
    @Basic
    @Column(name= "user_role")
    private String user_role;

    public int getId(){ return userid;}

    public void setId(int id){this.userid = id;}

    public String getUser_name(){return user_name;}
    public void setUser_name (String user_name){this.user_name = user_name;}

    public String getUser_email(){return user_email;}
    public void setUser_email (String user_email){this.user_email = user_email;}

    public String getUser_password(){return user_password;}
    public void setUser_password (String user_password){this.user_password = user_password;}

}