package vn.vtcc.boitoan.repository;

import vn.vtcc.boitoan.model.Que;

/**
 * Created by TuanAnh on 22/02/2018.
 */
public class QueRepository {
    public static Que getQueById(int queId) {
        Que que = new Que();
        que.setId(queId);
        que.setLoiGiai("abc xyz");
        que.setImageURL("https://imgur.com/xyz");
        return que;
    }
}
