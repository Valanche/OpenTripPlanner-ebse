//THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.opentripplanner.apis.gtfs.generated;

import graphql.relay.Connection;
import graphql.relay.Edge;
import graphql.schema.DataFetcher;
import graphql.schema.TypeResolver;
import java.util.Currency;
import java.util.Map;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.opentripplanner.api.resource.DebugOutput;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLAbsoluteDirection;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLAlertCauseType;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLAlertEffectType;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLAlertSeverityLevelType;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLBikesAllowed;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLInputField;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLOccupancyStatus;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLRelativeDirection;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLRoutingErrorCode;
import org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLTransitMode;
import org.opentripplanner.apis.gtfs.model.RideHailingProvider;
import org.opentripplanner.apis.gtfs.model.StopPosition;
import org.opentripplanner.apis.gtfs.model.TripOccupancy;
import org.opentripplanner.ext.fares.model.FareRuleSet;
import org.opentripplanner.ext.ridehailing.model.RideEstimate;
import org.opentripplanner.model.StopTimesInPattern;
import org.opentripplanner.model.SystemNotice;
import org.opentripplanner.model.TripTimeOnDate;
import org.opentripplanner.model.calendar.openinghours.OHCalendar;
import org.opentripplanner.model.fare.FareMedium;
import org.opentripplanner.model.fare.FareProduct;
import org.opentripplanner.model.fare.FareProductUse;
import org.opentripplanner.model.fare.RiderCategory;
import org.opentripplanner.model.plan.Emissions;
import org.opentripplanner.model.plan.Itinerary;
import org.opentripplanner.model.plan.Leg;
import org.opentripplanner.model.plan.LegTimes;
import org.opentripplanner.model.plan.StopArrival;
import org.opentripplanner.model.plan.WalkStep;
import org.opentripplanner.routing.alertpatch.TransitAlert;
import org.opentripplanner.routing.api.response.RoutingError;
import org.opentripplanner.routing.graphfinder.NearbyStop;
import org.opentripplanner.routing.graphfinder.PatternAtStop;
import org.opentripplanner.routing.graphfinder.PlaceAtDistance;
import org.opentripplanner.routing.vehicle_parking.VehicleParking;
import org.opentripplanner.routing.vehicle_parking.VehicleParkingSpaces;
import org.opentripplanner.routing.vehicle_parking.VehicleParkingState;
import org.opentripplanner.service.realtimevehicles.model.RealtimeVehicle;
import org.opentripplanner.service.realtimevehicles.model.RealtimeVehicle.StopRelationship;
import org.opentripplanner.service.vehiclerental.model.RentalVehicleEntityCounts;
import org.opentripplanner.service.vehiclerental.model.RentalVehicleType;
import org.opentripplanner.service.vehiclerental.model.RentalVehicleTypeCount;
import org.opentripplanner.service.vehiclerental.model.VehicleRentalPlace;
import org.opentripplanner.service.vehiclerental.model.VehicleRentalStation;
import org.opentripplanner.service.vehiclerental.model.VehicleRentalStationUris;
import org.opentripplanner.service.vehiclerental.model.VehicleRentalVehicle;
import org.opentripplanner.transit.model.basic.Money;
import org.opentripplanner.transit.model.network.Route;
import org.opentripplanner.transit.model.network.TripPattern;
import org.opentripplanner.transit.model.organization.Agency;
import org.opentripplanner.transit.model.timetable.Trip;

public class GraphQLDataFetchers {

  /** A public transport agency */
  public interface GraphQLAgency {
    public DataFetcher<Iterable<TransitAlert>> alerts();

    public DataFetcher<String> fareUrl();

    public DataFetcher<String> gtfsId();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<String> lang();

    public DataFetcher<String> name();

    public DataFetcher<String> phone();

    public DataFetcher<Iterable<Route>> routes();

    public DataFetcher<String> timezone();

    public DataFetcher<String> url();
  }

  /** Alert of a current or upcoming disruption in public transportation */
  public interface GraphQLAlert {
    public DataFetcher<Agency> agency();

    public DataFetcher<GraphQLAlertCauseType> alertCause();

    public DataFetcher<String> alertDescriptionText();

    public DataFetcher<Iterable<Map.Entry<String, String>>> alertDescriptionTextTranslations();

    public DataFetcher<GraphQLAlertEffectType> alertEffect();

    public DataFetcher<Integer> alertHash();

    public DataFetcher<String> alertHeaderText();

    public DataFetcher<Iterable<Map.Entry<String, String>>> alertHeaderTextTranslations();

    public DataFetcher<GraphQLAlertSeverityLevelType> alertSeverityLevel();

