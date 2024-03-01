package com.project.lockerMaster.entities;

import javax.persistence.*;

@Entity
public class Locker {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name="locker_id")
    private int lockerid;

    //The locker group or the furniture group to which the locker belongs to
    @ManyToOne(targetEntity = LockerGroup.class)
    @JoinColumn(name = "locker_group_id", referencedColumnName = "locker_group_id")
    private int locker_group_id;

    //The unique identifier of the locker
    @Basic
    @Column(name= "locker_name")
    private String locker_name;

    //The availability of the locker: true or false, validated every day by a job which verifies the date
    @Basic
    @Column(name= "locker_available")
    private Bool locker_available;

    //The date when the locker was borrowed. If the locker is not borrowed, the value is null
    @Basic
    @Column(name="locker_borrow_date")
    private Date locker_borrow_date;

    //The user who borrowed the locker. If the locker is not borrowed, the value is null
    @OneToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private int user_id;

    //Lockers may not be empty but their date has expired, this is a flag to notify the admin so they can empty the locker
    //and store the belongings in a safe place.
    @Basic
    @Column(name="locker_empty")
    private Bool locker_empty;

    public int getId(){ return lockerid;}
    public void setId(int id){this.lockerid = id;}
    public int getLocker_group_id(){return locker_group_id;}
    public void setLocker_group_id (int locker_group_id){this.locker_group_id = locker_group_id;}
    public String getLocker_name(){return locker_name;}
    public void setLocker_name (String locker_name){this.locker_name = locker_name;}
    public Bool getLocker_available(){return locker_available;}
    public void setLocker_available (Bool locker_available){this.locker_available = locker_available;}
    public Date getLocker_borrow_date(){return locker_borrow_date;}
    public void setLocker_borrow_date (Date locker_borrow_date){this.locker_borrow_date = locker_borrow_date;}
    public int getUser_id(){return user_id;}
    public void setUser_id (int user_id){this.user_id = user_id;}
    public Bool getLocker_empty(){return locker_empty;}
    public void setLocker_empty (Bool locker_empty){this.locker_empty = locker_empty;}
}