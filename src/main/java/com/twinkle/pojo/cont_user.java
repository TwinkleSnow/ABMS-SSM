package com.twinkle.pojo;

public class cont_user {
    private int usercont_id;
    private int fk_user;
    private int fk_con_main;

    public int getUsercont_id() {
        return usercont_id;
    }

    public void setUsercont_id(int usercont_id) {
        this.usercont_id = usercont_id;
    }

    public int getFk_user() {
        return fk_user;
    }

    public void setFk_user(int fk_user) {
        this.fk_user = fk_user;
    }

    public int getFk_con_main() {
        return fk_con_main;
    }

    public void setFk_con_main(int fk_con_main) {
        this.fk_con_main = fk_con_main;
    }
}
