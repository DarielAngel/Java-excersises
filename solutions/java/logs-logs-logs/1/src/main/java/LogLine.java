public class LogLine {

    private final String log;

    public LogLine(String logLine) {
        this.log = logLine;
    }

    public LogLevel getLogLevel() {
        return switch (log.substring(1,4)) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return getLogLevel().getEncoded() + ":" + log.substring(log.indexOf("]: ")+3, log.length());
    }
}
