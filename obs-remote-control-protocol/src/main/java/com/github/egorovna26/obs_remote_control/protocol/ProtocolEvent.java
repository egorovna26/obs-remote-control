package com.github.egorovna26.obs_remote_control.protocol;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class ProtocolEvent implements Serializable {
    private String description;
    private String eventType;
    private String eventSubscription;
    private int complexity;
    private String rpcVersion;
    private boolean deprecated;
    private String initialVersion;
    private String category;
    private List<ProtocolDataField> dataFields = new ArrayList<>();
}