    public DataFetcher<String> alertUrl();

    public DataFetcher<Iterable<Map.Entry<String, String>>> alertUrlTranslations();

    public DataFetcher<Long> effectiveEndDate();

    public DataFetcher<Long> effectiveStartDate();

    public DataFetcher<Iterable<Object>> entities();

    public DataFetcher<String> feed();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Iterable<TripPattern>> patterns();

    public DataFetcher<Route> route();

    public DataFetcher<Object> stop();

    public DataFetcher<Trip> trip();
  }

  /** Entity related to an alert */
  public interface GraphQLAlertEntity extends TypeResolver {}

  /** Bike park represents a location where bicycles can be parked. */
  public interface GraphQLBikePark {
    public DataFetcher<String> bikeParkId();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<String> name();

    public DataFetcher<OHCalendar> openingHours();

    public DataFetcher<Boolean> realtime();

    public DataFetcher<Integer> spacesAvailable();

    public DataFetcher<Iterable<String>> tags();
  }

  /** Bike rental station represents a location where users can rent bicycles for a fee. */
  public interface GraphQLBikeRentalStation {
    public DataFetcher<Boolean> allowDropoff();

    public DataFetcher<Boolean> allowDropoffNow();

    public DataFetcher<Boolean> allowOverloading();

    public DataFetcher<Boolean> allowPickup();

    public DataFetcher<Boolean> allowPickupNow();

    public DataFetcher<Integer> bikesAvailable();

    public DataFetcher<Integer> capacity();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<String> name();

    public DataFetcher<Iterable<String>> networks();

    public DataFetcher<Boolean> operative();

    public DataFetcher<Boolean> realtime();

    public DataFetcher<VehicleRentalStationUris> rentalUris();

    public DataFetcher<Integer> spacesAvailable();

    public DataFetcher<String> state();

    public DataFetcher<String> stationId();
  }

  public interface GraphQLBikeRentalStationUris {
    public DataFetcher<String> android();

    public DataFetcher<String> ios();

    public DataFetcher<String> web();
  }

  /**
   * Booking information for a stop time which has special requirements to use, like calling ahead or
   * using an app.
   */
  public interface GraphQLBookingInfo {
    public DataFetcher<org.opentripplanner.transit.model.organization.ContactInfo> contactInfo();

    public DataFetcher<String> dropOffMessage();

    public DataFetcher<org.opentripplanner.model.BookingTime> earliestBookingTime();

    public DataFetcher<org.opentripplanner.model.BookingTime> latestBookingTime();

    public DataFetcher<Long> maximumBookingNoticeSeconds();

    public DataFetcher<String> message();

    public DataFetcher<Long> minimumBookingNoticeSeconds();

    public DataFetcher<String> pickupMessage();
  }

  /** Temporal restriction for a booking */
  public interface GraphQLBookingTime {
    public DataFetcher<Integer> daysPrior();

    public DataFetcher<String> time();
  }

  /** Car park represents a location where cars can be parked. */
  public interface GraphQLCarPark {
    public DataFetcher<String> carParkId();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<Integer> maxCapacity();

    public DataFetcher<String> name();

    public DataFetcher<OHCalendar> openingHours();

    public DataFetcher<Boolean> realtime();

    public DataFetcher<Integer> spacesAvailable();

    public DataFetcher<Iterable<String>> tags();
  }

  /** Cluster is a list of stops grouped by name and proximity */
  public interface GraphQLCluster {
    public DataFetcher<String> gtfsId();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<String> name();

    public DataFetcher<Iterable<Object>> stops();
  }

  /** Contact information for booking an on-demand or flexible service. */
  public interface GraphQLContactInfo {
    public DataFetcher<String> additionalDetails();

    public DataFetcher<String> bookingUrl();

    public DataFetcher<String> contactPerson();

    public DataFetcher<String> eMail();

    public DataFetcher<String> faxNumber();

    public DataFetcher<String> infoUrl();

    public DataFetcher<String> phoneNumber();
  }

  public interface GraphQLCoordinates {
    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();
  }

  /** A currency */
  public interface GraphQLCurrency {
    public DataFetcher<String> code();

    public DataFetcher<Integer> digits();
  }

  /**
   * The standard case of a fare product: it only has a single price to be paid by the passenger
   * and no discounts are applied.
   */
  public interface GraphQLDefaultFareProduct {
    public DataFetcher<String> id();

    public DataFetcher<FareMedium> medium();

    public DataFetcher<String> name();

    public DataFetcher<Money> price();

    public DataFetcher<RiderCategory> riderCategory();
  }

