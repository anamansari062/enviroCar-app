package org.envirocar.app.views.settings.custom;

import android.content.Context;
import android.util.AttributeSet;

import androidx.preference.DialogPreference;

import org.envirocar.app.R;
import org.envirocar.app.handler.ApplicationSettings;

/**
 * @author dewall
 */
public class GPSTrimDurationPreference extends DialogPreference implements TimePickerPreferenceDialog.TimePickerPreference {

    public GPSTrimDurationPreference(Context context) {
        super(context);
    }

    public GPSTrimDurationPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public int getDialogLayoutResource() {
        return R.layout.preference_timepicker_dialog;
    }

    @Override
    public int getTime() {
        return getPersistedInt(ApplicationSettings.DEFAULT_TRACK_TRIM_DURATION);
    }

    @Override
    public void setTime(int time) {
        persistInt(time);
    }
}
