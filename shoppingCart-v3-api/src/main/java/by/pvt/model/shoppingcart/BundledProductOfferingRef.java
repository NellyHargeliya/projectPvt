package by.pvt.model.shoppingcart;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BundledProductOffering Reference. A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.
 */
@ApiModel(description = "BundledProductOffering Reference. A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class BundledProductOfferingRef {
    @JsonProperty("href")
    @Column
    private String href = null;

    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id = null;

    @JsonProperty("name")
    @Column
    private String name = null;

    @JsonProperty("bundledProductOffering")
    @Embedded
    //@OneToMany(fetch = FetchType.LAZY)
    private List<BundledProductOfferingRef> bundledProductOffering = null;


    public BundledProductOfferingRef href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Reference of the product offering
     *
     * @return href
     **/
    @ApiModelProperty(value = "Reference of the product offering")

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public BundledProductOfferingRef id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the product offering
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique identifier of the product offering")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BundledProductOfferingRef name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the product offering
     *
     * @return name
     **/
    @ApiModelProperty(value = "Name of the product offering")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BundledProductOfferingRef bundledProductOffering(List<BundledProductOfferingRef> bundledProductOffering) {
        this.bundledProductOffering = bundledProductOffering;
        return this;
    }

    public BundledProductOfferingRef addBundledProductOfferingItem(BundledProductOfferingRef bundledProductOfferingItem) {
        if (this.bundledProductOffering == null) {
            this.bundledProductOffering = new ArrayList<BundledProductOfferingRef>();
        }
        this.bundledProductOffering.add(bundledProductOfferingItem);
        return this;
    }

    /**
     * Get bundledProductOffering
     *
     * @return bundledProductOffering
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<BundledProductOfferingRef> getBundledProductOffering() {
        return bundledProductOffering;
    }

    public void setBundledProductOffering(List<BundledProductOfferingRef> bundledProductOffering) {
        this.bundledProductOffering = bundledProductOffering;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BundledProductOfferingRef bundledProductOfferingRef = (BundledProductOfferingRef) o;
        return Objects.equals(this.href, bundledProductOfferingRef.href) &&
                Objects.equals(this.id, bundledProductOfferingRef.id) &&
                Objects.equals(this.name, bundledProductOfferingRef.name) &&
                Objects.equals(this.bundledProductOffering, bundledProductOfferingRef.bundledProductOffering);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, name, bundledProductOffering);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BundledProductOfferingRef {\n");

        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    bundledProductOffering: ").append(toIndentedString(bundledProductOffering)).append("\n");
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

