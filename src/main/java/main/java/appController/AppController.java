package main.java.appController;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	private static final Log logger = LogFactory.getLog(AppController.class);
	
	@RequestMapping(value="/")
	public ModelAndView hello() {
		logger.info("hello方法被调用");
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("message","Hello World!");
		
		mv.setViewName("/WEB-INF/content/index.jsp");
		
		return mv;
	}
	
	@ResponseBody
	@RequestMapping(value="/request_test", method=RequestMethod.POST)
	public void testtmp(@RequestParam("id")String id,@RequestParam("ii")String ii,@RequestParam("user")String user) {
		logger.info("ID:"+id);
		logger.info("II:"+ii);
		logger.info("USER:"+user);
	}

	@RequestMapping(value="/request_GET_test",method=RequestMethod.GET)
	@ResponseBody
	public String testtmp2() {
		return "123";
	}
}
