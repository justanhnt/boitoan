package vn.vtcc.boitoan.service;

import org.springframework.stereotype.Service;
import vn.vtcc.boitoan.model.Que;
import vn.vtcc.boitoan.repository.QueRepository;

/**
 * Created by TuanAnh on 22/02/2018.
 */

@Service
public class GieoQueService {
    public Que getQue() {
        int queId = RandomService.getRandomInt(64);
        return QueRepository.getQueById(queId);
    }
}
