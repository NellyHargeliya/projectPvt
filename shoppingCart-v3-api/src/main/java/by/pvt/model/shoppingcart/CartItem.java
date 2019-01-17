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
import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An identified part of the shopping cart. A shopping cart  is decomposed into one or more shopping cart item. Cart item represents a product offering or bundled product offering that user wish to purchase, as well as the pricing of the product offering, reference to product in case of configured characteristic or installation address. Cart items can be related to other cart item to related bundled offerings or reference cart Items to a shipping options
 */
@ApiModel(description = "An identified part of the shopping cart. A shopping cart  is decomposed into one or more shopping cart item. Cart item represents a product offering or bundled product offering that user wish to purchase, as well as the pricing of the product offering, reference to product in case of configured characteristic or installation address. Cart items can be related to other cart item to related bundled offerings or reference cart Items to a shipping options")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-01T19:21:18.377+03:00")
@Entity
public class CartItem {
    @JsonProperty("action")
    @Column
    private String action = null;

    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id = null;

    @JsonProperty("quantity")
    @Column
    private Integer quantity = null;

    @JsonProperty("status")
    @Column
    private String status = null;

    @JsonProperty("cartItem")
    @Valid
    @Embedded
    private List<CartItem> cardItem = null;

    @JsonProperty("totalItemPrice")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<CartPrice> totalItemPrice = null;

    @JsonProperty("product")
    @OneToOne
    private ProductRefOrValue product = null;

    @JsonProperty("itemPrice")
    @Valid
    @ManyToMany
    private List<CartPrice> itemPrice = null;

    @JsonProperty("productOffering")
    @OneToOne
    private ProductOfferingRef productOffering = null;

    @JsonProperty("cartItemRelationship")
    @Valid
    @OneToMany
    private List<CartItemRelationship> cartItemRelationship = null;

    public CartItem action(String action) {
        this.action = action;
        return this;
    }

    /**
     * Can be \"add\" / \"modify\" / \"no_change\"/ \"delete\"
     *
     * @return action
     **/
    @ApiModelProperty(value = "Can be \"add\" / \"modify\" / \"no_change\"/ \"delete\"")


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public CartItem id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Identifier of the cart item (generally it is a sequence number 01, 02, 03, ...) in the shopping cart
     *
     * @return id
     **/
    @ApiModelProperty(value = "Identifier of the cart item (generally it is a sequence number 01, 02, 03, ...) in the shopping cart")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CartItem quantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Quantity of cart items
     *
     * @return quantity
     **/
    @ApiModelProperty(value = "Quantity of cart items")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public CartItem status(String status) {
        this.status = status;
        return this;
    }

    /**
     * status of cart item. e.g \"Active\" , \"SavedForLater\".
     *
     * @return status
     **/
    @ApiModelProperty(value = "status of cart item. e.g \"Active\" , \"SavedForLater\".")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CartItem cardItem(List<CartItem> cardItem) {
        this.cardItem = cardItem;
        return this;
    }

    public CartItem addCardItemItem(CartItem cardItemItem) {
        if (this.cardItem == null) {
            this.cardItem = new ArrayList<CartItem>();
        }
        this.cardItem.add(cardItemItem);
        return this;
    }

    /**
     * Get cardItem
     *
     * @return cardItem
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<CartItem> getCardItem() {
        return cardItem;
    }

    public void setCardItem(List<CartItem> cardItem) {
        this.cardItem = cardItem;
    }

    public CartItem totalItemPrice(List<CartPrice> totalItemPrice) {
        this.totalItemPrice = totalItemPrice;
        return this;
    }

    public CartItem addTotalItemPriceItem(CartPrice totalItemPriceItem) {
        if (this.totalItemPrice == null) {
            this.totalItemPrice = new ArrayList<CartPrice>();
        }
        this.totalItemPrice.add(totalItemPriceItem);
        return this;
    }

    /**
     * Get totalItemPrice
     *
     * @return totalItemPrice
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<CartPrice> getTotalItemPrice() {
        return totalItemPrice;
    }

    public void setTotalItemPrice(List<CartPrice> totalItemPrice) {
        this.totalItemPrice = totalItemPrice;
    }

    public CartItem product(ProductRefOrValue product) {
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

    public CartItem itemPrice(List<CartPrice> itemPrice) {
        this.itemPrice = itemPrice;
        return this;
    }

    public CartItem addItemPriceItem(CartPrice itemPriceItem) {
        if (this.itemPrice == null) {
            this.itemPrice = new ArrayList<CartPrice>();
        }
        this.itemPrice.add(itemPriceItem);
        return this;
    }

    /**
     * Get itemPrice
     *
     * @return itemPrice
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<CartPrice> getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(List<CartPrice> itemPrice) {
        this.itemPrice = itemPrice;
    }

    public CartItem productOffering(ProductOfferingRef productOffering) {
        this.productOffering = productOffering;
        return this;
    }

    /**
     * Get productOffering
     *
     * @return productOffering
     **/
    @ApiModelProperty(value = "")
    @Valid
    public ProductOfferingRef getProductOffering() {
        return productOffering;
    }

    public void setProductOffering(ProductOfferingRef productOffering) {
        this.productOffering = productOffering;
    }

    public CartItem cartItemRelationship(List<CartItemRelationship> cartItemRelationship) {
        this.cartItemRelationship = cartItemRelationship;
        return this;
    }

    public CartItem addCartItemRelationshipItem(CartItemRelationship cartItemRelationshipItem) {
        if (this.cartItemRelationship == null) {
            this.cartItemRelationship = new ArrayList<CartItemRelationship>();
        }
        this.cartItemRelationship.add(cartItemRelationshipItem);
        return this;
    }

    /**
     * Get cartItemRelationship
     *
     * @return cartItemRelationship
     **/
    @ApiModelProperty(value = "")
    @Valid
    public List<CartItemRelationship> getCartItemRelationship() {
        return cartItemRelationship;
    }

    public void setCartItemRelationship(List<CartItemRelationship> cartItemRelationship) {
        this.cartItemRelationship = cartItemRelationship;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CartItem cartItem = (CartItem) o;
        return Objects.equals(this.action, cartItem.action) &&
                Objects.equals(this.id, cartItem.id) &&
                Objects.equals(this.quantity, cartItem.quantity) &&
                Objects.equals(this.status, cartItem.status) &&
                Objects.equals(this.cardItem, cartItem.cardItem) &&
                Objects.equals(this.totalItemPrice, cartItem.totalItemPrice) &&
                Objects.equals(this.product, cartItem.product) &&
                Objects.equals(this.itemPrice, cartItem.itemPrice) &&
                Objects.equals(this.productOffering, cartItem.productOffering) &&
                Objects.equals(this.cartItemRelationship, cartItem.cartItemRelationship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, id, quantity, status, cardItem, totalItemPrice, product, itemPrice, productOffering, cartItemRelationship);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CartItem {\n");

        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    cardItem: ").append(toIndentedString(cardItem)).append("\n");
        sb.append("    totalItemPrice: ").append(toIndentedString(totalItemPrice)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
        sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
        sb.append("    cartItemRelationship: ").append(toIndentedString(cartItemRelationship)).append("\n");
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

