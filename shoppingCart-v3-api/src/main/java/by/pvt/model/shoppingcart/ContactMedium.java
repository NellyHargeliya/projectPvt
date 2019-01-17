package by.pvt.model.shoppingcart;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.Objects;

/**
 * Indicates the contact medium that could be used to contact the party.
 */
@ApiModel(description = "Indicates the contact medium that could be used to contact the party.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class ContactMedium {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column
    private String id = null;

    @JsonProperty("preferred")
    @Column
    private Boolean preferred = null;

    @JsonProperty("type")
    @Column
    private String type = null;

    @JsonProperty("validFor")
    @Embedded
    private TimePeriod validFor = null;

    @JsonProperty("characteristic")
    @OneToOne(cascade=CascadeType.ALL)
    private MediumCharacteristic characteristic = null;

    public ContactMedium preferred(Boolean preferred) {
        this.preferred = preferred;
        return this;
    }

    /**
     * If true, indicates that is the preferred contact medium
     *
     * @return preferred
     **/
    @ApiModelProperty(value = "If true, indicates that is the preferred contact medium")


    public Boolean isPreferred() {
        return preferred;
    }

    public void setPreferred(Boolean preferred) {
        this.preferred = preferred;
    }

    public ContactMedium type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the contact medium, such as: email address, telephone number, postal address
     *
     * @return type
     **/
    @ApiModelProperty(value = "Type of the contact medium, such as: email address, telephone number, postal address")


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ContactMedium validFor(TimePeriod validFor) {
        this.validFor = validFor;
        return this;
    }

    /**
     * The time period that the contact medium is valid for
     *
     * @return validFor
     **/
    @ApiModelProperty(value = "The time period that the contact medium is valid for")

    @Valid

    public TimePeriod getValidFor() {
        return validFor;
    }

    public void setValidFor(TimePeriod validFor) {
        this.validFor = validFor;
    }

    public ContactMedium characteristic(MediumCharacteristic characteristic) {
        this.characteristic = characteristic;
        return this;
    }

    /**
     * Get characteristic
     *
     * @return characteristic
     **/
    @ApiModelProperty(value = "")

    @Valid

    public MediumCharacteristic getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(MediumCharacteristic characteristic) {
        this.characteristic = characteristic;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContactMedium contactMedium = (ContactMedium) o;
        return Objects.equals(this.preferred, contactMedium.preferred) &&
                Objects.equals(this.type, contactMedium.type) &&
                Objects.equals(this.validFor, contactMedium.validFor) &&
                Objects.equals(this.characteristic, contactMedium.characteristic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preferred, type, validFor, characteristic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContactMedium {\n");

        sb.append("    preferred: ").append(toIndentedString(preferred)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
        sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