  /**
   * Departure row is a combination of a pattern and a stop of that pattern.
   *
   * They are de-duplicated so for each pattern there will only be a single departure row.
   *
   * This is useful if you want to show a list of stop/pattern combinations but want each pattern to be
   * listed only once.
   */
  public interface GraphQLDepartureRow {
    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<TripPattern> pattern();

    public DataFetcher<Object> stop();

    public DataFetcher<Iterable<TripTimeOnDate>> stoptimes();
  }

  public interface GraphQLEmissions {
    public DataFetcher<org.opentripplanner.framework.model.Grams> co2();
  }

  /** A 'medium' that a fare product applies to, for example cash, 'Oyster Card' or 'DB Navigator App'. */
  public interface GraphQLFareMedium {
    public DataFetcher<String> id();

    public DataFetcher<String> name();
  }

  /** A fare product (a ticket) to be bought by a passenger */
  public interface GraphQLFareProduct extends TypeResolver {
    public default DataFetcher<String> id() {
      return null;
    }

    public default DataFetcher<FareMedium> medium() {
      return null;
    }

    public default DataFetcher<String> name() {
      return null;
    }

    public default DataFetcher<RiderCategory> riderCategory() {
      return null;
    }
  }

  /** A container for both a fare product (a ticket) and its relationship to the itinerary. */
  public interface GraphQLFareProductUse {
    public DataFetcher<String> id();

    public DataFetcher<FareProduct> product();
  }

  /** A feed provides routing data (stops, routes, timetables, etc.) from one or more public transport agencies. */
  public interface GraphQLFeed {
    public DataFetcher<Iterable<Agency>> agencies();

    public DataFetcher<Iterable<TransitAlert>> alerts();

    public DataFetcher<String> feedId();
  }

  public interface GraphQLGeometry {
    public DataFetcher<Integer> length();

    public DataFetcher<String> points();
  }

  public interface GraphQLItinerary {
    public DataFetcher<Double> accessibilityScore();

    public DataFetcher<Boolean> arrivedAtDestinationWithRentedBicycle();

    public DataFetcher<Long> duration();

    public DataFetcher<Double> elevationGained();

    public DataFetcher<Double> elevationLost();

    public DataFetcher<Emissions> emissionsPerPerson();

    public DataFetcher<java.time.OffsetDateTime> end();

    public DataFetcher<Long> endTime();

    public DataFetcher<Iterable<Object>> fares();

    public DataFetcher<Integer> generalizedCost();

    public DataFetcher<Iterable<Leg>> legs();

    public DataFetcher<Integer> numberOfTransfers();

    public DataFetcher<java.time.OffsetDateTime> start();

    public DataFetcher<Long> startTime();

    public DataFetcher<Iterable<SystemNotice>> systemNotices();

    public DataFetcher<Long> waitingTime();

    public DataFetcher<Double> walkDistance();

    public DataFetcher<Long> walkTime();
  }

  public interface GraphQLLeg {
    public DataFetcher<Double> accessibilityScore();

    public DataFetcher<Agency> agency();

    public DataFetcher<Iterable<TransitAlert>> alerts();

    public DataFetcher<Integer> arrivalDelay();

    public DataFetcher<Integer> departureDelay();

    public DataFetcher<Double> distance();

    public DataFetcher<org.opentripplanner.model.BookingInfo> dropOffBookingInfo();

    public DataFetcher<String> dropoffType();

    public DataFetcher<Double> duration();

    public DataFetcher<LegTimes> end();

    public DataFetcher<Long> endTime();

    public DataFetcher<Iterable<FareProductUse>> fareProducts();

    public DataFetcher<StopArrival> from();

    public DataFetcher<Integer> generalizedCost();

    public DataFetcher<String> headsign();

    public DataFetcher<Boolean> interlineWithPreviousLeg();

    public DataFetcher<Boolean> intermediatePlace();

    public DataFetcher<Iterable<StopArrival>> intermediatePlaces();

    public DataFetcher<Iterable<Object>> intermediateStops();

    public DataFetcher<Geometry> legGeometry();

    public DataFetcher<String> mode();

    public DataFetcher<Iterable<Leg>> nextLegs();

    public DataFetcher<org.opentripplanner.model.BookingInfo> pickupBookingInfo();

    public DataFetcher<String> pickupType();

    public DataFetcher<Boolean> realTime();

    public DataFetcher<String> realtimeState();

    public DataFetcher<Boolean> rentedBike();

    public DataFetcher<RideEstimate> rideHailingEstimate();

    public DataFetcher<Route> route();

    public DataFetcher<String> serviceDate();

