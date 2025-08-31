package com.github.egorovna26.obs_remote_control;

import com.github.egorovna26.obs_remote_control.message.request.Request;
import com.github.egorovna26.obs_remote_control.message.request.config.CreateProfileRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.CreateSceneCollectionRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.GetPersistentDataRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.GetProfileListRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.GetProfileParameterRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.GetRecordDirectoryRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.GetSceneCollectionListRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.GetStreamServiceSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.GetVideoSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.RemoveProfileRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.SetCurrentProfileRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.SetCurrentSceneCollectionRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.SetPersistentDataRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.SetProfileParameterRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.SetRecordDirectoryRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.SetStreamServiceSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.config.SetVideoSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.CreateSourceFilterRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.GetSourceFilterDefaultSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.GetSourceFilterKindListRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.GetSourceFilterListRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.GetSourceFilterRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.RemoveSourceFilterRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.SetSourceFilterEnabledRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.SetSourceFilterIndexRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.SetSourceFilterNameRequest;
import com.github.egorovna26.obs_remote_control.message.request.filters.SetSourceFilterSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.general.BroadcastCustomEventRequest;
import com.github.egorovna26.obs_remote_control.message.request.general.CallVendorRequestRequest;
import com.github.egorovna26.obs_remote_control.message.request.general.GetHotkeyListRequest;
import com.github.egorovna26.obs_remote_control.message.request.general.GetStatsRequest;
import com.github.egorovna26.obs_remote_control.message.request.general.GetVersionRequest;
import com.github.egorovna26.obs_remote_control.message.request.general.SleepRequest;
import com.github.egorovna26.obs_remote_control.message.request.general.TriggerHotkeyByKeySequenceRequest;
import com.github.egorovna26.obs_remote_control.message.request.general.TriggerHotkeyByNameRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.CreateInputRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputAudioBalanceRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputAudioMonitorTypeRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputAudioSyncOffsetRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputAudioTracksRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputDefaultSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputDeinterlaceFieldOrderRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputDeinterlaceModeRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputKindListRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputListRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputMuteRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputPropertiesListPropertyItemsRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetInputVolumeRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.GetSpecialInputsRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.PressInputPropertiesButtonRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.RemoveInputRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputAudioBalanceRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputAudioMonitorTypeRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputAudioSyncOffsetRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputAudioTracksRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputDeinterlaceFieldOrderRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputDeinterlaceModeRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputMuteRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputNameRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.SetInputVolumeRequest;
import com.github.egorovna26.obs_remote_control.message.request.inputs.ToggleInputMuteRequest;
import com.github.egorovna26.obs_remote_control.message.request.media_inputs.GetMediaInputStatusRequest;
import com.github.egorovna26.obs_remote_control.message.request.media_inputs.OffsetMediaInputCursorRequest;
import com.github.egorovna26.obs_remote_control.message.request.media_inputs.SetMediaInputCursorRequest;
import com.github.egorovna26.obs_remote_control.message.request.media_inputs.TriggerMediaInputActionRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.GetLastReplayBufferReplayRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.GetOutputListRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.GetOutputSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.GetOutputStatusRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.GetReplayBufferStatusRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.GetVirtualCamStatusRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.SaveReplayBufferRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.SetOutputSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.StartOutputRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.StartReplayBufferRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.StartVirtualCamRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.StopOutputRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.StopReplayBufferRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.StopVirtualCamRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.ToggleOutputRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.ToggleReplayBufferRequest;
import com.github.egorovna26.obs_remote_control.message.request.outputs.ToggleVirtualCamRequest;
import com.github.egorovna26.obs_remote_control.message.request.record.CreateRecordChapterRequest;
import com.github.egorovna26.obs_remote_control.message.request.record.GetRecordStatusRequest;
import com.github.egorovna26.obs_remote_control.message.request.record.PauseRecordRequest;
import com.github.egorovna26.obs_remote_control.message.request.record.ResumeRecordRequest;
import com.github.egorovna26.obs_remote_control.message.request.record.SplitRecordFileRequest;
import com.github.egorovna26.obs_remote_control.message.request.record.StartRecordRequest;
import com.github.egorovna26.obs_remote_control.message.request.record.StopRecordRequest;
import com.github.egorovna26.obs_remote_control.message.request.record.ToggleRecordPauseRequest;
import com.github.egorovna26.obs_remote_control.message.request.record.ToggleRecordRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.CreateSceneItemRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.DuplicateSceneItemRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.GetGroupSceneItemListRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.GetSceneItemBlendModeRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.GetSceneItemEnabledRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.GetSceneItemIdRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.GetSceneItemIndexRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.GetSceneItemListRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.GetSceneItemLockedRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.GetSceneItemSourceRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.GetSceneItemTransformRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.RemoveSceneItemRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.SetSceneItemBlendModeRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.SetSceneItemEnabledRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.SetSceneItemIndexRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.SetSceneItemLockedRequest;
import com.github.egorovna26.obs_remote_control.message.request.scene_items.SetSceneItemTransformRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.CreateSceneRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.GetCurrentPreviewSceneRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.GetCurrentProgramSceneRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.GetGroupListRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.GetSceneListRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.GetSceneSceneTransitionOverrideRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.RemoveSceneRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.SetCurrentPreviewSceneRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.SetCurrentProgramSceneRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.SetSceneNameRequest;
import com.github.egorovna26.obs_remote_control.message.request.scenes.SetSceneSceneTransitionOverrideRequest;
import com.github.egorovna26.obs_remote_control.message.request.sources.GetSourceActiveRequest;
import com.github.egorovna26.obs_remote_control.message.request.sources.GetSourceScreenshotRequest;
import com.github.egorovna26.obs_remote_control.message.request.sources.SaveSourceScreenshotRequest;
import com.github.egorovna26.obs_remote_control.message.request.stream.GetStreamStatusRequest;
import com.github.egorovna26.obs_remote_control.message.request.stream.SendStreamCaptionRequest;
import com.github.egorovna26.obs_remote_control.message.request.stream.StartStreamRequest;
import com.github.egorovna26.obs_remote_control.message.request.stream.StopStreamRequest;
import com.github.egorovna26.obs_remote_control.message.request.stream.ToggleStreamRequest;
import com.github.egorovna26.obs_remote_control.message.request.transitions.GetCurrentSceneTransitionCursorRequest;
import com.github.egorovna26.obs_remote_control.message.request.transitions.GetCurrentSceneTransitionRequest;
import com.github.egorovna26.obs_remote_control.message.request.transitions.GetSceneTransitionListRequest;
import com.github.egorovna26.obs_remote_control.message.request.transitions.GetTransitionKindListRequest;
import com.github.egorovna26.obs_remote_control.message.request.transitions.SetCurrentSceneTransitionDurationRequest;
import com.github.egorovna26.obs_remote_control.message.request.transitions.SetCurrentSceneTransitionRequest;
import com.github.egorovna26.obs_remote_control.message.request.transitions.SetCurrentSceneTransitionSettingsRequest;
import com.github.egorovna26.obs_remote_control.message.request.transitions.SetTBarPositionRequest;
import com.github.egorovna26.obs_remote_control.message.request.transitions.TriggerStudioModeTransitionRequest;
import com.github.egorovna26.obs_remote_control.message.request.ui.GetMonitorListRequest;
import com.github.egorovna26.obs_remote_control.message.request.ui.GetStudioModeEnabledRequest;
import com.github.egorovna26.obs_remote_control.message.request.ui.OpenInputFiltersDialogRequest;
import com.github.egorovna26.obs_remote_control.message.request.ui.OpenInputInteractDialogRequest;
import com.github.egorovna26.obs_remote_control.message.request.ui.OpenInputPropertiesDialogRequest;
import com.github.egorovna26.obs_remote_control.message.request.ui.OpenSourceProjectorRequest;
import com.github.egorovna26.obs_remote_control.message.request.ui.OpenVideoMixProjectorRequest;
import com.github.egorovna26.obs_remote_control.message.request.ui.SetStudioModeEnabledRequest;
import com.github.egorovna26.obs_remote_control.message.requestresponse.RequestResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.CreateProfileResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.CreateSceneCollectionResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.GetPersistentDataResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.GetProfileListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.GetProfileParameterResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.GetRecordDirectoryResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.GetSceneCollectionListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.GetStreamServiceSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.GetVideoSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.RemoveProfileResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.SetCurrentProfileResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.SetCurrentSceneCollectionResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.SetPersistentDataResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.SetProfileParameterResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.SetRecordDirectoryResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.SetStreamServiceSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.config.SetVideoSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.CreateSourceFilterResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.GetSourceFilterDefaultSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.GetSourceFilterKindListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.GetSourceFilterListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.GetSourceFilterResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.RemoveSourceFilterResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.SetSourceFilterEnabledResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.SetSourceFilterIndexResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.SetSourceFilterNameResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.filters.SetSourceFilterSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.general.BroadcastCustomEventResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.general.CallVendorRequestResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.general.GetHotkeyListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.general.GetStatsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.general.GetVersionResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.general.SleepResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.general.TriggerHotkeyByKeySequenceResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.general.TriggerHotkeyByNameResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.CreateInputResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputAudioBalanceResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputAudioMonitorTypeResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputAudioSyncOffsetResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputAudioTracksResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputDefaultSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputDeinterlaceFieldOrderResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputDeinterlaceModeResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputKindListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputMuteResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputPropertiesListPropertyItemsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetInputVolumeResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.GetSpecialInputsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.PressInputPropertiesButtonResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.RemoveInputResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputAudioBalanceResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputAudioMonitorTypeResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputAudioSyncOffsetResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputAudioTracksResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputDeinterlaceFieldOrderResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputDeinterlaceModeResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputMuteResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputNameResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.SetInputVolumeResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.inputs.ToggleInputMuteResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.media_inputs.GetMediaInputStatusResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.media_inputs.OffsetMediaInputCursorResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.media_inputs.SetMediaInputCursorResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.media_inputs.TriggerMediaInputActionResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.GetLastReplayBufferReplayResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.GetOutputListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.GetOutputSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.GetOutputStatusResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.GetReplayBufferStatusResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.GetVirtualCamStatusResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.SaveReplayBufferResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.SetOutputSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.StartOutputResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.StartReplayBufferResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.StartVirtualCamResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.StopOutputResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.StopReplayBufferResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.StopVirtualCamResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.ToggleOutputResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.ToggleReplayBufferResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.outputs.ToggleVirtualCamResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.record.CreateRecordChapterResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.record.GetRecordStatusResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.record.PauseRecordResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.record.ResumeRecordResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.record.SplitRecordFileResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.record.StartRecordResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.record.StopRecordResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.record.ToggleRecordPauseResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.record.ToggleRecordResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.CreateSceneItemResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.DuplicateSceneItemResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.GetGroupSceneItemListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.GetSceneItemBlendModeResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.GetSceneItemEnabledResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.GetSceneItemIdResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.GetSceneItemIndexResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.GetSceneItemListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.GetSceneItemLockedResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.GetSceneItemSourceResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.GetSceneItemTransformResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.RemoveSceneItemResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.SetSceneItemBlendModeResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.SetSceneItemEnabledResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.SetSceneItemIndexResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.SetSceneItemLockedResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scene_items.SetSceneItemTransformResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.CreateSceneResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.GetCurrentPreviewSceneResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.GetCurrentProgramSceneResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.GetGroupListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.GetSceneListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.GetSceneSceneTransitionOverrideResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.RemoveSceneResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.SetCurrentPreviewSceneResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.SetCurrentProgramSceneResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.SetSceneNameResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.scenes.SetSceneSceneTransitionOverrideResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.sources.GetSourceActiveResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.sources.GetSourceScreenshotResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.sources.SaveSourceScreenshotResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.stream.GetStreamStatusResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.stream.SendStreamCaptionResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.stream.StartStreamResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.stream.StopStreamResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.stream.ToggleStreamResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.transitions.GetCurrentSceneTransitionCursorResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.transitions.GetCurrentSceneTransitionResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.transitions.GetSceneTransitionListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.transitions.GetTransitionKindListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.transitions.SetCurrentSceneTransitionDurationResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.transitions.SetCurrentSceneTransitionResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.transitions.SetCurrentSceneTransitionSettingsResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.transitions.SetTBarPositionResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.transitions.TriggerStudioModeTransitionResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.ui.GetMonitorListResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.ui.GetStudioModeEnabledResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.ui.OpenInputFiltersDialogResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.ui.OpenInputInteractDialogResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.ui.OpenInputPropertiesDialogResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.ui.OpenSourceProjectorResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.ui.OpenVideoMixProjectorResponse;
import com.github.egorovna26.obs_remote_control.message.requestresponse.ui.SetStudioModeEnabledResponse;
import com.github.egorovna26.obs_remote_control.session.BlockingConsumer;
import com.github.egorovna26.obs_remote_control.session.OBSRemoteSession;
import java.lang.Exception;
import java.lang.Object;
import java.lang.String;
import lombok.CustomLog;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@CustomLog
public abstract class OBSRemoteControlBase {
    private static final int TIMEOUT = 5000;

