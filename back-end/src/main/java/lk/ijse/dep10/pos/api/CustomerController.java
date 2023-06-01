package lk.ijse.dep10.pos.api;


import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
@CrossOrigin
public class CustomerController {

    @Autowired
    private BasicDataSource pool;

    @GetMapping
    public void getCustomer(@RequestParam(value = "q", required = false) String query) {
        System.out.println("getCustomer()");
    }


}
