package me.ywj.cloudpvp.core.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

/**
 * JacksonUtils
 *
 * @author sheip9
 * @since 2024/10/25 16:26
 */
public class JacksonUtils {
    public final static ObjectMapper INSTANCE = createInstance();
    
    private JacksonUtils() {}
    
    private static ObjectMapper createInstance() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION, true);
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        return objectMapper;
    }
    
    public static String serialize(Object o) throws IOException {
        return INSTANCE.writeValueAsString(o);
    }
    
    public static <T> T deserialize(String json, Class<T> clazz) throws IOException {
        return INSTANCE.readValue(json, clazz);
    }
}
