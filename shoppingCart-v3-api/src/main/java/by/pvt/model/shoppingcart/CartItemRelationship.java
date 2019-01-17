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
 * Relationship among cart items mainly other than hierarchical relationships such as \&quot;RelyOn\&quot;, \&quot;DependentOn\&quot;, \&quot;Shipping\&quot; etc.
 */
@ApiModel(description = "Relationship among cart items mainly other than hierarchical relationships such as \"RelyOn\", \"DependentOn\", \"Shipping\" etc.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class CartItemRelationship {
    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id = null;

    @JsonProperty("type")
    @Column
    private String type = null;

    @JsonProperty("cartItem")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<CartItemRef> cartItem = null;

    public CartItemRelationship id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(value = "")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CartItemRelationship type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of the order item relationship
     *
     * @return type
     **/
    @ApiModelProperty(value = "Type of the order item relationship")


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CartItemRelationship cartItem(List<CartItemRef> cartItem) {
        this.cartItem = cartItem;
        return this;
    }

    public CartItemRelationship addCartItemItem(CartItemRef cartItemItem) {
        if (this.cartItem == null) {
            this.cartItem = new ArrayList<CartItemRef>();
        }
        this.cartItem.add(cartItemItem);
        return this;
    }

    /**
     * Get cartItem
     *
     * @return cartItem
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<CartItemRef> getCartItem() {
        return cartItem;
    }

    public void setCartItem(List<CartItemRef> cartItem) {
        this.cartItem = cartItem;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CartItemRelationship cartItemRelationship = (CartItemRelationship) o;
        return Objects.equals(this.id, cartItemRelationship.id) &&
                Objects.equals(this.type, cartItemRelationship.type) &&
                Objects.equals(this.cartItem, cartItemRelationship.cartItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, cartItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CartItemRelationship {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    cartItem: ").append(toIndentedString(cartItem)).append("\n");
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

