package appController;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
}