    protected final OBSRemoteSession session = new OBSRemoteSession();

    /**
     * Gets the value of a "slot" from the selected persistent data realm.
     */
    public GetPersistentDataResponse getPersistentData(String realm, String slotName) {
        return send(new GetPersistentDataRequest(realm, slotName));
    }

    /**
     * Sets the value of a "slot" from the selected persistent data realm.
     */
    public SetPersistentDataResponse setPersistentData(String realm, String slotName,
            Object slotValue) {
        return send(new SetPersistentDataRequest(realm, slotName, slotValue));
    }

    /**
     * Gets an array of all scene collections
     */
    public GetSceneCollectionListResponse getSceneCollectionList() {
        return send(new GetSceneCollectionListRequest());
    }

    /**
     * Switches to a scene collection.
     *
     * Note: This will block until the collection has finished changing.
     */
    public SetCurrentSceneCollectionResponse setCurrentSceneCollection(String sceneCollectionName) {
        return send(new SetCurrentSceneCollectionRequest(sceneCollectionName));
    }

    /**
     * Creates a new scene collection, switching to it in the process.
     *
     * Note: This will block until the collection has finished changing.
     */
    public CreateSceneCollectionResponse createSceneCollection(String sceneCollectionName) {
        return send(new CreateSceneCollectionRequest(sceneCollectionName));
    }

