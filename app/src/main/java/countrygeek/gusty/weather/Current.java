package countrygeek.gusty.weather;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import countrygeek.gusty.R;

/**
 * Created by yocow on 3/21/2015.
 */
public class Current {

    private String mIcon;
    private long mTime;
    private double mTemperature;
    private double mHumidity;
    private double mPrecipChance;
    private String mTimeZone;

    public String getTimeZone() {
        return mTimeZone;
    }

    public void setTimeZone(String timeZone) {
        mTimeZone = timeZone;
    }

    public String getSummary() {
        return mSummary;
    }

    public void setSummary(String summary) {
        mSummary = summary;
    }

    public String getIcon() {
        return mIcon;
    }

    public void setIcon(String icon) {
        mIcon = icon;
    }

    public int getIConID() {
        // clear-day, clear-night, rain, snow, sleet, wind, fog, cloudy, partly-cloudy-day, or partly-cloudy-night
        int iconID = R.mipmap.clear_day;
        if(mIcon.equals("clear-day")){
            iconID = R.mipmap.clear_day;
        }
        else if (mIcon.equals("clear-night")) {
            iconID = R.mipmap.clear_night;
        }
        else if (mIcon.equals("rain")) {
            iconID = R.mipmap.rain;
        }
        else if (mIcon.equals("snow")) {
            iconID = R.mipmap.snow;
        }
        else if (mIcon.equals("sleet")) {
            iconID = R.mipmap.sleet;
        }
        else if (mIcon.equals("wind")) {
            iconID = R.mipmap.wind;
        }
        else if (mIcon.equals("fog")) {
            iconID = R.mipmap.fog;
        }
        else if (mIcon.equals("cloudy")) {
            iconID = R.mipmap.cloudy;
        }
        else if (mIcon.equals("partly-cloudy-day")) {
            iconID = R.mipmap.partly_cloudy;
        }
        else if (mIcon.equals("partly-cloudy-night")) {
            iconID = R.mipmap.cloudy_night;
        }

        return iconID;
    }



    public long getTime() {
        return mTime;
    }

    public String getFormattedTime() {
        SimpleDateFormat formatter = new SimpleDateFormat("h:mm a");
        formatter.setTimeZone(TimeZone.getTimeZone(getTimeZone()));
        Date dateTime = new Date(getTime() * 1000);
        String timeString = formatter.format(dateTime);

        return timeString;
    }

    public void setTime(long time) {
        mTime = time;
    }

    public int getTemperature() {
        return (int) Math.round(mTemperature);
    }

    public void setTemperature(double temperature) {
        mTemperature = temperature;
    }

    public int getHumidity() {
        return (int) Math.round(mHumidity * 100);
    }

    public void setHumidity(double humidity) {
        mHumidity = humidity;
    }

    public int getPrecipChance() {
        return (int) Math.round(mPrecipChance * 100);
    }

    public void setPrecipChance(double precipChance) {
        mPrecipChance = precipChance;
    }

    private String mSummary;

}
