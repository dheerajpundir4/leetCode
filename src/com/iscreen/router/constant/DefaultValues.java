package com.iscreen.router.constant;

import com.google.common.collect.ImmutableMap;

public class DefaultValues {
    public static ImmutableMap<String, String> DEFAULT_VALUES = ImmutableMap.<String, String>builder()
            .put(JsonPath.PersonName.PREFIX, "")
            .put(JsonPath.PerfonalInfo.PersonName.PRIMARY, "undefined");
            .build();
}

