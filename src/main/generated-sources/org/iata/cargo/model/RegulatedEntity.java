
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.Set;


/**
 * Regulated Entity
 * 
 * This class was generated by OWL2Java 0.15.0
 * 
 */
@OWLClass(iri = Vocabulary.s_c_RegulatedEntity)
public class RegulatedEntity
    implements Serializable
{

    @Id(generated = true)
    @ApiModelProperty(readOnly = true)
    protected String id;
    @JsonIgnore
    @OWLAnnotationProperty(iri = RDFS.LABEL)
    protected String name;
    @JsonIgnore
    @OWLAnnotationProperty(iri = cz.cvut.kbss.jopa.vocabulary.DC.Elements.DESCRIPTION)
    protected String description;
    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_RegulatedEntity)
    protected Set<String> types;
    @Properties
    @JsonIgnore
    protected Map<String, Set<String>> properties;

    /**
     * Branch/Company
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_entity)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1),
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, min = 1, max = -1)
    })
    @JsonProperty(Vocabulary.s_p_entity)
    protected Branch entity;
    /**
     * Regulated entity identifier (e.g. Regulated Agent Identifier) is mandatory
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_regulatedEntityIdentifier)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    @JsonProperty(Vocabulary.s_p_regulatedEntityIdentifier)
    protected Company regulatedEntityIdentifier;
    /**
     * Expiry date 4 digits month/year
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_expiryDate)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#dateTime", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_expiryDate)
    protected Date expiryDate;
    /**
     * Party type - e.g. RA - Regulated Agent, KC - Known Consignor, AO - Aircraft Operator, RC - Regulated Carrier
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_regulatedEntityCategory)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_regulatedEntityCategory)
    protected String regulatedEntityCategory;

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
        return ((((("RegulatedEntity {"+ name)+"<")+ id)+">")+"}");
    }

    public void setEntity(Branch entity) {
        this.entity = entity;
    }

    public Branch getEntity() {
        return entity;
    }

    public void setRegulatedEntityIdentifier(Company regulatedEntityIdentifier) {
        this.regulatedEntityIdentifier = regulatedEntityIdentifier;
    }

    public Company getRegulatedEntityIdentifier() {
        return regulatedEntityIdentifier;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setRegulatedEntityCategory(String regulatedEntityCategory) {
        this.regulatedEntityCategory = regulatedEntityCategory;
    }

    public String getRegulatedEntityCategory() {
        return regulatedEntityCategory;
    }

}