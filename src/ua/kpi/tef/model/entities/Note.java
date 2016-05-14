package ua.kpi.tef.model.entities;

import java.util.Date;

/**
 * Created by Денис on 11.05.2016.
 */
public class Note {

    private String name;
    private String surname;
    private String middleName;
    private String nickname;
    private String comment;
    private Groups group;
    private String homePhone;
    private String mobilePhone;
    private String email;
    private String skype;
    private Address address;
    private Date createDate;
    private Date updateDate;

    //Constructors

    public Note(String name, String surname, String middleName,
                String nickname, String comment, String group,
                String homePhone, String mobilePhone, String email,
                String skype, String zip, String city, String street,
                String building, String apartment) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.nickname = nickname;
        this.comment = comment;
        this.group = defineGroup(group);
        setHomePhone(homePhone);
        setMobilePhone(mobilePhone);
        this.email = email;
        this.skype = skype;
        this.address = new Address(zip, city, street, building, apartment);
        this.createDate = new Date();
        this.updateDate = this.createDate;
    }

    private Groups defineGroup(String name) {
        Groups[] groups = Groups.values();
        for (Groups group: groups) {
            if(group.name().equalsIgnoreCase(name)) {
                return group;
            }
        }
        return null;
    }

    //Custom methods

    /**
     * This method returns a full name
     *
     * @return "Surname N. M." (example)
     * */
    public String getFullName() {
        StringBuilder fn = new StringBuilder(name.length() + 6);
        fn.append(surname);
        fn.append(" ");
        fn.append(name.charAt(0));
        fn.append(". ");
        fn.append(middleName.charAt(0));
        fn.append(".");
        return fn.toString();
    }

    public String getPostalAddress() {
        return this.address.getPostalAddress();
    }

    public String getCommonAddress() {
        return this.address.getCommonAddress();
    }

    //Getters and Setters


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Groups getGroup() {
        return group;
    }

    public void setGroup(Groups group) {
        this.group = group;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = toThePhoneTemplate(homePhone);
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = toThePhoneTemplate(mobilePhone);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    private String toThePhoneTemplate(String phone) {
        StringBuilder sb = new StringBuilder(phone);

        insertIfNecessary(sb, 0, '+');
        insertIfNecessary(sb, 3, '(');
        insertIfNecessary(sb, 7, ')');
        insertIfNecessary(sb, 11, '-');
        insertIfNecessary(sb, 14, '-');

        return sb.toString();
    }

    private void insertIfNecessary(StringBuilder sb, int position, char c) {
        if(sb.charAt(position) != c) {
            sb.insert(position, c);
        }
    }
}
