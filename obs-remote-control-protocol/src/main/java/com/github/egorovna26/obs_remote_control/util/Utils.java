package com.github.egorovna26.obs_remote_control.util;

import com.google.common.base.CaseFormat;
import lombok.experimental.UtilityClass;

@UtilityClass
public class Utils {
    public static String uc2uu(String s){
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, s);
    }

    public static String lc2uc(String s){
        return CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, s);
    }

    public static String uc2lc(String s){
        return CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_CAMEL, s);
    }
}