    /**
     * Gets an array of all profiles
     */
    public GetProfileListResponse getProfileList() {
        return send(new GetProfileListRequest());
    }

    /**
     * Switches to a profile.
     */
    public SetCurrentProfileResponse setCurrentProfile(String profileName) {
        return send(new SetCurrentProfileRequest(profileName));
    }

    /**
     * Creates a new profile, switching to it in the process
     */
    public CreateProfileResponse createProfile(String profileName) {
        return send(new CreateProfileRequest(profileName));
    }

    /**
     * Removes a profile. If the current profile is chosen, it will change to a different profile first.
     */
    public RemoveProfileResponse removeProfile(String profileName) {
        return send(new RemoveProfileRequest(profileName));
    }

    /**
     * Gets a parameter from the current profile's configuration.
     */
    public GetProfileParameterResponse getProfileParameter(String parameterCategory,
            String parameterName) {
        return send(new GetProfileParameterRequest(parameterCategory, parameterName));
    }

    /**
     * Sets the value of a parameter in the current profile's configuration.
     */
    public SetProfileParameterResponse setProfileParameter(String parameterCategory,
            String parameterName, String parameterValue) {
        return send(new SetProfileParameterRequest(parameterCategory, parameterName, parameterValue));
    }

    /**
     * Gets the current video settings.
     *
     * Note: To get the true FPS value, divide the FPS numerator by the FPS denominator. Example: `60000/1001`
     */
    public GetVideoSettingsResponse getVideoSettings() {
        return send(new GetVideoSettingsRequest());
    }

    /**
     * Sets the current video settings.
     *
     * Note: Fields must be specified in pairs. For example, you cannot set only `baseWidth` without needing to specify `baseHeight`.
     */
    public SetVideoSettingsResponse setVideoSettings(int fpsNumerator, int fpsDenominator,
            int baseWidth, int baseHeight, int outputWidth, int outputHeight) {
        return send(new SetVideoSettingsRequest(fpsNumerator, fpsDenominator, baseWidth, baseHeight, outputWidth, outputHeight));
    }

    /**
     * Gets the current stream service settings (stream destination).
     */
    public GetStreamServiceSettingsResponse getStreamServiceSettings() {
        return send(new GetStreamServiceSettingsRequest());
    }

    /**
     * Sets the current stream service settings (stream destination).
     *
     * Note: Simple RTMP settings can be set with type `rtmp_custom` and the settings fields `server` and `key`.
     */
    public SetStreamServiceSettingsResponse setStreamServiceSettings(String streamServiceType,
            Object streamServiceSettings) {
        return send(new SetStreamServiceSettingsRequest(streamServiceType, streamServiceSettings));
    }

    /**
     * Gets the current directory that the record output is set to.
     */
    public GetRecordDirectoryResponse getRecordDirectory() {
        return send(new GetRecordDirectoryRequest());
    }

    /**
     * Sets the current directory that the record output writes files to.
     */
    public SetRecordDirectoryResponse setRecordDirectory(String recordDirectory) {
        return send(new SetRecordDirectoryRequest(recordDirectory));
    }

    /**
     * Gets an array of all available source filter kinds.
     *
     * Similar to `GetInputKindList`
     */
    public GetSourceFilterKindListResponse getSourceFilterKindList() {
        return send(new GetSourceFilterKindListRequest());
    }

    /**
     * Gets an array of all of a source's filters.
     */
    public GetSourceFilterListResponse getSourceFilterList(String sourceName, String sourceUuid) {
        return send(new GetSourceFilterListRequest(sourceName, sourceUuid));
    }

    /**
     * Gets the default settings for a filter kind.
     */
    public GetSourceFilterDefaultSettingsResponse getSourceFilterDefaultSettings(
            String filterKind) {
        return send(new GetSourceFilterDefaultSettingsRequest(filterKind));
    }

    /**
     * Creates a new filter, adding it to the specified source.
     */
    public CreateSourceFilterResponse createSourceFilter(String sourceName, String sourceUuid,
            String filterName, String filterKind, Object filterSettings) {
        return send(new CreateSourceFilterRequest(sourceName, sourceUuid, filterName, filterKind, filterSettings));
    }

    /**
     * Removes a filter from a source.
     */
    public RemoveSourceFilterResponse removeSourceFilter(String sourceName, String sourceUuid,
            String filterName) {
        return send(new RemoveSourceFilterRequest(sourceName, sourceUuid, filterName));
    }

    /**
     * Sets the name of a source filter (rename).
     */
    public SetSourceFilterNameResponse setSourceFilterName(String sourceName, String sourceUuid,
            String filterName, String newFilterName) {
        return send(new SetSourceFilterNameRequest(sourceName, sourceUuid, filterName, newFilterName));
    }

    /**
     * Gets the info for a specific source filter.
     */
    public GetSourceFilterResponse getSourceFilter(String sourceName, String sourceUuid,
            String filterName) {
        return send(new GetSourceFilterRequest(sourceName, sourceUuid, filterName));
    }

    /**
     * Sets the index position of a filter on a source.
     */
    public SetSourceFilterIndexResponse setSourceFilterIndex(String sourceName, String sourceUuid,
            String filterName, int filterIndex) {
        return send(new SetSourceFilterIndexRequest(sourceName, sourceUuid, filterName, filterIndex));
    }

    /**
     * Sets the settings of a source filter.
     */
    public SetSourceFilterSettingsResponse setSourceFilterSettings(String sourceName,
            String sourceUuid, String filterName, Object filterSettings, boolean overlay) {
        return send(new SetSourceFilterSettingsRequest(sourceName, sourceUuid, filterName, filterSettings, overlay));
    }

    /**
     * Sets the enable state of a source filter.
     */
    public SetSourceFilterEnabledResponse setSourceFilterEnabled(String sourceName,
            String sourceUuid, String filterName, boolean filterEnabled) {
        return send(new SetSourceFilterEnabledRequest(sourceName, sourceUuid, filterName, filterEnabled));
    }

    /**
     * Gets data about the current plugin and RPC version.
     */
    public GetVersionResponse getVersion() {
        return send(new GetVersionRequest());
    }

    /**
     * Gets statistics about OBS, obs-websocket, and the current session.
     */
    public GetStatsResponse getStats() {
        return send(new GetStatsRequest());
    }

    /**
     * Broadcasts a `CustomEvent` to all WebSocket clients. Receivers are clients which are identified and subscribed.
     */
    public BroadcastCustomEventResponse broadcastCustomEvent(Object eventData) {
        return send(new BroadcastCustomEventRequest(eventData));
    }

