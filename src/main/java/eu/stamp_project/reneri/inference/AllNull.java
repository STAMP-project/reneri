package eu.stamp_project.reneri.inference;

import eu.stamp_project.reneri.observations.ValueObservation;

public class AllNull extends NullCondition {

    @Override
    public boolean holds(ValueObservation observation) {
        return observation.isNull();
    }
}
