package lk.ijse.gdse66.crud.testwithudarasir.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author : L.H.J
 * @File: Crud
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-05-02, Thursday
 **/

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "crud")
public class Crud implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;

}
