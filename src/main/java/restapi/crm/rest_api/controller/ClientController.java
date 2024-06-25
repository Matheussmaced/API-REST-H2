package restapi.crm.rest_api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import restapi.crm.rest_api.model.Customers;

@RestController
@RequestMapping("/clientes")
public class ClientController {

  @GetMapping
  public List<Customers> listar() {
    
  }