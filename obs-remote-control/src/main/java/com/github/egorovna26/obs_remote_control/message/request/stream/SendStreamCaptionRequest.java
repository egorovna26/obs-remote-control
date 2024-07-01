package com.github.egorovna26.obs_remote_control.message.request.stream;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.request.Request;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Sends CEA-608 caption text over the stream output.
 */
@Getter
@Setter
@ToString(
        callSuper = true
)
public class SendStreamCaptionRequest extends Request<SendStreamCaptionRequest.Data> {
    /**
     * SendStreamCaptionRequest constructor
     */
    public SendStreamCaptionRequest(String captionText) {
        super("SendStreamCaption", new Data(captionText));
    }

    /**
     * SendStreamCaption Request Data
     */
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString(
            callSuper = true
    )
    public static class Data implements Serializable {
        /**
         * Caption text
         */
        @JsonProperty("captionText")
        private String captionText;
    }
}
