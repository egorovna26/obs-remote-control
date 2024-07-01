package com.github.egorovna26.obs_remote_control.message.requestresponse.inputs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Gets the names of all special inputs.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class GetSpecialInputsResponse extends RequestResponse<GetSpecialInputsResponse.Data> {
    /**
     * @return Name of the Desktop Audio input
     */
    public String getDesktop1() {
        return getData().getResponseData().getDesktop1();
    }

    /**
     * @return Name of the Desktop Audio 2 input
     */
    public String getDesktop2() {
        return getData().getResponseData().getDesktop2();
    }

    /**
     * @return Name of the Mic/Auxiliary Audio input
     */
    public String getMic1() {
        return getData().getResponseData().getMic1();
    }

    /**
     * @return Name of the Mic/Auxiliary Audio 2 input
     */
    public String getMic2() {
        return getData().getResponseData().getMic2();
    }

    /**
     * @return Name of the Mic/Auxiliary Audio 3 input
     */
    public String getMic3() {
        return getData().getResponseData().getMic3();
    }

    /**
     * @return Name of the Mic/Auxiliary Audio 4 input
     */
    public String getMic4() {
        return getData().getResponseData().getMic4();
    }

    /**
     * GetSpecialInputs Request Response Data
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
         * Name of the Desktop Audio input
         */
        @JsonProperty("desktop1")
        private String desktop1;

        /**
         * Name of the Desktop Audio 2 input
         */
        @JsonProperty("desktop2")
        private String desktop2;

        /**
         * Name of the Mic/Auxiliary Audio input
         */
        @JsonProperty("mic1")
        private String mic1;

        /**
         * Name of the Mic/Auxiliary Audio 2 input
         */
        @JsonProperty("mic2")
        private String mic2;

        /**
         * Name of the Mic/Auxiliary Audio 3 input
         */
        @JsonProperty("mic3")
        private String mic3;

        /**
         * Name of the Mic/Auxiliary Audio 4 input
         */
        @JsonProperty("mic4")
        private String mic4;
    }
}
