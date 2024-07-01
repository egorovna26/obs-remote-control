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
public class Protocol implements Serializable {
    private List<ProtocolEvent> events = new ArrayList<>();
    private List<ProtocolRequest> requests = new ArrayList<>();
}
