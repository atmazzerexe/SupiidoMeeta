package id.its.atmazzer.supiidomeeta;

import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by Atmazzer on 11/5/2016.
 */

public interface IBaseGPSListener extends LocationListener, GpsStatus.Listener {
    public void onLocationChanged(Location location);
}
