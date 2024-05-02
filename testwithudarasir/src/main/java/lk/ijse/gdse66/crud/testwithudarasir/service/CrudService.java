package lk.ijse.gdse66.crud.testwithudarasir.service;

import lk.ijse.gdse66.crud.testwithudarasir.dto.CrudDto;
import lk.ijse.gdse66.crud.testwithudarasir.entity.Crud;

import java.util.List;

/**
 * @author : L.H.J
 * @File: CrudService
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-02, Thursday
 **/
public interface CrudService {

    public Integer save(CrudDto customerDTO);

    Integer update(CrudDto dto);

    Integer delete(CrudDto dto);

    CrudDto search(int id);

    List<CrudDto> findAllCustomers();
}
