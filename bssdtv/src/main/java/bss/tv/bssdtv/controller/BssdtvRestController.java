package bss.tv.bssdtv.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Random;
import java.util.logging.Logger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author bhawani.singh
 * @since 01/12/16
 */

@RestController
@RequestMapping("/bssdtv")
public class BssdtvRestController {

	BssdtvRestController() {
		System.out.println("@@@@@@@@@@@@@@@@@   BssDtvController.BssDtvController()");
	}

	@SuppressWarnings("unused")
	private static final Logger LOG = Logger.getLogger(BssdtvRestController.class.getName());

	@RequestMapping(value = "/bssdtvChannels", method = RequestMethod.GET)
	@ResponseBody
	public String getBssdtvChannels() {
		// log
		LOG.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   getBssdtvChannels");
		return " getBssdtvChannels Hello Bhawani required dtvChannels ????";
	}

	@RequestMapping(value = "/satendar", method = RequestMethod.GET)
	@ResponseBody
	public String getList() {
		// log
		LOG.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   getList");

		return " getList Hello Bhawani required dtvChannels ????";
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		LOG.info("\n\n@@@@@@@@   hello     @@@@@@@@\n\n");

		InetAddress ip;
		try {

			ip = InetAddress.getLocalHost();
			LOG.info("Current IP address : " + ip.getHostAddress());
			boolean isEven = false;
			Random rand = new Random();
			isEven = (rand.nextInt(100) % 2) == 0 ? true : false ;
			LOG.info(" isEven = " + isEven);
			
			if(isEven) {
				try {
					LOG.info("\n\n@@@@@@@@@@@@   Before Sleep currentTimeMillis = " + System.currentTimeMillis());
					Thread.sleep(5000);
					LOG.info("\n\n@@@@@@@@@@@@   After Sleep currentTimeMillis = " + System.currentTimeMillis());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}	
			}
			

		} catch (UnknownHostException e) {

			e.printStackTrace();

		}
		return " Hello Bhawani !!!!";
	}

	public static void main(String[] args) {
		boolean isEven = false;
		Random rand = new Random();
		int val = rand.nextInt(100); 
		System.out.println("BssdtvRestController.main() val = " + val);
		isEven = (val%2) == 0 ? true : false ;
		System.out.println("BssdtvRestController.main() isEven = " + isEven);
		if(isEven) {
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		System.out.println("BssdtvRestController.main() After Sleep ");
	}
	
}