    /**
     * Call a request registered to a vendor.
     *
     * A vendor is a unique name registered by a third-party plugin or script, which allows for custom requests and events to be added to obs-websocket.
     * If a plugin or script implements vendor requests or events, documentation is expected to be provided with them.
     */
    public CallVendorRequestResponse callVendorRequest(String vendorName, String requestType,
            Object requestData) {
        return send(new CallVendorRequestRequest(vendorName, requestType, requestData));
    }

    /**
     * Gets an array of all hotkey names in OBS.
     *
     * Note: Hotkey functionality in obs-websocket comes as-is, and we do not guarantee support if things are broken. In 9/10 usages of hotkey requests, there exists a better, more reliable method via other requests.
     */
    public GetHotkeyListResponse getHotkeyList() {
        return send(new GetHotkeyListRequest());
    }

    /**
     * Triggers a hotkey using its name. See `GetHotkeyList`.
     *
     * Note: Hotkey functionality in obs-websocket comes as-is, and we do not guarantee support if things are broken. In 9/10 usages of hotkey requests, there exists a better, more reliable method via other requests.
     */
    public TriggerHotkeyByNameResponse triggerHotkeyByName(String hotkeyName, String contextName) {
        return send(new TriggerHotkeyByNameRequest(hotkeyName, contextName));
    }

    /**
     * Triggers a hotkey using a sequence of keys.
     *
     * Note: Hotkey functionality in obs-websocket comes as-is, and we do not guarantee support if things are broken. In 9/10 usages of hotkey requests, there exists a better, more reliable method via other requests.
     */
    public TriggerHotkeyByKeySequenceResponse triggerHotkeyByKeySequence(String keyId,
            Object keyModifiers) {
        return send(new TriggerHotkeyByKeySequenceRequest(keyId, keyModifiers));
    }

    /**
     * Sleeps for a time duration or number of frames. Only available in request batches with types `SERIAL_REALTIME` or `SERIAL_FRAME`.
     */
    public SleepResponse sleep(int sleepMillis, int sleepFrames) {
        return send(new SleepRequest(sleepMillis, sleepFrames));
    }

    /**
     * Gets an array of all inputs in OBS.
     */
    public GetInputListResponse getInputList(String inputKind) {
        return send(new GetInputListRequest(inputKind));
    }

    /**
     * Gets an array of all available input kinds in OBS.
     */
    public GetInputKindListResponse getInputKindList(boolean unversioned) {
        return send(new GetInputKindListRequest(unversioned));
    }

    /**
     * Gets the names of all special inputs.
     */
    public GetSpecialInputsResponse getSpecialInputs() {
        return send(new GetSpecialInputsRequest());
    }

    /**
     * Creates a new input, adding it as a scene item to the specified scene.
     */
    public CreateInputResponse createInput(String sceneName, String sceneUuid, String inputName,
            String inputKind, Object inputSettings, boolean sceneItemEnabled) {
        return send(new CreateInputRequest(sceneName, sceneUuid, inputName, inputKind, inputSettings, sceneItemEnabled));
    }

    /**
     * Removes an existing input.
     *
     * Note: Will immediately remove all associated scene items.
     */
    public RemoveInputResponse removeInput(String inputName, String inputUuid) {
        return send(new RemoveInputRequest(inputName, inputUuid));
    }

    /**
     * Sets the name of an input (rename).
     */
    public SetInputNameResponse setInputName(String inputName, String inputUuid,
            String newInputName) {
        return send(new SetInputNameRequest(inputName, inputUuid, newInputName));
    }

    /**
     * Gets the default settings for an input kind.
     */
    public GetInputDefaultSettingsResponse getInputDefaultSettings(String inputKind) {
        return send(new GetInputDefaultSettingsRequest(inputKind));
    }

    /**
     * Gets the settings of an input.
     *
     * Note: Does not include defaults. To create the entire settings object, overlay `inputSettings` over the `defaultInputSettings` provided by `GetInputDefaultSettings`.
     */
    public GetInputSettingsResponse getInputSettings(String inputName, String inputUuid) {
        return send(new GetInputSettingsRequest(inputName, inputUuid));
    }

    /**
     * Sets the settings of an input.
     */
    public SetInputSettingsResponse setInputSettings(String inputName, String inputUuid,
            Object inputSettings, boolean overlay) {
        return send(new SetInputSettingsRequest(inputName, inputUuid, inputSettings, overlay));
    }

    /**
     * Gets the audio mute state of an input.
     */
    public GetInputMuteResponse getInputMute(String inputName, String inputUuid) {
        return send(new GetInputMuteRequest(inputName, inputUuid));
    }

    /**
     * Sets the audio mute state of an input.
     */
    public SetInputMuteResponse setInputMute(String inputName, String inputUuid,
            boolean inputMuted) {
        return send(new SetInputMuteRequest(inputName, inputUuid, inputMuted));
    }

    /**
     * Toggles the audio mute state of an input.
     */
    public ToggleInputMuteResponse toggleInputMute(String inputName, String inputUuid) {
        return send(new ToggleInputMuteRequest(inputName, inputUuid));
    }

    /**
     * Gets the current volume setting of an input.
     */
    public GetInputVolumeResponse getInputVolume(String inputName, String inputUuid) {
        return send(new GetInputVolumeRequest(inputName, inputUuid));
    }

    /**
     * Sets the volume setting of an input.
     */
    public SetInputVolumeResponse setInputVolume(String inputName, String inputUuid,
            int inputVolumeMul, int inputVolumeDb) {
        return send(new SetInputVolumeRequest(inputName, inputUuid, inputVolumeMul, inputVolumeDb));
    }

    /**
     * Gets the audio balance of an input.
     */
    public GetInputAudioBalanceResponse getInputAudioBalance(String inputName, String inputUuid) {
        return send(new GetInputAudioBalanceRequest(inputName, inputUuid));
    }

    /**
     * Sets the audio balance of an input.
     */
    public SetInputAudioBalanceResponse setInputAudioBalance(String inputName, String inputUuid,
            int inputAudioBalance) {
        return send(new SetInputAudioBalanceRequest(inputName, inputUuid, inputAudioBalance));
    }

    /**
     * Gets the audio sync offset of an input.
     *
     * Note: The audio sync offset can be negative too!
     */
    public GetInputAudioSyncOffsetResponse getInputAudioSyncOffset(String inputName,
            String inputUuid) {
        return send(new GetInputAudioSyncOffsetRequest(inputName, inputUuid));
    }

    /**
     * Sets the audio sync offset of an input.
     */
    public SetInputAudioSyncOffsetResponse setInputAudioSyncOffset(String inputName,
            String inputUuid, int inputAudioSyncOffset) {
        return send(new SetInputAudioSyncOffsetRequest(inputName, inputUuid, inputAudioSyncOffset));
    }

