package com.example.jallowbooks.authentication;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/authentication")
@RequiredArgsConstructor
public class AuthenticationController {

  private final AuthenticationService service;

  @PostMapping("/signup")
  public ResponseEntity<AuthenticationResponse> signup(
      @RequestBody CreateAccountRequest request
  ) {
    return ResponseEntity.ok(service.signup(request));
  }
  @PostMapping("/signin")
  public ResponseEntity<AuthenticationResponse> signin(
      @RequestBody LogInRequest request
  ) {
    return ResponseEntity.ok(service.signin(request));
  }


}