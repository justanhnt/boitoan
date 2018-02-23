package vn.vtcc.boitoan.model;

/**
 * Created by TuanAnh on 22/02/2018.
 */


public class Que {
    private int id;
    private String loiGiai;
    private String imageURL;

    public String getLoiGiai() {
        return loiGiai;
    }

    public void setLoiGiai(String loiGiai) {
        this.loiGiai = loiGiai;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
