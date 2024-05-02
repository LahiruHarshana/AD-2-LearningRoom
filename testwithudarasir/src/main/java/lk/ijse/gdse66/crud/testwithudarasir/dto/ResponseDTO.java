package lk.ijse.gdse66.crud.testwithudarasir.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;

/**
 * @author Dewmith Mihisara
 * @date 2024-04-03
 * @since 0.0.1
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO implements Serializable {
    private String message;
    private int status;
    private HashMap<String, Object> data = new HashMap<>();

    public ResponseDTO(String message, int status) {
        this.message = message;
        this.status = status;
    }

    public ResponseDTO(String success, CrudDto search) {

    }
}
