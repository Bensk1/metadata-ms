package de.hpi.isg.mdms.exceptions;

import de.hpi.isg.mdms.model.constraints.Constraint;
import de.hpi.isg.mdms.model.MetadataStore;
import de.hpi.isg.mdms.model.targets.Target;

/**
 * This {@link Exception} is thrown if the user tries to add a {@link Constraint} to a {@link MetadataStore} with
 * referenced {@link Target} (via {@link TargetReference}) that are unknown to the {@link MetadataStore}.
 *
 * @author fabian
 *
 */
public class NotAllTargetsInStoreException extends MetadataStoreException {

    public NotAllTargetsInStoreException(final int targetId) {
        super(String.format("Target with id %d", targetId));
    }
}
