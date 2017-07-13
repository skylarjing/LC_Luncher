package kh.edu.app.myproject.lc_luncher.DB;

/**
 * Created by Mork Pin on 7/6/2017.
 */

public class User {
    public User(String phoneNumber, String passWord) {
        this.phoneNumber = phoneNumber;
        this.passWord = passWord;

    }

    private String phoneNumber;
    private String passWord;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    /*public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }*/
}
