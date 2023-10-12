package br.com.id6.todolist.user;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Modificador - Descrição
 * public - pode ser acessado de qualquer lugar
 * private - só pode ser acessado dentro da classe
 * protected - pode ser acessado dentro da classe e subclasses
 */
@RestController
@RequestMapping("/users")
public class UserController {

  @Autowired
  private IUserRepository userRepository;

  /**
   * String - Texto
   * int - Número inteiro
   * double - Número decimal
   * Float - Número decimal
   * char - Caractere
   * Date - Data
   * void - Vazio
   */
  /**
   * Post - Cria um novo recurso
   * Get - Busca um recurso
   * Put - Atualiza um recurso
   * Delete - Deleta um recurso
   * Patch - Atualiza parcialmente um recurso
   */
  @PostMapping("")
  public ResponseEntity create(@RequestBody UserModel userModel) {
    var user = this.userRepository.findByUsername(userModel.getUsername());

    if (user != null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Usuário já existe");
    }
    var userCreated = this.userRepository.save(userModel);
    return ResponseEntity.status(HttpStatus.CREATED).body(userCreated);
  }

}