    /**
     * Gets the audio monitor type of an input.
     *
     * The available audio monitor types are:
     *
     * - `OBS_MONITORING_TYPE_NONE`
     * - `OBS_MONITORING_TYPE_MONITOR_ONLY`
     * - `OBS_MONITORING_TYPE_MONITOR_AND_OUTPUT`
     */
    public GetInputAudioMonitorTypeResponse getInputAudioMonitorType(String inputName,
            String inputUuid) {
        return send(new GetInputAudioMonitorTypeRequest(inputName, inputUuid));
    }

    /**
     * Sets the audio monitor type of an input.
     */
    public SetInputAudioMonitorTypeResponse setInputAudioMonitorType(String inputName,
            String inputUuid, String monitorType) {
        return send(new SetInputAudioMonitorTypeRequest(inputName, inputUuid, monitorType));
    }

    /**
     * Gets the enable state of all audio tracks of an input.
     */
    public GetInputAudioTracksResponse getInputAudioTracks(String inputName, String inputUuid) {
        return send(new GetInputAudioTracksRequest(inputName, inputUuid));
    }

    /**
     * Sets the enable state of audio tracks of an input.
     */
    public SetInputAudioTracksResponse setInputAudioTracks(String inputName, String inputUuid,
            Object inputAudioTracks) {
        return send(new SetInputAudioTracksRequest(inputName, inputUuid, inputAudioTracks));
    }

    /**
     * Gets the deinterlace mode of an input.
     *
     * Deinterlace Modes:
     *
     * - `OBS_DEINTERLACE_MODE_DISABLE`
     * - `OBS_DEINTERLACE_MODE_DISCARD`
     * - `OBS_DEINTERLACE_MODE_RETRO`
     * - `OBS_DEINTERLACE_MODE_BLEND`
     * - `OBS_DEINTERLACE_MODE_BLEND_2X`
     * - `OBS_DEINTERLACE_MODE_LINEAR`
     * - `OBS_DEINTERLACE_MODE_LINEAR_2X`
     * - `OBS_DEINTERLACE_MODE_YADIF`
     * - `OBS_DEINTERLACE_MODE_YADIF_2X`
     *
     * Note: Deinterlacing functionality is restricted to async inputs only.
     */
    public GetInputDeinterlaceModeResponse getInputDeinterlaceMode(String inputName,
            String inputUuid) {
        return send(new GetInputDeinterlaceModeRequest(inputName, inputUuid));
    }

    /**
     * Sets the deinterlace mode of an input.
     *
     * Note: Deinterlacing functionality is restricted to async inputs only.
     */
    public SetInputDeinterlaceModeResponse setInputDeinterlaceMode(String inputName,
            String inputUuid, String inputDeinterlaceMode) {
        return send(new SetInputDeinterlaceModeRequest(inputName, inputUuid, inputDeinterlaceMode));
    }

    /**
     * Gets the deinterlace field order of an input.
     *
     * Deinterlace Field Orders:
     *
     * - `OBS_DEINTERLACE_FIELD_ORDER_TOP`
     * - `OBS_DEINTERLACE_FIELD_ORDER_BOTTOM`
     *
     * Note: Deinterlacing functionality is restricted to async inputs only.
     */
    public GetInputDeinterlaceFieldOrderResponse getInputDeinterlaceFieldOrder(String inputName,
            String inputUuid) {
        return send(new GetInputDeinterlaceFieldOrderRequest(inputName, inputUuid));
    }

    /**
     * Sets the deinterlace field order of an input.
     *
     * Note: Deinterlacing functionality is restricted to async inputs only.
     */
    public SetInputDeinterlaceFieldOrderResponse setInputDeinterlaceFieldOrder(String inputName,
            String inputUuid, String inputDeinterlaceFieldOrder) {
        return send(new SetInputDeinterlaceFieldOrderRequest(inputName, inputUuid, inputDeinterlaceFieldOrder));
    }

    /**
     * Gets the items of a list property from an input's properties.
     *
     * Note: Use this in cases where an input provides a dynamic, selectable list of items. For example, display capture, where it provides a list of available displays.
     */
    public GetInputPropertiesListPropertyItemsResponse getInputPropertiesListPropertyItems(
            String inputName, String inputUuid, String propertyName) {
        return send(new GetInputPropertiesListPropertyItemsRequest(inputName, inputUuid, propertyName));
    }

    /**
     * Presses a button in the properties of an input.
     *
     * Some known `propertyName` values are:
     *
     * - `refreshnocache` - Browser source reload button
     *
     * Note: Use this in cases where there is a button in the properties of an input that cannot be accessed in any other way. For example, browser sources, where there is a refresh button.
     */
    public PressInputPropertiesButtonResponse pressInputPropertiesButton(String inputName,
            String inputUuid, String propertyName) {
        return send(new PressInputPropertiesButtonRequest(inputName, inputUuid, propertyName));
    }

    /**
     * Gets the status of a media input.
     *
     * Media States:
     *
     * - `OBS_MEDIA_STATE_NONE`
     * - `OBS_MEDIA_STATE_PLAYING`
     * - `OBS_MEDIA_STATE_OPENING`
     * - `OBS_MEDIA_STATE_BUFFERING`
     * - `OBS_MEDIA_STATE_PAUSED`
     * - `OBS_MEDIA_STATE_STOPPED`
     * - `OBS_MEDIA_STATE_ENDED`
     * - `OBS_MEDIA_STATE_ERROR`
     */
    public GetMediaInputStatusResponse getMediaInputStatus(String inputName, String inputUuid) {
        return send(new GetMediaInputStatusRequest(inputName, inputUuid));
    }

    /**
     * Sets the cursor position of a media input.
     *
     * This request does not perform bounds checking of the cursor position.
     */
    public SetMediaInputCursorResponse setMediaInputCursor(String inputName, String inputUuid,
            int mediaCursor) {
        return send(new SetMediaInputCursorRequest(inputName, inputUuid, mediaCursor));
    }

    /**
     * Offsets the current cursor position of a media input by the specified value.
     *
     * This request does not perform bounds checking of the cursor position.
     */
    public OffsetMediaInputCursorResponse offsetMediaInputCursor(String inputName, String inputUuid,
            int mediaCursorOffset) {
        return send(new OffsetMediaInputCursorRequest(inputName, inputUuid, mediaCursorOffset));
    }

    /**
     * Triggers an action on a media input.
     */
    public TriggerMediaInputActionResponse triggerMediaInputAction(String inputName,
            String inputUuid, String mediaAction) {
        return send(new TriggerMediaInputActionRequest(inputName, inputUuid, mediaAction));
    }

    /**
     * Gets the status of the virtualcam output.
     */
    public GetVirtualCamStatusResponse getVirtualCamStatus() {
        return send(new GetVirtualCamStatusRequest());
    }

    /**
     * Toggles the state of the virtualcam output.
     */
    public ToggleVirtualCamResponse toggleVirtualCam() {
        return send(new ToggleVirtualCamRequest());
    }

    /**
     * Starts the virtualcam output.
     */
    public StartVirtualCamResponse startVirtualCam() {
        return send(new StartVirtualCamRequest());
    }

    /**
     * Stops the virtualcam output.
     */
    public StopVirtualCamResponse stopVirtualCam() {
        return send(new StopVirtualCamRequest());
    }

