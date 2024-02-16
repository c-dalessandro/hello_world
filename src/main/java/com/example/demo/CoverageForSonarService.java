package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CoverageForSonarService {
	
	private Logger log = LoggerFactory.getLogger(getClass());
	
	public void testTest(int num) {
		log.info("Test per Sonar");
		
		switch (num) {
		case 0: {
			log.info("Numero: 0");
		}
		case 1: {
			log.info("Numero: 1");
		}
		case 2: {
			log.info("Numero: 2");
		}
		case 3: {
			log.info("Numero: 3");
		}
		case 4: {
			log.info("Numero: 4");
		}
		case 5: {
			log.info("Numero: 5");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + num);
		}
	}
	
}