    public DataFetcher<LegTimes> start();

    public DataFetcher<Long> startTime();

    public DataFetcher<Iterable<WalkStep>> steps();

    public DataFetcher<StopArrival> to();

    public DataFetcher<Boolean> transitLeg();

    public DataFetcher<Trip> trip();

    public DataFetcher<Boolean> walkingBike();
  }

  public interface GraphQLLegTimes {
    public DataFetcher<java.time.OffsetDateTime> actual();

    public DataFetcher<java.time.Duration> delay();

    public DataFetcher<java.time.OffsetDateTime> scheduled();
  }

  /** A span of time. */
  public interface GraphQLLocalTimeSpan {
    public DataFetcher<Integer> from();

    public DataFetcher<Integer> to();
  }

  /** A date using the local timezone of the object that can contain timespans. */
  public interface GraphQLLocalTimeSpanDate {
    public DataFetcher<String> date();

    public DataFetcher<Iterable<Object>> timeSpans();
  }

  /** An amount of money. */
  public interface GraphQLMoney {
    public DataFetcher<Double> amount();

    public DataFetcher<Currency> currency();
  }

  /** An object with an ID */
  public interface GraphQLNode extends TypeResolver {
    public default DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id() {
      return null;
    }
  }

  public interface GraphQLOpeningHours {
    public DataFetcher<Iterable<Object>> dates();

    public DataFetcher<String> osm();
  }

  /** Information about pagination in a connection. */
  public interface GraphQLPageInfo {
    public DataFetcher<String> endCursor();

    public DataFetcher<Boolean> hasNextPage();

    public DataFetcher<Boolean> hasPreviousPage();

    public DataFetcher<String> startCursor();
  }

  /**
   * Pattern is sequence of stops used by trips on a specific direction and variant
   * of a route. Most routes have only two patterns: one for outbound trips and one
   * for inbound trips
   */
  public interface GraphQLPattern {
    public DataFetcher<Iterable<TransitAlert>> alerts();

    public DataFetcher<String> code();

    public DataFetcher<Integer> directionId();

    public DataFetcher<Iterable<Coordinate>> geometry();

    public DataFetcher<String> headsign();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<String> name();

    public DataFetcher<TripPattern> originalTripPattern();

    public DataFetcher<Geometry> patternGeometry();

    public DataFetcher<Route> route();

    public DataFetcher<String> semanticHash();

    public DataFetcher<Iterable<Object>> stops();

    public DataFetcher<Iterable<Trip>> trips();

    public DataFetcher<Iterable<Trip>> tripsForDate();

    public DataFetcher<Iterable<RealtimeVehicle>> vehiclePositions();
  }

  public interface GraphQLPlace {
    public DataFetcher<java.time.OffsetDateTime> arrival();

    public DataFetcher<Long> arrivalTime();

    public DataFetcher<VehicleParking> bikePark();

    public DataFetcher<VehicleRentalPlace> bikeRentalStation();

    public DataFetcher<VehicleParking> carPark();

    public DataFetcher<java.time.OffsetDateTime> departure();

    public DataFetcher<Long> departureTime();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<String> name();

    public DataFetcher<VehicleRentalVehicle> rentalVehicle();

    public DataFetcher<Object> stop();

    public DataFetcher<StopPosition> stopPosition();

    public DataFetcher<VehicleParking> vehicleParking();

    public DataFetcher<VehicleRentalStation> vehicleRentalStation();

    public DataFetcher<String> vertexType();
  }

  /** Interface for places, e.g. stops, stations, parking areas.. */
  public interface GraphQLPlaceInterface extends TypeResolver {
    public default DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id() {
      return null;
    }

    public default DataFetcher<Double> lat() {
      return null;
    }

    public default DataFetcher<Double> lon() {
      return null;
    }
  }

  public interface GraphQLPlan {
    public DataFetcher<Long> date();

    public DataFetcher<DebugOutput> debugOutput();

    public DataFetcher<StopArrival> from();

    public DataFetcher<Iterable<Itinerary>> itineraries();

    public DataFetcher<Iterable<String>> messageEnums();

    public DataFetcher<Iterable<String>> messageStrings();

    public DataFetcher<Long> nextDateTime();

    public DataFetcher<String> nextPageCursor();

    public DataFetcher<Long> prevDateTime();

    public DataFetcher<String> previousPageCursor();

    public DataFetcher<Iterable<RoutingError>> routingErrors();

    public DataFetcher<Long> searchWindowUsed();

    public DataFetcher<StopArrival> to();
  }

  /** Stop position at a specific stop. */
  public interface GraphQLPositionAtStop {
    public DataFetcher<Integer> position();
  }

