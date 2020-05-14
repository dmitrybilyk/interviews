package com.learn.web.gwt.client.sap;

//import com.sap.sse.common.Duration;

public class MillisecondsDurationImpl extends AbstractDuration {
    private static final long serialVersionUID = -4257982564719184723L;
    private long millis;
    
    public MillisecondsDurationImpl(long millis) {
        super();
        this.millis = millis;
    }

    public MillisecondsDurationImpl() {
    }

    @Override
    public long asMillis() {
        return millis;
    }

    @Override
    public Duration abs() {
        return millis >= 0 ? this : new MillisecondsDurationImpl(-millis);
    }

    @Override
    public double asSeconds() {
        return ((double) asMillis()) / 1000.;
    }

    @Override
    public Duration divide(long divisor) {
        return new MillisecondsDurationImpl(asMillis() / divisor);
    }

    @Override
    public Duration divide(double divisor) {
        return new MillisecondsDurationImpl((long) (1. / divisor * asMillis()));
    }

    @Override
    public double divide(Duration duration) {
        return ((double) asMillis()) / (double) duration.asMillis();
    }

    @Override
    public Duration times(long factor) {
        return new MillisecondsDurationImpl(asMillis() * factor);
    }

    @Override
    public Duration times(double factor) {
        return new MillisecondsDurationImpl((long) (factor*asMillis()));
    }

    @Override
    public double asMinutes() {
        return asSeconds() / 60;
    }

    @Override
    public double asHours() {
        return ((double) asMillis()) / (double) Duration.ONE_HOUR.asMillis();
    }

    @Override
    public double asDays() {
        return asMillis() / Duration.ONE_DAY.asMillis();
    }
    
    @Override
    public Duration minus(Duration duration) {
        return new MillisecondsDurationImpl(asMillis()-duration.asMillis());
    }

    @Override
    public Duration minus(long milliseconds) {
        return new MillisecondsDurationImpl(asMillis()-milliseconds);
    }

    @Override
    public Duration plus(long milliseconds) {
        return new MillisecondsDurationImpl(asMillis()+milliseconds);
    }

    @Override
    public Duration plus(Duration duration) {
        return new MillisecondsDurationImpl(asMillis()+duration.asMillis());
    }

    @Override
    public int compareTo(Duration o) {
        long diff = asMillis() - o.asMillis();
        return diff > 0l ? 1 : diff < 0l ? -1 : 0;
    }

    @Override
    public int hashCode() {
        return (int) (asMillis() & Integer.MAX_VALUE);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Duration) {
            return compareTo((Duration) obj) == 0;
        } else {
            return false;
        }
    }

    @Override
    public Duration mod(Duration d) {
        return new MillisecondsDurationImpl(asMillis() % d.asMillis());
    }

}
