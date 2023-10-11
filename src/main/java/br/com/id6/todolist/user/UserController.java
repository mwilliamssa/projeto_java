package br.com.id6.todolist.user;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
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
  public void create(@RequestBody UserModel userModel) {
    System.out.println(userModel.username);
    System.out.println(userModel.name);
    System.out.println(userModel.password);
  }

}
