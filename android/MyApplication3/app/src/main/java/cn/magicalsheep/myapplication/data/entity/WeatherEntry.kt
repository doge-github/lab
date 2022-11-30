package cn.magicalsheep.myapplication.data.entity

import android.provider.BaseColumns

object WeatherEntry : BaseColumns {
    const val TABLE_NAME = "weather"
    const val COLUMN_NAME_LOCATION_ID = "location_id"
    const val COLUMN_NAME_FX_DATE = "fx_date"
    const val COLUMN_NAME_SUNRISE = "sunrise"
    const val COLUMN_NAME_SUNSET = "sunset"
    const val COLUMN_NAME_MOONRISE = "moonrise"
    const val COLUMN_NAME_MOONSET = "moonset"
    const val COLUMN_NAME_MOON_PHASE = "moon_phase"
    const val COLUMN_NAME_MOON_PHASE_ICON = "moon_phase_icon"
    const val COLUMN_NAME_TEMP_MAX = "temp_max"
    const val COLUMN_NAME_TEMP_MIN = "temp_min"
    const val COLUMN_NAME_ICON_DAY = "icon_day"
    const val COLUMN_NAME_TEXT_DAY = "text_day"
    const val COLUMN_NAME_ICON_NIGHT = "icon_night"
    const val COLUMN_NAME_TEXT_NIGHT = "text_night"
    const val COLUMN_NAME_WIND_360_DAY = "wind_360_day"
    const val COLUMN_NAME_WIND_DIR_DAY = "wind_dir_day"
    const val COLUMN_NAME_WIND_SCALE_DAY = "wind_scale_day"
    const val COLUMN_NAME_WIND_SPEED_DAY = "wind_speed_day"
    const val COLUMN_NAME_WIND_360_NIGHT = "wind_360_night"
    const val COLUMN_NAME_WIND_DIR_NIGHT = "wind_dir_night"
    const val COLUMN_NAME_WIND_SCALE_NIGHT = "wind_scale_night"
    const val COLUMN_NAME_WIND_SPEED_NIGHT = "wind_speed_night"
    const val COLUMN_NAME_PRECIP = "precip"
    const val COLUMN_NAME_UV_INDEX = "uv_index"
    const val COLUMN_NAME_HUMIDITY = "humidity"
    const val COLUMN_NAME_PRESSURE = "pressure"
    const val COLUMN_NAME_VIS = "vis"
    const val COLUMN_NAME_CLOUD = "cloud"
}