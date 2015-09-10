package com.yumikoazu.theone.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by joker on 2015/8/31.
 */
public class DateUtil {

    public static String getTheDate(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }
}
