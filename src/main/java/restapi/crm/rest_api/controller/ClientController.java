package restapi.crm.rest_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import restapi.crm.rest_api.model.Customers;
import restapi.crm.rest_api.repository.CustomersRepository;

@RestController
@RequestMapping("/clientes")
public class ClientController {

  @Autowired
  private CustomersRepository customersRepository;

  @GetMapping
  public List<Customers> listar() {
    return customersRepository.findAll();
  }

  @PostMapping
  public Customers adding(@RequestBody Customers customers) {
    return customersRepository.save(customers);
  }
}