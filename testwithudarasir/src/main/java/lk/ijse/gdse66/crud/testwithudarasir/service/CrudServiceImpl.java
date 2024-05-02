package lk.ijse.gdse66.crud.testwithudarasir.service;

import lk.ijse.gdse66.crud.testwithudarasir.dto.CrudDto;
import lk.ijse.gdse66.crud.testwithudarasir.entity.Crud;
import lk.ijse.gdse66.crud.testwithudarasir.repository.CrudRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : L.H.J
 * @File: CrudServiceImpl
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-02, Thursday
 **/

@Service
public class CrudServiceImpl implements CrudService{


    private final CrudRepo crudRepo;
    private final ModelMapper modelMapper;

    @Autowired
    CrudServiceImpl(CrudRepo crudRepo, ModelMapper modelMapper){
        this.crudRepo = crudRepo;
        this.modelMapper = modelMapper;
    }
    public Integer save(CrudDto customerDTO) {
        crudRepo.save(modelMapper.map(customerDTO, Crud.class));
        return 200;
    }

    public Integer update(CrudDto dto){
        crudRepo.save(modelMapper.map(dto, Crud.class));
        return 200;
    }

    public List<CrudDto> findAllCustomers() {
        return crudRepo.findAll().stream()
                .map(customer -> modelMapper.map(customer,  CrudDto.class)).toList();
    }

    public Integer delete(CrudDto dto){
        crudRepo.delete(modelMapper.map(dto, Crud.class));
        return 200;
    }

    public CrudDto search(int id){
        Crud crud = crudRepo.findById(Math.toIntExact(id)).orElse(null);
        return modelMapper.map(crud, CrudDto.class);
    }
}
