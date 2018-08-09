package izhbg.cloud.common.logger;

public class LoggerManager {
    public static Logger getLogger(Class clazz) {
        return new Logger.LoggerImp(org.slf4j.LoggerFactory.getLogger(clazz));
    }
    public static Logger getLogger(String name) {
        return new Logger.LoggerImp(org.slf4j.LoggerFactory.getLogger(name));
    }
}
