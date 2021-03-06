package net.albert_akimov.rest.api.rest;

import net.albert_akimov.rest.api.model.Customer;
import net.albert_akimov.rest.api.rest.impl.AbstractControllerImpl;
import net.albert_akimov.rest.api.service.CustomerService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @Authot: Albert Akimov
 * @Date: 25.02.2020
 * @Description:
 */

@RestController
@RequestMapping("/api/v1/login/person")
public class CustomerRestController extends AbstractControllerImpl<Customer, CustomerService> {

    protected CustomerRestController(CustomerService service) {
        super(service);
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> getById(@PathVariable Long id) {
        return super.getById(id);
    }

    @Override
    @RequestMapping(value = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> save(@RequestBody @Valid Customer entity) {
        return super.save(entity);
    }

    @Override
    @RequestMapping(value = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> update(@RequestBody @Valid Customer entity) {
        return super.update(entity);
    }

    @Override
    @RequestMapping(value = "{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Customer> delete(@PathVariable("id") Long id) {
        return super.delete(id);
    }

    @Override
    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Customer>> getAll() {
        return super.getAll();
    }
}
