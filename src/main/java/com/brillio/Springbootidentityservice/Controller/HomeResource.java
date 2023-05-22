//package com.brillio.Springbootidentityservice.Controller;
//import com.brillio.Springbootidentityservice.Service.UserService;
//import com.brillio.Springbootidentityservice.Utility.JWTUtility;
//import com.brillio.Springbootidentityservice.Model.JWTRequest;
//import com.brillio.Springbootidentityservice.Model.JWTResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/auth")
//public class HomeResource {
//
//    @Autowired
//    private JWTUtility jwtUtility;
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/home")
//    public String home() {
//        return "Welcome to WebMonitoring!!";
//    }
//
//    @PostMapping("/token")
//    public JWTResponse authenticate(@RequestBody JWTRequest jwtRequest) throws Exception{
//
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(
//                            jwtRequest.getUsername(),
//                            jwtRequest.getPassword()
//                    )
//            );
//        } catch (BadCredentialsException e) {
//            throw new Exception("INVALID_CREDENTIALS", e);
//        }
//
//
//        final UserDetails userDetails
//                = userService.loadUserByUsername(jwtRequest.getUsername());
//
//        final String token =
//                jwtUtility.generateToken(userDetails);
//
//        return  new JWTResponse(token);
//    }
//
//
//
//}
