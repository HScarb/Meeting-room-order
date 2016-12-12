package com.mtr.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.ID
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.USER_NAME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.PASSWORD
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.COMPANY
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String company;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.DEPARTMENT
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String department;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.NAME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.IS_ADMIN
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private Boolean isAdmin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.EMAIL
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    private String email;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.ID
     *
     * @return the value of user.ID
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.ID
     *
     * @param id the value for user.ID
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.USER_NAME
     *
     * @return the value of user.USER_NAME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.USER_NAME
     *
     * @param userName the value for user.USER_NAME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.PASSWORD
     *
     * @return the value of user.PASSWORD
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.PASSWORD
     *
     * @param password the value for user.PASSWORD
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.COMPANY
     *
     * @return the value of user.COMPANY
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.COMPANY
     *
     * @param company the value for user.COMPANY
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.DEPARTMENT
     *
     * @return the value of user.DEPARTMENT
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getDepartment() {
        return department;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.DEPARTMENT
     *
     * @param department the value for user.DEPARTMENT
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.NAME
     *
     * @return the value of user.NAME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.NAME
     *
     * @param name the value for user.NAME
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.IS_ADMIN
     *
     * @return the value of user.IS_ADMIN
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public Boolean getIsAdmin() {
        return isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.IS_ADMIN
     *
     * @param isAdmin the value for user.IS_ADMIN
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.EMAIL
     *
     * @return the value of user.EMAIL
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.EMAIL
     *
     * @param email the value for user.EMAIL
     *
     * @mbg.generated Mon Dec 12 17:21:01 CST 2016
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}