package com.github.egorovna26.obs_remote_control.message;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(callSuper = true)
public abstract class Message implements Serializable {
    public static final int HELLO = 0;
    public static final int IDENTIFY = 1;
    public static final int IDENTIFIED = 2;
    public static final int REIDENTIFY = 3;
    public static final int EVENT = 5;
    public static final int REQUEST = 6;
    public static final int REQUEST_RESPONSE = 7;
    public static final int REQUEST_BATCH = 8;
    public static final int REQUEST_BATCH_RESPONSE = 9;

    @JsonProperty(value = "op")
    protected int op;
}
