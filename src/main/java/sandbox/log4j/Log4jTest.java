package sandbox.log4j;

import com.savoirtech.logging.slf4j.json.LoggerFactory;
import com.savoirtech.logging.slf4j.json.logger.Logger;

/**
 * Created by art on 11/12/17.
 */
public class Log4jTest {

  private static Logger log = LoggerFactory.getLogger(Log4jTest.class);

  public static void main(String[] args) {
    LoggerFactory.setIncludeLoggerName(false);

    Logger logger = LoggerFactory.getLogger(Log4jTest.class);

    logger.info().message("It works!").field("test", "blaaaa").log();
  }
}
