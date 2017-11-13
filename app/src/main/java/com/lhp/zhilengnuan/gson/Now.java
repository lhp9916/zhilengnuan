package com.lhp.zhilengnuan.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lhp on 2017/11/13.
 * description: TODO
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}
