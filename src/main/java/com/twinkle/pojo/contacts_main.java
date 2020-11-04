package com.twinkle.pojo;

public class contacts_main {
    private int contacts_main_id;
    private String contacts_name;
    private String contacts_phone1;
    private String contacts_phone2;
    private int fk_category;

    public int getContacts_main_id() {
        return contacts_main_id;
    }

    public void setContacts_main_id(int contacts_main_id) {
        this.contacts_main_id = contacts_main_id;
    }

    public String getContacts_name() {
        return contacts_name;
    }

    public void setContacts_name(String contacts_name) {
        this.contacts_name = contacts_name;
    }

    public String getContacts_phone1() {
        return contacts_phone1;
    }

    public void setContacts_phone1(String contacts_phone1) {
        this.contacts_phone1 = contacts_phone1;
    }

    public String getContacts_phone2() {
        return contacts_phone2;
    }

    public void setContacts_phone2(String contacts_phone2) {
        this.contacts_phone2 = contacts_phone2;
    }

    public int getFk_category() {
        return fk_category;
    }

    public void setFk_category(int fk_category) {
        this.fk_category = fk_category;
    }
}
