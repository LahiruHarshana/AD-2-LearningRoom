package lk.ijse.gdse66.crud.testwithudarasir.repository;

import lk.ijse.gdse66.crud.testwithudarasir.entity.Crud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : L.H.J
 * @File: CrudRepo
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-02, Thursday
 **/


@Repository
public interface CrudRepo extends JpaRepository<Crud, Integer> {
}
