/*
 * Copyright (C) 2012 Yuriy Kulikov yuriy.kulikov.87@gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.better.alarm.model.interfaces;

import com.better.alarm.BuildConfig;

public class Intents {
    /**
     * Broadcasted when an alarm fires.
     */
    public static final String ALARM_ALERT_ACTION = BuildConfig.APPLICATION_ID +".ALARM_ALERT";

    /**
     * Broadcasted when an alarm fires.
     */
    public static final String ALARM_PREALARM_ACTION = BuildConfig.APPLICATION_ID +".ALARM_PREALARM_ACTION";

    /**
     * Broadcasted when alarm is snoozed.
     */
    public static final String ALARM_SNOOZE_ACTION = BuildConfig.APPLICATION_ID +".ALARM_SNOOZE";

    /**
     * Broadcasted when alarm is snoozed.
     */
    public static final String ACTION_CANCEL_SNOOZE = BuildConfig.APPLICATION_ID +".ACTION_CANCEL_SNOOZE";

    /**
     * Broadcasted when alarm is dismissed.
     */
    public static final String ALARM_DISMISS_ACTION = BuildConfig.APPLICATION_ID +".ALARM_DISMISS";

    /**
     * Broadcasted when alarm is scheduled
     */
    public static final String ACTION_SOUND_EXPIRED = BuildConfig.APPLICATION_ID +".ACTION_SOUND_EXPIRED";

    /**
     * Broadcasted when alarm is scheduled
     */
    public static final String ACTION_ALARM_SCHEDULED = BuildConfig.APPLICATION_ID +".model.Intents.ACTION_ALARM_SCHEDULED";

    /**
     * Broadcasted when alarm is scheduled
     */
    public static final String ACTION_ALARMS_UNSCHEDULED = BuildConfig.APPLICATION_ID +".model.Intents.ACTION_ALARMS_UNSCHEDULED";

    /**
     * Broadcasted when alarm is scheduled
     */
    public static final String ACTION_ALARM_CHANGED = BuildConfig.APPLICATION_ID +".model.Intents.ACTION_ALARM_CHANGED";

    /**
     * Broadcasted when alarm is set
     */
    public static final String ACTION_ALARM_SET = BuildConfig.APPLICATION_ID +".model.Intents.ACTION_ALARM_SET";

    /**
     * Key of the AlarmCore attached as a parceble extra
     */
    public static final String EXTRA_ID = "intent.extra.alarm";

    public static final String EXTRA_NEXT_NORMAL_TIME_IN_MILLIS = "EXTRA_NEXT_NORMAL_TIME_IN_MILLIS";

    public static final String EXTRA_IS_PREALARM = "EXTRA_IS_PREALARM";

    public static final String ACTION_STOP_PREALARM_SAMPLE = BuildConfig.APPLICATION_ID +".ACTION_STOP_PREALARM_SAMPLE";

    public static final String ACTION_START_PREALARM_SAMPLE = BuildConfig.APPLICATION_ID +".ACTION_START_PREALARM_SAMPLE";

    public static final String ACTION_STOP_ALARM_SAMPLE = BuildConfig.APPLICATION_ID +".ACTION_STOP_ALARM_SAMPLE";

    public static final String ACTION_START_ALARM_SAMPLE = BuildConfig.APPLICATION_ID +".ACTION_START_ALARM_SAMPLE";

    public static final String ACTION_MUTE = BuildConfig.APPLICATION_ID +".ACTION_MUTE";

    public static final String ACTION_DEMUTE = BuildConfig.APPLICATION_ID +".ACTION_DEMUTE";

    public static final int MAX_ALARM_VOLUME = 10;

    public static final int MAX_PREALARM_VOLUME = 10;

    public static final int DEFAULT_PREALARM_VOLUME = 5;

    public static final int DEFAULT_ALARM_VOLUME = 10;

    public static final String KEY_PREALARM_VOLUME = "key_prealarm_volume";

    public static final String KEY_ALARM_VOLUME = "key_alarm_volume";

    /**
     * Broadcasted when someone wants to get last scheduled alarm.
     */
    public static final String REQUEST_LAST_SCHEDULED_ALARM = BuildConfig.APPLICATION_ID +".model.interfaces.Intents.REQUEST_LAST_SCHEDULED_ALARM";
}
