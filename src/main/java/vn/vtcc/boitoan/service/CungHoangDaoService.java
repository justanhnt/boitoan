package vn.vtcc.boitoan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.vtcc.boitoan.model.Bai;
import vn.vtcc.boitoan.model.CungHoangDao;
import vn.vtcc.boitoan.repository.BaiRepository;
import vn.vtcc.boitoan.repository.CungHoangDaoRepository;

@Service
public class CungHoangDaoService {
    @Autowired
    private CungHoangDaoRepository cungHoangDaoRepository;

    public CungHoangDao boiCungHoangDao(String ngaySinh, String gioiTinh){
        return cungHoangDaoRepository.getCungHoangDaoByGioiTinhNgaySinh(ngaySinh, gioiTinh);
    }
}
