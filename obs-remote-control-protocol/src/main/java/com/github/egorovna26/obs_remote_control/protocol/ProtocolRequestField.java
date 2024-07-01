package com.github.egorovna26.obs_remote_control.protocol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProtocolRequestField implements Serializable {
    private String valueName;
    private String valueType;
    private String valueDescription;
    private Object valueRestrictions;
    private boolean valueOptional;
    private Object valueOptionalBehavior;
}
