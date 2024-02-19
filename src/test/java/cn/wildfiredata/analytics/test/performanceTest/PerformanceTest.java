package cn.wildfiredata.analytics.test.performanceTest;

import cn.wildfiredata.analytics.TDAnalytics;
import cn.wildfiredata.analytics.TDLoggerConsumer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PerformanceTest {
    @org.junit.Test
    public void trackDuration()
    {
        TDAnalytics ta = new TDAnalytics(new TDLoggerConsumer("./log"));
        Map<String,Object> map= new HashMap<>();
        for(int i = 0; i < 20; i++) {
            map.put("#dasdadsdddffddfasadffdffdffdfdffafd"+i,"#dasdadsdddffddfasadffdffdffdfdffafd"+i);
        }
        long time1 = System.currentTimeMillis();

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        // add track ...

        long time2 = System.currentTimeMillis();
        System.out.println("time="+(time2-time1));
    }
}
