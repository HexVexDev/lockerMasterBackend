package com.project.lockerMaster.entities;

import javax.persistence.*;

@Entity
public class LockerGroup {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="locker_group_id")
    private int lockergroupid;

    //The name of the locker group or the name of the furniture, ie. "E1" or "Cabinet 1"
    @Basic
    @Column(name= "locker_group_name")
    private String locker_group_name;


    //The location of the locker group or the location of the furniture, ie. "1st floor" or "Room 1"
    @Basic
    @Column(name= "locker_group_location")
    private String locker_group_location;

    //The locker group is associated with an admin user since the system is being considered for usage by
    //multiple admins users.
    @OneToMany(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private int user_id;


    public int getId(){ return lockergroupid;}

    public void setId(int id){this.lockergroupid = id;}

    public String getLocker_group_name(){return locker_group_name;}
    public void setLocker_group_name (String locker_group_name){this.locker_group_name = locker_group_name;}

    public String getLocker_group_location(){return locker_group_location;}
    public void setLocker_group_location (String locker_group_location){this.locker_group_location = locker _group_location;}

    public int getUser_id(){return user_id;}
    public void setUser_id (int user_id){this.user_id = user_id;}
