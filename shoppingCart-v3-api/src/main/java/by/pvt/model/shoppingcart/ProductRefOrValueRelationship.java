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
 * Represents a relationship between products - which potentially holds an entire product object or a product reference (with partial content)
 */
@ApiModel(description = "Represents a relationship between products - which potentially holds an entire product object or a product reference (with partial content)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class ProductRefOrValueRelationship {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column
    private String id = null;

    @JsonProperty("type")
    @Column
    private String type = null;

    @JsonProperty("product")
    @Valid
    @OneToOne(cascade = CascadeType.ALL)
    private ProductRefOrValue product = null;

    public ProductRefOrValueRelationship type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the product relationship. It can be : <ul>  <li>\"bundled\" if the product is a bundle and you want to describe the \"bundled\" products inside this bundle</li>  <li>\"reliesOn\" if the product needs another already owned product to rely on (e.g. an option on an already owned mobile access product)</li> </ul> \"targets\" or \"isTargeted\" (depending on the way of expressing the link) for any other kind of links that may be useful
     *
     * @return type
     **/
    @ApiModelProperty(value = "Type of the product relationship. It can be : <ul>  <li>\"bundled\" if the product is a bundle and you want to describe the \"bundled\" products inside this bundle</li>  <li>\"reliesOn\" if the product needs another already owned product to rely on (e.g. an option on an already owned mobile access product)</li> </ul> \"targets\" or \"isTargeted\" (depending on the way of expressing the link) for any other kind of links that may be useful")


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProductRefOrValueRelationship product(ProductRefOrValue product) {
        this.product = product;
        return this;
    }

    /**
     * Get product
     *
     * @return product
     **/
    @ApiModelProperty(value = "")

    @Valid

    public ProductRefOrValue getProduct() {
        return product;
    }

    public void setProduct(ProductRefOrValue product) {
        this.product = product;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductRefOrValueRelationship productRefOrValueRelationship = (ProductRefOrValueRelationship) o;
        return Objects.equals(this.type, productRefOrValueRelationship.type) &&
                Objects.equals(this.product, productRefOrValueRelationship.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductRefOrValueRelationship {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