  /** The board/alight position in between two stops of the pattern of a trip with continuous pickup/drop off. */
  public interface GraphQLPositionBetweenStops {
    public DataFetcher<Integer> nextPosition();

    public DataFetcher<Integer> previousPosition();
  }

  public interface GraphQLQueryType {
    public DataFetcher<Iterable<Agency>> agencies();

    public DataFetcher<Agency> agency();

    public DataFetcher<Iterable<TransitAlert>> alerts();

    public DataFetcher<VehicleParking> bikePark();

    public DataFetcher<Iterable<VehicleParking>> bikeParks();

    public DataFetcher<VehicleRentalPlace> bikeRentalStation();

    public DataFetcher<Iterable<VehicleRentalPlace>> bikeRentalStations();

    public DataFetcher<Iterable<TripTimeOnDate>> cancelledTripTimes();

    public DataFetcher<VehicleParking> carPark();

    public DataFetcher<Iterable<VehicleParking>> carParks();

    public DataFetcher<Object> cluster();

    public DataFetcher<Iterable<Object>> clusters();

    public DataFetcher<PatternAtStop> departureRow();

    public DataFetcher<Iterable<String>> feeds();

    public DataFetcher<Trip> fuzzyTrip();

    public DataFetcher<Connection<PlaceAtDistance>> nearest();

    public DataFetcher<Object> node();

    public DataFetcher<TripPattern> pattern();

    public DataFetcher<Iterable<TripPattern>> patterns();

    public DataFetcher<graphql.execution.DataFetcherResult<org.opentripplanner.routing.api.response.RoutingResponse>> plan();

    public DataFetcher<VehicleRentalVehicle> rentalVehicle();

    public DataFetcher<Iterable<VehicleRentalVehicle>> rentalVehicles();

    public DataFetcher<Route> route();

    public DataFetcher<Iterable<Route>> routes();

    public DataFetcher<Object> serviceTimeRange();

    public DataFetcher<Object> station();

    public DataFetcher<Iterable<Object>> stations();

    public DataFetcher<Object> stop();

    public DataFetcher<Iterable<Object>> stops();

    public DataFetcher<Iterable<Object>> stopsByBbox();

    public DataFetcher<Connection<NearbyStop>> stopsByRadius();

    public DataFetcher<Iterable<FareRuleSet>> ticketTypes();

    public DataFetcher<Trip> trip();

    public DataFetcher<Iterable<Trip>> trips();

    public DataFetcher<VehicleParking> vehicleParking();

    public DataFetcher<Iterable<VehicleParking>> vehicleParkings();

    public DataFetcher<VehicleRentalStation> vehicleRentalStation();

    public DataFetcher<Iterable<VehicleRentalStation>> vehicleRentalStations();

    public DataFetcher<Object> viewer();
  }

  /** Rental vehicle represents a vehicle that belongs to a rental network. */
  public interface GraphQLRentalVehicle {
    public DataFetcher<Boolean> allowPickupNow();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<String> name();

    public DataFetcher<String> network();

    public DataFetcher<Boolean> operative();

    public DataFetcher<VehicleRentalStationUris> rentalUris();

    public DataFetcher<String> vehicleId();

    public DataFetcher<RentalVehicleType> vehicleType();
  }

  public interface GraphQLRentalVehicleEntityCounts {
    public DataFetcher<Iterable<RentalVehicleTypeCount>> byType();

    public DataFetcher<Integer> total();
  }

  public interface GraphQLRentalVehicleType {
    public DataFetcher<org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLFormFactor> formFactor();

    public DataFetcher<org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLPropulsionType> propulsionType();
  }

  public interface GraphQLRentalVehicleTypeCount {
    public DataFetcher<Integer> count();

    public DataFetcher<RentalVehicleType> vehicleType();
  }

  /** An estimate for a ride on a hailed vehicle, like an Uber car. */
  public interface GraphQLRideHailingEstimate {
    public DataFetcher<java.time.Duration> arrival();

    public DataFetcher<Money> maxPrice();

    public DataFetcher<Money> minPrice();

    public DataFetcher<String> productName();

    public DataFetcher<RideHailingProvider> provider();
  }

  public interface GraphQLRideHailingProvider {
    public DataFetcher<String> id();
  }

  /** Category of riders a fare product applies to, for example students or pensioners. */
  public interface GraphQLRiderCategory {
    public DataFetcher<String> id();

    public DataFetcher<String> name();
  }

