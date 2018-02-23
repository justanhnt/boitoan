package vn.vtcc.boitoan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.vtcc.boitoan.model.Que;
import vn.vtcc.boitoan.repository.QueRepository;

/**
 * Created by TuanAnh on 22/02/2018.
 */

@Service
public class GieoQueService {

    @Autowired
    QueRepository queRepository;

    public Que getQue() {
        int queId = RandomService.getRandomInt(64);
        return queRepository.getQueById(1);
    }
}
