package com.cabonline.traffic.control.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;
import org.springframework.format.annotation.DateTimeFormat;

import javax.annotation.Nullable;
import java.time.LocalDateTime;

@Value.Immutable
@Value.Style(of = "new",
        allParameters = true,
        jdkOnly = true
)
@JsonSerialize(as = ImmutableOrderSearch.class)
@JsonDeserialize(as = ImmutableOrderSearch.class)
public abstract class OrderSearch {
    private static final String SCHEDULED_TIME_FIELD = "scheduledTime";

    @JsonProperty(SCHEDULED_TIME_FIELD)
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    @Nullable
    public abstract LocalDateTime scheduledTime();
}
