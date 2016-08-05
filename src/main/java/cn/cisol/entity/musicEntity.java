package cn.cisol.entity;

/**
 * Created by Administrator on 2016/7/30 0030.
 */

public class MusicEntity {

    private int mid;
    private String mname;
    private String mauthor;
    private String minfo;

    public MusicEntity() {

    }

    public MusicEntity(int mid, String mname, String mauthor, String minfo) {
        this.mid = mid;
        this.mname = mname;
        this.mauthor = mauthor;
        this.minfo = minfo;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMauthor() {
        return mauthor;
    }

    public void setMauthor(String mauthor) {
        this.mauthor = mauthor;
    }

    public String getMinfo() {
        return minfo;
    }

    public void setMinfo(String minfo) {
        this.minfo = minfo;
    }

    @Override
    public String toString() {
        return "MusicEntity{" +
                "mid=" + mid +
                ", mname='" + mname + '\'' +
                ", mauthor='" + mauthor + '\'' +
                ", minfo='" + minfo + '\'' +
                '}';
    }

}
