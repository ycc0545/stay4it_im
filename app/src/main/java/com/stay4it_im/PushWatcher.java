package com.stay4it_im;

import com.stay4it_im.entities.Message;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by zhangchao_a on 2016/10/12.
 */

public class PushWatcher implements Observer {
    @Override
    public void update(Observable o, Object arg) {
       if (arg instanceof Message)
       {
           messageUpdata((Message) arg);
       }
    }

    public void messageUpdata(Message message)
    {

    }
}
