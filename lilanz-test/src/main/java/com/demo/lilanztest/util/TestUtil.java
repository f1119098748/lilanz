package com.demo.lilanztest.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@RefreshScope
@Component
public class TestUtil {

    private String wxabc;

    private String wxurl;

    private String wxvalue;

    public String getWxabc() {
        return wxabc;
    }
    @Value("${wx.abc}")
    public void setWxabc(String wxabc) {
        this.wxabc = wxabc;
    }

    public String getWxurl() {
        return wxurl;
    }
    @Value("${wx.url}")
    public void setWxurl(String wxurl) {
        this.wxurl = wxurl;
    }

    public String getWxvalue() {
        return wxvalue;
    }
    @Value("${wx.value}")
    public void setWxvalue(String wxvalue) {
        this.wxvalue = wxvalue;
    }

    @Override
    public String toString() {
        return "TestUtil{" +
                "wxabc='" + wxabc + '\'' +
                ", wxurl='" + wxurl + '\'' +
                ", wxvalue='" + wxvalue + '\'' +
                '}';
    }
}
