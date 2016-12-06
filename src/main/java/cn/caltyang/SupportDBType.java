package cn.caltyang;

/**
 * Created by liuxiaoyang on 16/12/6.
 */
public enum SupportDBType {

    DB_MYSQL("mysql",""),
    DB_ORACLE("oracle","");

    private String name;
    private String driverName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    SupportDBType(String name, String driverName) {
        this.name = name;
        this.driverName = driverName;
    }
}
