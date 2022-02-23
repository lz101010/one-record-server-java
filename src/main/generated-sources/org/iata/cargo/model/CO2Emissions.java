
package org.iata.cargo.model;

import java.io.Serializable;
import cz.cvut.kbss.jopa.model.annotations.OWLClass;
import cz.cvut.kbss.jopa.model.annotations.OWLDataProperty;
import cz.cvut.kbss.jopa.model.annotations.OWLObjectProperty;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraint;
import cz.cvut.kbss.jopa.model.annotations.ParticipationConstraints;
import org.iata.cargo.Vocabulary;


/**
 * CO2 Calculation
 * 
 * This class was generated by OWL2Java 0.17.2
 * 
 */
@OWLClass(iri = Vocabulary.s_c_CO2Emissions)
public class CO2Emissions
    extends LogisticsObject
    implements Serializable
{

    /**
     * CO2 emissions calculated
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_calculatedEmissions)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected Value calculatedEmissions;
    /**
     * Transport Movement linked to the CO2 Emissions object
     * 
     */
    @OWLObjectProperty(iri = Vocabulary.s_p_transportMovement_A_A_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = Vocabulary.s_c_Thing, max = 1)
    })
    protected TransportMovement transportMovement;
    /**
     * Name of the CO2 calculation method
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_methodName_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String methodName;
    /**
     * Version used for the calculation
     * 
     */
    @OWLDataProperty(iri = Vocabulary.s_p_methodVersion_A)
    @ParticipationConstraints({
        @ParticipationConstraint(owlObjectIRI = "http://www.w3.org/2001/XMLSchema#string", max = 1)
    })
    protected String methodVersion;

    public void setCalculatedEmissions(Value calculatedEmissions) {
        this.calculatedEmissions = calculatedEmissions;
    }

    public Value getCalculatedEmissions() {
        return calculatedEmissions;
    }

    public void setTransportMovement(TransportMovement transportMovement) {
        this.transportMovement = transportMovement;
    }

    public TransportMovement getTransportMovement() {
        return transportMovement;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodVersion(String methodVersion) {
        this.methodVersion = methodVersion;
    }

    public String getMethodVersion() {
        return methodVersion;
    }

}