    /**
     * Gets the status of the replay buffer output.
     */
    public GetReplayBufferStatusResponse getReplayBufferStatus() {
        return send(new GetReplayBufferStatusRequest());
    }

    /**
     * Toggles the state of the replay buffer output.
     */
    public ToggleReplayBufferResponse toggleReplayBuffer() {
        return send(new ToggleReplayBufferRequest());
    }

    /**
     * Starts the replay buffer output.
     */
    public StartReplayBufferResponse startReplayBuffer() {
        return send(new StartReplayBufferRequest());
    }

    /**
     * Stops the replay buffer output.
     */
    public StopReplayBufferResponse stopReplayBuffer() {
        return send(new StopReplayBufferRequest());
    }

    /**
     * Saves the contents of the replay buffer output.
     */
    public SaveReplayBufferResponse saveReplayBuffer() {
        return send(new SaveReplayBufferRequest());
    }

    /**
     * Gets the filename of the last replay buffer save file.
     */
    public GetLastReplayBufferReplayResponse getLastReplayBufferReplay() {
        return send(new GetLastReplayBufferReplayRequest());
    }

    /**
     * Gets the list of available outputs.
     */
    public GetOutputListResponse getOutputList() {
        return send(new GetOutputListRequest());
    }

    /**
     * Gets the status of an output.
     */
    public GetOutputStatusResponse getOutputStatus(String outputName) {
        return send(new GetOutputStatusRequest(outputName));
    }

    /**
     * Toggles the status of an output.
     */
    public ToggleOutputResponse toggleOutput(String outputName) {
        return send(new ToggleOutputRequest(outputName));
    }

    /**
     * Starts an output.
     */
    public StartOutputResponse startOutput(String outputName) {
        return send(new StartOutputRequest(outputName));
    }

    /**
     * Stops an output.
     */
    public StopOutputResponse stopOutput(String outputName) {
        return send(new StopOutputRequest(outputName));
    }

    /**
     * Gets the settings of an output.
     */
    public GetOutputSettingsResponse getOutputSettings(String outputName) {
        return send(new GetOutputSettingsRequest(outputName));
    }

    /**
     * Sets the settings of an output.
     */
    public SetOutputSettingsResponse setOutputSettings(String outputName, Object outputSettings) {
        return send(new SetOutputSettingsRequest(outputName, outputSettings));
    }

    /**
     * Gets the status of the record output.
     */
    public GetRecordStatusResponse getRecordStatus() {
        return send(new GetRecordStatusRequest());
    }

    /**
     * Toggles the status of the record output.
     */
    public ToggleRecordResponse toggleRecord() {
        return send(new ToggleRecordRequest());
    }

    /**
     * Starts the record output.
     */
    public StartRecordResponse startRecord() {
        return send(new StartRecordRequest());
    }

    /**
     * Stops the record output.
     */
    public StopRecordResponse stopRecord() {
        return send(new StopRecordRequest());
    }

    /**
     * Toggles pause on the record output.
     */
    public ToggleRecordPauseResponse toggleRecordPause() {
        return send(new ToggleRecordPauseRequest());
    }

    /**
     * Pauses the record output.
     */
    public PauseRecordResponse pauseRecord() {
        return send(new PauseRecordRequest());
    }

    /**
     * Resumes the record output.
     */
    public ResumeRecordResponse resumeRecord() {
        return send(new ResumeRecordRequest());
    }

    /**
     * Splits the current file being recorded into a new file.
     */
    public SplitRecordFileResponse splitRecordFile() {
        return send(new SplitRecordFileRequest());
    }

    /**
     * Adds a new chapter marker to the file currently being recorded.
     *
     * Note: As of OBS 30.2.0, the only file format supporting this feature is Hybrid MP4.
     */
    public CreateRecordChapterResponse createRecordChapter(String chapterName) {
        return send(new CreateRecordChapterRequest(chapterName));
    }

    /**
     * Gets a list of all scene items in a scene.
     *
     * Scenes only
     */
    public GetSceneItemListResponse getSceneItemList(String sceneName, String sceneUuid) {
        return send(new GetSceneItemListRequest(sceneName, sceneUuid));
    }

    /**
     * Basically GetSceneItemList, but for groups.
     *
     * Using groups at all in OBS is discouraged, as they are very broken under the hood. Please use nested scenes instead.
     *
     * Groups only
     */
    public GetGroupSceneItemListResponse getGroupSceneItemList(String sceneName, String sceneUuid) {
        return send(new GetGroupSceneItemListRequest(sceneName, sceneUuid));
    }

    /**
     * Searches a scene for a source, and returns its id.
     *
     * Scenes and Groups
     */
    public GetSceneItemIdResponse getSceneItemId(String sceneName, String sceneUuid,
            String sourceName, int searchOffset) {
        return send(new GetSceneItemIdRequest(sceneName, sceneUuid, sourceName, searchOffset));
    }

    /**
     * Gets the source associated with a scene item.
     */
    public GetSceneItemSourceResponse getSceneItemSource(String sceneName, String sceneUuid,
            int sceneItemId) {
        return send(new GetSceneItemSourceRequest(sceneName, sceneUuid, sceneItemId));
    }

    /**
     * Creates a new scene item using a source.
     *
     * Scenes only
     */
    public CreateSceneItemResponse createSceneItem(String sceneName, String sceneUuid,
            String sourceName, String sourceUuid, boolean sceneItemEnabled) {
        return send(new CreateSceneItemRequest(sceneName, sceneUuid, sourceName, sourceUuid, sceneItemEnabled));
    }

    /**
     * Removes a scene item from a scene.
     *
     * Scenes only
     */
    public RemoveSceneItemResponse removeSceneItem(String sceneName, String sceneUuid,
            int sceneItemId) {
        return send(new RemoveSceneItemRequest(sceneName, sceneUuid, sceneItemId));
    }

    /**
     * Duplicates a scene item, copying all transform and crop info.
     *
     * Scenes only
     */
    public DuplicateSceneItemResponse duplicateSceneItem(String sceneName, String sceneUuid,
            int sceneItemId, String destinationSceneName, String destinationSceneUuid) {
        return send(new DuplicateSceneItemRequest(sceneName, sceneUuid, sceneItemId, destinationSceneName, destinationSceneUuid));
    }

    /**
     * Gets the transform and crop info of a scene item.
     *
     * Scenes and Groups
     */
    public GetSceneItemTransformResponse getSceneItemTransform(String sceneName, String sceneUuid,
            int sceneItemId) {
        return send(new GetSceneItemTransformRequest(sceneName, sceneUuid, sceneItemId));
    }

    /**
     * Sets the transform and crop info of a scene item.
     */
    public SetSceneItemTransformResponse setSceneItemTransform(String sceneName, String sceneUuid,
            int sceneItemId, Object sceneItemTransform) {
        return send(new SetSceneItemTransformRequest(sceneName, sceneUuid, sceneItemId, sceneItemTransform));
    }

