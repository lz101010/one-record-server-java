
package org.iata.cargo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import cz.cvut.kbss.jopa.model.annotations.Types;
import io.swagger.annotations.ApiModelProperty;
import org.iata.cargo.Vocabulary;

import java.io.Serializable;
import java.util.Set;


/**
 * Waybill details
 * 
 * This class was generated by OWL2Java 0.14.6
 * 
 */
@OWLClass(iri = Vocabulary.s_c_Waybill)
public class Waybill
    extends LogisticsObject
    implements Serializable
{

    @Types
    @JsonProperty("@type")
    @ApiModelProperty(allowableValues = Vocabulary.s_c_Waybill)
    protected Set<String> types;

    /**
     * Waybill(s) contained, refers to URIs
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_containedWaybill)
    @JsonProperty(Vocabulary.s_p_containedWaybill)
    protected Set<Waybill> containedWaybill;
    /**
     * House or Master Waybill unique identifier
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_waybillNumber_A_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_waybillNumber_A_A_A)
    protected String waybillNumber;
    /**
     * Type of the Waybill: House or Master
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_waybillType)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral", min = 1, max = -1),
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/1999/02/22-rdf-syntax-ns#PlainLiteral", max = 1)
    })
    @JsonProperty(Vocabulary.s_p_waybillType)
    protected String waybillType;

    public void setContainedWaybill(Set<Waybill> containedWaybill) {
        this.containedWaybill = containedWaybill;
    }

    public Set<Waybill> getContainedWaybill() {
        return containedWaybill;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillType(String waybillType) {
        this.waybillType = waybillType;
    }

    public String getWaybillType() {
        return waybillType;
    }


    public Set<String> getTypes() {
        return types;
    }


    public void setTypes(Set<String> types) {
        this.types = types;
    }

}