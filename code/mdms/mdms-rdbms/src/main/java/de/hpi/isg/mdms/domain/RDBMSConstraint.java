package de.hpi.isg.mdms.domain;

import de.hpi.isg.mdms.domain.constraints.impl.ConstraintSQLSerializer;
import de.hpi.isg.mdms.domain.factories.SQLInterface;

/**
 * @author Sebastian
 * @since 04.03.2015.
 */
public interface RDBMSConstraint extends Constraint {

    /**
     * This function returns a new copy of the constraint's own {@link ConstraintSQLSerializer}. Therefore you have to
     * pass a {@link SQLInterface}.
     *
     * @param sqlInterface
     *        {@link SQLInterface}
     * @return a new copy of a {@link ConstraintSQLSerializer}
     */
    public ConstraintSQLSerializer<? extends Constraint> getConstraintSQLSerializer(SQLInterface sqlInterface);

}