  /**
   * Route represents a public transportation service, usually from point A to point
   * B and *back*, shown to customers under a single name, e.g. bus 550. Routes
   * contain patterns (see field `patterns`), which describe different variants of
   * the route, e.g. outbound pattern from point A to point B and inbound pattern
   * from point B to point A.
   */
  public interface GraphQLRoute {
    public DataFetcher<Agency> agency();

    public DataFetcher<Iterable<TransitAlert>> alerts();

    public DataFetcher<GraphQLBikesAllowed> bikesAllowed();

    public DataFetcher<String> color();

    public DataFetcher<String> desc();

    public DataFetcher<String> gtfsId();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<String> longName();

    public DataFetcher<GraphQLTransitMode> mode();

    public DataFetcher<Iterable<TripPattern>> patterns();

    public DataFetcher<String> shortName();

    public DataFetcher<Iterable<Object>> stops();

    public DataFetcher<String> textColor();

    public DataFetcher<Iterable<Trip>> trips();

    public DataFetcher<Integer> type();

    public DataFetcher<String> url();
  }

  /**
   * Route type entity which covers all agencies if agency is null,
   * otherwise only relevant for one agency.
   */
  public interface GraphQLRouteType {
    public DataFetcher<Agency> agency();

    public DataFetcher<Integer> routeType();

    public DataFetcher<Iterable<Route>> routes();
  }

  /** Description of the reason, why the planner did not return any results */
  public interface GraphQLRoutingError {
    public DataFetcher<GraphQLRoutingErrorCode> code();

    public DataFetcher<String> description();

    public DataFetcher<GraphQLInputField> inputField();
  }

  /**
   * Stop can represent either a single public transport stop, where passengers can
   * board and/or disembark vehicles, or a station, which contains multiple stops.
   * See field `locationType`.
   */
  public interface GraphQLStop {
    public DataFetcher<Iterable<TransitAlert>> alerts();

    public DataFetcher<Object> cluster();

    public DataFetcher<String> code();

    public DataFetcher<String> desc();

    public DataFetcher<String> direction();

    public DataFetcher<Object> geometries();

    public DataFetcher<String> gtfsId();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Double> lat();

    public DataFetcher<Object> locationType();

    public DataFetcher<Double> lon();

    public DataFetcher<String> name();

    public DataFetcher<Object> parentStation();

    public DataFetcher<Iterable<TripPattern>> patterns();

    public DataFetcher<String> platformCode();

    public DataFetcher<Iterable<Route>> routes();

    public DataFetcher<Iterable<TripTimeOnDate>> stopTimesForPattern();

    public DataFetcher<Iterable<Object>> stops();

    public DataFetcher<Iterable<StopTimesInPattern>> stoptimesForPatterns();

    public DataFetcher<Iterable<StopTimesInPattern>> stoptimesForServiceDate();

    public DataFetcher<Iterable<TripTimeOnDate>> stoptimesWithoutPatterns();

    public DataFetcher<String> timezone();

    public DataFetcher<Iterable<NearbyStop>> transfers();

    public DataFetcher<String> url();

    public DataFetcher<String> vehicleMode();

    public DataFetcher<Integer> vehicleType();

    public DataFetcher<org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLWheelchairBoarding> wheelchairBoarding();

    public DataFetcher<String> zoneId();
  }

  public interface GraphQLStopGeometries {
    public DataFetcher<org.locationtech.jts.geom.Geometry> geoJson();

    public DataFetcher<Iterable<Geometry>> googleEncoded();
  }

  /** Stop that should (but not guaranteed) to exist on a route. */
  public interface GraphQLStopOnRoute {
    public DataFetcher<Route> route();

    public DataFetcher<Object> stop();
  }

  /** Stop that should (but not guaranteed) to exist on a trip. */
  public interface GraphQLStopOnTrip {
    public DataFetcher<Object> stop();

    public DataFetcher<Trip> trip();
  }

  public interface GraphQLStopPosition extends TypeResolver {}

  /** Upcoming or current stop and how close the vehicle is to it. */
  public interface GraphQLStopRelationship {
    public DataFetcher<Object> status();

    public DataFetcher<Object> stop();
  }

  /** Stoptime represents the time when a specific trip arrives to or departs from a specific stop. */
  public interface GraphQLStoptime {
    public DataFetcher<Integer> arrivalDelay();

    public DataFetcher<Integer> departureDelay();

    public DataFetcher<String> dropoffType();

    public DataFetcher<String> headsign();

    public DataFetcher<String> pickupType();

    public DataFetcher<Boolean> realtime();

    public DataFetcher<Integer> realtimeArrival();

    public DataFetcher<Integer> realtimeDeparture();

    public DataFetcher<String> realtimeState();

