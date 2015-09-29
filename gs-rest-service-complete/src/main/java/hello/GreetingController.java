package hello;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ru.pokerbender.bo.GamePlay;
import ru.pokerbender.cntrlpojo.TableState;

@RestController
public class GreetingController {

    //http://localhost:8080/test/newtable
    @RequestMapping("/room/newtable")
    public TableState newTable() {
		return gamePlay().newTable();
    }
 	
	@RequestMapping(value="/room/gettable/{id}" , method=RequestMethod.GET)
    public TableState getTable(@PathVariable("id") String id) {
		return gamePlay().getTable(id);
    }
	
	private GamePlay gamePlay(){
		return (GamePlay) Application.ac.getBean("gamePlay");
	}
}