    /**
     * Gets the enable state of a scene item.
     *
     * Scenes and Groups
     */
    public GetSceneItemEnabledResponse getSceneItemEnabled(String sceneName, String sceneUuid,
            int sceneItemId) {
        return send(new GetSceneItemEnabledRequest(sceneName, sceneUuid, sceneItemId));
    }

    /**
     * Sets the enable state of a scene item.
     *
     * Scenes and Groups
     */
    public SetSceneItemEnabledResponse setSceneItemEnabled(String sceneName, String sceneUuid,
            int sceneItemId, boolean sceneItemEnabled) {
        return send(new SetSceneItemEnabledRequest(sceneName, sceneUuid, sceneItemId, sceneItemEnabled));
    }

    /**
     * Gets the lock state of a scene item.
     *
     * Scenes and Groups
     */
    public GetSceneItemLockedResponse getSceneItemLocked(String sceneName, String sceneUuid,
            int sceneItemId) {
        return send(new GetSceneItemLockedRequest(sceneName, sceneUuid, sceneItemId));
    }

    /**
     * Sets the lock state of a scene item.
     *
     * Scenes and Group
     */
    public SetSceneItemLockedResponse setSceneItemLocked(String sceneName, String sceneUuid,
            int sceneItemId, boolean sceneItemLocked) {
        return send(new SetSceneItemLockedRequest(sceneName, sceneUuid, sceneItemId, sceneItemLocked));
    }

    /**
     * Gets the index position of a scene item in a scene.
     *
     * An index of 0 is at the bottom of the source list in the UI.
     *
     * Scenes and Groups
     */
    public GetSceneItemIndexResponse getSceneItemIndex(String sceneName, String sceneUuid,
            int sceneItemId) {
        return send(new GetSceneItemIndexRequest(sceneName, sceneUuid, sceneItemId));
    }

    /**
     * Sets the index position of a scene item in a scene.
     *
     * Scenes and Groups
     */
    public SetSceneItemIndexResponse setSceneItemIndex(String sceneName, String sceneUuid,
            int sceneItemId, int sceneItemIndex) {
        return send(new SetSceneItemIndexRequest(sceneName, sceneUuid, sceneItemId, sceneItemIndex));
    }

    /**
     * Gets the blend mode of a scene item.
     *
     * Blend modes:
     *
     * - `OBS_BLEND_NORMAL`
     * - `OBS_BLEND_ADDITIVE`
     * - `OBS_BLEND_SUBTRACT`
     * - `OBS_BLEND_SCREEN`
     * - `OBS_BLEND_MULTIPLY`
     * - `OBS_BLEND_LIGHTEN`
     * - `OBS_BLEND_DARKEN`
     *
     * Scenes and Groups
     */
    public GetSceneItemBlendModeResponse getSceneItemBlendMode(String sceneName, String sceneUuid,
            int sceneItemId) {
        return send(new GetSceneItemBlendModeRequest(sceneName, sceneUuid, sceneItemId));
    }

    /**
     * Sets the blend mode of a scene item.
     *
     * Scenes and Groups
     */
    public SetSceneItemBlendModeResponse setSceneItemBlendMode(String sceneName, String sceneUuid,
            int sceneItemId, String sceneItemBlendMode) {
        return send(new SetSceneItemBlendModeRequest(sceneName, sceneUuid, sceneItemId, sceneItemBlendMode));
    }

    /**
     * Gets an array of all scenes in OBS.
     */
    public GetSceneListResponse getSceneList() {
        return send(new GetSceneListRequest());
    }

    /**
     * Gets an array of all groups in OBS.
     *
     * Groups in OBS are actually scenes, but renamed and modified. In obs-websocket, we treat them as scenes where we can.
     */
    public GetGroupListResponse getGroupList() {
        return send(new GetGroupListRequest());
    }

    /**
     * Gets the current program scene.
     *
     * Note: This request is slated to have the `currentProgram`-prefixed fields removed from in an upcoming RPC version.
     */
    public GetCurrentProgramSceneResponse getCurrentProgramScene() {
        return send(new GetCurrentProgramSceneRequest());
    }

    /**
     * Sets the current program scene.
     */
    public SetCurrentProgramSceneResponse setCurrentProgramScene(String sceneName,
            String sceneUuid) {
        return send(new SetCurrentProgramSceneRequest(sceneName, sceneUuid));
    }

    /**
     * Gets the current preview scene.
     *
     * Only available when studio mode is enabled.
     *
     * Note: This request is slated to have the `currentPreview`-prefixed fields removed from in an upcoming RPC version.
     */
    public GetCurrentPreviewSceneResponse getCurrentPreviewScene() {
        return send(new GetCurrentPreviewSceneRequest());
    }

    /**
     * Sets the current preview scene.
     *
     * Only available when studio mode is enabled.
     */
    public SetCurrentPreviewSceneResponse setCurrentPreviewScene(String sceneName,
            String sceneUuid) {
        return send(new SetCurrentPreviewSceneRequest(sceneName, sceneUuid));
    }

    /**
     * Creates a new scene in OBS.
     */
    public CreateSceneResponse createScene(String sceneName) {
        return send(new CreateSceneRequest(sceneName));
    }

    /**
     * Removes a scene from OBS.
     */
    public RemoveSceneResponse removeScene(String sceneName, String sceneUuid) {
        return send(new RemoveSceneRequest(sceneName, sceneUuid));
    }

    /**
     * Sets the name of a scene (rename).
     */
    public SetSceneNameResponse setSceneName(String sceneName, String sceneUuid,
            String newSceneName) {
        return send(new SetSceneNameRequest(sceneName, sceneUuid, newSceneName));
    }

    /**
     * Gets the scene transition overridden for a scene.
     *
     * Note: A transition UUID response field is not currently able to be implemented as of 2024-1-18.
     */
    public GetSceneSceneTransitionOverrideResponse getSceneSceneTransitionOverride(String sceneName,
            String sceneUuid) {
        return send(new GetSceneSceneTransitionOverrideRequest(sceneName, sceneUuid));
    }

    /**
     * Sets the scene transition overridden for a scene.
     */
    public SetSceneSceneTransitionOverrideResponse setSceneSceneTransitionOverride(String sceneName,
            String sceneUuid, String transitionName, int transitionDuration) {
        return send(new SetSceneSceneTransitionOverrideRequest(sceneName, sceneUuid, transitionName, transitionDuration));
    }

    /**
     * Gets the active and show state of a source.
     *
     * **Compatible with inputs and scenes.**
     */
    public GetSourceActiveResponse getSourceActive(String sourceName, String sourceUuid) {
        return send(new GetSourceActiveRequest(sourceName, sourceUuid));
    }

    /**
     * Gets a Base64-encoded screenshot of a source.
     *
     * The `imageWidth` and `imageHeight` parameters are treated as "scale to inner", meaning the smallest ratio will be used and the aspect ratio of the original resolution is kept.
     * If `imageWidth` and `imageHeight` are not specified, the compressed image will use the full resolution of the source.
     *
     * **Compatible with inputs and scenes.**
     */
    public GetSourceScreenshotResponse getSourceScreenshot(String sourceName, String sourceUuid,
            String imageFormat, int imageWidth, int imageHeight, int imageCompressionQuality) {
        return send(new GetSourceScreenshotRequest(sourceName, sourceUuid, imageFormat, imageWidth, imageHeight, imageCompressionQuality));
    }

