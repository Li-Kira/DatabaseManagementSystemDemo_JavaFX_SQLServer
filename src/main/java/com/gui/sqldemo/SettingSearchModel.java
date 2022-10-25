package com.gui.sqldemo;

public class SettingSearchModel {

    String operate,login_name,runsql,udate;


    public SettingSearchModel(String operate,String login_name,String runsql,String udate){
        this.operate = operate;
        this.login_name = login_name;
        this.runsql = runsql;
        this.udate = udate;
    }

    public String getOperate() {
        return operate;
    }

    public String getLogin_name() {
        return login_name;
    }

    public String getRunsql() {
        return runsql;
    }

    public String getUdate() {
        return udate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    public void setRunsql(String runsql) {
        this.runsql = runsql;
    }

    public void setUdate(String udate) {
        this.udate = udate;
    }
}
