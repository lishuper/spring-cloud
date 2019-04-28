package com.lee.spring.cloud.hello.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Controller
 *
 * @author lichsuper@qq.com
 * @create 2019-04-28 3:33 PM
 * @since 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public String hello() {
		return "hello world!";
	}
}
