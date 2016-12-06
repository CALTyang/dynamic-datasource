package cn.caltyang;

/**
 * Created by liuxiaoyang on 16/12/6.
 */
public class DynamicDatasource {

    private String userName;
    private String password;
    private String url;
    private int maxActive;
    private int initialSize;
    private long maxWait;
    private int minIdle;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getInitialSize() {
        return initialSize;
    }

    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }

    public long getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(long maxWait) {
        this.maxWait = maxWait;
    }

    public int getMinIdle() {
        return minIdle;
    }

    public void setMinIdle(int minIdle) {
        this.minIdle = minIdle;
    }

    @Override
    public String toString() {
        return "DynamicDatasource{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", url='" + url + '\'' +
                ", maxActive=" + maxActive +
                ", initialSize=" + initialSize +
                ", maxWait=" + maxWait +
                ", minIdle=" + minIdle +
                '}';
    }
}
