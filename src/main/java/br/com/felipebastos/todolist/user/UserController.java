package br.com.felipebastos.todolist.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador
 * public
 * private
 * protected
 */

@RestController
@RequestMapping("/users")
public class UserController {

  /**
   * String (texto)
   * Integer (int) números inteiros
   * Double (double) Números 0.0000
   * Float (float) Número 0.000
   * char (A C )
   * Date (data)
   * void
  */

  /*
    * Body
  */
    
  @PostMapping("/")
  @ResponseBody
  public String create(@RequestBody UserModel userModel) {
    return userModel.getName();
  }
  
}
