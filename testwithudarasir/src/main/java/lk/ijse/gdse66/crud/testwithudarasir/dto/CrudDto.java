package lk.ijse.gdse66.crud.testwithudarasir.dto;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: CrudDto
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-02, Thursday
 **/

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CrudDto {
    private int id;
    private String name;
    private String address;
}
