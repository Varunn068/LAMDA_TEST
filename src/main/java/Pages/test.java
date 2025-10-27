package Pages;

import org.testng.annotations.Test;

import java.io.FileReader;
import java.util.Properties;

public class test {

    @Test
  public void hello()throws Exception
  {
      Properties p;
      FileReader file =  new FileReader(".//src//main//Resources//config.properties");
      p = new Properties();
      p.load(file);
      String k = p.getProperty("execution_env");
      System.out.println(k);

  }
}
