package com.gzb.springboot.mvc;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class HttpMessageConverterConfig {

    @Bean
    public HttpMessageConverter fastJsonHttpMessageConverter(){
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        SerializerFeature[] serializerFeatures = new SerializerFeature[]{
                SerializerFeature.QuoteFieldNames,//输出Key是否包含双引号
                SerializerFeature.WriteMapNullValue,//是否输出为null的字段，若为null则显示该字段
                SerializerFeature.WriteNullNumberAsZero,//数字若为null，输出0
                SerializerFeature.WriteNullListAsEmpty, //list为null，输出[]
                SerializerFeature.WriteNullStringAsEmpty,//String为null，输出""
                SerializerFeature.WriteNullBooleanAsFalse,//boolean为null，输出false
                SerializerFeature.WriteDateUseDateFormat,//Date的日期转换器
                SerializerFeature.DisableCircularReferenceDetect //循环引用
        };
        fastJsonConfig.setSerializerFeatures(serializerFeatures);
        fastJsonConfig.setCharset(Charset.forName("UTF-8"));
        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
        List<MediaType> mediaTypeList = new ArrayList<MediaType>();
        mediaTypeList.add(MediaType.APPLICATION_JSON);
        fastJsonHttpMessageConverter.setSupportedMediaTypes(mediaTypeList);
        return fastJsonHttpMessageConverter;
    }
}
