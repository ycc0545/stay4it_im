package com.kevin.im.util;

import java.util.ArrayList;

/**
 * Created by zhangchao_a on 2016/10/14.
 */

public class TextUtil {
    public static boolean isValidate(String content)
    {
        if(content!=null&&!"".equals(content))
            return true;
        return false;
    }

    public static boolean isValidate(ArrayList<?> list)
    {
        if (list!=null&&list.size()>0)
            return true;
        return false;
    }
}
