/**
 * 
 */
package com.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author debalinasarkar26
 *
 */

//@Slf4j
@Controller
public class BurgerBuilderController {

	@GetMapping(value = "/")
	public String showBuilderForm() {
		return "home";
	}

}
