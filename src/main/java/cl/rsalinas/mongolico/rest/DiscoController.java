
package cl.rsalinas.mongolico.rest;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cl.rsalinas.mongolico.models.Disco;
import cl.rsalinas.mongolico.repositories.DiscoRepository;

@Controller
public class DiscoController {
	
	String message = "Welcome to Spring MVC!";

	//REST con respuesta en jsp
	@RequestMapping("/hello")
	public ModelAndView showMessage(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");

		ModelAndView mv = new ModelAndView("helloworld");
		mv.addObject("message", message);
		mv.addObject("name", name);
		return mv;
	}
	
	//REST con respuesta sin jsp
	@GetMapping("/saludo")
    @ResponseBody
	public String showSaludo(
			@RequestParam(value = "name", required = false, defaultValue = "World") String name) {
		System.out.println("in controller");

		String saludo = message+" "+name; 
				
		return saludo;
	}
	
	
	/*@Autowired
	private DiscoRepository repository;

    //http://localhost:8083/disco/all
    @GetMapping("/disco/all")
    @ResponseBody
    public List<Disco> getAllDiscos() {
	    return repository.findAll();
	  }
    
    
    //http://localhost:8083/disco/name?name=5babf44bd99f116e4b945f0d
    @GetMapping("/disco/name")
    @ResponseBody
    public Disco getDiscoName(@RequestParam(name="name", required=false, defaultValue="5babeb7bd99f116e4b945efc") ObjectId name) {
    	return repository.findBy_id(name);
    }*/
    
}