import java.io.UnsupportedEncodingException;
import java.util.logging.Logger;
public class TestLog {
    public static void main(String[] args){
        Logger logger = Logger.getLogger(Main.class.getName());
        logger.info("开始异常处理");
        try{
            "".getBytes("invalidCharsetName");
        } catch (UnsupportedEncodingException e){
//            logger.severe( );
        }
        logger.info("异常处理结束");
    }
}