    public DataFetcher<Integer> scheduledArrival();

    public DataFetcher<Integer> scheduledDeparture();

    public DataFetcher<Long> serviceDay();

    public DataFetcher<Object> stop();

    public DataFetcher<Integer> stopPosition();

    public DataFetcher<Boolean> timepoint();

    public DataFetcher<Trip> trip();
  }

  /** Stoptimes grouped by pattern */
  public interface GraphQLStoptimesInPattern {
    public DataFetcher<TripPattern> pattern();

    public DataFetcher<Iterable<TripTimeOnDate>> stoptimes();
  }

  /**
   * A system notice is used to tag elements with system information for debugging
   * or other system related purpose. One use-case is to run a routing search with
   * 'debugItineraryFilter: true'. This will then tag itineraries instead of removing
   * them from the result. This make it possible to inspect the itinerary-filter-chain.
   * A SystemNotice only has english text,
   * because the primary user are technical staff, like testers and developers.
   */
  public interface GraphQLSystemNotice {
    public DataFetcher<String> tag();

    public DataFetcher<String> text();
  }

  /** Describes ticket type */
  public interface GraphQLTicketType {
    public DataFetcher<String> currency();

    public DataFetcher<String> fareId();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Double> price();

    public DataFetcher<Iterable<String>> zones();
  }

  /** Text with language */
  public interface GraphQLTranslatedString {
    public DataFetcher<String> language();

    public DataFetcher<String> text();
  }

  /** Trip is a specific occurance of a pattern, usually identified by route, direction on the route and exact departure time. */
  public interface GraphQLTrip {
    public DataFetcher<Iterable<String>> activeDates();

    public DataFetcher<Iterable<TransitAlert>> alerts();

    public DataFetcher<TripTimeOnDate> arrivalStoptime();

    public DataFetcher<GraphQLBikesAllowed> bikesAllowed();

    public DataFetcher<String> blockId();

    public DataFetcher<TripTimeOnDate> departureStoptime();

    public DataFetcher<String> directionId();

    public DataFetcher<Iterable<Iterable<Double>>> geometry();

    public DataFetcher<String> gtfsId();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<TripOccupancy> occupancy();

    public DataFetcher<TripPattern> pattern();

    public DataFetcher<Route> route();

    public DataFetcher<String> routeShortName();

    public DataFetcher<String> semanticHash();

    public DataFetcher<String> serviceId();

    public DataFetcher<String> shapeId();

    public DataFetcher<Iterable<Object>> stops();

    public DataFetcher<Iterable<TripTimeOnDate>> stoptimes();

    public DataFetcher<Iterable<TripTimeOnDate>> stoptimesForDate();

    public DataFetcher<Geometry> tripGeometry();

    public DataFetcher<String> tripHeadsign();

    public DataFetcher<String> tripShortName();

    public DataFetcher<org.opentripplanner.apis.gtfs.generated.GraphQLTypes.GraphQLWheelchairBoarding> wheelchairAccessible();
  }

  /**
   * Occupancy of a vehicle on a trip. This should include the most recent occupancy information
   * available for a trip. Historic data might not be available.
   */
  public interface GraphQLTripOccupancy {
    public DataFetcher<GraphQLOccupancyStatus> occupancyStatus();
  }

  /** This is used for alert entities that we don't explicitly handle or they are missing. */
  public interface GraphQLUnknown {
    public DataFetcher<String> description();
  }

  /** Vehicle parking represents a location where bicycles or cars can be parked. */
  public interface GraphQLVehicleParking {
    public DataFetcher<Boolean> anyCarPlaces();

    public DataFetcher<VehicleParkingSpaces> availability();

    public DataFetcher<Boolean> bicyclePlaces();

    public DataFetcher<VehicleParkingSpaces> capacity();

    public DataFetcher<Boolean> carPlaces();

    public DataFetcher<String> detailsUrl();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<String> imageUrl();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<String> name();

    public DataFetcher<String> note();

    public DataFetcher<OHCalendar> openingHours();

    public DataFetcher<Boolean> realtime();

    public DataFetcher<VehicleParkingState> state();

    public DataFetcher<Iterable<String>> tags();

    public DataFetcher<String> vehicleParkingId();

    public DataFetcher<Boolean> wheelchairAccessibleCarPlaces();
  }

  /** The number of spaces by type. null if unknown. */
  public interface GraphQLVehicleParkingSpaces {
    public DataFetcher<Integer> bicycleSpaces();

    public DataFetcher<Integer> carSpaces();

    public DataFetcher<Integer> wheelchairAccessibleCarSpaces();
  }

