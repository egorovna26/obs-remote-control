package com.github.egorovna26.obs_remote_control.message.event.ui;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.egorovna26.obs_remote_control.message.event.Event;
import java.io.Serializable;
import java.lang.String;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A screenshot has been saved.
 *
 * Note: Triggered for the screenshot feature available in `Settings -&gt; Hotkeys -&gt; Screenshot Output` ONLY.
 * Applications using `Get/SaveSourceScreenshot` should implement a `CustomEvent` if this kind of inter-client
 * communication is desired.
 */
@NoArgsConstructor
@Getter
@Setter
@ToString(
        callSuper = true
)
public class ScreenshotSaved extends Event<ScreenshotSaved.Data> {
    /**
     * @return Path of the saved image file
     */
    public String getSavedScreenshotPath() {
        return getData().getEventData().getSavedScreenshotPath();
    }

    /**
     * ScreenshotSaved Event Data
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
         * Path of the saved image file
         */
        @JsonProperty("savedScreenshotPath")
        private String savedScreenshotPath;
    }
}
