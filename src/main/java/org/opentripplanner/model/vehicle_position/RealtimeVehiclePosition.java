package org.opentripplanner.model.vehicle_position;

import java.time.Instant;
import org.opentripplanner.model.StopLocation;
import org.opentripplanner.model.WgsCoordinate;

/**
 * Internal model of a realtime vehicle position.
 */
public class RealtimeVehiclePosition {

    public final String vehicleId;
    public final String label;
    public final WgsCoordinate coordinates;

    /**
     * Speed in meters per second
     */
    public final Double speed;

    /**
     * Bearing, in degrees, clockwise from North, i.e., 0 is North and 90 is East. This can be the
     * compass bearing, or the direction towards the next stop or intermediate location.
     */
    public final Double heading;

    /**
     * When the realtime position was recorded
     */
    public final Instant time;

    /**
     * Status of the vehicle, ie. if approaching the next stop or if it is there already.
     */
    public final StopStatus stopStatus;

    public final StopLocation nextStop;

    public RealtimeVehiclePosition(
            String vehicleId,
            String label,
            WgsCoordinate coordinates,
            Double speed,
            Double heading,
            Instant time,
            StopStatus stopStatus,
            StopLocation nextStop
    ) {
        this.vehicleId = vehicleId;
        this.label = label;
        this.coordinates = coordinates;
        this.speed = speed;
        this.heading = heading;
        this.time = time;
        this.stopStatus = stopStatus;
        this.nextStop = nextStop;
    }

    public static RealtimeVehiclePositionBuilder builder() {
        return new RealtimeVehiclePositionBuilder();
    }

    public enum StopStatus {
        INCOMING_AT,
        STOPPED_AT,
        IN_TRANSIT_TO
    }
}
