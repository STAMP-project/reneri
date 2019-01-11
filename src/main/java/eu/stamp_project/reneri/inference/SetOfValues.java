package eu.stamp_project.reneri.inference;


import eu.stamp_project.reneri.observations.AtomicValueObservation;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class SetOfValues extends AtomicValueCondition {

    private Set<?> values;

    public SetOfValues(Collection<?> values) {
        this.values = new HashSet<>(values);
    }

    @Override
    public boolean holdsFor(AtomicValueObservation observation) {
        return values.contains(observation.getValue());
    }
}
