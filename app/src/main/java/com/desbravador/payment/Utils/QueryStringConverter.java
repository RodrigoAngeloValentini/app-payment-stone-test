package com.desbravador.payment.Utils;

import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

public class QueryStringConverter {

    public static String queryStringToJson(String queryString) {
        Gson gson = new Gson();
        Map<String, String> queryMap = new HashMap<>();

        try {
            String[] queryParams = queryString.split("&");
            for (String param : queryParams) {
                String[] keyValuePair = param.split("=");
                if (keyValuePair.length == 2) {
                    String key = URLDecoder.decode(keyValuePair[0], "UTF-8");
                    String value = URLDecoder.decode(keyValuePair[1], "UTF-8");
                    queryMap.put(key, value);
                }
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return gson.toJson(gson.toJsonTree(queryMap).getAsJsonObject());
    }
}