  /** Realtime vehicle position */
  public interface GraphQLVehiclePosition {
    public DataFetcher<Double> heading();

    public DataFetcher<String> label();

    public DataFetcher<Long> lastUpdated();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<Double> speed();

    public DataFetcher<StopRelationship> stopRelationship();

    public DataFetcher<Trip> trip();

    public DataFetcher<String> vehicleId();
  }

  /** Vehicle rental station represents a location where users can rent bicycles etc. for a fee. */
  public interface GraphQLVehicleRentalStation {
    public DataFetcher<Boolean> allowDropoff();

    public DataFetcher<Boolean> allowDropoffNow();

    public DataFetcher<Boolean> allowOverloading();

    public DataFetcher<Boolean> allowPickup();

    public DataFetcher<Boolean> allowPickupNow();

    public DataFetcher<RentalVehicleEntityCounts> availableSpaces();

    public DataFetcher<RentalVehicleEntityCounts> availableVehicles();

    public DataFetcher<Integer> capacity();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<String> name();

    public DataFetcher<String> network();

    public DataFetcher<Boolean> operative();

    public DataFetcher<Boolean> realtime();

    public DataFetcher<VehicleRentalStationUris> rentalUris();

    public DataFetcher<Integer> spacesAvailable();

    public DataFetcher<String> stationId();

    public DataFetcher<Integer> vehiclesAvailable();
  }

  public interface GraphQLVehicleRentalUris {
    public DataFetcher<String> android();

    public DataFetcher<String> ios();

    public DataFetcher<String> web();
  }

  public interface GraphQLDebugOutput {
    public DataFetcher<Long> pathCalculationTime();

    public DataFetcher<Long> precalculationTime();

    public DataFetcher<Long> renderingTime();

    public DataFetcher<Boolean> timedOut();

    public DataFetcher<Long> totalTime();
  }

  public interface GraphQLElevationProfileComponent {
    public DataFetcher<Double> distance();

    public DataFetcher<Double> elevation();
  }

  public interface GraphQLFare {
    public DataFetcher<Integer> cents();

    public DataFetcher<Iterable<Object>> components();

    public DataFetcher<String> currency();

    public DataFetcher<String> type();
  }

  /** Component of the fare (i.e. ticket) for a part of the itinerary */
  public interface GraphQLFareComponent {
    public DataFetcher<Integer> cents();

    public DataFetcher<String> currency();

    public DataFetcher<String> fareId();

    public DataFetcher<Iterable<Route>> routes();
  }

  public interface GraphQLPlaceAtDistance {
    public DataFetcher<Integer> distance();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Object> place();
  }

  /** A connection to a list of items. */
  public interface GraphQLPlaceAtDistanceConnection {
    public DataFetcher<Iterable<Edge<PlaceAtDistance>>> edges();

    public DataFetcher<Object> pageInfo();
  }

  /** An edge in a connection. */
  public interface GraphQLPlaceAtDistanceEdge {
    public DataFetcher<String> cursor();

    public DataFetcher<PlaceAtDistance> node();
  }

  /** Time range for which the API has data available */
  public interface GraphQLServiceTimeRange {
    public DataFetcher<Long> end();

    public DataFetcher<Long> start();
  }

  public interface GraphQLStep {
    public DataFetcher<GraphQLAbsoluteDirection> absoluteDirection();

    public DataFetcher<Iterable<TransitAlert>> alerts();

    public DataFetcher<Boolean> area();

    public DataFetcher<Boolean> bogusName();

    public DataFetcher<Double> distance();

    public DataFetcher<Iterable<org.opentripplanner.model.plan.ElevationProfile.Step>> elevationProfile();

    public DataFetcher<String> exit();

    public DataFetcher<Double> lat();

    public DataFetcher<Double> lon();

    public DataFetcher<GraphQLRelativeDirection> relativeDirection();

    public DataFetcher<Boolean> stayOn();

    public DataFetcher<String> streetName();

    public DataFetcher<Boolean> walkingBike();
  }

  public interface GraphQLStopAtDistance {
    public DataFetcher<Integer> distance();

    public DataFetcher<graphql.relay.Relay.ResolvedGlobalId> id();

    public DataFetcher<Object> stop();
  }

  /** A connection to a list of items. */
  public interface GraphQLStopAtDistanceConnection {
    public DataFetcher<Iterable<Edge<NearbyStop>>> edges();

    public DataFetcher<Object> pageInfo();
  }

  /** An edge in a connection. */
  public interface GraphQLStopAtDistanceEdge {
    public DataFetcher<String> cursor();

    public DataFetcher<NearbyStop> node();
  }
}
