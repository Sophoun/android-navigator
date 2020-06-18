[core-utils](../../index.md) / [com.sophoun.android.core.utils](../index.md) / [LocationWatcher](./index.md)

# LocationWatcher

`class LocationWatcher`

LocationWatcher is a class that make us easier
to listen to location update and check GPS is enable or not
and it's also easy to get last know location.

Note: require permission

* [android.permission.ACCESS_FINE_LOCATION](#)
or
* [android.permission.ACCESS_COARSE_LOCATION](#)

### Constructors

| Name | Summary |
|---|---|
| [&lt;init&gt;](-init-.md) | `LocationWatcher(context: <ERROR CLASS>, provider: `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)` = LocationManager.GPS_PROVIDER, updateInterval: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)` = 10 * 1000, minDistance: `[`Float`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)` = 1f)`<br>LocationWatcher is a class that make us easier to listen to location update and check GPS is enable or not and it's also easy to get last know location. |

### Functions

| Name | Summary |
|---|---|
| [getLastLocation](get-last-location.md) | `suspend fun getLastLocation(): <ERROR CLASS>`<br>Get last know location |
| [getLocationUpdateFlow](get-location-update-flow.md) | `fun getLocationUpdateFlow(): <ERROR CLASS>`<br>Collect location update using flow api |
| [isLocationEnabled](is-location-enabled.md) | `fun isLocationEnabled(): <ERROR CLASS>` |