    /**
     * Saves a screenshot of a source to the filesystem.
     *
     * The `imageWidth` and `imageHeight` parameters are treated as "scale to inner", meaning the smallest ratio will be used and the aspect ratio of the original resolution is kept.
     * If `imageWidth` and `imageHeight` are not specified, the compressed image will use the full resolution of the source.
     *
     * **Compatible with inputs and scenes.**
     */
    public SaveSourceScreenshotResponse saveSourceScreenshot(String sourceName, String sourceUuid,
            String imageFormat, String imageFilePath, int imageWidth, int imageHeight,
            int imageCompressionQuality) {
        return send(new SaveSourceScreenshotRequest(sourceName, sourceUuid, imageFormat, imageFilePath, imageWidth, imageHeight, imageCompressionQuality));
    }

    /**
     * Gets the status of the stream output.
     */
    public GetStreamStatusResponse getStreamStatus() {
        return send(new GetStreamStatusRequest());
    }

    /**
     * Toggles the status of the stream output.
     */
    public ToggleStreamResponse toggleStream() {
        return send(new ToggleStreamRequest());
    }

    /**
     * Starts the stream output.
     */
    public StartStreamResponse startStream() {
        return send(new StartStreamRequest());
    }

    /**
     * Stops the stream output.
     */
    public StopStreamResponse stopStream() {
        return send(new StopStreamRequest());
    }

    /**
     * Sends CEA-608 caption text over the stream output.
     */
    public SendStreamCaptionResponse sendStreamCaption(String captionText) {
        return send(new SendStreamCaptionRequest(captionText));
    }

    /**
     * Gets an array of all available transition kinds.
     *
     * Similar to `GetInputKindList`
     */
    public GetTransitionKindListResponse getTransitionKindList() {
        return send(new GetTransitionKindListRequest());
    }

    /**
     * Gets an array of all scene transitions in OBS.
     */
    public GetSceneTransitionListResponse getSceneTransitionList() {
        return send(new GetSceneTransitionListRequest());
    }

    /**
     * Gets information about the current scene transition.
     */
    public GetCurrentSceneTransitionResponse getCurrentSceneTransition() {
        return send(new GetCurrentSceneTransitionRequest());
    }

    /**
     * Sets the current scene transition.
     *
     * Small note: While the namespace of scene transitions is generally unique, that uniqueness is not a guarantee as it is with other resources like inputs.
     */
    public SetCurrentSceneTransitionResponse setCurrentSceneTransition(String transitionName) {
        return send(new SetCurrentSceneTransitionRequest(transitionName));
    }

    /**
     * Sets the duration of the current scene transition, if it is not fixed.
     */
    public SetCurrentSceneTransitionDurationResponse setCurrentSceneTransitionDuration(
            int transitionDuration) {
        return send(new SetCurrentSceneTransitionDurationRequest(transitionDuration));
    }

    /**
     * Sets the settings of the current scene transition.
     */
    public SetCurrentSceneTransitionSettingsResponse setCurrentSceneTransitionSettings(
            Object transitionSettings, boolean overlay) {
        return send(new SetCurrentSceneTransitionSettingsRequest(transitionSettings, overlay));
    }

    /**
     * Gets the cursor position of the current scene transition.
     *
     * Note: `transitionCursor` will return 1.0 when the transition is inactive.
     */
    public GetCurrentSceneTransitionCursorResponse getCurrentSceneTransitionCursor() {
        return send(new GetCurrentSceneTransitionCursorRequest());
    }

    /**
     * Triggers the current scene transition. Same functionality as the `Transition` button in studio mode.
     */
    public TriggerStudioModeTransitionResponse triggerStudioModeTransition() {
        return send(new TriggerStudioModeTransitionRequest());
    }

    /**
     * Sets the position of the TBar.
     *
     * **Very important note**: This will be deprecated and replaced in a future version of obs-websocket.
     */
    public SetTBarPositionResponse setTBarPosition(int position, boolean release) {
        return send(new SetTBarPositionRequest(position, release));
    }

    /**
     * Gets whether studio is enabled.
     */
    public GetStudioModeEnabledResponse getStudioModeEnabled() {
        return send(new GetStudioModeEnabledRequest());
    }

    /**
     * Enables or disables studio mode
     */
    public SetStudioModeEnabledResponse setStudioModeEnabled(boolean studioModeEnabled) {
        return send(new SetStudioModeEnabledRequest(studioModeEnabled));
    }

    /**
     * Opens the properties dialog of an input.
     */
    public OpenInputPropertiesDialogResponse openInputPropertiesDialog(String inputName,
            String inputUuid) {
        return send(new OpenInputPropertiesDialogRequest(inputName, inputUuid));
    }

    /**
     * Opens the filters dialog of an input.
     */
    public OpenInputFiltersDialogResponse openInputFiltersDialog(String inputName,
            String inputUuid) {
        return send(new OpenInputFiltersDialogRequest(inputName, inputUuid));
    }

    /**
     * Opens the interact dialog of an input.
     */
    public OpenInputInteractDialogResponse openInputInteractDialog(String inputName,
            String inputUuid) {
        return send(new OpenInputInteractDialogRequest(inputName, inputUuid));
    }

    /**
     * Gets a list of connected monitors and information about them.
     */
    public GetMonitorListResponse getMonitorList() {
        return send(new GetMonitorListRequest());
    }

    /**
     * Opens a projector for a specific output video mix.
     *
     * Mix types:
     *
     * - `OBS_WEBSOCKET_VIDEO_MIX_TYPE_PREVIEW`
     * - `OBS_WEBSOCKET_VIDEO_MIX_TYPE_PROGRAM`
     * - `OBS_WEBSOCKET_VIDEO_MIX_TYPE_MULTIVIEW`
     *
     * Note: This request serves to provide feature parity with 4.x. It is very likely to be changed/deprecated in a future release.
     */
    public OpenVideoMixProjectorResponse openVideoMixProjector(String videoMixType,
            int monitorIndex, String projectorGeometry) {
        return send(new OpenVideoMixProjectorRequest(videoMixType, monitorIndex, projectorGeometry));
    }

    /**
     * Opens a projector for a source.
     *
     * Note: This request serves to provide feature parity with 4.x. It is very likely to be changed/deprecated in a future release.
     */
    public OpenSourceProjectorResponse openSourceProjector(String sourceName, String sourceUuid,
            int monitorIndex, String projectorGeometry) {
        return send(new OpenSourceProjectorRequest(sourceName, sourceUuid, monitorIndex, projectorGeometry));
    }

    /**
     * Send blocking request
     */
    private <R extends Request, RR extends RequestResponse> RR send(R request) {
        BlockingConsumer<RR> blockingConsumer = new BlockingConsumer<>();
        session.sendRequest(request.getRequestId(), request, blockingConsumer);
        try {
            return blockingConsumer.get(TIMEOUT);
        } catch (Exception e) {
            log.error("Send error", e);
        }
        return null;
    }
}
