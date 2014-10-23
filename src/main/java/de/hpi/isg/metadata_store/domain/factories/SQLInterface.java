package de.hpi.isg.metadata_store.domain.factories;

import java.util.Collection;

import de.hpi.isg.metadata_store.domain.Constraint;
import de.hpi.isg.metadata_store.domain.ConstraintCollection;
import de.hpi.isg.metadata_store.domain.Target;
import de.hpi.isg.metadata_store.domain.impl.RDBMSMetadataStore;
import de.hpi.isg.metadata_store.domain.targets.Column;
import de.hpi.isg.metadata_store.domain.targets.Schema;
import de.hpi.isg.metadata_store.domain.targets.Table;
import de.hpi.isg.metadata_store.domain.targets.impl.RDBMSColumn;
import de.hpi.isg.metadata_store.domain.targets.impl.RDBMSSchema;
import de.hpi.isg.metadata_store.domain.targets.impl.RDBMSTable;

/**
 * This interface describes common functionalities that a RDBMS-specifc interface for a {@link RDBMSMetadataStore} must
 * provide.
 * 
 * @author fabian
 *
 */
public interface SQLInterface {

    public void initializeMetadataStore();

    public void addConstraint(Constraint constraint);

    public void addSchema(Schema schema);

    public Collection<? extends Target> getAllTargets();

    public Collection<? extends Constraint> getAllConstraints();

    public Collection<Integer> getIdsInUse();

    public void addTarget(Target target);

    public Collection<ConstraintCollection> getAllConstraintCollections();

    public void addConstraintCollection(ConstraintCollection constraintCollection);

    Collection<Schema> getAllSchemas();

    public void setMetadataStore(RDBMSMetadataStore rdbmsMetadataStore);

    boolean addToIdsInUse(int id);

    public Collection<Table> getAllTablesForSchema(RDBMSSchema rdbmsSchema);

    public void addTableToSchema(RDBMSTable newTable, Schema schema);

    public Collection<Column> getAllColumnsForTable(RDBMSTable rdbmsTable);

    public void addColumnToTable(RDBMSColumn newColumn, Table table);

    boolean tablesExist();
}