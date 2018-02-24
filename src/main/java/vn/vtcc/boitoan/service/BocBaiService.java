package vn.vtcc.boitoan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.vtcc.boitoan.model.Bai;
import vn.vtcc.boitoan.model.Que;
import vn.vtcc.boitoan.repository.BaiRepository;
import vn.vtcc.boitoan.repository.QueRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class BocBaiService {
    @Autowired
    BaiRepository baiRepository;

    public Bai getBai() {
        int value = RandomService.getRandomInt(52);
        return baiRepository.getBaiById(value);
    }
}
