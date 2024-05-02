package lk.ijse.gdse66.crud.testwithudarasir.controller;

import lk.ijse.gdse66.crud.testwithudarasir.dto.CrudDto;
import lk.ijse.gdse66.crud.testwithudarasir.dto.ResponseDTO;
import lk.ijse.gdse66.crud.testwithudarasir.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : L.H.J
 * @File: CrudController
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-02, Thursday
 **/

@RestController
@RequestMapping("/api/v1/crud")
public class CrudController {

    @Autowired
    private CrudService crudService;
    @PostMapping
    public ResponseDTO save(@RequestBody CrudDto dto){
        return new ResponseDTO("Success", crudService.save(dto));
    }

    @GetMapping
    public List<CrudDto> getAllCustomers() {
        List<CrudDto> customerDTOS = crudService.findAllCustomers();
        if (!customerDTOS.isEmpty()) {
            return customerDTOS;
        } else {
            return null;
        }
    }

    @PutMapping
    public ResponseDTO update(@RequestBody CrudDto dto){
        return new ResponseDTO("Success", crudService.update(dto));
    }

    @DeleteMapping
    public ResponseDTO delete(@RequestBody CrudDto dto){
        return new ResponseDTO("Success", crudService.delete(dto));
    }
}
