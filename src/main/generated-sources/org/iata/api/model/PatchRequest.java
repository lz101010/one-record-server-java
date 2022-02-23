
package org.iata.api.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import cz.cvut.kbss.jopa.model.annotations.Id;
import cz.cvut.kbss.jopa.model.annotations.OWLAnnotationProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Properties;
import cz.cvut.kbss.jopa.model.annotations.Types;
import cz.cvut.kbss.jopa.vocabulary.RDFS;
import org.iata.api.Vocabulary;


/**
 * PATCH Request body containing updates on a Logistics Object
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_PatchRequest)
public class PatchRequest
    implements Serializable
{

    @Id(generated = true)
    protected String id;
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    protected Set<String> types;
    @Properties
    protected Map<String, Set<String>> properties;
    /**
     * Reference of the Logistics Object to which the change request is applied to
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_logisticsObjectRef_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected LogisticsObjectRef logisticsObjectRef;
    /**
     * List of operations to apply as PATCH on a Logistics Object
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_operations)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    protected Set<Operation> operations;
    /**
     * Reason for the change (optional)
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_description)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String description1;
    /**
     * The company identifier of the entity that is requesting the change request
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_requestorCompanyIdentifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String requestorCompanyIdentifier;
    /**
     * Revision number of the Logistics Object
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_revision)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1)
    })
    protected String revision;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public Set<String> getTypes() {
        return types;
    }

    public void setProperties(Map<String, Set<String>> properties) {
        this.properties = properties;
    }

    public Map<String, Set<String>> getProperties() {
        return properties;
    }

    @Override
    public String toString() {
        return ((((("PatchRequest {"+ name)+"<")+ id)+">")+"}");
    }

    public void setLogisticsObjectRef(LogisticsObjectRef logisticsObjectRef) {
        this.logisticsObjectRef = logisticsObjectRef;
    }

    public LogisticsObjectRef getLogisticsObjectRef() {
        return logisticsObjectRef;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }

    public Set<Operation> getOperations() {
        return operations;
    }

    public void setDescription1(String description1) {
        this.description1 = description1;
    }

    public String getDescription1() {
        return description1;
    }

    public void setRequestorCompanyIdentifier(String requestorCompanyIdentifier) {
        this.requestorCompanyIdentifier = requestorCompanyIdentifier;
    }

    public String getRequestorCompanyIdentifier() {
        return requestorCompanyIdentifier;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getRevision() {
        return revision;
    }

}
