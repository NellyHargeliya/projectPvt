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
 * Product reference. Configure the product characteristics (only configurable characteristics and necessary only if a non default value is selected) and/or identify the product that needs to be modified/deleted.
 */
@ApiModel(description = "Product reference. Configure the product characteristics (only configurable characteristics and necessary only if a non default value is selected) and/or identify the product that needs to be modified/deleted.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class ProductRefOrValue {
    @JsonProperty("href")
    @Column
    private String href = null;

    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column
    private String id = null;

    @JsonProperty("name")
    @Column
    private String name = null;

    @JsonProperty("productRelationship")
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<ProductRefOrValueRelationship> productRelationship = null;

    @JsonProperty("place")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<PlaceRef> place = null;

    @JsonProperty("characteristic")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<ProductCharacteristic> characteristic = null;

    @JsonProperty("relatedParty")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<RelatedPartyRef> relatedParty = null;

    @JsonProperty("productSpecification")
    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    private ProductSpecificationRef productSpecification = null;

    public ProductRefOrValue href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Reference of the product
     *
     * @return href
     **/
    @ApiModelProperty(value = "Reference of the product")


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ProductRefOrValue id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the product
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique identifier of the product")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductRefOrValue name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the product
     *
     * @return name
     **/
    @ApiModelProperty(value = "Name of the product")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductRefOrValue productRelationship(List<ProductRefOrValueRelationship> productRelationship) {
        this.productRelationship = productRelationship;
        return this;
    }

    public ProductRefOrValue addProductRelationshipItem(ProductRefOrValueRelationship productRelationshipItem) {
        if (this.productRelationship == null) {
            this.productRelationship = new ArrayList<ProductRefOrValueRelationship>();
        }
        this.productRelationship.add(productRelationshipItem);
        return this;
    }

    /**
     * Get productRelationship
     *
     * @return productRelationship
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<ProductRefOrValueRelationship> getProductRelationship() {
        return productRelationship;
    }

    public void setProductRelationship(List<ProductRefOrValueRelationship> productRelationship) {
        this.productRelationship = productRelationship;
    }

    public ProductRefOrValue place(List<PlaceRef> place) {
        this.place = place;
        return this;
    }

    public ProductRefOrValue addPlaceItem(PlaceRef placeItem) {
        if (this.place == null) {
            this.place = new ArrayList<PlaceRef>();
        }
        this.place.add(placeItem);
        return this;
    }

    /**
     * Get place
     *
     * @return place
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<PlaceRef> getPlace() {
        return place;
    }

    public void setPlace(List<PlaceRef> place) {
        this.place = place;
    }

    public ProductRefOrValue characteristic(List<ProductCharacteristic> characteristic) {
        this.characteristic = characteristic;
        return this;
    }

    public ProductRefOrValue addCharacteristicItem(ProductCharacteristic characteristicItem) {
        if (this.characteristic == null) {
            this.characteristic = new ArrayList<ProductCharacteristic>();
        }
        this.characteristic.add(characteristicItem);
        return this;
    }

    /**
     * Get characteristic
     *
     * @return characteristic
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<ProductCharacteristic> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(List<ProductCharacteristic> characteristic) {
        this.characteristic = characteristic;
    }

    public ProductRefOrValue relatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    public ProductRefOrValue addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
        if (this.relatedParty == null) {
            this.relatedParty = new ArrayList<RelatedPartyRef>();
        }
        this.relatedParty.add(relatedPartyItem);
        return this;
    }

    /**
     * Get relatedParty
     *
     * @return relatedParty
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<RelatedPartyRef> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
    }

    public ProductRefOrValue productSpecification(ProductSpecificationRef productSpecification) {
        this.productSpecification = productSpecification;
        return this;
    }

    /**
     * Get productSpecification
     *
     * @return productSpecification
     **/
    @ApiModelProperty(value = "")

    @Valid

    public ProductSpecificationRef getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(ProductSpecificationRef productSpecification) {
        this.productSpecification = productSpecification;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductRefOrValue productRefOrValue = (ProductRefOrValue) o;
        return Objects.equals(this.href, productRefOrValue.href) &&
                Objects.equals(this.id, productRefOrValue.id) &&
                Objects.equals(this.name, productRefOrValue.name) &&
                Objects.equals(this.productRelationship, productRefOrValue.productRelationship) &&
                Objects.equals(this.place, productRefOrValue.place) &&
                Objects.equals(this.characteristic, productRefOrValue.characteristic) &&
                Objects.equals(this.relatedParty, productRefOrValue.relatedParty) &&
                Objects.equals(this.productSpecification, productRefOrValue.productSpecification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(href, id, name, productRelationship, place, characteristic, relatedParty, productSpecification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductRefOrValue {\n");

        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    productRelationship: ").append(toIndentedString(productRelationship)).append("\n");
        sb.append("    place: ").append(toIndentedString(place)).append("\n");
        sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
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

