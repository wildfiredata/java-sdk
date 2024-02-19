package cn.wildfiredata.analytics.util;

import cn.wildfiredata.analytics.inter.ITDLogger;
import cn.wildfiredata.analytics.TDConstData;

public class TDLogger {
    private static ITDLogger loggerInstance;
    private static boolean isPrintLog = false;

    public static void enableLog(boolean isPrint) {
        isPrintLog = isPrint;
    }

    public static void setLogger(ITDLogger logger) {
        loggerInstance = logger;
    }

    public static void print(String msg) {
        if (isPrintLog) {
            String formatMsg = String.format("[WildfireData] %s", msg);
            if (loggerInstance != null) {
                loggerInstance.print(formatMsg);
            } else {
                System.out.print(formatMsg);
            }
        }
    }

    public static void println(String msg) {
        if (isPrintLog) {
            String formatMsg = String.format("%s\n", msg);
            TDLogger.print(formatMsg);
        }
    }
}
