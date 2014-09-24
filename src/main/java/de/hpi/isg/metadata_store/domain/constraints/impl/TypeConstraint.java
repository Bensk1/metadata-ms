package de.hpi.isg.metadata_store.domain.constraints.impl;

import de.hpi.isg.metadata_store.domain.Constraint;
import de.hpi.isg.metadata_store.domain.Target;
import de.hpi.isg.metadata_store.domain.impl.AbstractConstraint;
import de.hpi.isg.metadata_store.domain.impl.SingleTargetReference;
import de.hpi.isg.metadata_store.domain.targets.Column;

/**
 * This class is a {@link Constraint} representing the data type of a certain
 * {@link Column}. {@link Column}.
 */
public class TypeConstraint extends AbstractConstraint implements Constraint {

    private static final long serialVersionUID = 3194245498846860560L;

    public TypeConstraint(int id, String name, SingleTargetReference target) {
	super(id, name, target);
	for (final Target t : target.getAllTargets()) {
	    if (!(t instanceof Column)) {
		throw new IllegalArgumentException("TypeConstrains can only be defined on Columns.");
	    }
	}
    }

    @Override
    public String toString() {
	return "TypeConstraint [getProperties()=" + this.getProperties() + ", getTargetReference()="
		+ this.getTargetReference() + ", getId()=" + this.getId() + ", getName()=" + this.getName() + "]";
    }

}
